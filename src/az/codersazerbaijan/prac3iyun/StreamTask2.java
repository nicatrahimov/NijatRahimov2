package az.codersazerbaijan.prac3iyun;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class StreamTask2 {
    public static void main(String[] args) {
        Integer length=0;
        String str = "Hello my name is Gustavo,but you can call me gus";
        List<String> stringList = Arrays.stream(str.split(" ")).toList();
        System.out.println(stringList);

    }
}
