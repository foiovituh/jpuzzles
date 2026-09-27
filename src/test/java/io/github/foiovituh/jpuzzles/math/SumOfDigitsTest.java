package io.github.foiovituh.jpuzzles.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfDigitsTest {

    private final SumOfDigits sumOfDigits = new SumOfDigits();

    @Test
    void shouldSumDigits() {
        assertEquals(6, sumOfDigits.solve(123));
        assertEquals(22, sumOfDigits.solve(4567));
        assertEquals(9, sumOfDigits.solve(9));
    }
}