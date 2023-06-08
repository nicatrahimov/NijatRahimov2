package az.codersazerbaijan.prac9iyun.Task1;

import java.util.Comparator;

public class Student  {
    public String name;
    public String surname;
    public Integer age;

    public Student(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }


    public int compare(Student o1, Student o2) {
        return o1.age.compareTo(o2.age);
    }
}
