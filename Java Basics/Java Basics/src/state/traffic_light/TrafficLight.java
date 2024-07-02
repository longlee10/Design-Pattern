package state.traffic_light;

public class TrafficLight {
    private TrafficColor trafficColor;

    public TrafficLight(TrafficColor trafficColor) {
        this.trafficColor = trafficColor;
    }

    public void turn(){
        trafficColor.turn();
    }
}
