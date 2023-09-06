package com.ractodev.youtubewrapped.datafetcher.service;

import com.ractodev.youtubewrapped.datafetcher.service.enriched.EnrichedVideo;

import java.util.List;

public class User {
    private String userId;
    private List<EnrichedVideo> watchedVideos;

    // Constructor
    public User(String userId, List<EnrichedVideo> watchedVideos) {
        this.userId = userId;
        this.watchedVideos = watchedVideos;
    }

    public String getUserId() {
        return this.userId;
    }

    public List<EnrichedVideo> getWatchedVideos() {
        return this.watchedVideos;
    }
}
