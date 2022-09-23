package Day18;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(semerka(7157778));
    }

    public static int semerka(int n) {
        if (n == 0)
            return 0;
        if (n % 10 == 7)
            return 1 + semerka(n / 10);
        else
            return semerka(n / 10);

    }
}
