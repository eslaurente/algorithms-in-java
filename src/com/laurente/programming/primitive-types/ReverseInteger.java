/**
 *  EPI 5.8 (pp. 54-55)
 *  Reverse Digits
 */
public class ReverseInteger {
    public static int reverse(int x) {
        int result = 0;
        int remaining = Math.abs(x); // ignore sign
        while (remaining != 0) {
            result = (result * 10) + remaining % 10;
            remaining /= 10;
        }
        return x > 0 ? result : -result; // restore sign
    }
}
