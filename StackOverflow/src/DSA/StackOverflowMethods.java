package DSA;

public class StackOverflowMethods {
    private String[] elements;
    private boolean isEmpty = true;
    private int count;

    public StackOverflowMethods(int size) {
        elements = new String[size];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void push(String element) {
        elements[count++] = element;
    }

    public String pop() {
        return elements[--count];
    }
}
