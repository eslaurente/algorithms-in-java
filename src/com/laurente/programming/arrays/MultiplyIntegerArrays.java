import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * EPI 6.3 (pp. 66-67)
 * Multiply two arbitrary-precision integers
 */
public class MultiplyIntegerArrays {
    public static List<Integer> product(List<Integer> A, List<Integer> B) {
        int lenA = A.size();
        int lenB = B.size();
        Integer product;

        // Find the product sign:
        Integer sign = (A.get(0) < 0 ^ B.get(0) < 0) ? -1 : 1;
        A.set(0, Math.abs(A.get(0))); // remove negative:
        B.set(0, Math.abs(B.get(0)));

        List<Integer> result = new ArrayList<>(Collections.nCopies(lenA + lenB, 0));
        int resIndex = 0;
        for (int a = lenA - 1 ; a >= 0; a--) {
            for (int b = lenB - 1; b >= 0; b--) {
                resIndex = a + b + 1;
                product = A.get(a) * B.get(b);

                // Add the product
                result.set(resIndex, result.get(resIndex) + product);

                // Add the carry over to the next left digit
                result.set(resIndex - 1, result.get(resIndex - 1) + result.get(resIndex) / 10);

                // Add the digit to the current index
                result.set(resIndex, result.get(resIndex) % 10);

                System.out.println(result);
            }
        }

        // Trim the leading zeroes:
        while (result.size() > 1) {
            if (result.get(0).equals(0)) {
                result.remove(0);
            }
            else {
                break;
            }
        }
        result.set(0, result.get(0) * sign); // set sign

        return result;
    }
}
