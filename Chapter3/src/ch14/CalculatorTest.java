package ch14;

import ch14.Calc;

public class CalculatorTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr)); // static 이기 때문에 인터페이스 이름으로 호출가능

        CompleteCalc calc = new CompleteCalc();
    }
}

