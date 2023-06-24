package az.codersazerbaijan.prac22iyun.Task3;

import java.util.*;
import java.util.stream.Collectors;

public class Translate {
    public static void main(String[] args) {
        Map<String,String>words=Map.of("name","ad","good","yaxsi","pis","bad");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Set<String>englishWords = words.keySet();
        for (String s:englishWords
             ) {
            if (s.equals(str)){
                System.out.println(words.get(str));
            }
        }

  }
    }
