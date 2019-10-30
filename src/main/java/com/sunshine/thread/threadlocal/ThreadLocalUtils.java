package com.sunshine.thread.threadlocal;

import java.util.Map;

public class ThreadLocalUtils {

    public static ThreadLocal<Map<String, String>> trialThreadLocal = new ThreadLocal<>();

    public static void setTrialMap(Map<String, String> trialMap) {
        trialThreadLocal.set(trialMap);
    }

    public static Map<String, String> getTrialMap() {
        return trialThreadLocal.get();
    }
}
