package az.codersazerbaijan.prac15iyun.Task4;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 2002;
    String name;
    String surname;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", clazz='" + clazz + '\'' +
                '}';
    }

    String clazz;

    public Student(String name, String surname, String clazz) {
        this.name = name;
        this.surname = surname;
        this.clazz = clazz;
    }
}
