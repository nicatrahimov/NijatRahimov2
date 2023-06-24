package az.codersazerbaijan.prac20iyun;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        String word = "Salam menim adim Telet dir 1234321 udjak 1221 sus juj";

        checkPalindrome(word);

    }
    public static void checkPalindrome(String str){
        List<String>strings = List.of(str.split(" "));
        for (int i = 0; i < strings.size(); i++) {
            String word = strings.get(i);
            String revWord = "";
            for (int j = word.length()-1; j >=0 ; j--) {
                revWord=revWord+word.charAt(j);
            }
            if (word.equalsIgnoreCase(revWord)){
                System.out.println(word);
            }
        }

    }
}
