package dsa;

import DSA.Diaries;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiariesTest {

    @Test
    public void testYouCanAddToDiaryWithUserNameAndPassword() {
        Diaries diaries = new Diaries();
        diaries.addAccount("tittle", "description");

    }
}
