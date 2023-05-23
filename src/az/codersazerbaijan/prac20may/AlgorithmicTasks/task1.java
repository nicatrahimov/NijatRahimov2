package az.codersazerbaijan.prac20may.AlgorithmicTasks;

public class task1 {
    public static int faktorial(int a) {
        if (a > 1) {
            return a * faktorial(a - 1);
        } else return 1;
    }
}
