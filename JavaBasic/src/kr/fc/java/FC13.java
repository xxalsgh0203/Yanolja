package kr.fc.java;

import kr.fc.model.Movie;

public class FC13 {
    public static void main(String[] args) {
        // 영화 3편을 저장할 배열을 선언
        Movie[] mv = new Movie[3];
        mv[0] = new Movie("친구", "디카프리오", "WB", 17000, 15);
        mv[1] = new Movie("범죄와전쟁", "홍길동", "롯데", 13000, 12);
        mv[2] = new Movie("범죄도시", "마동석", "롯데", 15000, 13);

        // 가격을 기준으로 오름차순 정렬(sort) : 선택, 버블, 퀵, 힙...
        // 선택정렬
        for(int i=0; i<mv.length - 1; i++){
            for(int j=i+1; j<mv.length; j++){
                if(mv[i].getMprice() > mv[j].getMprice()){
                    Movie temp;
                    temp = mv[i];
                    mv[i] = mv[j];
                    mv[j] = temp;
                }
            }
        }

        // 영화 제목을 기준으로 오름차순 정렬
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


        // 출력
        for(Movie movie : mv){
            System.out.println(movie.toString());
        }
    }
}
