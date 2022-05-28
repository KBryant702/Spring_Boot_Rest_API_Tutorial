package com.meritamerica.springdemo.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PostController {

    List<String> strings = new ArrayList<String>();

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String test() {
        return "Hello World!";
    }

    @GetMapping(path = "/strings")
    public List<String> getStrings() {
        return strings;
    }

    @PostMapping(path = "/strings")
    public String addString() {
        String string = "test";
        strings.add(string);
        return string;
    }
}