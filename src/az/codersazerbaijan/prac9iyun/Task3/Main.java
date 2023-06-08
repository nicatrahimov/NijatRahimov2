package az.codersazerbaijan.prac9iyun.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student>studentList = new ArrayList<>();
        Student student1 = new Student("Nicat","Rahimov",60,"603");
        studentList.add(student1);
        Student student2 = new Student("Murad ","Taghizade",59,"603");
        studentList.add(student2);
       Student student3 = new Student("Kamran","Isgenderli",48,"601");
        studentList.add(student3);


        Map<String,List<Student>>studentMap = studentList.stream().collect(Collectors.groupingBy(o->o.groupName));
        System.out.println(studentMap.toString());
    }
}
