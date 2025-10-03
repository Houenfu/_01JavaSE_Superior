package _02Java基础概念._07键盘录入;

import java.util.Scanner;

public class Main {

    // 为什么有键盘录入？让变量中的数据更灵活！
    // 键盘录入: Java帮我们写好了一个类Scanner, 这个类就可以接收键盘输入的数字
        // 1.导包 --Scanner这个类在哪
        // 2.创建对象 --标识我要开始用Scanner这个类了
        // 3.接收数据 --真正开始干活了
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.printf("请输入整数:");
        int num = scanner.nextInt();
        System.out.println("num = " + num);

        // 判断录入的数据是否是整数
        System.out.print("请输入一个整数！");
        boolean changeInt = scanner.hasNextInt();
        System.out.println("changeInt = " + changeInt);
        // ------------------------------------------------
    }
}

// 键盘录入数字并求和-->练习
class Exam{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入数字a:");
        int a = scanner.nextInt();

        System.out.print("请输入数字b:");
        int b=scanner.nextInt();

        System.out.println(a+b);

        /*
        Integer S=100;
        Class<? extends Integer> aClass = S.getClass();
        System.out.println("aClass = " + aClass);*/
    }
}
