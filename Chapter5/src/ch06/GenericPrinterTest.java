package ch06;

public class GenericPrinterTest {
    public static void main(String[] args) {

        Powder powder = new Powder();
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>(); // 자료형을 지정해주지 않으면 Object 라고 생각함
        powderPrinter.setMaterial(powder);

        Powder p = powderPrinter.getMaterial(); // Object 를 사용할 떄와 다르게 형변환을 해주지 않아도됨
        // 컴파일러가 알아서 replace 해줌
        System.out.println(powderPrinter.toString());
    }
}
