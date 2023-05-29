package az.codersazerbaijan.prac27may.task1;

import java.util.Scanner;

public class Enums {
    public static void main(String[] args) {
        int degreeWithNumber;
        while (true){
            degreeWithNumber = new Scanner(System.in).nextInt();
            if (degreeWithNumber<0 || degreeWithNumber>100){
                continue;
            }else break;
        }
        switch (degreeWithNumber/10){
            case 0,1,2,3,4:
                System.out.println(Degrees.F.name());
                System.out.println("Kesildiniz");
                break;
            case 5:
                System.out.println(Degrees.E.name());
                break;
            case 6:
                System.out.println(Degrees.D.name());
                break;
            case 7:
                System.out.println(Degrees.C.name());
                break;
            case 8:
                System.out.println(Degrees.B.name());
                break;
            case 9,10:
                System.out.println(Degrees.A.name());
                break;
        }
    }
}
