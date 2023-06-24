package az.codersazerbaijan.prac13iyun.Task1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("D:\\coders\\NijatRahimov2\\untitled\\src\\az\\codersazerbaijan\\prac13iyun\\nicat.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String a;
        while (null !=(a=br.readLine())){
            System.out.println(a);
        }
    }
}
