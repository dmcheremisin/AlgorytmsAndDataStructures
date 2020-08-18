package com.algorithms.data.structures.challenges.leetcode;

import org.junit.Test;

import static com.algorithms.data.structures.challenges.leetcode.MedianOfTwoArrays.findMedianSortedArrays;
import static org.junit.Assert.*;

public class MedianOfTwoArraysTest {

    @Test
    public void findMedianSortedArraysTest() {
        assertEquals(2.0, findMedianSortedArrays(new int[]{1, 2}, new int[]{3}), 0.1);
        assertEquals(2.5, findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 0.1);
    }
}