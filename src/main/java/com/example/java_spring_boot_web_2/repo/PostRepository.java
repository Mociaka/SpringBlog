package com.example.java_spring_boot_web_2.repo;

import com.example.java_spring_boot_web_2.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
