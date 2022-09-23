package Day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add("Model_"+(i+1));
        }
        list.add(3, "New MOdel");
        list.remove(0);

        for (String model: list) {
            System.out.println(model);
        }

    }
}
