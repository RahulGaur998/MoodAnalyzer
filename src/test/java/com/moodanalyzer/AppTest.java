package com.moodanalyzer;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AppTest {
    String userInput;
    String expectation;

    MoodAnalyzer moodAnalyzerObject;

    @Before
    public void initialize() {
        moodAnalyzerObject = new MoodAnalyzer();
    }

    public AppTest(String userInput, String expectation) {
        this.userInput = userInput;
        this.expectation = expectation;
    }

    @Parameterized.Parameters
    public static Collection inputs() {
        return Arrays.asList(new Object[][] { { "I am in sad mood", "SAD" }, { "I am in happy mood", "HAPPY" }
        });
    }

    @Test
    public void checkUserInput() {
        // assertEquals(this.expectation,
        // moodAnalyzerObject.analyseMood(this.userInput));
    }

    @Test
    public void constructerMoodAnalyzer() {
        String inputMessage = "I am in sad mood";

        MoodAnalyzer moodAnalyzerObject = new MoodAnalyzer(inputMessage);
        String result = moodAnalyzerObject.analyseMood();

        assertEquals("SAD", result);
    }
}
