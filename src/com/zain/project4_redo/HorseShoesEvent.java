package com.zain.project4_redo;

/**
 * Created by Zain on 12/10/2014.
 */
//weeeeee another event class
public class HorseShoesEvent extends Event {

    int numHorseShoes;
    public HorseShoesEvent(int numHorseShoes) {
        super("HorseShoes");
        this.numHorseShoes=numHorseShoes;
    }

    public String getName() {
        return name;}
    public String getExtraInfo() {
        return numHorseShoes + "";

    }
    public int getnumHorseShoes(){
        return numHorseShoes;
    }
    public void setnumHorseShoes(int numHorseShoes){
        this.numHorseShoes=numHorseShoes;
    }

}
