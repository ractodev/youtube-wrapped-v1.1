package com.ractodev.youtubewrapped.datafetcher.service.enriched;

public class Video {
    private String title = "Unknown Title";
    private String channel = "Unknown Channel";
    private String url = "Unknown Url";
    private String category = "Unknown Category";
    private double length = 0;

    // Constructor
    public Video(String title, String channel, String url, String category, double length) {
        this.title = title;
        this.channel = channel;
        this.url = url;
        this.category = category;
        this.length = length;
    }

    public String getTitle() {
        return this.title;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getUrl() {
        return this.url;
    }

    public String getCategory() {
        return this.category;
    }

    public Double getLength() {
        return this.length;
    }
}
