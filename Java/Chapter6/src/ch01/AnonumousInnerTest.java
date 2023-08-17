package ch01;

class Outer2{
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i){ // final
        int num = 10; // final -> 다 상수화 시켜버림
//        class MyRunnable implements Runnable{
//            int localNum = 1000;
//
//            public void run(){
////                i = 50;
////                num = 20;
//
//                System.out.println("localNum = " + localNum);
//                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
//                System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
//            }
//        }
//        return new MyRunnable();

        return new Runnable(){
            int localNum = 1000;

            public void run(){
//                i = 50;
//                num = 20;

                System.out.println("localNum = " + localNum);
                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
            }
        };
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable class");
        }
    };
}

public class AnonumousInnerTest {
    public static void main(String[] args) {
        Outer2 out = new Outer2();
        Runnable runner = out.getRunnable(100);

        runner.run();


    }
}
