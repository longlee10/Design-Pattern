package control;

public class Demo {
    public static void main(String[] args) {
        var tv = new TV();
        var light = new Light();
        var remote = new RemoteControl();

        remote.addCommand(new TVCommand(tv));
        remote.addCommand(new LightCommand(light));

        remote.turnOn();
        remote.turnOff();
    }
}
