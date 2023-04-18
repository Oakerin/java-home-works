import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.qiwi.pair.Pair;

public class PairTest {

    @Test
    public void newPairTest() {
        Pair pair = Pair.of("first", "second");
        Assertions.assertEquals(pair.getSecond(), "second");
        Assertions.assertEquals(pair.getFirst(), "first");
    }

    @Test
    public void newPairWithNulls() {
        Pair pair = Pair.of(null, null);
        Assertions.assertNull(pair.getSecond());
        Assertions.assertNull(pair.getFirst());
    }

    @Test
    void equalsTestPairsWithNulls() {
        Pair pair1 = Pair.of(null, null);
        Pair pair2 = Pair.of(null, null);
        Assertions.assertTrue(pair1.equals(pair2), pair1 + " and " + pair2 + " must be equal");
    }

    @Test
    void equalsTestPairsNonNulls() {
        Pair pair1 = Pair.of(1, "");
        Pair pair2 = Pair.of(1, "");
        Assertions.assertTrue(pair1.equals(pair2), pair1 + " and " + pair2 + " must be equal");
    }

    @Test
    void notEqualsTestPairsNonNulls() {
        Pair pair1 = Pair.of(1, "");
        Pair pair2 = Pair.of(1, 1);
        Assertions.assertFalse(pair1.equals(pair2), pair1 + " and " + pair2 + " must be equal");
    }

    @Test
    void notEqualsTestPairsNonNulls1() {
        Pair pair1 = Pair.of(1, "");
        Pair pair2 = Pair.of(1, null);
        Assertions.assertFalse(pair1.equals(pair2), pair1 + " and " + pair2 + " must be equal");
    }

    @Test
    void notEqualsTestPairsNonNulls2() {
        Pair pair1 = Pair.of(1, 2);
        Pair pair2 = Pair.of(1, 1);
        Assertions.assertFalse(pair1.equals(pair2), pair1 + " and " + pair2 + " must be equal");
    }
}
