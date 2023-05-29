package az.codersazerbaijan.prac23may;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionAndUnion {
    public static void main(String[] args) {
        List<Integer>arrayList=new ArrayList<>();
        List<Integer>arrayList1=new ArrayList<>();
        HashSet<Integer>intersection=new HashSet<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(13);

        arrayList1.add(1);
        arrayList1.add(5);
        arrayList1.add(6);
        arrayList1.add(9);
        arrayList1.add(3);
        arrayList1.add(7);
        arrayList1.add(3);
        arrayList1.add(10);
        arrayList1.add(34);
        arrayList1.add(99);
        System.out.print("List 1: ");
        System.out.println(arrayList);
        System.out.print("List 2: ");
        System.out.println(arrayList1);

        for (Integer arrNumber :
                arrayList) {
            if (arrayList1.contains(arrNumber)){
                intersection.add(arrNumber);
            }
        }
        HashSet<Integer>union=new HashSet<>(arrayList);
        for (Integer arrNumber1 :
                arrayList1) {
            if (!union.contains(arrNumber1)){
                union.add(arrNumber1);
            }
        }
        System.out.println("intersection" + intersection);
        System.out.println("union"+union);
    }
}
