package mastermind;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CodeTest {

    @Test
    void equalsToTrue() {
        Code firstCode = new Code(Color.BLUE, Color.GREEN, Color.RED, Color.YELLOW);
        Code secondCode = new Code(Color.BLUE, Color.GREEN, Color.RED, Color.YELLOW);
        assertEquals(firstCode, secondCode);
    }

    @Test
    void equalsToFalse() {
        Code firstCode = new Code(Color.BLUE, Color.GREEN, Color.RED, Color.YELLOW);
        Code secondCode = new Code(Color.BLUE, Color.BLUE, Color.RED, Color.BLACK);
        assertNotEquals(firstCode, secondCode);
    }

}
