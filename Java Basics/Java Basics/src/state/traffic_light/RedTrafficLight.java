package state.traffic_light;

public class RedTrafficLight implements TrafficColor{
    @Override
    public void turn() {
        System.out.println("Turning green...");
    }
}
