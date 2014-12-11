package com.zain.project4_redo;

/**
 * Created by Zain on 12/10/2014.
 */
public class CanJamEvent extends Event {
    int frisbeeSize;
    public CanJamEvent(int frisbeeSize) {
        super("CanJam");
        this.frisbeeSize=frisbeeSize;
    }

    public String getName() {
        return name;}
    public String getExtraInfo() {
        return frisbeeSize + "";

    }
    public int getnumHorseShoes(){
        return frisbeeSize;
    }
    public void setfrisbeeSize(int frisbeeSize){
        this.frisbeeSize=frisbeeSize;
    }
}