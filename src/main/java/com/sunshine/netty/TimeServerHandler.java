package com.sunshine.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * Created by wangtao on 2017/3/6.
 */
public class TimeServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        ByteBuf time = ctx.alloc().buffer(4);

        time.writeInt((int)(System.currentTimeMillis()/1000L));
        ChannelFuture f = ctx.writeAndFlush(time);

        f.addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture future) throws Exception {
                assert f == future;
                ctx.close();
            }
        });


    }


//    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
//        //        ctx.fireChannelRead(msg);
////        ((ByteBuf) msg).release();
//        ctx.write(msg); // (1)
//        ctx.flush(); // (2)
//    }


    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        //        ctx.fireExceptionCaught(cause);
        cause.printStackTrace();
        ctx.close();
    }
}
