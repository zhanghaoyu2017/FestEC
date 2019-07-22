package com.example.latte_core.net;

import com.example.latte_core.net.callback.IError;
import com.example.latte_core.net.callback.IFailure;
import com.example.latte_core.net.callback.IRequest;
import com.example.latte_core.net.callback.ISuccess;
import com.example.latte_core.net.callback.RequestCallBacks;

import java.util.Map;
import java.util.WeakHashMap;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.RequestBody;

/**
 * Created by Android Studio.
 * User: zhanghaoyu
 * Date: 2019/7/12
 * Time: 22:32
 */
public class RestClient {
    private final String URL;
    private static final WeakHashMap<String, Object> PARAMS = RestCreator.getParams();
    private final IRequest REQUEST;
    private final ISuccess SUCCESS;
    private final IFailure FAILURE;
    private final IError ERROR;
    private final RequestBody BODY;

    public RestClient(String url, Map<String, Object> params,
                      IRequest request, ISuccess success, IFailure failure,
                      IError error, RequestBody body) {
        this.URL = url;
        PARAMS.putAll(params);
        this.REQUEST = request;
        this.SUCCESS = success;
        this.FAILURE = failure;
        this.ERROR = error;
        this.BODY = body;
    }

    public static RestClientBulider bulider() {
        return new RestClientBulider();
    }

    private void request(HttpMethod method) {
        final RestService service = RestCreator.getRestService();
        Call call = null;

        if (REQUEST != null) {
            REQUEST.onRequestStart();
        }
        switch (method) {
            case GET:
                call = (Call) service.get(URL, PARAMS);
                break;
            case POST:
                call = (Call) service.post(URL, PARAMS);
                break;
            case PUT:
                call = (Call) service.put(URL, PARAMS);
                break;
            case DELETE:
                call = (Call) service.delete(URL, PARAMS);
                break;
            default:
                break;
        }
        if (call != null) {
            call.enqueue(getRequestCallback());
        }
    }

    private Callback getRequestCallback() {
        return (Callback) new RequestCallBacks(REQUEST, SUCCESS, FAILURE, ERROR);
    }

    public final void get(){
        request(HttpMethod.GET);
    }
    public final void post(){
        request(HttpMethod.POST);
    }
    public final void put(){
        request(HttpMethod.PUT);
    }
    public final void delete(){
        request(HttpMethod.DELETE);
    }


}
