package state.traffic_light;

public class GreenTrafficLight implements TrafficColor{
    @Override
    public void turn() {
        System.out.println("Turning yellow...");
    }
}
