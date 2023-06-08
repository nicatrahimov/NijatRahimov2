package az.codersazerbaijan.prac3iyun;

import java.util.Collections;
import java.util.List;

public class StreamTask1 {
    public static void main(String[] args) {
List<Integer>stringList=List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> list = stringList.stream().sorted(Collections.reverseOrder()).toList();
        System.out.println(list);
    }
}
