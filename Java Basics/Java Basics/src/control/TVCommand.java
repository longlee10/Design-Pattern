package control;

public class TVCommand implements Command{
    private TV tv;

    public TVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void turnOn() {
        tv.turnOn();
    }

    @Override
    public void turnOff() {
        tv.turnOff();
    }
}
