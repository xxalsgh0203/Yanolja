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

/*
    int -> byte[]
    byte[] -> int
    스트림(빨대)의 분류 : java.io
    1. 데이터(이진 데이터, 문자 데이터) 의 종류의 따른 분류
        1) 바이트 스트림 : 이진데이터(binary data) 를 처리하는 스트림
        - 바이트 입력 스트림 : InputStream - read() : 바이트 단위로 읽음
        - 바이트 출력 스트림 : OutputStream - writer() : 바이트 단위로 출력
          ex) 파일에서 바이트 데이터를 읽으려면 어떤 스트림이 필요한가 ? FileInputStream
          ex) 파일에서 바이트 데이터를 저장려면 어떤 스트림이 필요한가 ? FileOutputStream

        2) 문자스트림 : 문자데이터를 처리하는 스트림(스트림 내부에서 문자 인코딩이 적용된다)
        - 문자 입력 스트림 : Reader - read() : 문자 단위로 읽음
        - 문자 출력 스트림 : Writer - write(), print(), println() : 문자 단위로 출력
          ex) 파일에서 문자 데이터를 읽으려면 어떤 스트림이 필요한가 ? FileReaderStream
          ex) 파일에서 문자 데이터를 저장려면 어떤 스트림이 필요한가 ? FileWriterStream

    2. 처리 방식에 따른 분류
        1) 노드 스트림 : 입출력 데이터에 가장 먼저 연결되는 스트림 - 성능이 좋지 않음. 필터스트림을 통해 성능을 향상
        2) 필터 스트림 : 단독 사용 불가 - 반드시 노드 스트림에 연결(연쇄)해서 사용 -> 생성자를 통해서 연결
            : 입출력의 성능을 개선시키는 용도
            : 버퍼기능이 있는 스트림
                - BufferedFileInputStream, BufferedFileOutputStream
                - BufferedFileReaderStream, BufferedFileWriterStream
            - 브릿지 스트림 : 바이트 입력/출력 스트림을 문자 입력/출력 스트림으로 변환
                    : InputStreamReader, OutputStreamWriter
*/

