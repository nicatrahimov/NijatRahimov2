package az.codersazerbaijan.prac24iyun.Task3;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Person pr = new Person();
        pr.age=10;
    }
    static {
        Class clazz = Person.class;
        Annotation[] annotation = clazz.getDeclaredAnnotations();
        System.out.println(Arrays.toString(annotation));
    }
}
