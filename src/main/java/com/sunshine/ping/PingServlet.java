package com.sunshine.ping;

/**
 * Created by wangtao on 2018/3/6.
 */

import com.fxiaoke.pms.api.PingMonitorClient;
import com.fxiaoke.pms.arg.PingMonitorArg;
import com.github.autoconf.base.ProcessInfo;
import com.github.autoconf.helper.ConfigHelper;
import com.google.common.base.Strings;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ping监控,返回"ok"
 *
 * @author hanmz
 */
@Slf4j
public class PingServlet extends HttpServlet {
    private static final String ROOT = "ROOT";
    private ProcessInfo processInfo = ConfigHelper.getProcessInfo();

    @Override
    public void init() throws ServletException {
        log.info("init Ping Servlet");
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().write("ok");
    }

    @Override
    public void destroy() {
        PingMonitorArg bean = buildPingMonitorArg();
        PingMonitorClient.offlineService(bean);
        log.info("unregister pingUrl: {}", bean.getPingUrl());
    }

    private PingMonitorArg buildPingMonitorArg() {
        PingMonitorArg bean = PingMonitorArg
            .builder()
            .appId(processInfo.getAppId())
            .ip(processInfo.getIp())
            .port(processInfo.getPort())
            .serviceName(processInfo.getName())
            .build();
        String server = processInfo.getIp() + ":" + processInfo.getPort();
        String path = processInfo.getPath();
        String pingUrl;
        if (Strings.isNullOrEmpty(path) || ROOT.equals(path)) {
            pingUrl = server + "/";
        } else {
            pingUrl = server + path;
        }
        bean.setPingUrl(pingUrl);
        return bean;
    }
}
