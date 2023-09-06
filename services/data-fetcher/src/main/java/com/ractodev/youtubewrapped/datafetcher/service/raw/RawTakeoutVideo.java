package com.ractodev.youtubewrapped.datafetcher.service.raw;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

/**
 * Represents raw video data of interest which can be found
 * in Google Takeout JSON file. Unwanted fields are ignored
 * when mapping JSON to Java Object using Jackson reader.
 * Metadata include title, channel and url.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RawTakeoutVideo {
    @JsonProperty("title")
    private String title;

    @JsonProperty("subtitles")
    private List<VideoDetail> videoDetails;

    /**
     * Initializes a raw takeout video object
     */
    public RawTakeoutVideo() {
        this.title = "Unknown title";
        this.videoDetails = List.of(new VideoDetail("Unknown Channel", "Unknown Url"));
    }

    /**
     * @return title of the YouTube Video, or "Unknown Title" if not set
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @param title of the YouTube Video
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return additional video details including channel and video url
     */
    public List<VideoDetail> getVideoDetails() {
        return this.videoDetails;
    }

    /**
     * @param videoDetails, i.e. additional video details including channel and video url
     */
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

    /**
     * Represents additional details on the video's metadata,
     * including channel and video url
     */
    public static class VideoDetail {
        @JsonProperty("name")
        private String channel;

        @JsonProperty("url")
        private String url;

        // No-args constructor
        public VideoDetail() {
        }

        /**
         * Initializes an object of additional video details
         * @param channel
         * @param url
         */
        public VideoDetail(String channel, String url) {
            this.channel = channel;
            this.url = url;
        }

        /**
         * @return channel that uploaded the video
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @param channel that uploaded the video
         */
        public void setChannel(String channel) {
            this.channel = channel;
        }

        /**
         * @return url of the video
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @param url of the video
         */
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
