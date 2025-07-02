package DSA;

public class AutomaticBike {

    private boolean status;
    private int acceleration = 0;

    public void turnOn() { this.status = true;}
    public void turnOff(){ this.status = false;}
    public boolean isOn() {return this.status;}

    public int getAcceleration() {return this.acceleration;}

    public void accelerateAutomaticBike(int speed,int gear) {
        this.acceleration += gear + speed;
    }
}
