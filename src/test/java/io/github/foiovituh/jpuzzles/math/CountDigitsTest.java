package io.github.foiovituh.jpuzzles.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountDigitsTest {

    private final CountDigits countDigits = new CountDigits();

    @Test
    void shouldSumDigits() {
		assertEquals(3, countDigits.solve(123));
		assertEquals(4, countDigits.solve(4567));
		assertEquals(1, countDigits.solve(9));
		assertEquals(5, countDigits.solve(10000));
    }
}