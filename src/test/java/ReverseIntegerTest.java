import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by laurente on 2/16/17.
 */
class ReverseIntegerTest {
    @Test
    public void zeroYieldsZero() {
        assertEquals(0, ReverseInteger.reverse(0));
    }

    @Test
    public void testReverseInteger() {
        assertEquals(53, ReverseInteger.reverse(35));
    }

    @Test
    public void testNegativeInteger() {
        assertEquals(-8744, ReverseInteger.reverse(-4478));
    }
}