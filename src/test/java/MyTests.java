import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MyTests {
    @Test
    public void testHasFullHouse() {
        assertTrue(MyMain.hasFullHouse(new int[]{1, 1, 1, 2, 2}));
        assertTrue(MyMain.hasFullHouse(new int[]{1, 2, 1, 2, 2}));
        assertTrue(MyMain.hasFullHouse(new int[]{12, 12, 13, 13, 12}));
        assertTrue(MyMain.hasFullHouse(new int[]{1, 1, 1, 2, 2, 2}));
        assertTrue(MyMain.hasFullHouse(new int[]{1, 2, 3, 4, 3, 2, 3}));
        assertTrue(MyMain.hasFullHouse(new int[]{7, 5, 5, 7, 5}));

        assertFalse(MyMain.hasFullHouse(new int[]{1, 2, 3, 4, 5}));
        assertFalse(MyMain.hasFullHouse(new int[]{2, 2, 3, 3, 5}));
        assertFalse(MyMain.hasFullHouse(new int[]{1, 1, 1, 1, 1}));
        assertFalse(MyMain.hasFullHouse(new int[]{2, 2, 4, 4, 6, 6}));
        assertFalse(MyMain.hasFullHouse(new int[]{2, 2, 4, 4}));
    }
}
