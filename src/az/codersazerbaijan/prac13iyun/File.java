package az.codersazerbaijan.prac13iyun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File {
    public static void main(String[] args) throws Exception {
        try(var a = new FileReader("D:\\coders\\NijatRahimov2\\untitled\\src\\az\\codersazerbaijan\\prac13iyun\\nicat.txt")){

            if (a.read()!=-1){
                System.out.println(a.read());
            }


        }
    }
}
