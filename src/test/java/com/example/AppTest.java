package com.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AppTest {
    @Test
    public void testApp() {
        assertTrue("This should always pass.", true);
    }

    // Example of poor test coverage
    @Test
    public void testCoverage() {
        App.main(new String[]{});
    }
}
