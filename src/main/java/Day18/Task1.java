package Day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};

        int rez = recurcionSumm(numbers.length, numbers);
        System.out.println(rez);
    }

    public static int recurcionSumm(int n, int[] array) {
        if (n > 0) {
            return array[n - 1] + recurcionSumm(n - 1, array);
        }
        return 0;
    }
}
