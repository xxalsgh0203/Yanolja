package ch06;

import java.util.Arrays;

// 스트림 이란?
// 자료의 대상과 관계없이 동일한 연산을 수행
// 배열, 컬렉션을 대상으로 연산을 수행 함
// 일관성 있는 연산으로 자료의 처리를 쉽고 간단하게 함

// 스트림 연산은 중간 연산과 최종 연산으로 구분 됨

public class IntArrayStreamTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for(int num : arr){
            System.out.println(num);
        }

        Arrays.stream(arr).forEach(n -> System.out.println(n));
        // 또 다른 연산을 하기 위해서는 다른 stream 을 재생성해야한다.
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
