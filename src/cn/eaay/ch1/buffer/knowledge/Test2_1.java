package cn.eaay.ch1.buffer.knowledge;

import java.nio.ByteBuffer;

public class Test2_1 {
    public static void main(String[] args) {
        byte[] byteArray = new byte[]{1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        byteBuffer.limit(2);
        try {
            byteBuffer.position(3);
        } catch (IllegalArgumentException e) {
            System.out.println("ByteBuffer 的 position 位置不能大于其 limit 限制");
        }
    }
}
