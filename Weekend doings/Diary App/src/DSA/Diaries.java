package DSA;

import java.util.ArrayList;

public class Diaries {
    private static ArrayList<Diary> diaries = new ArrayList<>();

    public void add(String userName, String password) {
        diaries.add(new Diary(userName, password));
    }
    public Diary findByUsername(String username) {
        for (Diary diary : diaries) {
            if (diary != null && diary.isLocked() && diary.userName.equals(username)) {
                return diary;
            }
        }
        return null;
    }

    public void delete(String username, String password) {
        if (findByUsername(username) == null) {
            return;
        }
        diaries.removeIf(diary ->
                diary.username.equals(username) && diary.password.equals(password)
        );
    }
}
