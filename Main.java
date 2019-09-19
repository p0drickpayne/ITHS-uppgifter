package com.company;

public class Main {

    public static void main(String[] args) {
        Computer C1 = new Computer("Dator",1967, 15, 100);

        Computer D2 = new PC(30, 300);

        Computer D3 = new MAC(25, 250);

        runComputer(C1);
        System.out.println();
        D2.boot();


    }
    public static void runComputer(Computer C1)    {
        //Kallar på objectet Computer och sen kallar objectet på metoden i klassen
        C1.boot();
        C1.crash();
        C1.reinstall();

    }

}
