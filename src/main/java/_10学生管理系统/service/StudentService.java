package _10学生管理系统.service;

import _10学生管理系统.entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {

    // 添加学生
    public static void addStudent(ArrayList<Student> students){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入学生的id:");
        Integer id= scanner.nextInt();
        scanner.nextLine();

        System.out.println("请输入学生的姓名:");
        String name=scanner.nextLine();

        System.out.println("请输入学生的年龄:");
        Integer age=scanner.nextInt();
        scanner.nextLine();

        System.out.println("请输入学生的家庭住址:");
        String home=scanner.nextLine();


        boolean contains = contains(students, id);
        if(contains){
            System.out.println(id+"已经存在，请重新录入！");
            return;
        }

        Student student = new Student(id, name, age, home);
        students.add(student);
        System.out.println(student.getName()+"添加成功！");
    }

    // 删除学生
    public static void deleteStudent(ArrayList<Student> students){

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要删除的id:");
        Integer id=scanner.nextInt();
        scanner.nextLine();

        if(getIndex(students, id)<0){
            System.out.println(id+"并不存在！请重新输入！");
        }else{
            Student remove = students.remove(getIndex(students, id));
            System.out.println(remove.getId()+"已被删除！");
        }
    }

    // 修改学生
    public static void updateStudent(ArrayList<Student> students){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要修改的id:");
        int id = scanner.nextInt();
        if(getIndex(students, id)<0){

            System.out.println(id + "不存在！请重新输入！");
        }else{

            Student student = students.get(getIndex(students, id));
            // 删除！
            students.remove(student);

            // 输入信息并修改！
            scanner.nextLine();
            System.out.println("修改：请输入学生的姓名:");
            String name=scanner.nextLine();

            System.out.println("修改：请输入学生的年龄:");
            Integer age=scanner.nextInt();
            scanner.nextLine();

            System.out.println("修改：请输入学生的家庭住址:");
            String home=scanner.nextLine();

            student = new Student(id, name, age, home);
            students.add(student); // 添加！id不变！
        }
    }

    // 查询学生
    public static void queryStudent(ArrayList<Student> students){

        if(students.size()==0){
            System.out.println("当前无学生信息！请添加后再查询！");
            // 结束该方法！而不是main方法
            return;
            //System.exit(0);
        }

        // size不为0时打印！
        System.out.println("id\t\tName\t\tAge\t\tHome");
        students.forEach(
                student -> {
                    System.out.printf("%d\t\t%s\t\t%d\t\t%s\n", student.getId(), student.getName(), student.getAge(), student.getHome());
                    //System.out.println(); // 换行！ \n也可以！
                }
        );
    }

    // 判断id在集合中是否存在
    public static boolean contains(ArrayList<Student> students, Integer id){

        // 循环遍历，进行判断！
        for (int i = 0; i < students.size(); i++) {

            Student student = students.get(i);
            if (student.getId().compareTo(id) == 0) {
                return true; // 存在
            }
        }

        return false;
    }

    // 通过id获取索引的方法
    public static int getIndex(ArrayList<Student> students, Integer id){

        for (int i = 0; i < students.size(); i++) {

            Student student = students.get(i);
            if(student.getId().compareTo(id)==0){
                return i;
            }
        }
        // 循环结束之后还没有找到！就表示不存在，就返回-1
        return -1;
    }
}
