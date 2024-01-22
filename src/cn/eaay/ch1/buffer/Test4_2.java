package cn.eaay.ch1.buffer;

import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

public class Test4_2 {
    public static void main(String[] args) {
        byte[] byteArray = {1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        byteBuffer.position(2);
        byteBuffer.mark();

        byteBuffer.position(1);

        try {
            byteBuffer.reset();
        } catch (InvalidMarkException e) {
            System.out.println("byteBuffer 的 mark 标记无效");
        }
    }
}
