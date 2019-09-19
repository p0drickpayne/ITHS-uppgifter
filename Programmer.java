package com.company;

import java.lang.reflect.Array;

public class Programmer {

    String name = "Hackerman";

    String programmeringsSpråk[] = {"Java", "C#", "Javascript", "JSON", "Python"};



    public int work(int hours) {
        if (hours > 50) {
            return Computer.crash();
        } else if (hours > 100) {
            return Computer.reinstall();
        }
        return 0;
    }


}
