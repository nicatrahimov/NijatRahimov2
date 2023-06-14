package az.codersazerbaijan.prac10iyun.Task2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class AnnotationExp {


    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
   public @interface noNegativeNumbers{

    }

public static boolean isPositive(int number){
        if (number>0){
            return true;
        }else return false;
}

}
