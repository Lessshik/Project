package FinalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayingField {
    private int[][] field;
    private String[] coordinateArray;
    private String playerName;
    private List<Ship> shipsList;

    public List<Ship> getShipsList() {
        return shipsList;
    }

    public int[][] getField() {
        return field;
    }

    public void setField(int x, int y) {
        this.field[x - 1][y - 1] = -3;
    }

    public PlayingField(Player player) {
        List<Ship> shipsList = new ArrayList<>();
        this.field = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                field[i][j] = 0;
            }
        }
        playerName = player.getName();
        this.coordinateArray = new String[1];
        inputCoordinate();
        for (String coorStr : coordinateArray) {
            List<Integer> integerList = coordinateListFromString(coorStr);
            shipsList.add(new Ship(integerList));
            for (int i = 0; i < integerList.size() - 1; i += 2) {
                this.field[integerList.get(i) - 1][integerList.get(i + 1) - 1] = 1;
            }
        }
    }

    public void showField() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void inputCoordinate() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Начнем расставлять корабли на поле игрока " + playerName + ". Второй игрок, не смотри!");

//        System.out.println("Введите координаты четырехпалубного корабля (формат: x,y;x,y;x,y;x,y)");
//        this.coordinateArray[0]=scanner.next();
//        verifyCoordinate(coordinateArray[0],4);

//        System.out.println("Введите координаты первого трехпалубного корабля (формат: x,y;x,y;x,y)");
//        this.coordinateArray[1]=scanner.next();
//
//        System.out.println("Введите координаты второго трехпалубного корабля (формат: x,y;x,y;x,y)");
//        this.coordinateArray[2]=scanner.next();
//
//        System.out.println("Введите координаты первого двухпалубного корабля (формат: x,y;x,y)");
//        this.coordinateArray[3]=scanner.next();
//
//        System.out.println("Введите координаты второго двухпалубного корабля (формат: x,y;x,y)");
//        this.coordinateArray[4]=scanner.next();
//
//        System.out.println("Введите координаты третьего двухпалубного корабля (формат: x,y;x,y)");
//        this.coordinateArray[0]=scanner.next();
//
//        System.out.println("Введите координаты первого однопалубного корабля (формат: x,y)");
//        this.coordinateArray[6]=scanner.next();
//
//        System.out.println("Введите координаты второго однопалубного корабля (формат: x,y)");
//        this.coordinateArray[7]=scanner.next();
//
        boolean varifys = true;
        while (varifys) {
            System.out.println("Введите координаты третьего однопалубного корабля (формат: x,y)");
            String coordinateString = scanner.next();
            if (verifyCoordinate(coordinateString, 2)) {
                this.coordinateArray[0] = coordinateString;
                varifys = false;
            } else varifys = true;
        }


//        System.out.println("Введите координаты четвертого однопалубного корабля (формат: x,y)");
//        this.coordinateArray[1] = scanner.next();

//        scanner.close();
        System.out.println();
        System.out.println("Корабли расставлены на одном поле, приступим ко второму полю");
        System.out.println();
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


    public boolean verifyCoordinate(String string, int numberOfDecks) {
        List<Integer> coordinateListInt = coordinateListFromString(string);

        boolean verify = false;
        for (int coorInt : coordinateListInt) {
            if (coorInt < 0 || coorInt > 10) {
                System.out.println("Ошибка ввода! Координаты должны быть в диапозоне от 1 до 10");
                verify = false;
                break;
            } else if (coordinateListInt.size() != numberOfDecks * 2) {
                System.out.println("Ошибка ввода! Количество координат не соответсвует количеству палуб");
                verify = false;
                break;
            } else verify = true;
        }
        return verify;
    }

    public static boolean isShipsLeft(PlayingField field) {
        boolean isShip = true;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (field.getField()[i][j] == 1) {
                    isShip = false;
                }
            }
        }
        if (isShip) {
            System.out.println("Игра окончена!!!");
        }
        return isShip;
    }


}
