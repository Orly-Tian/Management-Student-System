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
          System.out.println("    ��ӭ����ѧ������ϵͳ��");
          System.out.println("+-------------------------------------+");
          System.out.println("    ��ѡ�����¶�Ӧ�Ĺ��ܣ�");

          System.out.println("+-------------------------------------+");
          System.out.println("    1. ���ѧ����Ϣ");
          System.out.println("    2. ɾ��ѧ����Ϣ");
          System.out.println("    3. �޸�ѧ����Ϣ");
          System.out.println("    4. ͨ��ѧ�Ų鿴����ѧ����Ϣ");
          System.out.println("    5. �鿴����ѧ����Ϣ");
          System.out.println("    6. �˳�����ϵͳ");

          System.out.println("+-------------------------------------+");
          System.out.println("    ����������Ҫѡ��Ĳ�����");
     }


     public void add() {
          Student student = new Student();
          System.out.println("������ѧ����������");
          student.name = scanner.next();
          System.out.println("������ѧ����ѧ�ţ�");
          student.number = scanner.next();
          System.out.println("������ѧ�������ĳɼ���");
          student.Chinese = scanner.next();
          System.out.println("������ѧ������ѧ�ɼ���");
          student.math = scanner.next();
          System.out.println("������ѧ����Ӣ��ɼ���");
          student.English = scanner.next();
          System.out.println("��ӳɹ���");
          System.out.println("");

          StuHashMap.put(student.number, student);
     }


     public void del(String num) {
          System.out.println("����������Ҫɾ��ѧ����ѧ�ţ�");
          String del_num = scanner.next();
          StuHashMap.remove(del_num);
     }


     public void change(String num) {
          System.out.println("����������Ҫ�޸�ѧ����ѧ�ţ�");
          String chan_num = scanner.next();
          Student student = Student.StuHashMap.get(chan_num);
          System.out.println("�޸�����");
          String name=scanner.next();
          System.out.println("�޸����ĳɼ�");
          String Chinese=scanner.next();
          System.out.println("�޸���ѧ�ɼ�");
          String math=scanner.next();
          System.out.println("�޸�Ӣ��ɼ�");
          String English=scanner.next();

          student.name=name;
          student.Chinese=Chinese;
          student.math=math;
          student.English=English;
          StuHashMap.put(student.number, student);
     }


     public void query(String num) {
          System.out.println("����������Ҫ��ѯѧ����ѧ�ţ�");
          String query_num = scanner.next();
          Student student = Student.StuHashMap.get(query_num);
          System.out.println("����\t\t" + student.name);
          System.out.println("ѧ��\t\t" + student.number);
          System.out.println("���ĳɼ�\t\t" + student.Chinese);
          System.out.println("��ѧ�ɼ�\t\t" + student.math);
          System.out.println("Ӣ��ɼ�\t\t" + student.English);
     }


     public void show() {
          System.out.println("����ѧ������Ϣ���£�");

     }


     public void exit() {
          System.out.println("�����˳���ϵͳ��");
          System.out.println("��ӭ���´�ʹ�ã�");
          // break;
     }
}
