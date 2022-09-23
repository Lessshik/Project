package Day02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1_______
//        System.out.println("Введите количество этажей в доме");
//        int n = scanner.nextInt();
//
//        if (n<1){
//            System.out.println("Ошибка ввода");
//        } else if (n<=4){
//            System.out.println("Малоэтажный дом");
//        } else if (n>4 && n<=8){
//            System.out.println("Среднеэтажный дом");
//        } else if (n>=9){
//            System.out.println("Многоэтажный дом");
//        }

//        //2______
//        System.out.println("Введите числа а и б");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        for (int i = a+1; i<b;i++){
//            if (i%5==0 && i%10!=0){
//                System.out.print( i + " ");
//            }
//        }
//
         //3________

//        while (a<b){
//            a++;
//            if (a%5==0 && a%10!=0){
//                System.out.print( a + " ");
//            }
//        }

        //4________

        System.out.println("Введите число Х");
        double x = scanner.nextDouble();
        double y;
        if (x>=5){
            y = (Math.pow(x,2)-10)/(x+7);
            System.out.println(y);
        } else if (x>-3 && x<5){
            y = (x+3)*(Math.pow(x,2)-2);
        } else {
            y=420;
            System.out.println(y);
        }




    }
}
