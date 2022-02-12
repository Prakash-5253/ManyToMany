package com.example.ManyToMany.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name="Story_Table")
public class Story {
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    //@Column(name = "storyId")
    private String id;
    private String storyName;
    @ManyToMany(mappedBy = "storySet",cascade = CascadeType.ALL)
   // @JsonIgnoreProperties("storySet")
    private List<Book> bookSet;
}
