package DSA;

import java.util.ArrayList;

public class Diary {

    protected String userName;
    private String password;
    private boolean isLocked = true;
    private ArrayList<Entry> entries = new ArrayList<>();
    private int entryIdCounter = 1;

    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void unlockDiary(String password) {
        if (this.password.equals(password)) isLocked = false;
    }

    public void lockDiary() {
        isLocked = true;
    }
    public boolean isLocked() {
        return isLocked;
    }

    public void createEntry(String title, String body) {
        if (!isLocked) {
            entries.add(new Entry(entryIdCounter++, title, body));
        }
    }

    public void deleteEntry(int id) {
        if (!isLocked) {
            entries.removeIf(entry -> entry.getId() == id);
        }
    }

    public Entry findEntryById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) return entry;
        }
        return null;
    }

    public void updateEntry(int id, String newTitle, String newBody) {
        Entry entry = findEntryById(id);
        if (entry != null && !isLocked) {
            entry.setTitle(newTitle);
            entry.setBody(newBody);
        }
    }
}

