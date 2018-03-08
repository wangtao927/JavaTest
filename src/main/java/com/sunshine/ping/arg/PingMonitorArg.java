package com.sunshine.ping.arg;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Created by wangtao on 2018/3/6.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PingMonitorArg {
    private long appId;
    private String ip;
    private String port;
    private String serviceName;
    private String pingUrl;
}
