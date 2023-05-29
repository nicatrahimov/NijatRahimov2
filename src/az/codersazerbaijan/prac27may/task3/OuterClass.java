package az.codersazerbaijan.prac27may.task3;

public class OuterClass {
    public void forInnerMethod(){;
        LocalInnerClass localInnerClass =new OuterClass().new LocalInnerClass();
        localInnerClass.pingForOuter();
        System.out.println("outer");
    }

    public  class LocalInnerClass{

        public void pingForOuter(){
            System.out.println("INNER");
        }
    }
}
