package nokia;

public class Nokia {
    private boolean powerStatus;

    public void turnOn() { this.powerStatus = true;}
    public void turnOff(){ this.powerStatus = false;}
    public boolean powerDevice() {return powerStatus;}
}
