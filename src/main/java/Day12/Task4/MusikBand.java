package Day12.Task4;

import java.util.ArrayList;

public class MusikBand {
    private String name;
    private int year;
    private ArrayList<String> member;

    public static void transferMembers (MusikBand a, MusikBand b){
        a.member.addAll(b.member);
        b.member.clear();
    }

    public MusikBand(String name, int year) {
        this.name = name;
        this.year = year;
        this.member = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<String> getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member.add(member);
    }

    @Override
    public String toString() {
        return "MusikBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", member=" + member +
                '}';
    }


}
