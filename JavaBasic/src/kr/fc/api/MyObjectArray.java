package kr.fc.api;

public class MyObjectArray {
    // 정수를 여러개 저장하는 변수
    private Object[] arr;
    private int cnt;// 1개 저장

    public MyObjectArray(){
        this(10);
    };
    public MyObjectArray(int initialSize){
        arr = new Object[initialSize];
    }
    // 정수를 받아서 데이터를 저장하는 동작 : add()
    public void add(Object data){
        arr[cnt++] = data; // arr[0] = 10, arr[1] = 20,,,,,
    }

    public int size(){
        return this.cnt;
    }

    public Object get(int index){
        return arr[index];
    }
}
