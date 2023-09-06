package com.ractodev.youtubewrapped.datafetcher;

import com.ractodev.youtubewrapped.datafetcher.model.TakeoutProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DataFetcherApplication implements CommandLineRunner {

    @Autowired
    private TakeoutProcessingService takeoutProcessingService;

    public static void main(String[] args) {
        SpringApplication.run(DataFetcherApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("DataFetcher service started!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide path to your YouTube Takeout JSON file: ");
        String filePath = scanner.nextLine();
        takeoutProcessingService.processTakeoutData(filePath);

        System.out.println("DataFetcher service finished!");
    }
}
