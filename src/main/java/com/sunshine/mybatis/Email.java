package com.sunshine.mybatis;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wangtao on 2018/2/24.
 */
@Data
public class Email implements Serializable {

    private Long id;
    private String userId;
    private int status;
    private boolean receiveSsl;
    private boolean sendSsl;
    private String account;
    private String password;
    private String remark;
    private int emailType;
    private long emailConfigId;
    private Date createTime;
    private Date updateTime;
    private String signature;

    private String phone;
}
