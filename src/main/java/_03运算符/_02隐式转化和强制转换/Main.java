package _03运算符._02隐式转化和强制转换;

public class Main {

    public static void main(String[] args) {

        // 1."+"操作的三种情况
            // a.数字相加
            // b.字符串相加
            // c.字符相加
        // -------------------------------
        // 隐式转换：取值范围小的数值-->取值范围大的数值
        // 强制转换：取值范围大的数值-->取值范围小的数值

        // ---------------------------------------------------------
        // 隐式转换小结
            // 取值范围: byte<short<int<long<float<double
            // 什么时候转换？数据类型不一样，不能进行计算，需要转成一样的才可以进行计算
            // 转换规则：
                // 取值范围小的，和取值范围大的进行计算，小的会先提升为大的，再进行运算
                // byte, short, char 三种类型的数据在运算的时候，都会直接先提升为int, 然后再进行运算
    }
}

// 练习：请问最终的运算结果是什么类型？
class Exam{

    public static void main(String[] args) {
        byte b1=10;
        byte b2=20;
        int result = b1 + b2;

        System.out.println("result = " + result);
        // --------------------------------------

        int i=10;
        long n=100L;
        long aLong = i + n;
    }
}
