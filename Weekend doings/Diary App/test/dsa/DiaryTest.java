package dsa;

import DSA.Diaries;
import DSA.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    @BeforeEach
    public void startWith(){
        Diary diary = new Diary("JohnDoe","rivers");
    }

    @Test
    public void testDiaryIsLocked(){
        Diary diary = new Diary("JohnDoe","rivers");
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    public void testToUnlockDiaryWithPassword(){
        Diary diary = new Diary("JohnDoe","rivers");
        diary.unlockDiary("rivers");
        assertTrue(diary.isLocked());
    }

    @Test
    public void testYouCannotUnlockDiaryWithWrongPassword(){
        Diary diary = new Diary("JohnDoe","rivers");
        diary.unlockDiary("ballers");
        assertFalse(diary.isLocked());
    }

    @Test
    public void testYouCannotUnlockDiaryWithEmptyPassword(){
        Diary diary = new Diary("JohnDoe","rivers");
        diary.unlockDiary("");
        assertFalse(diary.isLocked());
    }
}
