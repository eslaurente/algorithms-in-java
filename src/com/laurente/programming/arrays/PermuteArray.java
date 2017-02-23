import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by laurente on 2/21/17.
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
