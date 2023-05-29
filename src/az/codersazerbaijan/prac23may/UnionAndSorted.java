package az.codersazerbaijan.prac23may;

import java.util.*;

public class UnionAndSorted {
    public static void main(String[] args) {
        List<Integer>arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(1);
        arrayList.add(7);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(12);
        arrayList.add(11);
        arrayList.add(11);
        arrayList.add(11);
        arrayList.add(12);

        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
