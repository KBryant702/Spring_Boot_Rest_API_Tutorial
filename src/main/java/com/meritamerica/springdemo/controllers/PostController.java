package com.meritamerica.springdemo.controllers;

import com.meritamerica.springdemo.models.Post;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PostController {

    List<String> strings = new ArrayList<String>();
    List<Post> posts = new ArrayList<Post>();

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String test() {
        return "Hello World!";
    }

    @GetMapping(path = "/strings")
    public List<String> getStrings() {
        return strings;
    }

    @PostMapping(path = "/strings")
    public String addString(@RequestBody String string) {
//        String string = "test";
        strings.add(string);
        return string;
    }

    @GetMapping(path = "/posts")
    public List<Post> getPosts(){
        return posts;
    }

    @PostMapping(path = "/posts")
    public Post addPost(@RequestBody Post post){
        posts.add(post);
        return post;
    }
}