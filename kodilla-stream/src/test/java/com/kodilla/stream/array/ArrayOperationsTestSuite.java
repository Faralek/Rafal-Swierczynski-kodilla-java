package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {

        int[] numbers = {1, 4, 3, 5, 2, 10, 7, 9, 8, 11};

        double testAverage = ArrayOperations.getAverage(numbers);
        double trueAverage = 6;

        Assert.assertEquals(trueAverage, testAverage, 0);

    }
}
