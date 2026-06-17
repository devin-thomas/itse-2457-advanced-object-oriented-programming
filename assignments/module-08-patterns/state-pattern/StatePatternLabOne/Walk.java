// Author: Kevin Roark (presumably)

package com.cosc.module8.StatePatternLabOne;

public class Walk implements TravelMode {
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }
    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}