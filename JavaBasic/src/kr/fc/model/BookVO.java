package kr.fc.model;
// 책(Object) => 제목, 가격, 출판사, 페이지수, 저자, ....
// 클래스는 객체 모델링 도구이다.
public class BookVO { // public class BookVO extends Object
    // 1. private (정보은닉)
    private String title;
    private int price;

    // 생략된 생성자 메서드 : 디폴트 생성자
    // public BookVO(){
    //      자신의 모든 멤버들을 메모리에 로딩한다
    // }

    // 디폴트 생성자 메서드를 명시적으로 만들것.
    public BookVO(){} // 없어도 되지 않나? 없으면 확장성과 유연성이 떨어짐. 인스턴스 생성하면서 초기화 시키지 않을떄 필요할수 있음.

    public BookVO(String title, int price){ // 같은 메소드 이름 : 메소드 오버로딩
        this.title = title;
        this.price = price;
    }


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

    // 재정의 (Override)
    public String toString(){ // 클래스안에 있는 모든 멤버변수들을 리턴해주는 함수. 객체가 가지고 있는 모든 값의 확인 용도. 디버깅용도
        return this.title+"\t"+this.price;
    }

    // 항상 부모 클래스에 toString() 이 있기 때문에 toString() 이 정의되어 있지 않더라도 사용할 수 있음
    // 이 클래스 객체의 최상위 부모는 Object(Root Class).
}

// 정보은닉 이유 공부해보기