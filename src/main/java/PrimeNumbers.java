import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public List<Integer> primeNumbers(int limit) {
        List<Integer> primes = new ArrayList<>();
        for(int numsToCheck = 2; numsToCheck <= limit; numsToCheck++) {
            boolean isPrime = true;
            for(int factor = 2; factor <= numsToCheck / 2; factor++) {
                if(numsToCheck % factor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                primes.add(numsToCheck);
            }
        }
        return primes;
    }
}
