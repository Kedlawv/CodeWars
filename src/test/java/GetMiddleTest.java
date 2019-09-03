import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetMiddleTest {

    @Test
    public void evenTests() {
        assertEquals("es", GetMiddle.getMiddle("test"));
        assertEquals("dd", GetMiddle.getMiddle("middle"));
        assertEquals("es", GetMiddle.getMiddleTernary("test"));
        assertEquals("dd", GetMiddle.getMiddleTernary("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", GetMiddle.getMiddle("testing"));
        assertEquals("A", GetMiddle.getMiddle("A"));
        assertEquals("t", GetMiddle.getMiddleTernary("testing"));
        assertEquals("A", GetMiddle.getMiddleTernary("A"));
    }
}