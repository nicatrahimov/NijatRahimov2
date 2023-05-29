package az.codersazerbaijan.prac27may.task2;

public class OuterClass {

    public class MemberInnerClass{
void greeting(){
    System.out.println("Hello");
}

    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        MemberInnerClass memberInnerClass = outerClass.new MemberInnerClass();
        memberInnerClass.greeting();
    }
}
