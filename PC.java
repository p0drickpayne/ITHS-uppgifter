package com.company;

public class PC extends Computer {
    public PC(int hårddiskUtrymmeKvar, int totaltDiskutrymme)    {
        super("Windows", 1977, hårddiskUtrymmeKvar, totaltDiskutrymme);
    }
    @Override
    public void boot() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!Hello and welcome to this PC!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
    @Override
    public void crash(){
        System.out.println("PC har kraschat wtf OMG Bluea sdcreen of death!!!!");
    }
}

