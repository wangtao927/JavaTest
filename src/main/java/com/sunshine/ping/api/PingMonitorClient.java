package com.sunshine.ping.api;


import com.google.gson.Gson;
import com.sunshine.ping.arg.PingMonitorArg;
import com.sunshine.ping.intercepter.RetryIntercepter;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.util.concurrent.TimeUnit;

/**
 * Created by wangtao on 2018/3/6.
 */

@Slf4j
@UtilityClass
public final class PingMonitorClient {
    private MediaType mediaType = MediaType.parse("application/json; charset=UTF-8");
    private OkHttpClient client = new OkHttpClient.Builder().connectTimeout(5, TimeUnit.SECONDS)
        .readTimeout(10, TimeUnit.SECONDS)
        .addInterceptor(new RetryIntercepter(3, 100))
        .build();

    /**
     * 上线
     */
    public void onlineService(PingMonitorArg arg) {
        post(getUrl() + "/online", new Gson().toJson((arg)));
    }

    /**
     * 下线
     */
    public void offlineService(PingMonitorArg arg) {
        post(getUrl() + "/offline", new Gson().toJson(arg));
    }

    /**
     * 根据不同环境获取不同配置url路径
     */
    private String getUrl() {
        return "http://xxxxx/ping-monitor";
    }

    /**
     * ok_http post
     */
    private void post(String url, String json) {
        log.info("post ping monitor body " + json);

        RequestBody body = RequestBody.create(mediaType, json);
        Request request = new Request.Builder().header("Connection", "close").url(url).post(body).build();
        try (Response response = client.newCall(request).execute()) {
            if (response.code() != 200) {
                log.warn("post ping monitor code:{}, url:{}", response.code(), url);
            } else {
                log.info("post ping monitor success");
            }
        } catch (Exception e) {
            log.error("post ping monitor error", e);
        }
    }
}
