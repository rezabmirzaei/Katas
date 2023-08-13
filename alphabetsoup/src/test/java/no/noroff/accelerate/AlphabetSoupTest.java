package no.noroff.accelerate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AlphabetSoupTest {

    private static AlphabetSoup as;

    @BeforeAll
    static void setup() {
        as = new AlphabetSoup();
    }

    @Test
    public void testForLoopAlphabetSoup_hello() {
        String expected = "ehllo";
        assertEquals(expected, as.forLoopAlphabetSoup("hello"));
    }

    @Test
    public void testForLoopAlphabetSoup_javascript() {
        String expected = "aacijprstv";
        assertEquals(expected, as.forLoopAlphabetSoup("javascript"));
    }

    @Test
    public void testArraysSortAlphabetSoup_hello() {
        String expected = "ehllo";
        assertEquals(expected, as.arraysSortAlphabetSoup("hello"));
    }

    @Test
    public void testArraysSortAlphabetSoup_javascript() {
        String expected = "aacijprstv";
        assertEquals(expected, as.arraysSortAlphabetSoup("javascript"));
    }
}
