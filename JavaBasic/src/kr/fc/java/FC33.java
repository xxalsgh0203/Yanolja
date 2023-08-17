package kr.fc.java;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FC33 {
    public static void main(String[] args) {
        // 한글 여러자를 키보드로부터 읽기
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        // 버퍼 기능이 있는 문자 입력 스트림
        BufferedReader br = new BufferedReader(isr);
        System.out.println("문자열을 입력하세요 : ");
        try {
            String line = br.readLine(); // 라인 단위로 읽기 가능(엔터를 제외한 문자열을 읽기)
            System.out.println(line);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
