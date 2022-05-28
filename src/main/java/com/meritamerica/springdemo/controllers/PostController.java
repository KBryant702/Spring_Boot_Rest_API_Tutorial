package com.meritamerica.springdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping(path = "/strings")
    public String addString() {
        String string = "test";
        strings.add(string);
        return string;
    }
}