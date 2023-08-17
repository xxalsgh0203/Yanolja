package kr.fc.java;

import kr.fc.poly4.B;

import java.io.*;

public class FC35 {
    public static void main(String[] args) {
        // 파일 핸들링 하기
        // 파일에 있는 데이터를 읽기(이미지, 문자) - xml, json
        // 파일에서 문자 데이터를 읽어 오기 위한 스트림의 연결(member.txt)

        try {
            FileReader fr = new FileReader("member.txt");
            BufferedReader br = new BufferedReader(fr);
            String data;
            int cnt = 0;
            while((data = br.readLine()) != null){
                System.out.println(data);
                cnt++;
            }
            System.out.println(cnt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
