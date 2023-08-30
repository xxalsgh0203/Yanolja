package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.model.Book;
import org.example.model.BookList;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class API04 {
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
            Book b = new Book(1, title, company, name, price);
            books.add(b);
        }

        scan.close();

        BookList bookList = new BookList(books);


//        Gson gson = new Gson();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(bookList);
        System.out.println(json);

        try{
            FileWriter fw = new FileWriter("books2.json");
            fw.write(json);
            fw.close();
            System.out.println("books2.json file created");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
