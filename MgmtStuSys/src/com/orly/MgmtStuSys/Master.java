package com.orly.MgmtStuSys;

import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;

import java.util.HashMap;
import java.util.Scanner;

public class Master {
    public static void main(String[] args){


        while (true) {
            Student student = new Student();

            student.welcome();

            Scanner scanner = new Scanner(System.in);
            String code = scanner.next();
            switch (code) {
                case "1" :
                    student.add(); break;
                case "2" :
                    student.del(student.number); break;
                case "3" :
                    student.change(student.number); break;
                case "4" :
                    student.query(student.number); break;
                case "5" :
                    student.show() ; break;
                case "6" :
                    student.exit(); break;
                default:
                    System.out.println("您输入的未找到，请重新输入！");
            }
            if (code.equals("6"))
                break;
        }
    }
}
