package kr.fc.java;

public class FC03 {
    public static void main(String[] args) {
        // 변수는 데이터를 1개의 형태로 저장을 한다
        // Q. 정수 3개를 저장할 변수를 선언하세요

        int [] a = new int [3];

        total(a);
    }

    public static void total(int [] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }

        System.out.println(sum);
    }
}
