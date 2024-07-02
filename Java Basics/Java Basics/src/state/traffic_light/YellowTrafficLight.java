package state.traffic_light;

public class YellowTrafficLight implements TrafficColor{
    @Override
    public void turn(){
        System.out.println("Turning red...");
    }
}
