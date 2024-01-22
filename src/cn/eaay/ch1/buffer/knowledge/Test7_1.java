package cn.eaay.ch1.buffer.knowledge;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class Test7_1 {
    public static void main(String[] args) {
        char[] charArray = new char[]{'a', 'b', 'c', 'd'};
        CharBuffer charBuffer = CharBuffer.wrap(charArray);

        System.out.println("A capacity() = " + charBuffer.capacity() + " limit() = " + charBuffer.limit() + " position() = " + charBuffer.position());

        System.out.println();
        charBuffer.position(1);
        charBuffer.limit(1);
        charBuffer.put("z");
    }
}
