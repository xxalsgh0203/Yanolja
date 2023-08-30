package org.example;

import org.example.model.Book;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.util.*;

public class API01 {
    public static void main(String[] args) {
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
            Book b = new Book(1, title, company, name, price);
            books.add(b);
        }

        scan.close();

        // 파일에 데이터 입력 : List -> JSONArray <- JSONObject({})
        // JSON API?
        JSONArray booksArray = new JSONArray();
        for(Book book : books){
            JSONObject bookObject = new JSONObject();
            bookObject.put("title", book.getTitle());
            bookObject.put("company", book.getCompany());
            bookObject.put("name", book.getName());
            bookObject.put("price", book.getPrice());

            booksArray.put(bookObject);
        }

        JSONObject root = new JSONObject();
        root.put("books", booksArray);

        // 파일에 저장
        try{
            FileWriter fw = new FileWriter("books.json");
            fw.write(root.toString(4));
            fw.close();
            System.out.println("books.json 파일 생성 완료");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

/*
    객체(Object)를 [문자열의 형태 = text]로 표현하는 방법
     = 책 : VO, DTO - 클래스(class)
     = 책 : text, json, xml
*/