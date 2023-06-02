package az.codersazerbaijan.prac1iyun;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        //1
        FuncInterfaceCem<Integer> funcInterfaceCem = (a, b) -> {
            return a + b;
        };
        System.out.println(funcInterfaceCem.sum(10, 28));
        //2
        FuncInterfaceFactorial<Double> funcInterfaceFactorial = a -> {
            Double b = 1.0;
            for (int i = 1; i <= a; i++) {
                b *= i;
            }
            return b;
        };
        System.out.println(funcInterfaceFactorial.factorial(10.0));
        //3
        FuncInterfaceLength funcInterfaceLength = str -> {
            return str.length();
        };
        System.out.println(funcInterfaceLength.findLength("NicatRahimov"));

        //4
        List<String> names = new ArrayList<>();
        names.add("Nicat");
        names.add("Rahimov");
        names.add("Jesse");
        names.add("Lalo");
        names.add("Zlatan");

        FuncInterfaceList funcInterfaceList = array -> {
            List<String> localNames = new ArrayList<>();
            array.forEach(element -> {
                StringBuilder stringBuilder = new StringBuilder(element.toUpperCase());
                localNames.add(stringBuilder.toString());
            });
            return localNames;
        };

        System.out.println(funcInterfaceList.toUpperCase(names));
        //5
        FuncInterfaceICut funcInterfaceICut = (List<Integer> array) -> {
            List<Integer> cutEdedler=new ArrayList<>();
            array.forEach(element -> {
                if (element % 2 == 0) {
                  cutEdedler.add(element);
                }
            });
            return cutEdedler;
        };
List<Integer> numbers=new ArrayList<>();
numbers.add(10);
numbers.add(11);
numbers.add(12);
numbers.add(13);
numbers.add(14);
numbers.add(15);
numbers.add(16);
numbers.add(17);
numbers.add(18);
numbers.add(19);
numbers.add(20);
        System.out.println(funcInterfaceICut.cutEdedleriTap(numbers));
    }
}