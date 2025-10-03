package _02Java基础概念._05数据类型;

public class Main {

    public static void main(String[] args) {

        // 基本数据类型
        // 整数, byte, int, short, long
        byte aByte=10;
        int aInt=1000;
        short aShort=333;
        long aLong=1000L;

        System.out.println("aByte = " + aByte);
        System.out.println("aInt = " + aInt);
        System.out.println("aShort = " + aShort);
        System.out.println("aLong = " + aLong);

        // 浮点数, float, double
        float aFloat=1.22f;
        double aDouble=3.33;

        System.out.println("aFloat = " + aFloat);
        System.out.println("aDouble = " + aDouble);

        // 字符, char
        char aChar='中';

        System.out.println("aChar = " + aChar);

        // 布尔, boolean
        boolean aTrue=true;
        boolean aFalse=false;

        System.out.println("aTrue = " + aTrue);
        System.out.println("aFalse = " + aFalse);
        // 引用数据类型
        // ------------------------------------------
        // Java语言的数据类型分为: 基本数据类型, 引用数据类型
        // 基本数据类型的四类八种
            // 整数: byte, int, short, long
            // 浮点数: float, long
            // 字符: char
            // 布尔: boolean
        // byte的取值范围: -128~127
        // 整数和小数取值范围的大小关系: double>float>long>int>short>byte
        // long类型变量: 需要加入L标识（大小写都可以）
        // float类型变量: 需要加入F标识（大小写都可以）
    }
}
