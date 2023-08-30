package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

// Lombok API
// 어노테이션. 전처리
@Data // getter, setter, toString
@NoArgsConstructor // 디폴트 생성자
@AllArgsConstructor
//@RequiredArgsConstructor
public class Book {
    private int num;
    private String title;
    private String company;
    private String name;
    private int price;

 // getter, setter, toString, Book(), Book(title, company, name, price)
}
