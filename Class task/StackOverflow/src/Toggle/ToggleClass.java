package Toggle;

public class ToggleClass {

    private boolean status;


    public void turnOn() { this.status = true;}
    public void turnOff(){ this.status = false;}

    public boolean toggle() {
        return status = !status;
    }
}
