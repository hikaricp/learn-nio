package cn.eaay.ch1.buffer;

import java.nio.CharBuffer;

public class Test10 {
    public static void main(String[] args) {
        CharBuffer charBuffer = CharBuffer.allocate(20);
        System.out.println("A position = " + charBuffer.position() + " limit = " + charBuffer.limit());
        // 一共写入 14 个字
        charBuffer.put("我是中国人我在中华人民共和国");
        System.out.println("B position = " + charBuffer.position() + " limit = " + charBuffer.limit());
        charBuffer.position(0); // position 还原成 0
        System.out.println("C position = " + charBuffer.position() + " limit = " + charBuffer.limit());

        // 下面的 for 语句的打印效果 “国” 字后面有 6 个空格，这 6 个空格是无效的数据
        // 应该只打印前 14 个字符，后 6 个字符不再读取
        for (int i = 0; i < charBuffer.limit(); i++) {
            System.out.print(charBuffer.get());
        }
        System.out.println();

        // 下面的代码是正确读取数据的代码
        System.out.println("D position = " + charBuffer.position() + " limit = " + charBuffer.limit());


        // 还原缓冲区状态
        charBuffer.clear();
        System.out.println("E position = " + charBuffer.position() + " limit = " + charBuffer.limit());

        // 继续写入
        charBuffer.put("我是河北人");
        System.out.println("F position = " + charBuffer.position() + " limit = " + charBuffer.limit());

        // 设置 for 循环结束的位置，也就是新的 limit 值
        charBuffer.limit(charBuffer.position());
        charBuffer.position(0);
        System.out.println("G position = " + charBuffer.position() + " limit = " + charBuffer.limit());

        for (int i = 0; i < charBuffer.limit(); i++) {
            System.out.print(charBuffer.get());
        }
    }
}
