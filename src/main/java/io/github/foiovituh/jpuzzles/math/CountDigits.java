package io.github.foiovituh.jpuzzles.math;

public class CountDigits {
    public int solve(int number) {
        int numberCopy = number;
        int count = 0;

        while (numberCopy > 0) {
            numberCopy /= 10;
            count++;
        }   

        return count;
    }
}