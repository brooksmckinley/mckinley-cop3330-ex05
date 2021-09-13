/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAdd() {
        Assertions.assertEquals(App.add(1, 1), 2);
        Assertions.assertEquals(App.add(2, 2), 4);
        Assertions.assertEquals(App.add(123, 234), 357);
    }

    @Test
    public void testSubtract() {
        Assertions.assertEquals(App.subtract(1, 1), 0);
        Assertions.assertEquals(App.subtract(123, 23), 100);
        Assertions.assertEquals(App.subtract(100, 123), -23);
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(App.multiply(3, 3), 9);
        Assertions.assertEquals(App.multiply(123, -1), -123);
        Assertions.assertEquals(App.multiply(10, 9), 90);
        Assertions.assertEquals(App.multiply(21839283, 1), 21839283);
    }

    @Test
    public void testDivide() {
        Assertions.assertEquals(App.divide(10, 2), 5);
        Assertions.assertEquals(App.divide(5, 2), 2);
        Assertions.assertEquals(App.divide(4, 1), 4);
        Assertions.assertEquals(App.divide(4, -1), -4);
    }

    @Test
    public void testReport() {
        String expected = "10 + 5 = 15\n10 - 5 = 5\n10 * 5 = 50\n10 / 5 = 2";
        String actual = App.generateReport(10, 5);
        Assertions.assertEquals(expected, actual);
    }
}