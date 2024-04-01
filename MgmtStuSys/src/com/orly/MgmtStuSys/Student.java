package com.orly.MgmtStuSys;

import java.util.HashMap;
import java.util.Scanner;

public class Student {
     Scanner scanner = new Scanner(System.in);
     static HashMap<String, Student> StuHashMap = new HashMap<>();

     public String name;
     public String number;
     public String Chinese;
     public String math;
     public String English;


     public void welcome() {
          System.out.println("+-------------------------------------+");
          System.out.println("    欢迎来到学生管理系统！");
          System.out.println("+-------------------------------------+");
          System.out.println("    请选择以下对应的功能：");

          System.out.println("+-------------------------------------+");
          System.out.println("    1. 添加学生信息");
          System.out.println("    2. 删除学生信息");
          System.out.println("    3. 修改学生信息");
          System.out.println("    4. 通过学号查看单个学生信息");
          System.out.println("    5. 查看所有学生信息");
          System.out.println("    6. 退出管理系统");

          System.out.println("+-------------------------------------+");
          System.out.println("    请输入您想要选择的操作：");
     }


     public void add() {
          Student student = new Student();
          System.out.println("请输入学生的姓名：");
          student.name = scanner.next();
          System.out.println("请输入学生的学号：");
          student.number = scanner.next();
          System.out.println("请输入学生的语文成绩：");
          student.Chinese = scanner.next();
          System.out.println("请输入学生的数学成绩：");
          student.math = scanner.next();
          System.out.println("请输入学生的英语成绩：");
          student.English = scanner.next();
          System.out.println("添加成功！");
          System.out.println("");

          StuHashMap.put(student.number, student);
     }


     public void del(String num) {
          System.out.println("请输入您想要删除学生的学号：");
          String del_num = scanner.next();
          StuHashMap.remove(del_num);
     }


     public void change(String num) {
          System.out.println("请输入您想要修改学生的学号：");
          String chan_num = scanner.next();
          Student student = Student.StuHashMap.get(chan_num);
          System.out.println("修改姓名");
          String name=scanner.next();
          System.out.println("修改语文成绩");
          String Chinese=scanner.next();
          System.out.println("修改数学成绩");
          String math=scanner.next();
          System.out.println("修改英语成绩");
          String English=scanner.next();

          student.name=name;
          student.Chinese=Chinese;
          student.math=math;
          student.English=English;
          StuHashMap.put(student.number, student);
     }


     public void query(String num) {
          System.out.println("请输入您想要查询学生的学号：");
          String query_num = scanner.next();
          Student student = Student.StuHashMap.get(query_num);
          System.out.println("姓名\t\t" + student.name);
          System.out.println("学号\t\t" + student.number);
          System.out.println("语文成绩\t\t" + student.Chinese);
          System.out.println("数学成绩\t\t" + student.math);
          System.out.println("英语成绩\t\t" + student.English);
     }


     public void show() {
          System.out.println("所有学生的信息如下：");

     }


     public void exit() {
          System.out.println("即将退出该系统！");
          System.out.println("欢迎您下次使用！");
          // break;
     }
}
