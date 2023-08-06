package ch16;

public class Player {

    private PlayerLevel level;

    public Player(){
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel(){
        return this.level;
    }

    public void upgradeLevel(PlayerLevel Level){
        this.level = Level;
        level.showLevelMessage();;
    }
    public void play(int count){
        level.go(count);
    }

}
