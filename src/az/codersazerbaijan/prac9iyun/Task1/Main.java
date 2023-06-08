package az.codersazerbaijan.prac9iyun.Task1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

Set<Student> studentList = new HashSet<>();
        Student student1 = new Student("Nicat","Rahimov",60);
        studentList.add(student1);
        Student student2 = new Student("Murad ","Taghizade",59);
        studentList.add(student2);
        Student student3 = new Student("Kamran","Isgenderli",48);
        studentList.add(student3);
        System.out.println(studentList);

        System.out.println(studentList.stream().max((x1,x2)-> x1.compare(x1,x2)).get());

    }
}
