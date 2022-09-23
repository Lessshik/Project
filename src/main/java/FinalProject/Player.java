package FinalProject;

import java.util.List;
import java.util.Scanner;

public class Player {
    private String name;

    public String getName() {
        return name;
    }

    public Player() {
        System.out.println("Приветствуем вас! \nВведите имя игрока:");
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.next();
    }

    @Override
    public String toString() {
        return name;
    }

    public static void move(Player player, PlayingField field){
        System.out.println("Игрок " + player.getName() + " делай ход (введи координаты в формате X,Y)");
        Scanner scanner = new Scanner(System.in);
        String moveCoordinate = scanner.next();
        List<Integer> moveListInt = PlayingField.coordinateListFromString(moveCoordinate);
        if (field.getField()[moveListInt.get(0)-1][moveListInt.get(1)-1]==1){
            System.out.println("ПОПАЛ! Ранил!");
            field.setField(moveListInt.get(0),moveListInt.get(1));

                if(!PlayingField.isShipsLeft(field)){
                    move(player, field);
                }

        } else System.out.println("ПРОМАХ!");

    }
}
