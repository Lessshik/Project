package Day07;

public class Task2 {
    public static void main(String[] args) {

        Player player_1 = new Player();
        Player player_2 = new Player();
        Player player_3 = new Player();
        Player player_4 = new Player();
        Player player_5 = new Player();
        Player player_6 = new Player();


        System.out.println(Player.countPlayers);
        System.out.println(player_1.getStamina());
        System.out.println(player_2.getStamina());
        Player.info();

        while (player_1.getStamina()>=1){
            player_1.run();
        }
        while (player_2.getStamina()>=1){
            player_2.run();
        }

        Player.info();

        Player player_7 = new Player();
        Player player_8 = new Player();

        System.out.println(Player.countPlayers);
        Player.info();
    }
}

class Player {
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    private int stamina;
    private final int MAX_STAMINA=100;
    private final int MIN_STAMINA=0;
    public static int countPlayers=0;

    public Player() {
        this.stamina = (int)(Math.random()*10+90);
        if (countPlayers<6){
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run(){
        if (stamina>1){
        stamina--;
        } else {
            countPlayers-=1;
            setStamina(getStamina()-1);
            System.out.println("Игрок уходит с поля");
        }
    }

    public static void info(){
        if (countPlayers<6){
            System.out.println("Команды неполные, на поле есть " + (6-countPlayers) +" свободных мест.");
        } else System.out.println("На поле нет свободных мест.");
    }

}
