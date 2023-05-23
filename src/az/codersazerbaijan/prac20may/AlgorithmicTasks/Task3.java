package az.codersazerbaijan.prac20may.AlgorithmicTasks;

public class Task3 {
    public static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int maxRest = findMax(arr, index + 1);
        return Math.max(arr[index], maxRest);
    }
}
