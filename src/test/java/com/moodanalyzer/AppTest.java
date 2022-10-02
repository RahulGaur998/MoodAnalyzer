package com.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    @Test
    public void checkFirstName() {
        MoodAnalyzer moodAnalyzerObject = new MoodAnalyzer();
        assertEquals("SAD", moodAnalyzerObject.analyseMood("I am in Sad Mood"));
    }
}
