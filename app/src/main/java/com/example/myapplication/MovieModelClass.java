package com.example.myapplication;

public class MovieModelClass {
    String name;
    String img;

    public MovieModelClass(String name, String img) {
        this.name = name;
        this.img = img;
    }

    public MovieModelClass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
