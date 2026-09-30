package io.github.foiovituh.jpuzzles.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {

    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void shouldValidateParentheses() {
        assertTrue(validParentheses.solve(""));
        assertTrue(validParentheses.solve("()"));
        assertTrue(validParentheses.solve("()[]{}"));
        assertTrue(validParentheses.solve("{[]}"));
        assertTrue(validParentheses.solve("{[()]}"));
    }

    @Test
    void shouldRejectInvalidParentheses() {
        assertFalse(validParentheses.solve("(]"));
        assertFalse(validParentheses.solve("([)]"));
        assertFalse(validParentheses.solve(")"));
        assertFalse(validParentheses.solve("]"));
        assertFalse(validParentheses.solve("}"));
        assertFalse(validParentheses.solve("(()"));
        assertFalse(validParentheses.solve("(["));
        assertFalse(validParentheses.solve("{"));
    }
}