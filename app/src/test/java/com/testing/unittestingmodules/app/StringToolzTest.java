package com.testing.unittestingmodules.app;

import com.testing.library.TestHelper;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class StringToolzTest {

    @Test
    public void testToUpper() throws Exception {
        String result = StringToolz.toUpper("hi");
        assertEquals("HI", result);
    }

    public void testToUpperWithSpaces() {
        String result = StringToolz.toUpperAndTrail("car");
        assertEquals("car ", result);
        TestHelper.assertTrimmedEquals("car", result);
    }


}