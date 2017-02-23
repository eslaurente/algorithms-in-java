import java.util.List;

/**
 * EPI 6.4 (p. 68)
 * Advancing Through an Array - Write a program which takes an array n integers, where A[i] denotes the maximum you can
 * advance from index i, and returns true or false whether it is possible to advance ot the last index from the index 0.
 */
public class CanReachTheEnd {
    public static boolean checkPath(List<Integer> A) {
        int lastIndex = A.size() - 1;
        if (lastIndex == -1) {
            return false;
        }

        int furthestIndex = 0;
        for (int i = 0; i <= furthestIndex && furthestIndex < lastIndex; i++) {
            furthestIndex = Math.max(furthestIndex, A.get(i) + i);
        }

        System.out.println(A + ": furthest: " + furthestIndex + " | reaches end? " + (furthestIndex >= lastIndex));

        return furthestIndex >= lastIndex;
    }
}
