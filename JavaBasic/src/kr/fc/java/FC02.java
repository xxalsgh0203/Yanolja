package kr.fc.java;
import kr.fc.model.BookVO;

public class FC02 {
    public static void main(String[] args) {
        // BookVO 를 이용해서 데이터를 묶어주기
        BookVO book = new BookVO();
//        book.title = "자바의 정석";
//        book.price = 35000;
        print(book);
    }

    public static void print(BookVO book){
//        System.out.println("title = " + book.title + ", price = " + book.price);
    }
}
