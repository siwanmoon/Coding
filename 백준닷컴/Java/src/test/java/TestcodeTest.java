import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestcodeTest {
    @Test
    @DisplayName("add test 1")
    void testAdd_1() {
        assertEquals(8, Testcode.add(5,3));
    }

    @Test
    @DisplayName("add test 2")
    void testAdd_2() {
        assertEquals(0, Testcode.add(8, -8));
    }

    @Test
    @DisplayName("sub test")
    void testSub() {
        assertEquals(8, Testcode.sub(19, 11));
    }
}
