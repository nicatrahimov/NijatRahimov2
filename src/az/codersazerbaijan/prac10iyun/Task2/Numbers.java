package az.codersazerbaijan.prac10iyun.Task2;

import java.lang.reflect.Field;
import java.util.List;

public class Numbers extends AnnotationExp{
    @noNegativeNumbers
    Integer number1;
    @noNegativeNumbers
    Integer number2;
    Integer number3;
    Integer number4;

    public static void main(String[] args) {
        Class clq = AnnotationExp.class;

       Field[] fields = clq.getDeclaredFields();


        Numbers numbers = new Numbers();
        numbers.number1=-1;
        numbers.number2=2;
        numbers.number3=-3;
        numbers.number4=4;

    }
}
