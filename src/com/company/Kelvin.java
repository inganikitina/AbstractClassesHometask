package com.company;

public class Kelvin extends BaseConverter{

Kelvin(double tempCelsius){this.tempCelsius=tempCelsius;}
    @Override
    public double Convert() {
        return tempCelsius+273.15;

    }}
