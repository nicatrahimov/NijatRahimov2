package az.codersazerbaijan.prac15iyun.Task4;

import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable {
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Serial
    private static final long serialVersionUID = 2002;
    String name;
    String surname;
    String age;

    public User(String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
