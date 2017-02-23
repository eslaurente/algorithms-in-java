import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * EPI 6.11 (p.79)
 * Implement an algorithm that takes in an input array of distinct elements and a size, k, and returns
 * a subset of the given size of the array. All subsets should be equally likely chosen.
 */
public class RandomSample {
    public static <E> void randomSubarray(List<E> A, int k) {
        int n = A.size();
        Random random = new Random();
        for (int i = 0; i < k; i++) {
            Collections.swap(A, i, i + random.nextInt(n - i));
        }
    }
}
