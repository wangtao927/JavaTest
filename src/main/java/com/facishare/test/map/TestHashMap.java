package com.facishare.test.map;

/**
 * Created by wangtao on 2016/9/13.
 */
public class TestHashMap {


    static TestHashMap _instance;


    public static TestHashMap getInstanceDC() {
        if (_instance == null) {                // Single Checked
            synchronized (TestHashMap.class) {
                if (_instance == null) {        // Double checked
                    _instance = new TestHashMap();
                }
            }
        }
        return _instance;
    }



}
