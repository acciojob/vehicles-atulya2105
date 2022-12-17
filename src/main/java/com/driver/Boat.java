package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private int capacity;
    Boat(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }
    public String getVehicleName() {
        String name1 = name;
        return name1;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
