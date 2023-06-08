package az.codersazerbaijan.prac9iyun.Task3;

public class Student {
    public String name;
    public String surname;
    public Integer age;
    public String groupName;

    public Student(String name, String surname, Integer age,String groupName) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.groupName=groupName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
