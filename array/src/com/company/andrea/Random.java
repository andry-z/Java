package com.company.andrea;

public class Random {
    int min = 10;
    int range = 90;
    int rand;
    public int genera(){
        rand = (int)(Math.random() * range) + min;
        return rand;
    }
}
