package com.codewithmosh.state;

public class Demo {
    public static void main(String[] args){
        var directionService = new DirectionService();
        directionService.setTravelMode(new DrivingMode());

        System.out.println("Estimated travel time: " + directionService.getEta() + " hour(s)");
        System.out.println(directionService.getDirection());
    }
}
