package io.github.foiovituh.jpuzzles.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStringTest {

    private final ReverseString reverseString = new ReverseString();

    @Test
    void shouldReverseString() {
        assertEquals("", reverseString.solve(""));
        assertEquals("a", reverseString.solve("a"));
        assertEquals("ba", reverseString.solve("ab"));
        assertEquals("olleh", reverseString.solve("hello"));
        assertEquals("!dlrow olleh", reverseString.solve("hello world!"));
        assertEquals("abca", reverseString.solve("acba"));
    }
}