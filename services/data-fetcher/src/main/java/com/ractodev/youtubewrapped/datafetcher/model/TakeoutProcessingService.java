package com.ractodev.youtubewrapped.datafetcher.model;

// Reads takeout file, parses to user and video objects, fetches additional details from youtube api
public class TakeoutProcessingService {
    private String filePath;

    // Method that initializes data processing, and returns true/false if processing was successful
    public void processTakeoutData(String filePath) {
        this.filePath = filePath;
        readTakeoutFile();
    }

    // Reads the Google Takeout JSON file
    private void readTakeoutFile() {

    }

    /*
    // Parses the raw data to extract relevant details returned by readTakeoutFile()
    private void parseWatchHistory(Object rawData) {

    }

    // Fetches additional details (like video length) for a given video
    private void fetchAdditionalVideoDetails(Video video) {

    }

    // Saves the parsed watch history to database
    private void saveToDatabase(List<Video> video) {

    }
    */
}
