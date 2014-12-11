package com.zain.project4_redo;

/**
 * Created by Zain on 12/10/2014.
 */

//yawnnnnnn
public class LadderBallEvent extends Event {

    int numRugs;
    public LadderBallEvent(int numRugs)
    {
        super("LadderBall");
        this.numRugs=numRugs;
    }
    public String getName() {
        return name;}
    public String getExtraInfo() {
        return numRugs + "";

    }
    public int getNumRugs() {
        return numRugs;
    }
    public void setNumRugs(int numRugs) {
        this.numRugs = numRugs;
    }


}
