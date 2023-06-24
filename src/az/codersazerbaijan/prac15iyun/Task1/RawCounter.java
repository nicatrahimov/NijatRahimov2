package az.codersazerbaijan.prac15iyun.Task1;

import java.io.*;

public class RawCounter {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\coders\\NijatRahimov2\\untitled\\src\\az\\codersazerbaijan\\prac15iyun\\Task1\\setirlerinsayinitap.txt");
        BufferedReader bw = new BufferedReader(new FileReader(file));
        int counter=0;
        String a;
        while(null!=(a=bw.readLine())){
            System.out.println(a);
            counter++;
        }
        System.out.println("Setirlerin sayi=" + counter);
    }
}
