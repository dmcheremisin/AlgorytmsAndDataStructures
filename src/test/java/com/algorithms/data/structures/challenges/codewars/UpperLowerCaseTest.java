package com.algorithms.data.structures.challenges.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class UpperLowerCaseTest {

    @Test
    public void solve() {
        assertEquals("code", UpperLowerCase.solve("code"));
        assertEquals("CODE", UpperLowerCase.solve("CODe"));
        assertEquals("code", UpperLowerCase.solve("COde"));
        assertEquals("code", UpperLowerCase.solve("Code"));
        assertEquals("", UpperLowerCase.solve(""));
    }
}