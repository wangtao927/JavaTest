package com.sunshine.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * Created by wangtao on 2017/3/6.
 */
public class TimeClientHandler extends ChannelInboundHandlerAdapter {

    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
         ByteBuf m = (ByteBuf) msg;
         long cuttentTime = m.readUnsignedInt() * 1000;
        System.out.println(cuttentTime);
        ctx.close();

    }


    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        //        ctx.fireExceptionCaught(cause);
        cause.printStackTrace();
        ctx.close();
    }
}
