import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PrimeNumbersTest {

    private final List<Integer> primes = new ArrayList<>();


    @Before
    public void setUp() {
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);
        primes.add(13);
    }

    @Test
    public void primesTestInit() {
        assertNotNull(primes);
    }



}
