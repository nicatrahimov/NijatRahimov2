package az.codersazerbaijan.prac13iyun.Task2;

import javax.swing.text.DateFormatter;
import java.io.*;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDateFromFile {
    public static void main(String[] args) throws Exception {
        File dateFile = new File("D:\\coders\\NijatRahimov2\\untitled\\src\\az\\codersazerbaijan\\prac13iyun\\Task2\\date.txt");
        BufferedReader bw = new BufferedReader(new FileReader(dateFile));
String date;
        List<String>dateList = new ArrayList<>();

        while (null!=(date= bw.readLine())){
            dateList.add(date);
        }
        System.out.println(dateList);


        String format ="dd-MM-yyyy mm:hh";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(format);
        List<LocalDateTime>localDateTimes = new ArrayList<>();

        for (int i = 0; i < dateList.size(); i++) {
            LocalDateTime localDateTime = LocalDateTime.parse(dateList.get(i),dateTimeFormatter);
            localDateTimes.add(localDateTime);
        }
        System.out.println(localDateTimes);
    }
}
