package com.sunshine.designpatterns.clone;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 原型模式
 * Created by wangtao on 2018/3/12.
 */
public class CloneClient {

    public static void main(String[] args) {

        Mail m = new Mail();
        m.setFrom("from");
        m.setToList(Arrays.asList("a","b","c"));

//        for (int i = 0; i < 10; i++) {
//            m.setContent("content_" + i);
//            m.setSubject("subject_" + i);
//            System.out.println(m);
//        }
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
//            m.setContent("content_" + i);
//            m.setSubject("subject_" + i);
//            System.out.println(m);
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    Mail mail = m.clone();
                    mail.setToList(Arrays.asList(Thread.currentThread().getName()));
                    mail.setContent("content_" + Thread.currentThread().getId());
                    mail.setSubject("subject_" + Thread.currentThread().getId());
                    System.out.println(mail);
                }
            });
        }

    }
}
