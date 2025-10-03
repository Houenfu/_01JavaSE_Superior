package _03运算符._01算术运算符;

import java.util.Scanner;

public class Main {

    // 运算符！对字面量或者变量进行操作的符号
    // 表达式！用运算符把字面量或者变量连接起来，符合Java语法的式子就可以称为表达式！
    public static void main(String[] args) {

        // 算术运算符: +, -, *, /, %
    }
}

// 数值拆分！录入一个三位数，将其中拆分为个位 十位 百位
class Exam{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个三位数:");
        Integer number = scanner.nextInt();

        String str = number.toString();
        char[] charArray = str.toCharArray();
        char bai = charArray[0];
        char shi = charArray[1];
        char ge = charArray[2];

        System.out.println("ge = " + ge);
        System.out.println("shi = " + shi);
        System.out.println("bai = " + bai);
    }
}
