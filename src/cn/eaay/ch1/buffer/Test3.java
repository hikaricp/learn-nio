package cn.eaay.ch1.buffer;

import java.nio.CharBuffer;

public class Test3 {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd'};
        CharBuffer charBuffer = CharBuffer.wrap(charArray);
        System.out.println("A capacity() = " + charBuffer.capacity() + " limit() = " + charBuffer.limit() + " position() = " + charBuffer.position());
        charBuffer.position(2);
        System.out.println("C capacity() = " + charBuffer.capacity() + " limit() = " + charBuffer.limit() + " position() = " + charBuffer.position());
        charBuffer.put('z'); // 下一个读取或写入操作的 index
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
    }
}
