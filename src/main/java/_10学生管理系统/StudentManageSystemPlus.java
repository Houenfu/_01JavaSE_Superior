package _10学生管理系统;

import _10学生管理系统.service.StudentService;

import java.util.Scanner;

public class StudentManageSystemPlus {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choose = scanner.nextInt();
        scanner.nextLine();
        switch (choose){

            case 1->{
                System.out.println("登录！");


                // 登录成功！
                StudentManageSystem.main(args);
            }

            case 2->{
                System.out.println("注册！");
            }

            case 3->{
                System.out.println("忘记密码！");
            }
        }
    }
}