package com.solution.random.youtube.course.mit;

import org.junit.Assert;
import org.junit.Test;

public class MemoizationVsRecursionTest {
    @Test
    public void testingFibonocciViaMemoization() {
        MemoizationVsRecursion memoizationVsRecursionTest = new MemoizationVsRecursion();
        Assert.assertEquals(1, memoizationVsRecursionTest.fibonocciViaMemoization(1));
        Assert.assertEquals(1, memoizationVsRecursionTest.fibonocciViaMemoization(2));
        Assert.assertEquals(2, memoizationVsRecursionTest.fibonocciViaMemoization(3));
        Assert.assertEquals(55, memoizationVsRecursionTest.fibonocciViaMemoization(10));
    }

    @Test
    public void testingFibonocciViaRecursion() {
        MemoizationVsRecursion memoizationVsRecursionTest = new MemoizationVsRecursion();
        Assert.assertEquals(55, memoizationVsRecursionTest.fibnocciViaRecursion(10));
    }
}
