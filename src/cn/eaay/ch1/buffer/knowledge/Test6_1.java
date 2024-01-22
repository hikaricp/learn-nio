package cn.eaay.ch1.buffer.knowledge;

import java.nio.ByteBuffer;

public class Test6_1 {
    public static void main(String[] args) {
        byte[] byteArray = {1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);

        byteBuffer.position(3);

        System.out.println("byteBuffer limit(2) 之前的位置 " + byteBuffer.position());

        byteBuffer.limit(2);

        System.out.println("byteBuffer limit(2) 之后的位置 " + byteBuffer.position());
    }
}
