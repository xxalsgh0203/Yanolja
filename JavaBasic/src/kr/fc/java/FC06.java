package kr.fc.java;

public class FC06 {
    public static void main(String[] args) {
        FC06 fc = new FC06();
        int a = 10;
        int b = 20;
        // non static 메서드 사용 방법
        int v = fc.hap(a,b); // 값전달(Call by Value)
        System.out.println(v);
    }

    public int hap(int a, int b){
        int sum = a + b;
        return sum;
    }
}
