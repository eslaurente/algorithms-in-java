import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by laurente on 2/21/17.
 */
class PermuteArrayTest {

    @Test
    public void appliesAPermutationOnAnArray() {
        List<Integer> A = Arrays.asList(1, 2, 3, 4);
        List<Integer> result = PermuteArray.apply(Arrays.asList(2, 0, 1, 3), A);
        System.out.println(A + " => " + result);
        assertEquals(4, result.size());
    }

    @Test
    public void getsTheNextPermutationOfZeroZeroZero() {
        List<Integer> A = Arrays.asList(0, 0, 0);
        List<Integer> result = PermuteArray.next(A);
        System.out.println(A + " => " + result);
        assertEquals(Arrays.asList(0, 0, 1), result);
    }

    @Test
    public void getsTheNextPermutationOfOneThreeNine() {
        List<Integer> A = Arrays.asList(1, 3, 9);
        List<Integer> result = PermuteArray.next(A);
        System.out.println(A + " => " + result);
        assertEquals(Arrays.asList(1, 4, 0), result);
    }

    @Test
    public void emptyArrayOnLastPermutation() {
        List<Integer> A = Arrays.asList(9, 9, 9);
        List<Integer> result = PermuteArray.next(A);
        System.out.println(A + " => " + result);
        assertEquals(Arrays.asList(), result);
    }

}