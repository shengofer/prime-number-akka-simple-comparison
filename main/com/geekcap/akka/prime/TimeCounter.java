package com.geekcap.akka.prime;


public  class TimeCounter {
    public static long startTime;
    public static long endTime;

    public TimeCounter(long startTime){
        this.startTime = startTime;
    }

    public static void writeTime(){
        System.out.println("Took " + (endTime - startTime)/10e9 + " s");
    }


}
