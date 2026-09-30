package io.github.foiovituh.jpuzzles.string;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class ValidParentheses{
	private static final Set<Character> OPEN_CHARS = Set.of('(', '[', '{');
	private static final Set<Character> CLOSE_CHARS = Set.of(')', ']', '}');

    public boolean solve(String string) {
    	if (string.isBlank()) {
    		return true;
    	}

    	int length = string.length();

    	if ((length % 2) != 0) {
    		return false;
    	}

    	var chars = string.toCharArray();

    	if (!OPEN_CHARS.contains(chars[0])
    			|| !CLOSE_CHARS.contains(chars[length - 1])) {
    		return false;
    	}

    	Deque<Character> deque = new ArrayDeque<>();

		for (Character c : chars) {
			if (OPEN_CHARS.contains(c)) {
				deque.add(c);
			} else if (CLOSE_CHARS.contains(c)) {
				char equivalentOpen = switch (c) {
					case ')' -> '(';
					case ']' -> '[';
					case '}' -> '{';
					default -> 'x';
				};
                
				if (equivalentOpen == deque.getLast()) {
				    deque.removeLast();
				    
					continue;
				}
				
				return false;
			}
		}

        return true;
    }
}