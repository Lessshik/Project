package Day03;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean isTrue = true;

        while (isTrue) {
            System.out.println("Введите делимое и делитель");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if (b!=0){
                double rez = (a/b);
                System.out.println(a+" / "+b+" = " + rez);
            } else {
                isTrue=false;
                System.out.println("Ошибка - Делитель равен 0");
            }

        }

    }
}
