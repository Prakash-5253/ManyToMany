package com.example.ManyToMany.Repository;

import com.example.ManyToMany.Entity.Story;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoryRepository extends JpaRepository<Story,String> {
}
