package az.codersazerbaijan.prac24iyun.Task1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer>integers = List.of(1,2,3,4,55,22,1,23,21,2,31,31);
        List<Double> doubles = new ArrayList<>();
        doubles.add(1.2);
        doubles.add(12.41);
        doubles.add(12.15);
        doubles.add(92.21);
        doubles.add(111.2);
        doubles.add(133.33123);
        doubles.add(411.22);
        System.out.println(MaxNumber.maxNumberofArray(integers));
        System.out.println(MaxNumber.maxNumberofArray(doubles));
    }
}
