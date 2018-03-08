package com.sunshine.ping.intercepter;


import com.google.common.util.concurrent.Uninterruptibles;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by wangtao on 2018/3/6.
 */
public class RetryIntercepter implements Interceptor {

    /**
     * 最大重试次数（最大请求次数）
     */
    private int maxRetryTimes;

    /**
     * 重试间隔
     */
    private long sleepTimeInMilliSecond;

    public RetryIntercepter(int retryTimes, long sleepTimeInMilliSecond) {
        this.maxRetryTimes = retryTimes;
        this.sleepTimeInMilliSecond = sleepTimeInMilliSecond;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        int retryTimes = 1;
        Request request = chain.request();
        Response response = chain.proceed(request);
        while (!response.isSuccessful() && retryTimes++ < maxRetryTimes) {
            response.close();
            Uninterruptibles.sleepUninterruptibly(sleepTimeInMilliSecond, TimeUnit.MILLISECONDS);
            response = chain.proceed(request);
        }
        return response;
    }

}
