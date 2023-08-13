package no.noroff.accelerate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LengthOfNestedArrayTest {

    private static LengthOfNestedArray lona;

    @BeforeAll
    static void setup() {
        lona = new LengthOfNestedArray();
    }

    @Test
    public void testGetLength_nestedOneLevel() {
        int expected = 4;
        assertEquals(expected, lona.getLength(new Object[] { 1, new Object[] { 2, 3 }, 4 }));
    }

    @Test
    public void testGetLength_nonNested() {
        int expected = 3;
        assertEquals(expected, lona.getLength(new Object[] { 1, 2, 3 }));
    }

    @Test
    public void testGetLength_empty() {
        int expected = 0;
        assertEquals(expected, lona.getLength(new Object[] {}));
    }
}
