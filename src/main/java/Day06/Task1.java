package Day06;

public class Task1 {
    public static void main(String[] args) {

        AirPlane airPlane = new AirPlane("Boing", 2000, 125.5,25.8);
        airPlane.info();
        airPlane.fillUp(1500);
        airPlane.info();
        airPlane.setYear(2005);
        airPlane.setLength(135.8);
        airPlane.info();
        airPlane.setYear(2010);
        airPlane.setLength(185.8);
        airPlane.fillUp(3500);
        airPlane.info();
        System.out.println();
        System.out.println(airPlane);
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

    @Override
    public String toString() {
        return "Изготовитель: "+getProduser()
                +", год выпуска: "+getYear()
                +", длина: "+getLength()
                +", вес: "+getWeight()
                +", количество топлива в баке:"+getFuel();
    }
}
