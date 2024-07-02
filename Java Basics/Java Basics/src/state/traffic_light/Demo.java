package state.traffic_light;

public class Demo {
    public static void main(String[] args) {
        var light = new TrafficLight(new RedTrafficLight());
        light.turn();

    }
}
