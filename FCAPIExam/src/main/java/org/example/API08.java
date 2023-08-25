package org.example;

public class API08 {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName());
//        t1.setPriority(1);
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());

        // 여기서는 A~Z 까지 출력하세요
        // 1. 작업 객체를 만든다(job)
        Runnable target = new AlphaData();
        // 2. 스레드를 만든다(알바생)
        Thread alpha = new Thread(target);
        // 3. 스레드를 시작한다
        alpha.start(); // run(

        // 여기서는 1~100까지 수를 출력하시오
        try{
            for(int i=1; i<=100; i++){
                System.out.print(i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println();


        // Context switching (제어권이 왔다갔다 하는것)
    }
}
