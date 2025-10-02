package _02Java基础概念._02字面量;

public class Main {

    // 字面量: 数据在程序中的书写格式
    public static void main(String[] args) {

        // 字面量类型: 整数类型, 小数类型, 字符串类型, 字符类型, 布尔类型, 空类型
        // 整数类型
        System.out.println(666);
        System.out.println(-777);

        // 小鼠类型
        System.out.println(1.99);
        System.out.println(-7.77);

        // 字符串
        System.out.println("Houenfu 是大帅比！");
        System.out.println("Houenfu");

        // 字符
        System.out.println('N');
        System.out.println('M');

        // 布尔
        System.out.println(true);
        System.out.println(false);

        // 空
        // null是不能直接打印的
        // 如果我们要打印null, 那么只能用字符串的形式来打印！
        System.out.println("null");
        // -----------------------------------------------
        // \t 制表符:
            // 打印的时候, 会把前面的字符串的长度补齐到8, 或者8的整数倍, 最少补1个空格, 罪过补8个空格！
        System.out.println("Houe"+"\t"+"enfu");
        System.out.println("HHUUE\tiiwjjid");
        System.out.println("wwwww"+"\t"+"8899");
        // ------------------------------------------------
        // 熟悉制表符的基本用法
        System.out.println("------------------");
        System.out.println("name"+"\t"+"age");
        System.out.println("Houenfu"+"\t"+"22");

    }
}
