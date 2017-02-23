import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by laurente on 2/18/17.
 */
class RandomSampleTest {
    List<Integer> A = Arrays.asList(3, 7, 5, 11);


    @Test
    public void test() {
        System.out.println(A);
        RandomSample.randomSubarray(A, 3);
        System.out.println(A);
    }
}