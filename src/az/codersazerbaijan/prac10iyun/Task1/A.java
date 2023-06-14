package az.codersazerbaijan.prac10iyun.Task1;

public class A {
    private String name;
    private String surname;

    public A(){

    }
     private A(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
