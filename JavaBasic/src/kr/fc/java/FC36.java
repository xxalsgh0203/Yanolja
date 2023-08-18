package kr.fc.java;

import kr.fc.model.BookVO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FC36 {

    public static void main(String[] args) {
        List<BookVO> list = new ArrayList<BookVO>();
        try{
            FileReader fr = new FileReader("member.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
                String[] sp = line.split(",");
                BookVO b = new BookVO(sp[0], Integer.parseInt(sp[3]));
                list.add(b);
            }
            selectionSort(list);
            bookPrint(list);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void bookPrint(List<BookVO> list){
//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(0) + " " + list.get(1));
//        }

        for(BookVO book : list){
            System.out.println(book);
        }
    }

    public static void selectionSort(List<BookVO> list){
        BookVO temp;
        for(int i=0; i<list.size()-1; i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i).getTitle().compareTo(list.get(j).getTitle()) > 0){
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}
