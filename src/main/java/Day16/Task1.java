package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        File file = new File("number.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        printResult(file);

    }

    public static void printResult (File file){
        try {
            Scanner scanner =new Scanner(file);
            double result = 0;
            while (scanner.hasNextLine()){
                String[] arrayNumber = scanner.nextLine().split(" ");
                for (String num: arrayNumber) {
                    result+=(double) Integer.parseInt(num);
                }
                result=result/arrayNumber.length;
            }
            System.out.print("Ответ: "+ result + "-->");
            System.out.printf("%.3f", result);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
