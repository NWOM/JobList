package com.sagnik.joblisting.controller;

import com.sagnik.joblisting.repository.PostRepository;
import com.sagnik.joblisting.model.Post;
import com.sagnik.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController
{
    @Autowired
    PostRepository repo;
    @Autowired
    SearchRepository searchRepository;
    @ApiIgnore
    @RequestMapping(value="/")
    @CrossOrigin
   public void redirect(HttpServletResponse response)throws IOException {
       response.sendRedirect("/swagger-ui.html");
   }
   @GetMapping("/posts")
   @CrossOrigin
   public List<Post> getAllPosts()
    {
         return repo.findAll();
    }
    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text){
         return searchRepository.findByText(text);
    }
    @PostMapping("/post")
    @CrossOrigin
    public Post addPost(@RequestBody Post post){
       return repo.save(post);

    }

}
