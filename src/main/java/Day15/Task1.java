package Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("import_empl_csv.csv");
        File newFile = new File("missing_tel_numbel.txt");

        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(newFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String[] arrayString = scanner.nextLine().split(";");
                if (!arrayString[8].equals("0")) {
                    for (String str :arrayString) {
                        printWriter.print(str+" ");
                    }
                    printWriter.println();

                }
            }
            printWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
