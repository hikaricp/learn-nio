package cn.eaay.ch1.buffer;

import java.nio.ByteBuffer;

public class Test3_1 {
    public static void main(String[] args) {
        byte[] byteArray = {1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        try {
            byteBuffer.limit(100);
        } catch (IllegalArgumentException e) {
            System.out.println("ByteBuffer 的 limit 不能大于其 capacity 容量");
        }
    }
}
