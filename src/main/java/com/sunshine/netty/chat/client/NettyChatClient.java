package com.sunshine.netty.chat.client;

import com.sunshine.netty.chat.common.Constant;
import com.sunshine.netty.chat.server.NettyChatServer;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NettyChatClient {

    public void createClient() throws InterruptedException, IOException {

        EventLoopGroup works = new NioEventLoopGroup();

        try {
            Bootstrap bootstrap = new Bootstrap().group(works).channel(NioSocketChannel.class).handler(new SimpleChatChannelClientInitial());
            Channel channel = bootstrap.connect(Constant.IP_ADDRESS, Constant.SERVER_PORT).sync().channel();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String readStr = reader.readLine();
                if (!"bye".equalsIgnoreCase(readStr)) {
                    channel.writeAndFlush(readStr + "\r\n");

                } else {
                    channel.closeFuture().sync();
                    break;
                }
            }
        } finally {
            works.shutdownGracefully();
        }

    }

    public static void main(String[] args) throws IOException, InterruptedException {
        new NettyChatClient().createClient();
    }
}
