package com.example.ManyToMany.Controller;

import com.example.ManyToMany.Entity.Book;
import com.example.ManyToMany.Repository.BookRepository;
import com.example.ManyToMany.Repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookManagement {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    StoryRepository  storyRepository;
    @PostMapping("/addDetails")
    public String addInfo(@RequestBody List<Book> bookSet){
        bookRepository.saveAll(bookSet);
        return "details are added";
    }
    @DeleteMapping("/removeDetail/{id}")
    public  String deleteInfo(@PathVariable("id") String id){
       bookRepository.deleteById(id);
        return "deleted successfully";
    }
}
