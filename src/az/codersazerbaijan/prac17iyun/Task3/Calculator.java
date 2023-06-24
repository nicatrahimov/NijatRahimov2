package az.codersazerbaijan.prac17iyun.Task3;

public class Calculator {

    public static double findAnswer(double firstNumber,double secondNumber,String operation){
        double answer = 0;
        switch (operation) {
            case "+" -> answer = firstNumber + secondNumber;
            case "-" -> answer = firstNumber - secondNumber;
            case "*" -> answer = firstNumber * secondNumber;
            case "/" -> answer = firstNumber / secondNumber;
        }
        return answer;
    }
}
