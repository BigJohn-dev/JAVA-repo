package dsa;

import DSA.Diaries;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiariesTest {

    @Test
    public void testYouCanAddToDiaryWithUserNameAndPassword() {
        Diaries diaries = new Diaries();
        diaries.add("JohnDoe", "rivers");
        assertNotNull(diaries.findByUsername("JohnDoe"));
    }

    @Test
    public void testYouCannotFindDiaryWithPassword() {
        Diaries diaries = new Diaries();
        diaries.add("JohnDoe", "rivers");
        assertNull(diaries.findByUsername("rivers"));
    }

    @Test
    public void testYouCannotFindDiaryWithPassword() {
        Diaries diaries = new Diaries();
        diaries.add("JohnDoe", "rivers");
        assertNull(diaries.findByUsername("rivers"));
    }
}
