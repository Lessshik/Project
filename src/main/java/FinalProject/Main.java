package FinalProject;

public class Main {
    public static void main(String[] args) {
        Player player_1 = new Player();
        Player player_2 = new Player();
        PlayingField playingField_1 = new PlayingField(player_1);
        PlayingField playingField_2 = new PlayingField(player_2);

        playingField_1.showField();
        playingField_2.showField();

        boolean isWin = false;
        while (!isWin) {

            Player.move(player_1, playingField_2);
            if(PlayingField.isShipsLeft(playingField_2)){
                break;
            }

            Player.move(player_2, playingField_1);
            if(PlayingField.isShipsLeft(playingField_1)){
                break;
            }
        }

    }
}
