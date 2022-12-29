package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K4Square2d22() {
        double expected = 2.22;
        int p = 8;
        double k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP9K5Square3d47() {
        double expected = 3.47;
        int p = 10;
        double k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}