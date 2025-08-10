import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    public void testReverse() {
        StringUtils su = new StringUtils();
        assertEquals("cba", su.reverse("abc"));
    }
    @Test
    public void testIsPalindrome() {
        StringUtils su = new StringUtils();
        assertTrue(su.isPalindrome("madam"));
        assertFalse(su.isPalindrome("hello"));
    }
    @Test
    public void testToUpperCase() {
        StringUtils su = new StringUtils();
        assertEquals("HELLO", su.toUpperCase("hello"));
    }
}