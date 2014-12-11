package com.zain.project4_redo;

public abstract class Event {
    public String name;
    public int playTo;
    public boolean isPlayToExact;
    public int playDistance;

    public Event(String name) {
        this.name=name;
    }

    public abstract String getExtraInfo();

}

