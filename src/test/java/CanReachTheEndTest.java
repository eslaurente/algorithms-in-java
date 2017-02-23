import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by laurente on 2/19/17.
 */
class CanReachTheEndTest {
    @Test
    public void falseOnEmpty() {
        assertEquals(false, CanReachTheEnd.checkPath(Arrays.asList()));
    }

    @Test
    public void falseWhenFirstElementIsZero() {
        assertEquals(false, CanReachTheEnd.checkPath(Arrays.asList(0, 3, 5)));
    }

    @Test
    public void trueWhenSizeOneIsNonZero() {
        assertEquals(true, CanReachTheEnd.checkPath(Arrays.asList(3)));
    }

    @Test
    public void trueWhenFirstElementIsASolution() {
        assertEquals(true, CanReachTheEnd.checkPath(Arrays.asList(3, 0, 0, 3)));
    }

    @Test
    public void falseWhenNoSolution() {
        assertEquals(false, CanReachTheEnd.checkPath(Arrays.asList(2, 0, 0, 3)));
    }

    @Test
    public void trueWithASolution() {
        assertEquals(true, CanReachTheEnd.checkPath(Arrays.asList(3, 3, 1, 0, 2, 0, 1)));
    }
}