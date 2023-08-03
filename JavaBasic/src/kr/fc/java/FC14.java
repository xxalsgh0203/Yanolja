package kr.fc.java;

import kr.fc.model.Movie;

public class FC14 {
    public static void main(String[] args) {
        Movie[] mv = new Movie[3];
        mv[0] = new Movie("친구", "디카프리오", "WB", 17000, 15);
        mv[1] = new Movie("범죄와전쟁", "홍길동", "롯데", 13000, 12);
        mv[2] = new Movie("범죄도시", "마동석", "롯데", 15000, 13);

        // 검색(search) : 순차검색, 블럭검색, 이진검색....
        // 친구라는 영화의 가격을 출력하세요.
        String mtitle = "친구";

        // 순차검색
        int index = -1;
//        for(int i=0; i<mv.length; i++){
//            if(mv[i].getMtitle() == mtitle){
//                index = i;
//            }
//        }

        // selection sort
        selectionSort(mv);
        // 이진검색
        index = BinarySearch(mv, mtitle);

        if(index != -1){
            System.out.println(mv[index].getMprice());
        }else{
            System.out.println("검색 실패");
        }
    }

    public static int BinarySearch(Movie[] mv, String mtitle){
        // 이진검색
        int low = 0, high = mv.length - 1;
        int index = -1;

        while(low <= high){
            int middle = (low + high) / 2;
            if(mv[middle].getMtitle().compareTo(mtitle) == 0){
                index = middle;
                break;
            }else if(mv[middle].getMtitle().compareTo(mtitle) < 0){
                low = middle + 1;
            }else{
                high = middle - 1;
            }
        }

        return index;
    }

    public static void selectionSort(Movie[] mv){
        for(int i=0; i<mv.length - 1; i++){
            for(int j=i+1; j<mv.length; j++){
                if(mv[i].getMtitle().compareTo(mv[j].getMtitle()) > 0){
                    Movie temp;
                    temp = mv[i];
                    mv[i] = mv[j];
                    mv[j] = temp;
                }
            }
        }
    }
}
