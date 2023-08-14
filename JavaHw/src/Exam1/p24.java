package Exam1;

import java.util.Arrays;
import java.util.Comparator;

public class p24 {
    public static void main(String[] args) {
        BookVO[] books = new BookVO[3];
        String search = "자바";

        books[0] = new BookVO("자바", "한빛미디어", "홍길동", 30000);
        books[1] = new BookVO("JSP", "영진출판사", "이길동", 35000);
        books[2] = new BookVO("C언어", "제이펍", "조길동", 20000);

        Arrays.sort(books, Comparator.comparing(BookVO::getTitle));

        int answer = binarySearch(books, search);

        if (answer >= 0) {
            System.out.println(books[answer].toString());
        } else {
            System.out.println("Not found.");
        }
    }

    public static int binarySearch(BookVO[] books, String search){
        int left = 0;
        int right = books.length - 1;

        while(left <= right){
            int middle = (left + right) / 2;
            int comparison = search.compareTo(books[middle].getTitle());
            if(comparison == 0){
                return middle;
            }
            else if(comparison < 0){
                right = middle - 1;
            }else{
                left = middle + 1;
            }
        }

        return -1;
    }
}
