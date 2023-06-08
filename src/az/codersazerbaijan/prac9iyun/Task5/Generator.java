package az.codersazerbaijan.prac9iyun.Task5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generator {

    public static List<Integer> generateAndAdd(){
        List<Integer>integers=new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            integers.add(random.nextInt(100));
        }
return integers;
    }
    public static void main(String[] args) {
        List<Integer>integers = generateAndAdd();
        System.out.println(integers);
        Map<Integer,List<Integer>>intMap= integers.stream().collect(Collectors.groupingBy((Integer x)->x));
        System.out.println(intMap);
    }
}
