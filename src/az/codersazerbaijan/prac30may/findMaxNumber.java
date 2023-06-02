package az.codersazerbaijan.prac30may;

import java.util.*;

public class findMaxNumber<T>{
    public  T findMaxNumber(List<T> array){

        Integer max = (Integer) array.get(0);
        for (int i = 1; i < array.size(); i++) {
            Integer current = (Integer) array.get(i);
            if (current > max) {
                max = current;
            }
        }
        return (T) max;

    }

    public static void main(String[] args) {


        LinkedList<Integer>list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(15);
        list.add(17);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(12123);
        list.add(12314);
        list.add(1232);

        findMaxNumber findMaxNumber = new findMaxNumber();
        System.out.println(findMaxNumber.findMaxNumber(list));
//        Collections.sort(list);
//        System.out.println(list.getLast());
    }
}
