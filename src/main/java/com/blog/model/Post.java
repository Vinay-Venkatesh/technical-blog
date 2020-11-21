package com.blog.model;
import java.util.Date;

public class Post {

    private String title;
    private String body;
    private Date date;

    public Post() {
    }

    public Post(String title, String body, Date date) {
        this.title = title;
        this.body = body;
        this.date = date;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Post title(String title) {
        this.title = title;
        return this;
    }

    public Post body(String body) {
        this.body = body;
        return this;
    }

    public Post date(Date date) {
        this.date = date;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " title='" + getTitle() + "'" +
            ", body='" + getBody() + "'" +
            ", date='" + getDate() + "'" +
            "}";
    }

}
