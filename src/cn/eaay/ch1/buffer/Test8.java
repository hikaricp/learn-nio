package cn.eaay.ch1.buffer;

import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

public class Test8 {
    public static void main(String[] args) {
        byte[] byteArray = new byte[]{1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);

        byteBuffer.position(2);
        byteBuffer.limit(3);
        byteBuffer.mark();

        byteBuffer.clear();

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
