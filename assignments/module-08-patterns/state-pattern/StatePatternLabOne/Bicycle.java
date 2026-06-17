// Author: Devin Thomas
// Date 12 Apr 2024
// Purpose: create a Bicycle class
// that properly implements TravelMode in the same fashion as Walk and Bus

package com.cosc.module8.StatePatternLabOne;

public class Bicycle implements TravelMode {
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (biking)");
        return 2;
    }
    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (biking)");
        return 2;
    }
}