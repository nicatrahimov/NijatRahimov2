package az.codersazerbaijan.prac22iyun.Task2;

public abstract class Employer {
private String name;

    public Employer(String name) {
        this.name = name;
    }

    public  String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                '}';
    }
}
