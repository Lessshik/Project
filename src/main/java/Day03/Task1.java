package Day03;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String cityName = "";

        while (!cityName.equals("стоп")){
            System.out.println("Введите название города или stop: ");
            cityName = scanner.nextLine();
            switch (cityName){
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println(cityName + " - это Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println(cityName + " - это Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println(cityName + " - это Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println(cityName + " - это Германия");
                    break;
                case "стоп":
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }

        }
    }
}
