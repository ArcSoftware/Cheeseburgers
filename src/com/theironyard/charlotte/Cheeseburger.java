package com.theironyard.charlotte;

/**
 * Created by Jake on 4/17/17.
 */
public class Cheeseburger {
    String orderName;
    String mayo;
    String pattieNumber;
    String bunNumber;
    String baconNumber;
    String specialInstruction;

    public Cheeseburger(String orderName, String mayo, String pattieNumber, String bunNumber, String baconNumber, String specialInstruction) {
        this.orderName = orderName;
        this.mayo = mayo;
        this.pattieNumber = pattieNumber;
        this.bunNumber = bunNumber;
        this.baconNumber = baconNumber;
        this.specialInstruction = specialInstruction;
    }
}
