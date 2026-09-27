package io.github.foiovituh.jpuzzles.math;

public class SumOfDigits {
    public int solve(int number) {
        int numberCopy = number;
        int sum = 0;

        while (numberCopy > 0) {
            sum += numberCopy % 10;
            numberCopy /= 10;
        }   

        return sum;
    }
}