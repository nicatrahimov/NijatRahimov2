package az.codersazerbaijan.prac15iyun.Task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class WordCounter {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\coders\\NijatRahimov2\\untitled\\src\\az\\codersazerbaijan\\prac15iyun\\Task2\\LoremIpsum");
        BufferedReader bw = new BufferedReader(new FileReader(file));
        String a;
        int countList=0;
        while(null!=(a=bw.readLine())){
         List<String> strings = List.of(a.trim().split(" "));
            System.out.println(strings);
            countList += strings.size();
        }
        System.out.println(countList);

    }
}
