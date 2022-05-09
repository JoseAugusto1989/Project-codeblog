package com.spring.codeblog.utils;

import com.spring.codeblog.model.PostModel;
import com.spring.codeblog.repositories.CodeBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    private CodeBlogRepository codeBlogRepository;

    //@PostConstruct 'gera o banco de dados toda a vez que o codigo for rodado'
    public void savePosts() {

        List<PostModel> postList = new ArrayList<>();

        PostModel post1 = new PostModel();
        post1.setAuthor("Jose Augusto");
        post1.setDate(LocalDate.now());
        post1.setTitle("Docker");
        post1.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
                "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud " +
                "exercitation ullamco laboris nisi");

        PostModel post2 = new PostModel();
        post2.setAuthor("Michelle Brito");
        post2.setDate(LocalDate.now());
        post2.setTitle("API REST");
        post2.setText("But I must explain to you how all this mistaken idea of denouncing pleasure and" +
                " praising pain was born and I will give you a complete account of the system, " +
                "and expound the actual teachings of the great explorer of the truth, the master-builder" +
                " of human happiness. No one rejects, dislikes, or avoids pleasure itself");

        postList.add(post1);
        postList.add(post2);

        for(PostModel post: postList) {
            PostModel postSaved = codeBlogRepository.save(post);
            System.out.println(postSaved.getId());
        }

    }
}
