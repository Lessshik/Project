package Day11;

public class Picker implements Worker{
    private int salary;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary+=80;
        warehouse.setCountOrder(warehouse.getCountOrder()+1);

        if (warehouse.getCountOrder()%1500==0){
            System.out.println("БОНУС У СБОРЩИКА!!!");
            bonus();
        }
    }

    @Override
    public void bonus() {
        this.salary=this.salary*3;
    }

    @Override
    public String toString() {
        return "Сборщик: " + "зарплата - " + salary;
    }
}
