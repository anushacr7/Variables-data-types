package com.company;

public class Long {
    public static void main(String[] args) {


        int lightspeed;
        long day;
        long seconds;
        long distance;
        lightspeed = 186000;
        day = 1000;
        seconds = day * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.println("In" + day);
        System.out.println("days light travel about");
        System.out.println(distance + "miles");
    }
}
