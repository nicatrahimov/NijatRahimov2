package az.codersazerbaijan.prac23may;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveRepeatedNumbers {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(14);
        arrayList.add(3);

        Set<Integer>hashSet=new HashSet<>(arrayList);
        System.out.println(hashSet);
    }
}
