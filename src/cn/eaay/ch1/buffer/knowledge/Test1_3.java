package cn.eaay.ch1.buffer.knowledge;

import java.nio.ByteBuffer;

public class Test1_3 {
    public static void main(String[] args) {
        byte[] byteArray = new byte[]{1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        try {
            byteBuffer = (ByteBuffer) byteBuffer.position(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("ByteBuffer 位置 position 大小不能为负数");
        }
    }
}
