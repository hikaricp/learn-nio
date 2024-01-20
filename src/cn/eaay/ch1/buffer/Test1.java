package cn.eaay.ch1.buffer;

import java.nio.*;

public class Test1 {
    public static void main(String[] args) {
        byte[] byteArray = {1, 2, 3};
        short[] shortArray = {1, 2, 3, 4};
        int[] intArray = {1, 2, 3, 4, 5};
        long[] longArray = {1, 2, 3, 4, 5, 6};
        float[] floatArray = {1, 2, 3, 4, 5, 6, 7};
        double[] doubleArray = {1, 2, 3, 4, 5, 6, 7, 8};
        char[] charArray = {'a', 'b', 'c', 'd'};

        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        ShortBuffer shortBuffer = ShortBuffer.wrap(shortArray);
        IntBuffer intBuffer = IntBuffer.wrap(intArray);
        LongBuffer longBuffer = LongBuffer.wrap(longArray);
        FloatBuffer floatBuffer = FloatBuffer.wrap(floatArray);
        DoubleBuffer doubleBuffer = DoubleBuffer.wrap(doubleArray);
        CharBuffer charBuffer = CharBuffer.wrap(charArray);

        System.out.println("byteBuffer = " + byteBuffer.getClass().getName());
        System.out.println("shortBuffer = " + shortBuffer.getClass().getName());
        System.out.println("intBuffer = " + intBuffer.getClass().getName());
        System.out.println("longBuffer = " + longBuffer.getClass().getName());
        System.out.println("floatBuffer = " + floatBuffer.getClass().getName());
        System.out.println("doubleBuffer = " + doubleBuffer.getClass().getName());
        System.out.println("charBuffer = " + charBuffer.getClass().getName());

        System.out.println();

        System.out.println("byteBuffer.capacity = " + byteBuffer.capacity());
        System.out.println("shortBuffer.capacity = " + shortBuffer.capacity());
        System.out.println("intBuffer.capacity = " + intBuffer.capacity());
        System.out.println("longBuffer.capacity = " + longBuffer.capacity());
        System.out.println("floatBuffer.capacity = " + floatBuffer.capacity());
        System.out.println("doubleBuffer.capacity = " + doubleBuffer.capacity());
        System.out.println("charBuffer.capacity = " + charBuffer.capacity());
    }
}
