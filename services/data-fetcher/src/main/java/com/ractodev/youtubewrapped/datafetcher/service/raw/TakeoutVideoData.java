package com.ractodev.youtubewrapped.datafetcher.service.raw;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TakeoutVideoData {
    @JsonProperty("title")
    private String title;

    @JsonProperty("subtitles")
    private List<VideoDetail> videoDetails;

    // No-args constructor
    public TakeoutVideoData() {
        this.title = "Unknown title";
        this.videoDetails = List.of(new VideoDetail("Unknown Channel", "Unknown Url"));
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<VideoDetail> getVideoDetails() {
        return this.videoDetails;
    }

    public void setVideoDetails(List<VideoDetail> videoDetails) {
        this.videoDetails = videoDetails;
    }

    @Override
    public String toString() {
        return "TakeoutVideoData{" +
                "title='" + title + '\'' +
                ", videoDetails=" + videoDetails +
                '}';
    }


    public static class VideoDetail {
        @JsonProperty("name")
        private String channel;

        @JsonProperty("url")
        private String url;

        // No-args constructor
        public VideoDetail() {
        }

        // Custom constructor
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

        @Override
        public String toString() {
            return "VideoDetail{" +
                    "channel='" + channel + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }

    }
}
