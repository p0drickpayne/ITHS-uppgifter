package com.company;

public class Computer {
    private String modell;
    private int byggnadsår;
    private int hårddiskutrymmeKvar;
    private int totaltDiskutrymme;

    public Computer(String modell, int byggnadsår, int hårddiskUtrymmeKvar, int totaltDiskutrymme) {
        this.modell = modell;
        this.byggnadsår = byggnadsår;
        this.hårddiskutrymmeKvar = hårddiskUtrymmeKvar;
        this.totaltDiskutrymme = totaltDiskutrymme;

    }
    public void boot() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!Hello and welcome to this Computer!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
    public void reinstall() {
        System.out.println("Datorn installeras om lol");
    }
    public void crash(){
        System.out.println("Datorn har kraschat wtf");
    }

//    public String getModell() {
//        return modell;
//    }
//
//    public void setModell(String modell) {
//        this.modell = modell;
//    }
//
//    public int getByggnadsår() {
//        return byggnadsår;
//    }
//
//    public void setByggnadsår(int byggnadsår) {
//        this.byggnadsår = byggnadsår;
//    }
//
//    public int getHårddiskUtrymmeKvar() {
//        return hårddiskutrymmeKvar;
//    }
//
//    public void setHårddiskUtrymmeKvar(int hårddiskUtrymmeKvar) {
//        this.hårddiskutrymmeKvar = hårddiskUtrymmeKvar;
//    }
//
//    public int getTotaltDiskutrymme() {
//        return totaltDiskutrymme;
//    }
//
//    public void setTotaltDiskutrymme(int totaltDiskutrymme) {
//        this.totaltDiskutrymme = totaltDiskutrymme;
//    }
}