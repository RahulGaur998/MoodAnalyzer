package com.moodanalyzer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    @Test
    public void constructerMoodAnalyzer() {
        String inputMessage = "I am in sad mood";
        String inputMessage1 = "I am in happy mood";
        MoodAnalyzer moodAnalyzerObject = new MoodAnalyzer(inputMessage);
        MoodAnalyzer moodAnalyzerObject1 = new MoodAnalyzer(inputMessage1);
        String result = moodAnalyzerObject.analyseMood();
        String result1 = moodAnalyzerObject1.analyseMood();
        assertEquals("SAD", result);
        assertEquals("HAPPY", result1);
    }
}
