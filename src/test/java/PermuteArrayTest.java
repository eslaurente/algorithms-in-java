import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by laurente on 2/21/17.
 */
class PermuteArrayTest {

    @Test
    public void test() {
        List<Integer> result = PermuteArray.apply(Arrays.asList(2, 0, 1, 3), Arrays.asList(1, 2, 3, 4));
        System.out.println(result);
        assertEquals(4, result.size());
    }
}