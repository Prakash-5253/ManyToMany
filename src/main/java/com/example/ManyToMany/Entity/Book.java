package com.example.ManyToMany.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Book_Table")
public class Book {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "bookId")
    private String id;
    private String bookName;
    @ManyToMany(cascade = CascadeType.ALL)
    //@JoinTable(name = "fk_id", @JoinColumn(name = "book_id"))
    @JoinTable(name = "book_story_Mapping", joinColumns = @JoinColumn(name = "bookId"),
            inverseJoinColumns = @JoinColumn(name = "storyId"))
    private List<Story> storySet;
}
