package com.company;

public class Main {

    public static void main(String[] args) {
Kelvin tempKelvin=new Kelvin(100);
System.out.println(tempKelvin.tempCelsius+ " в градусах Цельсия составляет "+tempKelvin.Convert()+" градусов Кельвина.");
Farenheit tempFarenheit=new Farenheit(100);
 System.out.println(tempFarenheit.tempCelsius+ " в градусах Цельсия составляет "+tempFarenheit.Convert()+" градусов Фаренгейта.");
}
}
