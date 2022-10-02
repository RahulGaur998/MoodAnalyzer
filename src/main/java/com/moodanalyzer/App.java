package com.moodanalyzer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Mood Analyzer!");
        MoodAnalyzer moodAnalyzerObject = new MoodAnalyzer();
        logger.info(moodAnalyzerObject.analyseMood("Sad"));
    }
}
