package _02Java基础概念._03变量;

public class Main {

    // 变量: 在程序执行过程中, 其值有可能发生改变的量(数据)
    public static void main(String[] args) {

        // 变量的定义格式
            // 数据类型 变量名=数据值;
            // 数据类型: 限定了变量能存储数据的类型, int(整数), double(小数)...
            // 变量名: 就是存储空间的名字, 作用是方便以后使用！
            // 数据值: 真正存在变量中的数据

            // 等号: 赋值, 把右边的数据赋值给左边的变量！
        int a=11;
        System.out.println("a = " + a); // 11
    }
}

// 使用方法和注意事项！
class UsingMethod{

    // 变量的使用方式:
    public static void main(String[] args) {
        // 1.输出打印: 定义变量, 再进行输出打印
        int a=10;
        System.out.println("a = " + a);

        // 2.参与计算
        int b=20;
        int c=10;
        System.out.println(a + b);

        // 3.修改记录的值
        a=50;
        System.out.println("a = " + a);
        // --------------------------------------------
        // 变量的注意事项
        // 1.只能存储一个值
        // 2.变量名不允许重复定义
        // 3.一条语句可以定义多个变量
        int d=100, e=200, f=300;
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        // 4.变量再使用之前一定要进行赋值: 以后再定义变量的时候，请直接赋值，不要把赋值分开写！
        int g;
        g=20;
        System.out.println("g = " + g); // error:java: 可能尚未初始化变量g
    }
}

// 变量练习_计算公交车的人数！
class Exam {

    public static void main(String[] args) {

        // 乘客的数量：18
        // 经过4站
        int messages=18;
        for (int i = 0; i < 4; i++) {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            messages--;
            System.out.println("messages = " + messages);
        }

        System.out.println("FinalMessages = " + messages);
    }
}
