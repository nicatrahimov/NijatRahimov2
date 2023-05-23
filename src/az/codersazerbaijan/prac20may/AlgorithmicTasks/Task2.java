package az.codersazerbaijan.prac20may.AlgorithmicTasks;

public class Task2 {
    public static int calculateSum(int[] array, int index) {
    if (index < 0) {
        return 0;
    } return array[index] + calculateSum(array, index - 1);
    }

}
