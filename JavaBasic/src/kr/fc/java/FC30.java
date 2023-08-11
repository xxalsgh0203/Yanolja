package kr.fc.java;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class FC30 {
    public static void main(String[] args) {
        // 표준 입출력 방식(파일, 메모리, 네트워크)
        // 키보드로 부터 데이터를 입력 받는것 : 표준 입력
        // 빨대 kim = System.in; : 빨대 = 스트림(Stream) - 통로역할 : 객체로 취급
        // 문자열 -> String 객체
        // 예외 -> Exception 객체
        // 스트림 -> Stream(X) : InputStream(입력) - read() , OutputStream(출력) - write(), print()
        InputStream kin = System.in;
        System.out.println("영문 1자를 입력 : ");
        try{
            int data = kin.read();
            PrintStream cout = System.out;
            cout.println((char)data);
        }catch(IOException e){ // 예외처리
            e.printStackTrace();
        }
    }
}
