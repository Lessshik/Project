package Day04;

import java.util.Random;
import java.util.Scanner;

public class Tast1 {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        int bolshe_8 = 0;
        int ravno_1 = 0;
        int chetnix = 0;
        int neChetnix = 0;
        int summa = 0;

        for (int i=0; i< array.length; i++){
            int numder = rand.nextInt(10);
            array[i]=numder;
            System.out.print(array[i]+" ");

            if (numder>8){
                bolshe_8++;
            }
            if (numder==1){
                ravno_1++;
            }
            if (numder%2==0 && numder!=0){
                chetnix++;
            }
            if (numder%2!=0 || numder==1){
                neChetnix++;
            }
            summa+=numder;
        }
        System.out.println();

        System.out.println("Длина массива: "+n);
        System.out.println("Количество чисел больше 8: "+bolshe_8);
        System.out.println("Количество чисел равных: "+ravno_1);
        System.out.println("Количество четных чисел: "+chetnix);
        System.out.println("Количество нечетных чисел: "+neChetnix);
        System.out.println("Сумма всех элементов массива: "+summa);

    }
}
