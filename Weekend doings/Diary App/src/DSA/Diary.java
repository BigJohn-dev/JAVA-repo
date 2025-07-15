package DSA;

import java.util.ArrayList;

public class Diary {

    private String userName;
    private String password;
    private boolean isLocked = false;
    private ArrayList<Entry> entries = new ArrayList<>();

    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void unlockDiary(String password) {
        this.isLocked = password.equals(this.password);
    }

    public void lockDiary() {
        isLocked = true;
    }
    public boolean isLocked() {
        return isLocked;
    }
}
