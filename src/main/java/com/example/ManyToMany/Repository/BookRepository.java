package com.example.ManyToMany.Repository;

import com.example.ManyToMany.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,String> {
}
