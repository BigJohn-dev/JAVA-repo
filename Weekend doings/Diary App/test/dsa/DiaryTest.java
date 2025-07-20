package dsa;

import DSA.Diaries;
import DSA.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    @Test
    public void testCheckDiaryIsLocked(){
        Diary diary = new Diary("JohnDoe","rivers");
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    public void testToUnlockDiaryWithPassword(){
        Diary diary = new Diary("JohnDoe","rivers");
        diary.unlockDiary("rivers");
        assertFalse(diary.isLocked());
    }

    @Test
    public void testYouCannotUnlockDiaryWithWrongPassword(){
        Diary diary = new Diary("JohnDoe","rivers");
        diary.unlockDiary("ballers");
        assertTrue(diary.isLocked());
    }

    @Test
    public void testYouCannotUnlockDiaryWithEmptyPassword(){
        Diary diary = new Diary("JohnDoe","rivers");
        diary.unlockDiary("");
        assertTrue(diary.isLocked());
    }

    @Test
    public void testToAddEntry(){
        Diary diary = new Diary("JohnDoe","rivers");
        diary.lockDiary(); assertTrue(diary.isLocked());
        diary.unlockDiary("rivers"); assertFalse(diary.isLocked());
        diary.createEntry("Persistence", "the quality that allows someone to continue doing something even though it is difficult");

    }
}
