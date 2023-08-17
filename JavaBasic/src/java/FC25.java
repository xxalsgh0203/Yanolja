package java;

import kr.fc.api.MyIntArray;

public class FC25 {
    public static void main(String[] args) {
        MyIntArray arr = new MyIntArray(5);
        arr.add(10);
        arr.add(20);
        arr.add(30);

        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}
