package com.theironyard.charlotte;

/**
 * Created by Jake on 4/17/17.
 */
public class Cheeseburger {
    public String orderName;
    public String mayo;
    public String pattieNumber;
    public String bunNumber;
    public String baconNumber;
    public String specialInstruction;

    public Cheeseburger() {

    }

    public Cheeseburger(String orderName, String mayo, String pattieNumber, String bunNumber, String baconNumber, String specialInstruction) {
        this.orderName = orderName;
        this.mayo = mayo;
        this.pattieNumber = pattieNumber;
        this.bunNumber = bunNumber;
        this.baconNumber = baconNumber;
        this.specialInstruction = specialInstruction;
    }
}
