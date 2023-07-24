package kr.fc.model;
// 책(Object) => 제목, 가격, 출판사, 페이지수, 저자, ....
// 클래스는 객체 모델링 도구이다.
public class BookVO {
    // 1. private (정보은닉)
    private String title;
    private int price;

    // 생략된 생성자 메서드 : 디폴트 생성자
    // public BookVO(){
    //      자신의 모든 멤버들을 메모리에 로딩한다
    // }

    // setter, getter method
    public void setTitle(String title){
        this.title = title;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getTitle(){
        return this.title;
    }
    public int getPrice(){
        return this.price;
    }
}

// 정보은닉 이유 공부해보기