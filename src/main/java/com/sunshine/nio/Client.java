package com.sunshine.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by wangtao on 2017/3/6.
 */
public class Client {


    Selector selector;

    public void initClient(String ip, int port) throws IOException {

        SocketChannel channel = SocketChannel.open();
        channel.configureBlocking(false);

        selector = Selector.open();

        channel.connect(new InetSocketAddress(ip, port));

        channel.register(selector, SelectionKey.OP_CONNECT);


    }

    public void listen() throws IOException {

        while (true) {
            selector.select();

            Iterator it = this.selector.selectedKeys().iterator();
            while (it.hasNext()) {
                SelectionKey key = (SelectionKey) it.next();
                it.remove();

                if (key.isConnectable()) {

                    SocketChannel channel = (SocketChannel) key.channel();

                    if (channel.isConnectionPending()) {
                        channel.finishConnect();
                    }
                    channel.configureBlocking(false);

                    channel.write(ByteBuffer.wrap(new String("向服务器端发送一条信息").getBytes()));

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

        System.out.println("客户端收到消息:" +  msg);


//        ByteBuffer outBuffer = ByteBuffer.wrap(msg.getBytes());
//        channel.write(outBuffer);
        Scanner scanner = new Scanner(System.in);

        String nextLine = scanner.nextLine();
        while (!"exit".equals(nextLine)) {

            channel.write(ByteBuffer.wrap(nextLine.getBytes()));
            nextLine = scanner.nextLine();
        }

    }

    public static void main(String[] args) throws IOException {
        Client client = new Client();

        client.initClient("localhost", 8000);
        client.listen();
    }
}
