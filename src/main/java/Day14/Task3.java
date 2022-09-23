package Day14;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");

        List<Person> list1 = fileParseToListObj(file);

        for (Person pers : list1) {
            System.out.print(pers);
        }
    }

    public static List<Person> fileParseToListObj(File file) {
        List<Person> personList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lineStr = line.split(" ");
                personList.add(new Person(lineStr[0], Integer.parseInt(lineStr[1])));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return personList;
    }
}
