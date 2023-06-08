package az.codersazerbaijan.prac6iyun.Task2;

import java.util.List;
import java.util.Optional;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String metn = "Hello 212 my name 3312 is Nicat.What 124 about 34 you?";
        List<String>stringList = List.of(metn.split(" "));
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(metn);

        matcher.results().map(MatchResult::group).forEach(System.out::println);

    }
}
