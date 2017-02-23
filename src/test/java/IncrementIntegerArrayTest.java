import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by laurente on 2/18/17.
 */
class IncrementIntegerArrayTest {

    @Test
    public void addsWithoutCarryOver() {
        List<Integer> num = Arrays.asList(1, 1);
        IncrementIntegerArray.plusOne(num);
        System.out.println(num);

        assertEquals(2, num.size());
        assertEquals((Integer)1, num.get(0));
        assertEquals((Integer)2, num.get(1));
    }

    @Test
    public void addsWithCarry() {
        List<Integer> num = Arrays.asList(1, 9);
        IncrementIntegerArray.plusOne(num);
        System.out.println(num);

        assertEquals(2, num.size());
        assertEquals((Integer)2, num.get(0));
        assertEquals((Integer)0, num.get(1));
    }
}