package com.education.atm;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.Vector;

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
        int arr[] = new int[4];
        int[] change = {1, 3};
        Vector res = new Vector<>();
        Vector expected = new Vector();
        example.findCombinationsUtil(arr, change, 0, 4, 4, res);
        Assert.assertEquals("[1, 1, 1, 1, 1, 3]", res.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    void main() {
    }
}