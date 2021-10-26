package com.musbas;

public class Car {

    private String engine;
    private Integer tires;
    private int windows;
    private int doors;

    public Car(String engine, Integer tires, int windows, int doors) {
        this.engine = engine;
        this.tires = tires;
        this.windows = windows;
        this.doors = doors;
    }

    public Car() {

    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Integer getTires() {
        return tires;
    }

    public void setTires(Integer tires) {
        this.tires = tires;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }


}
