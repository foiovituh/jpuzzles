package io.github.foiovituh.jpuzzles.string;

public class ReverseString {

    public String solve(String string) {
    	int length = string.length();

    	if (1 == length) {
    		return string;
    	}
    	
    	var reversed = new char[length];

    	for (int i = 0; i < length; i++) {
    		reversed[i] = string.charAt(length - 1 - i);
    	}

    	return String.valueOf(reversed);
    }
}