public class Clock {

    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getHour() {
        return hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public int getMinute() {
        return minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public int getSecond() {
        return second;
    }
    public String clockFomat(int hour, int minute, int second) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            this.second = 0;
        }
        return hour + ":" + minute + ":" + second;
    }

}
