package com.spring.codeblog.services.serviceImpl;

import com.spring.codeblog.model.PostModel;
import com.spring.codeblog.repositories.CodeBlogRepository;
import com.spring.codeblog.services.CodeBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeBlogServiceImpl implements CodeBlogService {

    @Autowired
    private CodeBlogRepository codeBlogRepository;

    @Override
    public List<PostModel> findAll() {
        return codeBlogRepository.findAll();
    }

    @Override
    public PostModel findById(long id) {
        return codeBlogRepository.findById(id).get();
    }

    @Override
    public PostModel save(PostModel postModel) {
        return codeBlogRepository.save(postModel);
    }
}
