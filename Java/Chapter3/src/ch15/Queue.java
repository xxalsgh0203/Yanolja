package ch15;

public interface Queue {

    void enQueue(String tile);
    String deQueue();

    int getSize();

}
