package com.testing.library;

import junit.framework.TestCase;

public class TestHelper extends TestCase {
    public static void assertTrimmedEquals(String expected, String actual) {
        expected = expected.trim();
        actual = actual.trim();
        assertEquals(expected, actual);
    }
}