package ch16;

public class PlayerTest {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.play(1);

        AdvancedLevel player2 = new AdvancedLevel();
        player1.upgradeLevel(player2);
        player1.play(2);

        SuperLevel player3 = new SuperLevel();
        player1.upgradeLevel(player3);
        player1.play(3);

    }
}
