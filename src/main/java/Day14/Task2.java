package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> list1 = parseFileToList(file);

        for (String name: list1) {
            System.out.print(name+", ");
        }
    }

    public static List<String> parseFileToList(File file) {
        List<String> stringList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lineToSplit = line.split(" ");
                if (Integer.parseInt(lineToSplit[1]) > 0) {
                    stringList.add(line);
                } else {
                    System.out.println("Некорректный файл");
                    stringList.clear();
                break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        }
        return stringList;
        }
}
