package com.zain.project4_redo;

/**
 * Created by Zain on 12/10/2014.
 */

//#notexciting
public class StickGameEvent extends Event {
    int frisbeeSize;

    public StickGameEvent(int frisbeeSize)
    {
        super("StickGame");
        this.frisbeeSize=frisbeeSize;
    }
    public String getName() {
        return name;}
    public String getExtraInfo() {
        return frisbeeSize + "";

    }
    public int getfrisbeeSize(){
        return frisbeeSize;
    }
    public void setfrisbeeSize(int frisbeeSize){
        this.frisbeeSize=frisbeeSize;
    }
}
