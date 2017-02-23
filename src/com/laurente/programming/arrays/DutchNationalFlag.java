import java.lang.reflect.ParameterizedType;
import java.util.Collections;
import java.util.List;

/**
 * EPI 6.1 (pp. 62-65)
 * DUTCH NATIONAL FLAG
 *   Given an array A and index pivotIndex, rearrange the elements such that
 *   int pivot := A[pivotIndex]
 *   x in A such that | x < pivot ... | x = pivot ... | x > pivot ... |
 */
enum Color { RED, WHITE, BLUE }

public class DutchNationalFlag {

    public static void partition(List<Integer> A, int pivotIndex) {
        int n = A.size();
        if (n <= 2) {
            return;
        }

        Integer pivot = A.get(pivotIndex);

        // First Pass: Group numbers < pivot
        int smaller = 0;
        for (int i = 0; i < n; i++) {
            if (A.get(i) < pivot) {
                Collections.swap(A, smaller, i);
                smaller++;
            }
        }

        // First Pass: Group numbers > pivot
        int larger = n -1;
        for (int i = n - 1; i >= 0 && A.get(i) >= pivot; --i) {
            if (A.get(i) > pivot) {
                Collections.swap(A, larger, i);
                larger--;
            }
        }
    }

    public static void partitionColors(List<Color> A, int pivotIndex) {
        int n = A.size();
        if (n <= 2 || pivotIndex < 0 || pivotIndex >= n) {
            return;
        }

        Color pivot = A.get(pivotIndex);

        // Firt Pass: Group numbers < pivot
        int smaller = 0;
        for (int i = 0; i < n; i++) {
            if (A.get(i).ordinal() < pivot.ordinal()) {
                Collections.swap(A, i, smaller);
                smaller++;
            }
        }

        // Second Pass: Group numbers > pivot
        int larger = 0;
        for (int i = n - 1; i >= 0 && A.get(i).ordinal() > pivot.ordinal(); i--) {
            if (A.get(i).ordinal() > pivot.ordinal()) {
                Collections.swap(A, i, larger);
                larger--;
            }
        }
    }

    /**
     * left:    [0,       smaller)
     * center:  [smaller, needle]
     * unkonwn: (needle,  larger)
     * right:   [larger,  n)
     * @param A
     * @param pivotIndex
     */
    public static void partitionOptimal(List<Integer> A, int pivotIndex) {
        int n = A.size();
        Integer pivot = A.get(pivotIndex);
        int smaller = 0;
        int needle = 0;
        int larger = n - 1;

        while (needle <= larger) {
            if (A.get(needle).compareTo(pivot) < 0) {
                // A[needle] < pivot
                Collections.swap(A, smaller, needle);
                smaller++;
                needle++;
            }
            else if (A.get(needle).equals(pivot)) {
                // A[needle] = pivot
                needle++;
            }
            else {
                // A[needle] > pivot
                Collections.swap(A, larger, needle);
                larger--;
            }
        }
    }
}
