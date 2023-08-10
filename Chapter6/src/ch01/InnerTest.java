package ch01;

class OutClass{
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass(){
        inClass = new InClass();
    }

    class InClass(){
        int inNum = 100;
        static int sInNum = 500;

        void inTest(){
            System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");

        }
    }

    public void usingClass(){
        inClass.inTest();
    }

    static Class InStaticClass{
        int iNum = 100;
        static int sInNum = 200;

        void inTest(){   //정적 클래스의 일반 메서드
            //num += 10;    // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
            System.out.println("InStaticClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
            System.out.println("OutClass sNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
        }

        static void sTest(){  // 정적 클래스의 static 메서드
            //num += 10;   // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
            //inNum += 10; // 내부 클래스의 인스턴스 변수는 사용할 수 없음

            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");

        }

    }
}
public class InnerTest {
    public static void main(String[] args) {
        OutClass outclass = new OutClass();
        outclass.usingClass();

        OutClass.InClass inner = outclass.new InClass();

//        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();

        OutClass.InStaticClass.sTest();
    }
}
