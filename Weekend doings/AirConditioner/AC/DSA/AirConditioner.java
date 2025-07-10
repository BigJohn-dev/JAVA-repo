package DSA;

public class AirConditioner {

    private boolean status;
    private int temperature = 16;

    public void turnOn() { this.status = true;}
    public void turnOff(){ this.status = false;}
    public boolean isOn() {return status;}

    public int getTemperature(){ return this.temperature;}

    public void increaseTemperature(int increment) {
        this.temperature += increment;

        if (temperature >= 30) this.temperature = 30;
    }

    public void decreaseTemperature(int decrement) {
        this.temperature -= decrement;
        if (temperature <= 16) this.temperature = 16;
    }
}
