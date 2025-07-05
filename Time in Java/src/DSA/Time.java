package DSA;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int setHour(int hour) {
        if (hour < 0 || hour > 23) throw new IllegalArgumentException("Hour must be between 0 and 23");
        return this.hour;
    }
    public int setMinute(int minute) {
        if (minute < 0 || minute > 59) throw new IllegalArgumentException("minute must be between 0 and 59");
        return this.minute;
    }
    public int setSecond(int second) {
        if (second < 0 || second > 59) throw new IllegalArgumentException("second must be between 0 and 59");
        return this.second;
    }
    public int getHour() {
       return this.hour  = setHour(this.hour);
    }
    public int getMinute() {
        return this.minute  = setMinute(this.minute);
    }
    public int getSecond() {
        return second  = setSecond(this.second);
    }
}
