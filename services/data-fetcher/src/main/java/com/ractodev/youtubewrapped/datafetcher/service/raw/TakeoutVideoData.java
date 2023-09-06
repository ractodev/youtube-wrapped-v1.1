package com.ractodev.youtubewrapped.datafetcher.service.raw;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

// Class representing the raw data found in the takeout JSON file
public class TakeoutVideoData {
    @JsonProperty("title")
    private String title = "Unknown title";
    @JsonProperty("subtitles")
    private List<VideoDetail> videoDetails = List.of(new VideoDetail("Unknown Channel", "Unknown Url"));

    // Getter and setter methods for the above fields
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<VideoDetail> getVideoDetails() {
        return this.videoDetails;
    }

    public static class VideoDetail {
        @JsonProperty("name")
        private String channel;

        @JsonProperty("url")
        private String url;

        // Constructor
        public VideoDetail(String channel, String url) {
            this.channel = channel;
            this.url = url;
        }

        public String getChannel() {
            return this.channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public String getUrl() {
            return this.url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
