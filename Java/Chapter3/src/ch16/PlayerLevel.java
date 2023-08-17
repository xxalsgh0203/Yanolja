package ch16;

public abstract class PlayerLevel{

    public abstract void run();

    public abstract void jump();

    public abstract void turn();

    public abstract void showLevelMessage();

    public void go(int times){
        run();
        for(int i=0; i<times; i++){
            jump();
        }
        turn();
    }
}
