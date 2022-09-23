package Day07;

public class Task1 {
    public static void main(String[] args) {

        AirPlane airPlane_1 = new AirPlane("Boing", 2000, 125.5,25.8);
        AirPlane airPlane_2 = new AirPlane("SuperJet", 2010, 115.8,25.8);

        AirPlane.compareAirplannes(airPlane_1,airPlane_2);


    }
}

class AirPlane {
    private String produser;
    private int year;
    private double length;
    private double weight;
    private double fuel;

    public AirPlane(String produser, int year, double length, double weight) {
        this.produser = produser;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public String getProduser() {
        return produser;
    }

    public void setProduser(String produser) {
        this.produser = produser;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void info (){
        System.out.println("Изготовитель: "+getProduser()
                +", год выпуска: "+getYear()
                +", длина: "+getLength()
                +", вес: "+getWeight()
                +", количество топлива в баке:"+getFuel());
    }
    public void fillUp (double fuel){
        setFuel(fuel);
    }

    public static void compareAirplannes (AirPlane airPlane1, AirPlane airPlane2){
        if (airPlane1.getLength() > airPlane2.getLength()){
            System.out.println("Самолет "+airPlane1.getProduser()+" длиннее, чем самолет "+airPlane2.getProduser());
        } else System.out.println("Самолет "+airPlane2.getProduser()+" длиннее, чем самолет "+airPlane1.getProduser());
    }
}
