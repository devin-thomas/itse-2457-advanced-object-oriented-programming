// Author: Devin Thomas
// Date 12 Apr 2024
// Purpose: create a Drive class
// that properly implements TravelMode in the same fashion as Walk and Bus

package com.cosc.module8.StatePatternLabOne;

public class Drive implements TravelMode {
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }
    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}