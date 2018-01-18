package com.sunshine.nio;

import com.rabbitmq.client.AMQP;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * Created by wangtao on 2017/3/6.
 */
public class Server {

    Selector selector;

    public void initServer(int port) throws IOException {
        // 获取一个socket通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();

        //
        serverSocketChannel.configureBlocking(false);

        serverSocketChannel.socket().bind(new InetSocketAddress(port));

        this.selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
    }

    public void listen() throws IOException {

        System.out.println("服务器端启动");
        while (true) {
            selector.select();
            Iterator it = selector.selectedKeys().iterator();
            while (it.hasNext()) {

                SelectionKey key = (SelectionKey) it.next();
                it.remove();
                if (key.isAcceptable()) {
                    ServerSocketChannel server = (ServerSocketChannel)key.channel();

                    SocketChannel channel = server.accept();

                    channel.configureBlocking(false);
                    channel.write(ByteBuffer.wrap(new String("向客户端发送一条消息").getBytes()));

                    channel.register(selector, SelectionKey.OP_READ);
                } else {
                    read(key);
                }


            }

        }

    }

    public void read(SelectionKey key) throws IOException {
        SocketChannel channel = (SocketChannel) key.channel();
        ByteBuffer buffer = ByteBuffer.allocate(10);
        channel.read(buffer);

        byte[] data = buffer.array();

        String msg = new String(data).trim();

        System.out.println("服务器端收到消息:" +  msg);

        ByteBuffer outBuffer = ByteBuffer.wrap(msg.getBytes());
        channel.write(outBuffer);

    }

    public static void main(String[] args) throws IOException {

        // 1. 问题 拆包的问题

        Server server = new Server();
        server.initServer(8000);
        server.listen();

    }

}
