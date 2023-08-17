package ch03;

public class MyNumberTest {
    public static void main(String[] args) {
        MyNumber number = (x, y) -> x > y ? x : y;

        System.out.println(number.getMax(10, 20));
    }
}
