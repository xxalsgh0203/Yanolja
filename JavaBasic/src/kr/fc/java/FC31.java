package kr.fc.java;

import java.io.IOException;
import java.io.InputStream;

public class FC31 {
    public static void main(String[] args){
        // 키보드로부터 영문 여러자를 입력해서 출력하시오
        InputStream is = System.in;
        System.out.println("영문 여러자를 입력하시오 : ");
        try {
            while(true){
                int data = is.read();
                if(data == 10) // 10(엔터를 의미)
                    break;
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
