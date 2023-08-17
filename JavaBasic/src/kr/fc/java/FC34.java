package kr.fc.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FC34 {
    public static void main(String[] args) {
        // 키보드로부터 문자열을 계속 입력받다가 exit 를 입력하면 종료하시오
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line;
        System.out.println("문자열을 입력하세요 : ");
        try {
            while((line = br.readLine()) != null){ // 더 이상 읽을 데이터가 없으면 Null
                if(line.equals("exit"))
                    break;
                System.out.println(line);
                System.out.println("문자열을 입력하세요 : ");
                br.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
