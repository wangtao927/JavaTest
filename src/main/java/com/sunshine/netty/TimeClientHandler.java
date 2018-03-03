package com.sunshine.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.SimpleChannelInboundHandler;
import sun.java2d.pipe.SpanShapeRenderer;

/**
 * Created by wangtao on 2017/3/6.
 */
public class TimeClientHandler extends SimpleChannelInboundHandler<String> {

    private int counter;

    public TimeClientHandler() {
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        System.out.println("client body" + msg + "; counter is " + counter++ );

    }



    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
