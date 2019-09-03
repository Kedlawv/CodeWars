/*  Write a function, persistence, that takes in a positive parameter num and returns its multiplicative
    persistence, which is the number of times you must multiply the digits in num until you reach
    a single digit.

    For example:

    persistence(39) == 3    // because 3*9 = 27, 2*7 = 14, 1*4=4
                            // and 4 has only one digit
    persistence(999) == 4   // because 9*9*9 = 729, 7*2*9 = 126,
                            // 1*2*6 = 12, and finally 1*2 = 2
    persistence(4) == 0     // because 4 is already a one-digit number
*/

import java.util.ArrayDeque;
import java.util.Deque;

// My code
public class Persist {
    public static int persistence(long n) {
        int persistanceCount = 0;

        while (n > 9) {
            Deque<Long> digits = extractDigits(n);
            n = 1;
            while (!digits.isEmpty()) {
                n *= digits.pop();
            }
            persistanceCount++;
        }
        return persistanceCount;
    }

    //Top answer by 'best practices'
    public static int persistenceTopCWAnswer(long n) { // recursive
        long m = 1, r = n;

        if (r / 10 == 0)   // integer division if r / 10 is 0 than number is less than 10
            return 0;       // return condition for the recursion

        for (r = n; r != 0; r /= 10)     // m is the result of multiplication for current frame
            m *= r % 10;                 // r is the result of last frames multiplication

        return persistence(m) + 1;      //recursive call , +1 will sum up the frames on the way back

    }

    // helper method for my code
    public static Deque<Long> extractDigits(long num) {
        Deque<Long> digitStack = new ArrayDeque<>();
        while (num > 0) {
            digitStack.push(num % 10);
            num /= 10;
        }
        return digitStack;
    }
}
