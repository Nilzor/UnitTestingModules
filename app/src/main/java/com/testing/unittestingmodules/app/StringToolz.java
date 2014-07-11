package com.testing.unittestingmodules.app;

import com.testing.library.LibraryStringTools;

public class StringToolz {
    public static String toUpper(String s) {
        return s.toUpperCase();
    }

    public static String toUpperAndTrail(String s) {
        return LibraryStringTools.trailWithSpace(s.toUpperCase());
    }
}
