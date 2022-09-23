package Day12.task5;

public class Tast5 {
    public static void main(String[] args) {

        Day12.task5.MusikBand band1 = new Day12.task5.MusikBand("Band1", 2000);
        Day12.task5.MusikBand band2 = new Day12.task5.MusikBand("Band2", 2050);

        MusicArtist member = new MusicArtist("NIK",25);
        band1.setMember(member);
        band1.setMember(new MusicArtist("TOM",30));
        band1.setMember(new MusicArtist("JON",18));
//
        band2.setMember(new MusicArtist("pisy",20));
        band2.setMember(new MusicArtist("masha",15));
        band2.setMember(new MusicArtist("lisa",21));

        System.out.println(band1);
        System.out.println(band2);

        MusikBand.transferMembers(band1,band2);
        System.out.println(band1);
        System.out.println(band2);

    }
}
