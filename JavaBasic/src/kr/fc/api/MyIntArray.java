package kr.fc.api;

public class MyIntArray {
    // 정수를 여러개 저장하는 변수
    private int[] arr;
    private int cnt;// 1개 저장

    public MyIntArray(){
        this(10);
    };
    public MyIntArray(int initialSize){
        arr = new int[initialSize];
    }
    // 정수를 받아서 데이터를 저장하는 동작 : add()
    public void add(int data){
        arr[cnt++] = data; // arr[0] = 10, arr[1] = 20,,,,,
    }

    public int size(){
        return this.cnt;
    }

    public int get(int index){
        return arr[index];
    }
}
