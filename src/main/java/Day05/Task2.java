package Day05;

public class Task2 {

    public static void main(String[] args) {
        Mototbike moto1 = new Mototbike(2015, "Black", "Honda");
        moto1.showInfo();

    }
}

class Mototbike {
    private int productionYear;
    private String color;
    private String model;

    public Mototbike(int productionYear, String color, String model) {
        this.productionYear = productionYear;
        this.color = color;
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void showInfo (){
        System.out.println(getProductionYear());
        System.out.println(getColor());
        System.out.println(getModel());
    }
}
