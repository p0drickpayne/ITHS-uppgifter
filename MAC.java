package com.company;

public class MAC extends Computer {
    public MAC(int hårddiskUtrymmeKvar, int totaltDiskutrymme)    {
        super("Mac", 1978, hårddiskUtrymmeKvar, totaltDiskutrymme);
    }
    @Override
    public void boot() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!Hello and welcome to this MAC!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
    @Override
    public void crash(){
        System.out.println("MAC har kraschat hur fan hände det här?");
    }
}