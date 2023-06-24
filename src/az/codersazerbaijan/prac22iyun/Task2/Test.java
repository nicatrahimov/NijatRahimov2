package az.codersazerbaijan.prac22iyun.Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Employer developer = new Developer("C");
        Employer manager = new Manager("01");
        Employer tester = new Tester("123123");
        List<Employer>employers=new ArrayList<>();
        employers.add(developer);
        employers.add(manager);
        employers.add(tester);

        List<Employer>employers1= employers.stream().sorted(Comparator.comparingInt(str -> str.getName()
                .charAt(str.getName().length() - 1))).toList();
        System.out.println(employers1);


    }
}
