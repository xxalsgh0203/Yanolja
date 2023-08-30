package org.example.model;
//     Spring Data JPA --> CrudRepository, JpaRepository
//                         delete(), save() : insert, update, findAll() ...
public interface BookRepository {
    // CRUD method 정의
    public int bookDelete(int num);

}
