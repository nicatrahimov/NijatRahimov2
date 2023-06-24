package az.codersazerbaijan.prac20iyun;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        String word = "Namaz";
        String secondWord = "Zaman";
        List<String>list1 = new java.util.ArrayList<>(List.of(word.toLowerCase().split("")));
        List<String>list2 = new java.util.ArrayList<>(List.of(secondWord.toLowerCase().split("")));
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1.equals(list2));


    }
}
