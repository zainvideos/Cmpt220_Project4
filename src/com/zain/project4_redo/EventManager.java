package com.zain.project4_redo;

public class EventManager {
//manage a list of events
    Event[] events;
    public  EventManager() {
        LadderBallEvent Event1 = new LadderBallEvent(5);

        StickGameEvent Event2 = new StickGameEvent(3);
        WashoosEvent Event3 = new WashoosEvent(10,false);
        CanJamEvent Event4 = new CanJamEvent(12);
        CornHoleEvent Event5 = new CornHoleEvent(30);
        HorseShoesEvent Event6 = new HorseShoesEvent(5);
        events = new Event[]{
                Event3, Event2, Event1, Event4, Event5, Event6};
    }
    public Event[] getEvents()
    {
        return events;
    }

}