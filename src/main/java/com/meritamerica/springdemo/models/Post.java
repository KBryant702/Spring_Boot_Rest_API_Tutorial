package com.meritamerica.springdemo.models;

import javax.validation.constraints.NotBlank;

public class Post {
    static int nextId = 0;

    int id;
    @NotBlank(message = "Title is mandatory")
    String title;
    @NotBlank(message = "Body is mandatory")
    String body;

    public Post() {
        this.id = nextId++;
        this.title = "";
        this.body = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
