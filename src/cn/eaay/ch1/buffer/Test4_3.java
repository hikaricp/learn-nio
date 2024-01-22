package cn.eaay.ch1.buffer;

import java.nio.ByteBuffer;

public class Test4_3 {
    public static void main(String[] args) {
        byte[] byteArray = {1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);

        System.out.println("A byteBuffer position = " + byteBuffer.position() + " limit = " + byteBuffer.limit());
        System.out.println();

        byteBuffer.position(2);
        byteBuffer.mark();

        System.out.println("B byteBuffer position = " + byteBuffer.position() + " limit = " + byteBuffer.limit());

        byteBuffer.position(3);
        byteBuffer.limit(3);
        System.out.println();

        System.out.println("C byteBuffer position = " + byteBuffer.position() + " limit = " + byteBuffer.limit());

        byteBuffer.reset();
        System.out.println();

        System.out.println("D byteBuffer position = " + byteBuffer.position() + " limit = " + byteBuffer.limit());
    }
}
