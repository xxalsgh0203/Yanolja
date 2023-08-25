package org.example;

public class AlphaData implements Runnable{ // 스레드가 실행해야 하는것
// public class AlphaData extends Thread 로도 쓸 수 있음. 이렇게 하면 클래스가 스레드가 됨
    @Override
    public void run() {
        try{
            for(char i = 'A'; i<='Z'; i++){
                System.out.println(i);
                Thread.sleep(1000); // 다른 스레드가 CPU 의 시간을 얻을 수 있는 기회를 주는 것
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
