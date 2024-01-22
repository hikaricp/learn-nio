package cn.eaay.ch1.buffer;

import java.nio.*;

public class Test6 {
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

        System.out.println("byteBuffer.isReadOnly = " + byteBuffer.isReadOnly());
        System.out.println("shortBuffer.isReadOnly = " + shortBuffer.isReadOnly());
        System.out.println("intBuffer.isReadOnly = " + intBuffer.isReadOnly());
        System.out.println("longBuffer.isReadOnly = " + longBuffer.isReadOnly());
        System.out.println("floatBuffer.isReadOnly = " + floatBuffer.isReadOnly());
        System.out.println("doubleBuffer.isReadOnly = " + doubleBuffer.isReadOnly());
        System.out.println("charBuffer.isReadOnly = " + charBuffer.isReadOnly());
    }
}
