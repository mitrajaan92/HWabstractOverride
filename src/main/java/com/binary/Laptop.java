package com.binary;

import java.util.Objects;

public class Laptop extends Product{
    private double screenSize;
    private double ram;
    private double ssd;
    private double processors;

    public Laptop(double screenSize, double ram, double ssd, double processors ){
        this.screenSize = screenSize;
        this.ram = ram;
        this.ssd = ssd;
        this.processors = processors;
    }
    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getRAM() {
        return ram;
    }

    public void setRAM(double RAM) {
        this.ram = RAM;
    }

    public double getSSD() {
        return ssd;
    }

    public void setSSD(double SSD) {
        this.ssd = SSD;
    }

    public double getProcessors() {
        return processors;
    }

    public void setProcessors(double processors) {
        this.processors = processors;
    }
    public boolean checkCharging(int a){
        return a == 1;
    }
    public boolean checkLogin(int a){
        return a == 1;
    }

    @Override
    public String toString() {
        return "Laptop: " +
                ", ID = " + this.getId() +
                ", Name= " + this.getName() +
                ", Price= " + this.getPrice() +
                ", Rate= " + this.getRating() +
                ", ScreenSize= " + screenSize +
                ", ram= " + ram +
                ", ssd= " + ssd +
                ", processors= " + processors;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(getScreenSize(), laptop.getScreenSize()) == 0 && Double.compare(ram, laptop.ram) == 0 && Double.compare(ssd, laptop.ssd) == 0 && Double.compare(getProcessors(), laptop.getProcessors()) == 0;
    }

}
