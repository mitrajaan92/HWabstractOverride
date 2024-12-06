package com.binary;

import java.util.Objects;

public class Light extends Product{
    private double wats;
    private double lumens;

    public Light(double wats, double lumens) {
        this.wats = wats;
        this.lumens = lumens;
    }

    public double getWats() {
        return wats;
    }

    public void setWats(double wats) {
        this.wats = wats;
    }

    public double getLumens() {
        return lumens;
    }

    public void setLumens(double lumens) {
        this.lumens = lumens;
    }
    public int noOfAmps(){
        return 0;
    }
    public boolean checkPowerUTil( int a){
        return a == 1;
    }
    @Override
    public String toString() {
        return "Light: " +
                ", ID = " + this.getId() +
                ", Name= " + this.getName() +
                ", Price= " + this.getPrice() +
                ", Rate= " + this.getRating() +
                ", Wats= " + wats +
                ", Lumen= " + lumens;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Light light = (Light) o;
        return Double.compare(getWats(), light.getWats()) == 0 && Double.compare(getLumens(), light.getLumens()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWats(), getLumens());
    }
}
