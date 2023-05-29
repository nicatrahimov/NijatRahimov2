package az.codersazerbaijan.prac27may.task5;

public class OuterClass {
    public interface InnerInterface{
        void greetings();
    }


    public void method(){
        InnerInterface innerInterface = new InnerInterface() {
            @Override
            public void greetings() {
                System.out.println("Method of AnonymClass");
            }

        };
innerInterface.greetings();
    }
    public static void main(String[] args) {
OuterClass outerClass = new OuterClass();
outerClass.method();
    }
}
