package com.spring.codeblog.repositories;

import com.spring.codeblog.model.PostModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeBlogRepository extends JpaRepository<PostModel, Long> {

}
