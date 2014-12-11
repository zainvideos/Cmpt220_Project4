package com.zain.project4_redo;

/**
 * Created by Zain on 12/10/2014.
 */
public class CornHoleEvent extends Event {

    int numBeanBags;

    public CornHoleEvent(int numBeamBags)
    {
        super("CornHole");
        this.numBeanBags=numBeamBags;
    }
    public String getName() {
        return name;}
    public String getExtraInfo() {
        return numBeanBags + "";

    }
    public int getnumBeanBags(){
        return numBeanBags;
    }
    public void setnumBeanBags(int numBeanBags){
        this.numBeanBags=numBeanBags;
    }


}

