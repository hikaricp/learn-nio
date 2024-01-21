package cn.eaay.ch1.buffer;

import java.nio.ByteBuffer;

public class Test1_1 {
    public static void main(String[] args) {
        try {
            ByteBuffer byteBuffer = ByteBuffer.allocate(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("ByteBuffer 容量 capacity 大小不能为负数");
        }
    }
}
