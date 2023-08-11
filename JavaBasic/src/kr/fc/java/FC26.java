package kr.fc.java;

import kr.fc.api.MyObjectArray;
import kr.fc.poly1.Cat;
import kr.fc.poly1.Dog;

public class FC26 {
    public static void main(String[] args) {
        MyObjectArray objArr = new MyObjectArray(5);
        objArr.add(new Dog());
        objArr.add(new Cat());

        for(int i=0; i<objArr.size(); i++){
            Object obj = objArr.get(i);
            if(obj instanceof Dog){
                ((Dog) obj).eat();
            }else if(obj instanceof Cat){
                ((Cat) obj).eat();
            }
        }
    }
}
