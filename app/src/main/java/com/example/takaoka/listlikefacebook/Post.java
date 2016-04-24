package com.example.takaoka.listlikefacebook;

/**
 * Created by takaoka on 2016/04/24.
 */
public class Post {

    private String title;

    private String description;

    public Post() {
    }

    public String getTitle() {
        return title;
    }

    public Post setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Post setDescription(String description) {
        this.description = description;
        return this;
    }
}
