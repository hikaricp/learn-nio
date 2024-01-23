package cn.eaay.ch1.buffer;

import java.nio.ByteBuffer;

public class Test7 {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100);
        System.out.println(byteBuffer.isDirect());
    }
}
