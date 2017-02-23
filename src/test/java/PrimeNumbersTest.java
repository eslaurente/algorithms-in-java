import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by laurente on 2/20/17.
 */
class PrimeNumbersTest {
    @Test
    public void enumeratesPrimesToN() {
        List<Integer> result = PrimeNumbers.enumerate(18);
        System.out.println(result);
        List<Integer> expect = Arrays.asList(2, 3, 5, 7, 11, 13, 17);
        assertEquals(7, result.size());
        assertTrue(expect.equals(result));
    }
}