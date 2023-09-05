package com.ractodev.youtubewrapped.datafetcher.service;

public class Video {
    private String title;
    private String creator;
    private String url;
    private String category;
    private double length;

    // Constructor
    public Video(String title, String creator, String url, String category, double length) {
        this.title = title;
        this.creator = creator;
        this.url = url;
        this.category = category;
        this.length = length;
    }

    public String getVideoTitle() {
        return this.title;
    }

    public String getVideoCreator() {
        return this.creator;
    }

    public String getVideoUrl() {
        return this.url;
    }

    public String getVideoCategory() {
        return this.category;
    }

    public Double getVideoLength() {
        return this.length;
    }
}
