import java.util.List;

/**
 * EPI 6.5 (p. 69)
 * Delete Duplicates from a Sorted Array -
 *   Given a sorted array, remove duplicate items, and return the valid elements count
 *   Optionally, remove elements beyond the valid elements
 */
public class DeleteDuplicatesInSortedArray {
    public static int shiftRemove(List<Integer> A) {
        if (A.isEmpty()) {
            return 0;
        }

        int writeIndex = 1;
        for (int i = 1; i < A.size(); i++) {
            if (!A.get(writeIndex - 1).equals(A.get(i))) {
                A.set(writeIndex, A.get(i));
                writeIndex++;
            }
            // else: i++
        }

        return writeIndex;
    }

    public static void deleteDuplicates(List<Integer> A) {
        if (A.isEmpty()) {
            return;
        }

        // start at the second element:
        int n = A.size();
        int writeIndex = 1;
        for (int i = 1; i < n; i++) {
            if (!A.get(writeIndex - 1).equals(A.get(i))) {
                A.set(writeIndex, A.get(i));
                writeIndex++;
            }
            // else, i++
        }

        // Remove invalid elements:
        while (writeIndex < A.size()) {
            A.remove(writeIndex);
        }
    }
}
