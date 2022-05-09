package com.spring.codeblog.services;

import com.spring.codeblog.model.PostModel;

import java.util.List;

public interface CodeBlogService {

    List<PostModel> findAll();
    PostModel findById(long id);
    PostModel save(PostModel postModel);

}
