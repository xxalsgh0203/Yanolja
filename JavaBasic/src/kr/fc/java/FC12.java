package kr.fc.java;

public class FC12 {
    public static void main(String[] args) {
        // 자바에서 문자열처리? "APPLE"(객체로 취급). 객체를 생성한후 변수가 객체번지를 가리킴.
        String s = new String("Apple"); // Heap 에 저장됨.
        String s1 = "Apple"; // -> 문자열 상수(literal). 이중 따옴표를 객체로 취급한다.
        // 하지만 힙이 아닌 literal pool(문자열 상수만 생성하는 메모리공간) 이라는 곳에 저장이됨.

        // 두 방법모두 객체를 만든다는 사실은 같지만 메모리 저장공간이 다르다.
        System.out.println(s); // s.toString() 이 생략됨

        // 1. 길이
        System.out.println(s.length());

        // 2. 모두 소문자 출력
        System.out.println(s.toLowerCase());

        // 3. PL 이라는 부분 문자열만 출력
        System.out.println(s.substring(2, 4));

        // 4. # 자르고 출력
        String s2 = "바나나#포도#오렌지#귤";
        String[] sp = s1.split("#");
        for(String ss : sp){
            System.out.println(ss);
        }

        // 5. 문자열 비교 방법 1 (같은지 다른지)
        String str1 = "APPLE";
        String str2 = "BLUE";
        // str1 과 str2 가 같은지 다른지?
        if(str1.equals(str2)){
            System.out.println("str1 == str2");
        }else{
            System.out.println("str1 != str2");
        }

        // 6. 문자열 비교 방법 2 (어떤 문자열이 큰지 작은지) -> sorting 위해 ascii 코드값으로 비교
        int cmp = str1.compareTo(str2);
        if(cmp == 0){
            System.out.println("str1 == str2");
        }else if(cmp > 0){
            System.out.println("str1 > str2");
        }else{
            System.out.println("str1 < str2");
        }
    }
}

// XML, JSON, EXCEL, CVS, PDF
// 파일입출력
// 네트워킹, Thread
