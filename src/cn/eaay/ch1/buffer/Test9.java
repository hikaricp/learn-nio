package cn.eaay.ch1.buffer;

import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

public class Test9 {
    public static void main(String[] args) {
        byte[] byteArray = {1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);

        byteBuffer.position(2);
        byteBuffer.mark();

        byteBuffer.flip();

        System.out.println("byteBuffer.position = " + byteBuffer.position());
        System.out.println();

        System.out.println("byteBuffer.limit = " + byteBuffer.limit());
        System.out.println();

        try {
            byteBuffer.reset();
        } catch (InvalidMarkException e) {
            System.out.println("byteBuffer mark 丢失");
        }
    }
}
