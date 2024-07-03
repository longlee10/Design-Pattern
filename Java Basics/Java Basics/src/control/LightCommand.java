package control;

public class LightCommand implements Command{
    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void turnOn() {
        light.turnOn();
    }

    @Override
    public void turnOff() {
        light.turnOff();
    }
}
