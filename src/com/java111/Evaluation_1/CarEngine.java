package com.java111.Evaluation_1;

public class CarEngine {
    private int rmp;
    private int power;
    private String manufacturer;
    private boolean hasTurbo = false;

    public boolean enableTurbo() {
        hasTurbo = true;
        return hasTurbo;
    }

    public int getRmp() {
        return rmp;
    }

    public void setRmp(int rmp) {
        this.rmp = rmp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isHasTurbo() {
        return hasTurbo;
    }
}
