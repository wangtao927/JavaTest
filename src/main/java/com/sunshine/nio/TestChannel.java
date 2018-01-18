package com.sunshine.nio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;

/**
 * Created by wangtao on 2017/3/6.
 */
public class TestChannel {

    public static void main(String[] args) {
        TestChannel testChannel = new TestChannel();

        DatagramChannel datagramChannel;
        SocketChannel socketChannel;

    }

    public void testFileChannel() throws IOException {

        RandomAccessFile accessFile = new RandomAccessFile("d://key//mersure.jks", "rw");
        FileChannel fileChannel = accessFile.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        int result = fileChannel.read(byteBuffer);

        while (result != -1) {
            // 用flip 切换读写模式
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                System.out.println(byteBuffer.get());

            }
            byteBuffer.clear();
            result = fileChannel.read(byteBuffer);
        }
        accessFile.close();


    }
}
