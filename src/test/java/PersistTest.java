import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PersistTest {
    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        assertEquals(3, Persist.persistence(39));
        assertEquals(0, Persist.persistence(4));
        assertEquals(2, Persist.persistence(25));
        assertEquals(4, Persist.persistence(999));
    }

    @Test
    public void extractDigitsTest(){
        assertIterableEquals(new ArrayDeque<>(Arrays.asList(2,5,6)), Persist.extractDigits(256) );
        assertIterableEquals(new ArrayDeque<>(Arrays.asList(1)), Persist.extractDigits(1) );
        assertIterableEquals(new ArrayDeque<>(Arrays.asList(3,4,6,8,6,5)), Persist.extractDigits(346865) );
    }

}