package com.zain.project4_redo;

/**
 * Created by Zain on 12/10/2014.
 */
//these event classes were so annoying and repetitive
public class WashoosEvent extends Event {
    int numWashoos;
    boolean hasAutoWinStick;

    public WashoosEvent(int numWashoos,boolean hasAutoWinStick)
    {
        super("Washoos");
        this.numWashoos=numWashoos;
        this.hasAutoWinStick=hasAutoWinStick;
    }
    public String getName() {
        return name;
    }
    public String getExtraInfo() {
        return numWashoos + "";

    }
    public int getNumWashoos() {
        return numWashoos;
    }
    public void setNumWashoos(int numWashoos) {
        this.numWashoos = numWashoos;
    }
    public boolean isHasAutoWinStick() {
        return hasAutoWinStick;
    }
    public void setHasAutoWinStick(boolean hasAutoWinStick) {
        this.hasAutoWinStick = hasAutoWinStick;
    }

}

