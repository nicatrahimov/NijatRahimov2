package az.codersazerbaijan.prac10iyun.Task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B {
    public static void main(String[] args) throws NoSuchMethodException {

        Class aClass = A.class;


        Constructor[] constructor = aClass.getDeclaredConstructors();

        for (Constructor c : constructor) {
            System.out.println(c.getName());
        }
      List<Constructor> asad = Arrays.stream(constructor).filter(x -> Modifier.toString(x.getModifiers()).equals("private")).toList();

//        asad.stream().map(x->x.setAccessible(true)).forEach(System.out::println);


    }
}
