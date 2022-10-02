package com.moodanalyzer;

public class MoodAnalyzer {
    String analyseMood(String input) {
        if (input.equalsIgnoreCase("I am in Happy mood")) {
            return "HAPPY";
        } else {
            return "SAD";
        }
    }
}
