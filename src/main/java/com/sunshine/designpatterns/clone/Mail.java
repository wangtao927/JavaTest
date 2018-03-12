package com.sunshine.designpatterns.clone;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangtao on 2018/3/12.
 */

@Data
public class Mail implements Cloneable {

    private String from;

    private List<String> toList;

    private String subject;

    private String content;


    @Override
    protected Mail clone() {

        try {
            Mail mail = (Mail)super.clone();
            return mail;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

}
