package org.example.model;

import java.util.List;

//     Spring Data JPA --> CrudRepository, JpaRepository
//                         delete(), save() : insert, update, findAll() ...
public interface BookRepository {
    // CRUD method 정의
    public int bookDelete(int num);

    public List<Book> getLikeBooks(String search);
}
