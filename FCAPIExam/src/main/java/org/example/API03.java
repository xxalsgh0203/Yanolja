package org.example;

import com.google.gson.Gson;
import org.example.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class API03 {
    public static void main(String[] args) {
        // Gson API
        List<Book> books = new ArrayList<Book>();

        // 키보드로부터 책 여러권 입력받아 파일에 json 형태로 저장
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("책 제목 : (exit 를 입력하면 종료)");
            String input = scan.nextLine();
            if(input.equals("exit"))
                break;
            String title = input;

            System.out.print("책 출판사 : ");
            String company = scan.nextLine();

            System.out.print("저자 : ");
            String name = scan.nextLine();

            System.out.print("가격 : ");
            int price = Integer.parseInt(scan.nextLine());

            // VO 구조에 묶고 list 에 담아
            Book b = new Book(title, company, name, price);
            books.add(b);
        }

        scan.close();
        Gson gson = new Gson();
        String json = gson.toJson(books);
        System.out.println(json);
    }
}
