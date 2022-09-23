package FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    private List<Integer> shipCoordinatesListX;
    private List<Integer> shipCoordinatesListY;
    private List<Integer> shipCoordinatesListXY;
    private int typeOfShip;
    private boolean isShipGorizontal;
    private String viewShip;

    public int getTypeOfShip() {
        return typeOfShip;
    }

    public List<Integer> getShipCoordinatesListX() {
        return shipCoordinatesListX;
    }

    public List<Integer> getShipCoordinatesListY() {
        return shipCoordinatesListY;
    }

    public Ship(List<Integer> integerList) {
        this.shipCoordinatesListXY = integerList;
        this.shipCoordinatesListX = new ArrayList<>();
        this.shipCoordinatesListY = new ArrayList<>();

        for (int i = 0; i < shipCoordinatesListXY.size()-1; i += 2) {
            this.shipCoordinatesListX.add(shipCoordinatesListXY.get(i));
            this.shipCoordinatesListY.add(shipCoordinatesListXY.get(i + 1));
            this.typeOfShip = shipCoordinatesListX.size();
        }
        this.isShipGorizontal = isShipGorizontal(integerList);
        if(isShipGorizontal){
            System.out.println("Корабрь горизонтально-расположенный");
            this.typeOfShip = shipCoordinatesListX.size();
        } else {
            System.out.println("Корабль вертикально-располоденный");
            this.typeOfShip = shipCoordinatesListY.size();

        }
    }

    public static List<Integer> coordinateListFromString(String coordinateString) {
        List<Integer> coordinateList = new ArrayList<>();
        String[] arrayCoordinateString = coordinateString.split(";");
        for (String coorStr : arrayCoordinateString) {
            String[] array = coorStr.split(",");
            coordinateList.add(Integer.parseInt(array[0]));
            coordinateList.add(Integer.parseInt(array[1]));
        }
        return coordinateList;
    }

    public boolean isShipGorizontal (List <Integer> integerList){
        boolean isTrue = true;
        for (int i = 0; i < integerList.size()-2; i+=2) {
            if (integerList.get(i) != integerList.get(i+2)){
                isTrue=false;
                break;
            }
        }
        return isTrue;
    }


}
