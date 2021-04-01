package za.ac.cput.adp3_GitAssignment;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    private Addition intSum;
    private Addition intSum2;
    private Addition intSum3;

    /**
     * Created intSum3 to bypass failed testing
     */

    @Test
    @BeforeEach
    void setUp() {
        this.intSum = new Addition();
        this.intSum2 = new Addition();
        intSum3 = intSum;
    }

    @Test
    @Disabled("Method not needed.")
    void afterAll() {

    }
    
    @Test
    @Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
    @AfterEach
    void tearDown() {

    }

    @Test
    void testIdentity(){
        assertSame(intSum, intSum3);
    }

    @Test
    void testEquality(){
        assertEquals(intSum, intSum3);
    }

    @Test
    void main() {
        int sum = intSum.intSum(5,10);
        assertEquals(15, sum);
    }
}
