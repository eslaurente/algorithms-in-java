import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by laurente on 2/17/17.
 */
class DutchNationalFlagTest {
    List<Color> colors = Arrays.asList(
            Color.RED,
            Color.RED,
            Color.WHITE,
            Color.BLUE,
            Color.BLUE,
            Color.WHITE,
            Color.BLUE
    );

    List<Integer> A = Arrays.asList(-1, 0, 1, 2, 4, 1, 2);

    @Test
    public void doesNothingIfSizeIsLessThanTwo() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 3));
        DutchNationalFlag.partition(numbers, 0);
        assertEquals((Integer)(2), numbers.get(0));
        assertEquals((Integer)(3), numbers.get(1));
    }

    @Test
    public void partitionsAnArrayOfIntegers() {
        List<Integer> _A = new ArrayList<>(A);
        DutchNationalFlag.partitionOptimal(_A, 3);
        System.out.println(A + " => " + _A);

        assertEquals((Integer)(-1), _A.get(0));
        assertEquals((Integer)(0),  _A.get(1));
        assertEquals((Integer)(1),  _A.get(2));
        assertEquals((Integer)(1),  _A.get(3));
        assertEquals((Integer)(2),  _A.get(4));
        assertEquals((Integer)(2),  _A.get(5));
        assertEquals((Integer)(4),  _A.get(6));
    }

    @Test
    public void partitionsAnArrayOfColors() {
        List<Color> _A = new ArrayList<>(colors);
        DutchNationalFlag.partitionColors(_A, 3);
        System.out.println(colors + " => " + _A);

        assertEquals(Color.RED,   _A.get(0));
        assertEquals(Color.RED,   _A.get(1));
        assertEquals(Color.WHITE, _A.get(2));
        assertEquals(Color.WHITE, _A.get(3));
        assertEquals(Color.BLUE,  _A.get(4));
        assertEquals(Color.BLUE,  _A.get(5));
        assertEquals(Color.BLUE,  _A.get(6));
    }
}