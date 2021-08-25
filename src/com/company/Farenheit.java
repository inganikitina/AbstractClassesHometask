package com.company;

public class Farenheit extends BaseConverter{
Farenheit(double tempCelsius){this.tempCelsius=tempCelsius;}
    @Override
    public double Convert() {
        return tempCelsius*1.8+32;
    }
}
