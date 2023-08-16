package kr.fc.java;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FC32 {
    public static void main(String[] args) {
        // 한글 한 자를 입력받아 출력
        InputStream is = System.in;
        // 문자 입력 스트림이 필요함 -> Reader 계열
        InputStreamReader isr = new InputStreamReader(is);
        System.out.println("한글 한 자를 입력하시오 : ");

        try {
            int data;
            while((data= isr.read()) != -1){
                System.out.println((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
