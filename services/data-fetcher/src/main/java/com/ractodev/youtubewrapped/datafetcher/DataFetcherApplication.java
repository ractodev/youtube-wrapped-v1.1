package com.ractodev.youtubewrapped.datafetcher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataFetcherApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DataFetcherApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Here, you can add any code to test your service or invoke certain methods.
        // For instance, you might fetch data from the YouTube API and print it to the terminal.
        System.out.println("DataFetcher service started!");

        // Call any service methods you want to test here
        // Example:
        // watchHistoryService.fetchRecentHistory();

        System.out.println("DataFetcher service finished!");
    }
}
