package Day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i <= 350; i++) {
            if (i%2==0&&i>=0&&i<=30){
                list.add(i);
            } else if (i%2==0&&i>=300&&i<=350){
                list.add(i);
            }
        }
        for (int i:list) {
            System.out.print(" "+ i);
        }
    }
}
