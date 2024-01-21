package cn.eaay.ch1.buffer;

import java.nio.ByteBuffer;

public class Test1_2 {
    public static void main(String[] args) {
        byte[] byteArray = new byte[]{1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        try {
            byteBuffer = (ByteBuffer) byteBuffer.limit(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("ByteBuffer 限制 limit 大小不能为负数");
        }
    }
}
