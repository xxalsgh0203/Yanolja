package ch11;

public abstract class Calculator implements Calc{ // 구현하지 않은 메서드들이 있기 때문에 abstract 붙혀줘야함
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }
}
