package cn.eaay.ch1.buffer;

import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

public class Test4_4 {
    public static void main(String[] args) {
        byte[] byteArray = {1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);

        System.out.println("A byteBuffer position = " + byteBuffer.position() + " limit = " + byteBuffer.limit());
        System.out.println();

        byteBuffer.position(2);
        byteBuffer.mark();

        System.out.println("B byteBuffer position = " + byteBuffer.position() + " limit = " + byteBuffer.limit());

        byteBuffer.limit(1);
        System.out.println();

        System.out.println("C byteBuffer position = " + byteBuffer.position() + " limit = " + byteBuffer.limit());

        System.out.println();

        try {
            byteBuffer.reset();
        } catch (InvalidMarkException e) {
            System.out.println("byteBuffer mark 丢失");
        }

    }
}
