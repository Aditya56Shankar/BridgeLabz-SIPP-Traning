import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {
    @Test
    public void testAddElement() {
        ListManager lm = new ListManager();
        var list = new ArrayList<Integer>();
        lm.addElement(list, 5);
        assertTrue(list.contains(5));
    }
    @Test
    public void testRemoveElement() {
        ListManager lm = new ListManager();
        var list = new ArrayList<Integer>();
        list.add(5);
        lm.removeElement(list, 5);
        assertFalse(list.contains(5));
    }
    @Test
    public void testGetSize() {
        ListManager lm = new ListManager();
        var list = new ArrayList<Integer>();
        lm.addElement(list, 5);
        lm.addElement(list, 6);
        assertEquals(2, lm.getSize(list));
    }
}