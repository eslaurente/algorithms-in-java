/**
 *  EPI 6a (p. 60)
 *  Intro: Given an array of integers, reorder entries so that Even integers appear first
 */
public class EvenNumbersFirst {
    public static void sort(int[] A) {
        int n = A.length;
        int evenIndex = 0;
        int oddIndex = n - 1;
        int temp;

        while (evenIndex < oddIndex) {
            if (A[evenIndex] % 2 != 0) {
                temp = A[evenIndex];
                A[evenIndex] = A[oddIndex];
                A[oddIndex] = temp;
                oddIndex--;
            }
            else {
                evenIndex++;
            }
        }
    }
}
