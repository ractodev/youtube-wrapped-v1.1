package com.ractodev.youtubewrapped.datafetcher.service;

import com.ractodev.youtubewrapped.datafetcher.service.enriched.Video;

import java.util.List;

public class User {
    private String userId;
    private List<Video> watchedVideos;

    // Constructor
    public User(String userId, List<Video> watchedVideos) {
        this.userId = userId;
        this.watchedVideos = watchedVideos;
    }

    public String getUserId() {
        return this.userId;
    }

    public List<Video> getWatchedVideos() {
        return this.watchedVideos;
    }
}
