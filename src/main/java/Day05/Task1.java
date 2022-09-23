package Day05;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setProductionYear(1995);
        car1.setColor("RED");
        car1.setModel("Tesla");

        System.out.println(
                "Машина 1: \nгод выпуска - " + car1.getProductionYear()
                + "\nцвет - " + car1.getColor()
                + "\nмодель - "+ car1.getModel());

    }
}

class Car {
    private int productionYear;
    private String color;
    private String model;

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
}
