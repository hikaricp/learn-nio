package cn.eaay.ch1.buffer;

import java.nio.ByteBuffer;

public class Test12 {
    public static void main(String[] args) {
        // ByteBuffer byteBuffer = ByteBuffer.allocate(100);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100);
        byteBuffer.put((byte) 1);
        byteBuffer.put((byte) 2);
        System.out.println(byteBuffer.hasArray());
    }
}
