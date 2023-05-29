package az.codersazerbaijan.prac27may.task4;

public class OuterClass {

    public static class InnerClass{
            public void pingForOuter(){
                System.out.println("inner");
            }
    }

    public static void main(String[] args) {
InnerClass innerClass = new InnerClass();
innerClass.pingForOuter();
    }
}
