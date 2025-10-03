package _10学生管理系统;

import _10学生管理系统.entity.Student;
import _10学生管理系统.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManageSystem {

    // 需求文档
    // 需求：采取控制台的方式去书写学生管理系统
    // 初始菜单！
        // -------------欢迎来到！！！---------------
        // 添加， 删除， 修改， 查询， 退出！
        // 请输入您的选择？！
    // 学生类：id, 姓名, 年龄, 家庭住址！
    // 添加：键盘录入每一个学生的信息，并添加， id唯一
    // 删除：通过id删除学生的信息，id存在删除，id不存在时需要提示不存在！
    // 修改：id存在，继续录入其他信息，id不存在，需要提示不存在
    // 查询：如果没有，需要提示无学生信息，如果有，需要按excel表的格式输出！

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        // 主流！NB
        loop:while (true) {
            Scanner scanner = new Scanner(System.in);

            boolean quit=false;

            System.out.println("----欢迎来到学生管理系统-----");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.print("请输入您的选择！");

            int choose = scanner.nextInt();
            switch (choose){
                case 1->{
                    System.out.println("添加学生");
                    StudentService.addStudent(students);
                }
                case 2->{
                    System.out.println("删除学生");
                    StudentService.deleteStudent(students);
                }
                case 3->{
                    System.out.println("修改学生");
                    StudentService.updateStudent(students);
                }
                case 4->{
                    System.out.println("查询学生");
                    StudentService.queryStudent(students);
                }
                case 5->{
                    System.out.println("退出！");
                    //quit=true; // low 货
                    break loop;
                    //System.exit(0); // 停止虚拟机运行！
                    //return; // 也能达到一定的效果
                }
                default->{
                    System.out.println("没有这个指令！");
                }
            }
            // 退出指令！这种太low了！
            /*
            if(quit){
                break;
            }*/
        }
    }
}
