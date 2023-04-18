import nl.altindag.console.ConsoleCaptor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import ru.qiwi.fortytwo.FortyTwo;

public class FortyTwoTest {

    FortyTwo fortyTwo = new FortyTwo();

    @Test
    void testIntValue () {
        assertEquals(42, fortyTwo.intValue());
    }

    @Test
    void testLongValue () {
        assertEquals(42L, fortyTwo.longValue());
    }

    @Test
    void testDoubleValue () {
        assertEquals(42.0, fortyTwo.doubleValue());
    }

    @Test
    void testFloatValue () {
        assertEquals(42.0f, fortyTwo.floatValue());
    }

    @Test
    void testCompareTo () {
        assertEquals(fortyTwo.compareTo(fortyTwo), 0);
    }

    @Test
    void testGetAnswer() {
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        fortyTwo.getAnswer();
        assertTrue(consoleCaptor.getStandardOutput().contains("42"));
    }
}
