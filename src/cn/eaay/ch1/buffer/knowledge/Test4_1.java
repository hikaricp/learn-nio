package cn.eaay.ch1.buffer.knowledge;

import java.nio.ByteBuffer;

public class Test4_1 {
    public static void main(String[] args) {
        byte[] byteArray = {1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        byteBuffer.position(1);
        byteBuffer.mark();

        System.out.println("byteBuffer 在 " + byteBuffer.position() + " 位置设置 mark 标记");

        byteBuffer.position(2);
        byteBuffer.reset();
        System.out.println();
        System.out.println("byteBuffer 回到 " + byteBuffer.position() + " 位置");
    }
}
