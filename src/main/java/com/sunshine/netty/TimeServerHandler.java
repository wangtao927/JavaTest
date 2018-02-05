package com.sunshine.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;

import java.net.InetAddress;
import java.util.Date;

/**
 * Created by wangtao on 2017/3/6.
 */
public class TimeServerHandler extends SimpleChannelInboundHandler<String> {

    private int counter;
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        // Send greeting for a new connection.
        ctx.write("Welcome to " + InetAddress.getLocalHost().getHostName() + "!\r\n");
        ctx.write("It is " + new Date() + " now.\r\n");
        ctx.flush();
    }
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {

        System.out.println("server receive:" + msg + "; the counter is " + counter++);
        ChannelFuture future = ctx.write("receive body:" + msg);

        // Close the connection after sending 'Have a good day!'
        // if the client has sent 'bye'.
        if (msg.equals("bye")) {
            future.addListener(ChannelFutureListener.CLOSE);
        }
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {

        ctx.flush();
    }


    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        //        ctx.fireExceptionCaught(cause);
        cause.printStackTrace();
        ctx.close();
    }
}
