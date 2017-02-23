import java.util.List;

/**
 *  EPI 6.2 (pp. 65-66)
 *  Increment an Arbitrary-precision integer - Increment an array of digits by 1
 */
public class IncrementIntegerArray {
    public static void plusOne(List<Integer> A) {
        int lastIndex = A.size() - 1;
        // Add one to the right-most digit:
        A.set(lastIndex, A.get(lastIndex) + 1);

        // For each element with 10, set to 0, and increment the next left element
        for (int i = lastIndex; i > 0 && A.get(i) == 10; i--) {
            A.set(i, 0);
            A.set(i - 1, A.get(i - 1) + 1);
        }

        if (A.get(0) == 10) {
            // If the first element is a 10, set it to 0, and add a new '1' digit to the left
            A.set(0, 0);
            A.add(0, 1);
        }
    }
}
