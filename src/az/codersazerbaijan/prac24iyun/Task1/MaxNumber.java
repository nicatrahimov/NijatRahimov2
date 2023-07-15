package az.codersazerbaijan.prac24iyun.Task1;

import java.util.List;

public class MaxNumber{
    public static <T extends Comparable<T>> T maxNumberofArray(List<T> integers){
        T max=integers.get(0);
        for (int i = 0; i < integers.size(); i++) {
           if (integers.get(i).compareTo(max)>0){
               max=integers.get(i);
           }
        }
        return max;
    }
}
