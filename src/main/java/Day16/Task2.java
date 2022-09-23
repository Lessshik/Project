package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {

        File fileFirst = new File("file_1");
        File fileSecond = new File ("file_2");

        try {
            fileFirst.createNewFile();
            fileSecond.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter printWriter = new PrintWriter(fileFirst);
        PrintWriter printWriter1 = new PrintWriter(fileSecond);

        for (int i = 0; i < 1000; i++) {
            printWriter.print((int) (Math.random()*100) + " ");
        }
        printWriter.close();

        Scanner scanner = new Scanner(fileFirst);
        while (scanner.hasNextLine()){
            String[] array = scanner.nextLine().split(" ");
            for (int i = 0; i < array.length; i+=20) {
                int summ = 0;
                for (int j = i; j < i+20; j++) {
                    summ += Integer.parseInt(array[j]);
                }
                double sA = (double) summ/20;
                printWriter1.print(sA + " ");
            }
            printWriter1.close();

        }
        printResult(fileSecond);
    }

    public static void printResult (File file){
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String[] array = scanner.nextLine().split(" ");
                double summa = 0;
                for (String str: array) {
                    summa+=Double.parseDouble(str);
                }
                System.out.println("Otvet: "+summa);
                System.out.println("Otvet: "+(int)summa);

            }
            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
