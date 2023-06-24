package az.codersazerbaijan.prac17iyun;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String numberStr = Integer.toString(number);
        String temp="";
        StringBuilder sb = new StringBuilder(temp);
        for (int i = 0; i < numberStr.length(); i++) {
            if (i==0){
                sb.append(numberStr.charAt(numberStr.length()-1));
            } else if (i==numberStr.length()-1) {
                sb.append(numberStr.charAt(0));
                numberStr = String.valueOf(sb);
            }else sb.append(numberStr.charAt(i));
        }
        number= Integer.parseInt(numberStr);
        System.out.println(number);
    }
}
