package Day11;

public class Task11 {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);

        for (int i = 0; i <3000; i++) {
            picker.doWork();
            courier.doWork();
        }

        System.out.println(warehouse + "\n"+courier+"\n"+picker);





    }
}
