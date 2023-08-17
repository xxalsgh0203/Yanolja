package ch17;

public class Company {
    private static Company instance = new Company(); // 유일한 객체 => 외부에서 쓰일 수 있게 해야함
    private Company(){ // 생성자를 private 로 만들어 줌으로서 company 를 마음대로 new 할 수 없음. 컴파일러는 생성자를 제공하지 않음.

    }

    public static Company getInstance(){ // 객체 생성없이 사용해야 하므로 static 이여야함
        if(instance == null){
            instance = new Company();
        }
        return instance;
    }

}
