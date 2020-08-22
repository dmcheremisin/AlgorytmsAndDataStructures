package com.algorithms.data.structures.challenges.leetcode;

import org.junit.Test;

import static com.algorithms.data.structures.challenges.leetcode.ZigZagConversion.convert;
import static org.junit.Assert.*;

public class ZigZagConversionTest {

    @Test
    public void convertTest() {
        assertEquals(convert("PAYPALISHIRING", 3), "PAHNAPLSIIGYIR");
        assertEquals(convert("PAYPALISHIRING", 4), "PINALSIGYAHRPI");
        assertEquals(convert("", 2), "");
        assertEquals(convert("AB", 1), "AB");
    }


}