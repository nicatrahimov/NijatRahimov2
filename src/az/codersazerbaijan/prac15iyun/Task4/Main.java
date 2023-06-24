package az.codersazerbaijan.prac15iyun.Task4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("student","STUDENT","Clazz");
        User user = new User("user","USER","Age");


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\coders\\NijatRahimov2\\untitled\\src\\az\\codersazerbaijan\\prac15iyun\\Task4\\objects.txt"));
        oos.writeObject(user);

        System.out.println(user);
        System.out.println(student);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\coders\\NijatRahimov2\\untitled\\src\\az\\codersazerbaijan\\prac15iyun\\Task4\\objects.txt"));
        ois.readObject();

        System.out.println(user);
        System.out.println(student);
    }
}
