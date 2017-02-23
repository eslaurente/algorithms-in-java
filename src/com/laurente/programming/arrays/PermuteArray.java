import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * EPI 6.9 (pp. 74-75)
 * A permutation can be viewed as a rearrangement of elements of a set/sequence to a new one. For example,
 * there are 24 permutations of {a, b, c, d}, as n!/(n-r)! describes.
 *
 * Given an array of permutation definition P and an array of elements A, apply P to A. For example,
 * let P = {2, 0, 1, 3} applied to A = {a, b, c, d} => {b, c, a, d}
 */
public class PermuteArray {
    public static List<Integer> apply(List<Integer> permutations, List<Integer> original) {
        if (permutations.size() != original.size()) {
            return null;
        }
        List<Integer> result = new ArrayList<>(original);
        int n = permutations.size();
        for (int i = 0; i < n; i++) {
            result.set(permutations.get(i), original.get(i));
        }

        return result;
    }
}
