package com.ractodev.youtubewrapped.datafetcher.service.enriched;

/**
 * Represents a video with additional enriched metadata,
 * including title, channel, url, category and length.
 */
public class EnrichedVideo {
    private String title = "Unknown Title";
    private String channel = "Unknown Channel";
    private String url = "Unknown Url";
    private String category = "Unknown Category";
    private double length = 0;

    /**
     * Initializes a new enriched Video object
     * @param title
     * @param channel
     * @param url
     * @param category
     * @param length
     */
    public EnrichedVideo(String title, String channel, String url, String category, double length) {
        this.title = title;
        this.channel = channel;
        this.url = url;
        this.category = category;
        this.length = length;
    }

    /**
     * @return title of the YouTube Video, or "Unknown Title" if not set
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return channel that uploaded video, or "Unknown Channel" if not set
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return video's url, or "Unknown Url" if not set
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return the YouTube category of the video, or "Unknown Category" if not set
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return length of video in seconds, or "0" if not set
     */
    public Double getLength() {
        return this.length;
    }
}
