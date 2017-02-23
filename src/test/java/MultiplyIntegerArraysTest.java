import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by laurente on 2/18/17.
 */
class MultiplyIntegerArraysTest {
    @Test
    public void multiplyZeroByZero() {
        List<Integer> res = MultiplyIntegerArrays.product(Arrays.asList(0), Arrays.asList(0));
        assertEquals(1, res.size());
        assertEquals((Integer) 0, res.get(0));
    }

    @Test
    public void multiplyZeroByOther() {
        List<Integer> res = MultiplyIntegerArrays.product(Arrays.asList(0), Arrays.asList(3, 2));
        System.out.println(res);
        assertEquals(1, res.size());
        assertEquals((Integer)0, res.get(0));
    }

    @Test
    public void multiplyOneByOther() {
        List<Integer> res = MultiplyIntegerArrays.product(Arrays.asList(1), Arrays.asList(3, 2));
        assertEquals(2, res.size());
        assertEquals((Integer)3, res.get(0));
        assertEquals((Integer)2, res.get(1));

        res = MultiplyIntegerArrays.product(Arrays.asList(3, 2), Arrays.asList(1));
        assertEquals(2, res.size());
        assertEquals((Integer)3, res.get(0));
        assertEquals((Integer)2, res.get(1));
    }

    @Test
    public void multiplySingleDigits() {
        List<Integer> res = MultiplyIntegerArrays.product(Arrays.asList(3), Arrays.asList(2));
        assertEquals(1, res.size());
        assertEquals((Integer)6, res.get(0));
    }

    @Test
    public void multiplyWithCarry() {
        List<Integer> res = MultiplyIntegerArrays.product(Arrays.asList(9), Arrays.asList(2));
        Integer[] expected = new Integer[]{1, 8};
        System.out.println(res);

        assertEquals(2, res.size());
        assertArrayEquals(expected, res.toArray());
    }

    @Test
    public void multiplyWithLargerNum() {
        List<Integer> res = MultiplyIntegerArrays.product(Arrays.asList(1, 9, 3, 7, 0, 7, 7, 2, 1), Arrays.asList(-7, 6, 1, 8, 3, 8, 2, 5, 7, 2, 8, 7));
        Integer[] expected = new Integer[]{-1, 4, 7, 5, 7, 3, 9, 5, 2, 5, 8, 9, 6, 7, 6, 4, 1, 2, 9, 2, 7};
        System.out.println(res);

        assertEquals(21, res.size());
        assertArrayEquals(expected, res.toArray());
    }

    @Test
    public void multiplyWitherEvenLargerNumbers() {
        List<Integer> res = MultiplyIntegerArrays.product(Arrays.asList(-1, 4, 7, 5, 7, 3, 9, 5, 2, 5, 8, 9, 6, 7, 6, 4, 1, 2, 9, 2, 7), Arrays.asList(-1, 4, 7, 5, 7, 3, 9, 5, 2, 5, 8, 9, 6, 7, 6, 4, 1, 2, 9, 2, 7));
        Integer[] expected = new Integer[]{2, 1, 7, 7, 8, 0, 7, 1, 4, 8, 2, 9, 4, 0, 0, 6, 1, 6, 6, 1, 3, 6, 0, 8, 2, 6, 9, 7, 0, 4, 5, 3, 8, 1, 2, 7, 0, 7, 3, 2, 9};
        System.out.println(res);
        assertEquals(41, res.size());
        assertArrayEquals(expected, res.toArray());
    }

    @Test
    public void multiplyWithNegative() {
        List<Integer> res = MultiplyIntegerArrays.product(Arrays.asList(-1, 2), Arrays.asList(1, 2));
        Integer[] expected = new Integer[]{-1, 4, 4};
        System.out.println(res);

        assertEquals(3, res.size());
        assertArrayEquals(expected, res.toArray());
    }
}