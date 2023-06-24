package az.codersazerbaijan.prac17iyun;

public class Task2 {
    public static void main(String[] args) {
        String str = "2481632641282565121024";
        String temp = "";
        int count = 1;
        while (true){
            int number = (int) Math.pow(2,count++);
            temp+=number;
            System.out.println(temp );
            if (str.equals(temp)){
                System.out.println(count);
                break;
            }
        }
    }
}
