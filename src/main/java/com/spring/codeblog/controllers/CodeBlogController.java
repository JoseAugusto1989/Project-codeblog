package com.spring.codeblog.controllers;

import com.spring.codeblog.model.PostModel;
import com.spring.codeblog.services.CodeBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CodeBlogController {

    @Autowired
    private CodeBlogService codeBlogService;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getPosts() {
        ModelAndView mv = new ModelAndView("posts");
        List<PostModel> posts = codeBlogService.findAll();
        mv.addObject("posts", posts);
        return mv;
    }

}
