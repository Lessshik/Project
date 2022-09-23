package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("newfile.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        printSummDigits(file);
    }

    public static void printSummDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbersStr = line.split(" ");

                if (numbersStr.length == 10) {
                    int summ = 0;
                    for (String numb : numbersStr) {
                        summ += Integer.parseInt(numb);
                    }
                    System.out.println("Сумма 10 чисел из файла = " + summ);
                } else System.out.println("Некорректный входной файл");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            ;
        }
    }
}
