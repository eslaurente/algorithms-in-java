import java.util.*;

/**
 * Created by laurente on 2/20/17.
 */
public class PrimeNumbers {
    public static List<Integer> enumerate(int n) {
        List<Integer> primes = new ArrayList<>();

        for (int k = 2; k <= n; k++) {
            boolean isPrime = true;
            for (Integer aPrime : primes) {
                if (k % aPrime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(k);
            }
        }

        return primes;
    }
}
