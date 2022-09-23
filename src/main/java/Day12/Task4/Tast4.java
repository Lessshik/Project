package Day12.Task4;

import java.util.ArrayList;
import java.util.List;

public class Tast4 {
    public static void main(String[] args) {

        MusikBand band1 = new MusikBand("Band1", 2000);
        MusikBand band2 = new MusikBand("Band2", 2050);

        band1.setMember("NIK");
        band1.setMember("TOM");
        band1.setMember("JON");

        band2.setMember("liza");
        band2.setMember("masha");
        band2.setMember("kity");

        System.out.println(band1);
        System.out.println(band2);

        MusikBand.transferMembers(band1,band2);
        System.out.println(band1);
        System.out.println(band2);

    }
}
