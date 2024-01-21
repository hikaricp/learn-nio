package cn.eaay.ch1.buffer;

import java.nio.ByteBuffer;

public class Test5 {
    public static void main(String[] args) {
        byte[] byteArray = {1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        System.out.println("byteBuffer.capacity = " + byteBuffer.capacity());
        System.out.println();

        byteBuffer.position(1);
        byteBuffer.mark(); // 在位置 1 设置 mark
        System.out.println("byteBuffer.position = " + byteBuffer.position());

        byteBuffer.position(2);
        byteBuffer.reset(); // 重置位置

        System.out.println();
        // 回到位置为 1 处
        System.out.println("byteBuffer.position = " + byteBuffer.position());

    }
}
