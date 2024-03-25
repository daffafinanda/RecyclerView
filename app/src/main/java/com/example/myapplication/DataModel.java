package com.example.myapplication ;
public class DataModel {
    private String name;
    private String nim;
    private int imageResource;

    public DataModel(String name, String nim, int imageResource) {
        this.name = name;
        this.nim = nim;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public String getNim() {
        return nim;
    }

    public int getImageResource() {
        return imageResource;
    }
}
