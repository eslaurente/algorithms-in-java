import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by laurente on 2/16/17.
 */
class EvenNumbersFirstTest {
    int[] zero = new int[]{0};
    int[] twoEvens = new int[]{4, 6};
    int[] twoOdds = new int[]{5, 1};
    int[] setA = new int[]{4, 5, 9, 92, 3, 334, 52, 11, 2};

    @Test
    public void zeroIntInput() {
        EvenNumbersFirst.sort(zero);
        assertTrue(zero[0] == 0);
    }

    @Test
    public void twoElementEvens() {
        EvenNumbersFirst.sort(twoEvens);
        assertTrue(twoEvens[0] == 4);
        assertTrue(twoEvens[1] == 6);
    }

    @Test
    public void twoOddElementsChangesOrder() {
        EvenNumbersFirst.sort(twoOdds);
        assertTrue(twoOdds[0] == 1);
        assertTrue(twoOdds[1] == 5);
    }

    @Test
    public void sortCorrectly() {
        EvenNumbersFirst.sort(setA);
        System.out.println(Arrays.toString(setA));
        assertEquals(4,   setA[0]);
        assertEquals(2,   setA[1]);
        assertEquals(52,  setA[2]);
        assertEquals(92,  setA[3]);
        assertEquals(334, setA[4]);
        assertEquals(3,   setA[5]);
        assertEquals(11,  setA[6]);
        assertEquals(9,   setA[7]);
        assertEquals(5,   setA[8]);

    }

}