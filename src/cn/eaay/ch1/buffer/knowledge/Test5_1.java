package cn.eaay.ch1.buffer.knowledge;

import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

public class Test5_1 {
    public static void main(String[] args) {
        byte[] byteArray = {1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        try {
            byteBuffer.reset();
        } catch (InvalidMarkException e) {
            System.out.println("byteBuffer 的 mark 标记无效");
        }
    }
}
