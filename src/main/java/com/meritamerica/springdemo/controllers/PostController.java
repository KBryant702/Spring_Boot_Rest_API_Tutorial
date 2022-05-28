package com.meritamerica.springdemo.controllers;

import com.meritamerica.springdemo.exceptions.NoSuchResourceFoundException;
import com.meritamerica.springdemo.models.Post;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public String addString(@Valid @RequestBody String string) {
//        String string = "test";
        strings.add(string);
        return string;
    }

    @GetMapping(path = "/posts")
    @ResponseStatus(HttpStatus.OK)
    public List<Post> getPosts() {
        return posts;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "/posts")
    public Post addPost(@Valid @RequestBody Post post) {
        posts.add(post);
        return post;
    }

    @GetMapping(path = "/posts/{id}")
    public Post getPostById(@PathVariable int id) throws NoSuchResourceFoundException {
        if (id > posts.size() - 1) {
            throw new NoSuchResourceFoundException("Invalid id");
        }
        return posts.get(id);
    }
}