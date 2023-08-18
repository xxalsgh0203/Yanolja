package kr.fc.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FC37 {
    public static void main(String[] args) {
        // 키보드로부터 책 데이터를 입력 받아서 파일에 저장(book.txt)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("책 제목을 입력하시오 : ");
            String title = br.readLine();
            System.out.println("책 가격을 입력하시오 : ");
            int price = Integer.parseInt(br.readLine());
            String data = title + "," + price;
            // VO 에 묵어줘야함 -> DAO(CRUD)
            FileWriter fw = new FileWriter("book.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
            System.out.println("파일 생성");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
