import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by laurente on 2/19/17.
 */
class DeleteDuplicatesInSortedArrayTest {
    @Test
    public void shiftRemoveOnEmptyIsNoOp() {
        List<Integer> A = new ArrayList<>();
        assertEquals(0, DeleteDuplicatesInSortedArray.shiftRemove(A));
        assertEquals(true, A.isEmpty());
    }

    @Test
    public void shiftRemovesDuplicates() {
        List<Integer> A = new ArrayList<>(Arrays.asList(2, 3, 5, 5, 7, 11, 11, 11, 13));
        System.out.print(A);

        int validCount = DeleteDuplicatesInSortedArray.shiftRemove(A);
        System.out.println(" => " + A);
    }

    @Test
    public void removeDuplicatesOnEmptyIsNoOp() {
        List<Integer> A = new ArrayList<>();
        DeleteDuplicatesInSortedArray.deleteDuplicates(A);
        assertEquals(true, A.isEmpty());
    }

    @Test
    public void removesNothingWithNoDuplicates() {
        List<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.print(A);

        DeleteDuplicatesInSortedArray.deleteDuplicates(A);
        assertEquals(5, A.size());
        assertEquals(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)), A);
        System.out.println(" => " + A);
    }

    @Test
    public void removeSingleDuplicate() {
        List<Integer> A = new ArrayList<>(Arrays.asList(4, 4));
        System.out.print(A);

        DeleteDuplicatesInSortedArray.deleteDuplicates(A);
        assertEquals(1, A.size());
        assertEquals(new ArrayList<Integer>(Arrays.asList(4)), A);
        System.out.println(" => " + A);
    }

    @Test
    public void removesDuplicatesInListTail() {
        List<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 9, 10, 10, 10));
        System.out.print(A);

        DeleteDuplicatesInSortedArray.deleteDuplicates(A);
        assertEquals(10, A.size());
        assertEquals(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)), A);
        System.out.println(" => " + A);
    }

    @Test
    public void worksOnDescendingOrderedArray() {
        List<Integer> A = new ArrayList<>(Arrays.asList(10, 10, 10, 9, 9, 8, 7, 6, 5, 4, 4, 3, 2, 1));
        System.out.print(A);

        DeleteDuplicatesInSortedArray.deleteDuplicates(A);
        assertEquals(10, A.size());
        assertEquals(new ArrayList<Integer>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)), A);
        System.out.println(" => " + A);
    }

    @Test
    public void doesNotWorkIfArrayIsNotSorted() {
        List<Integer> A = new ArrayList<>(Arrays.asList(1, 3, 4, 2, 1, 1, 1, 2, 1, 4, 9, 1));
        System.out.print(A);

        DeleteDuplicatesInSortedArray.deleteDuplicates(A);
        assertFalse(A.size() == 5);
        assertFalse(A.equals(new ArrayList<Integer>(Arrays.asList(1, 3, 4, 2, 9))));
        System.out.println(" => " + A);
    }
}