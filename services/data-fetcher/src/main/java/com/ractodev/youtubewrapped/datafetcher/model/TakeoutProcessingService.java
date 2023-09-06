package com.ractodev.youtubewrapped.datafetcher.model;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ractodev.youtubewrapped.datafetcher.service.raw.TakeoutVideoData;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

// Reads takeout file, parses to user and video objects, fetches additional details from youtube api
@Service
public class TakeoutProcessingService {
    private String filePath;

    // Method that initializes data processing, and returns true/false if processing was successful
    public void processTakeoutData(String filePath) {
        try {
            this.filePath = filePath;
            printTakeoutData(readTakeoutFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Reads the Google Takeout JSON file
    private List<TakeoutVideoData> readTakeoutFile() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File(filePath);
        List<TakeoutVideoData> videoDataList = objectMapper.readValue(jsonFile, new TypeReference<List<TakeoutVideoData>>() {});

        return videoDataList;
    }

    private void printTakeoutData(List<TakeoutVideoData> videoDataList) {
        for (int i = 0; i < 5; i++) {
            System.out.println(videoDataList.get(i).toString());
        }
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
