package Day12.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusikBand> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new MusikBand("Band "+(i+1), (int)(Math.random()*150+1900)));
        }

        Collections.shuffle(list);

        for (MusikBand band: list) {
            System.out.println(band);
        }
        list=groupsAfter2000(list);
        System.out.println();

        for (MusikBand band: list) {
            System.out.println(band);
        }

    }

    public static List<MusikBand> groupsAfter2000 (List<MusikBand> list){
        List<MusikBand> listAfter2000 = new ArrayList<>();
        for (MusikBand band: list) {
            if (band.getYear()>2000){
                listAfter2000.add(band);
            }
        }
        return listAfter2000;
    }
}

