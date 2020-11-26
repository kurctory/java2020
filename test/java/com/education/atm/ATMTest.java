package com.education.atm;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import java.io.*;

class ATMTest{
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    void testfindCombinationsUtil() {
    }

    @Test
    void testfindCombinations() {
        ATM example = new ATM();
        int arr[] = new int[5];
        int[] change = {2, 3};
        example.findCombinationsUtil(arr, change, 0, 5, 5);
        Assert.assertEquals("2 3", output.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    void main() {
    }
}