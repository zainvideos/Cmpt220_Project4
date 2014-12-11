package com.zain.project4_redo;

/**
 * Created by Zain on 12/10/2014.
 */
public class CompetitionManager {

    private CompetitionLinkedList linked_list;
    public CompetitionManager()
    {
        linked_list=new CompetitionLinkedList();
    }
    public void StartCompetition(Event event, Team team1, Team team2)
    {
        if(isEventAlreadyHappening(event))
            return;
        if(isTeamAlreadyPlaying(team1))
            return;
        if(isTeamAlreadyPlaying(team2))
            return;
        linked_list.add(event, team1, team2);

    }
    boolean isEventAlreadyHappening(Event event)
    {
        for(int i=1;i<=linked_list.size();i++)
        {
            if(linked_list.get(i).event.name==event.name)
                return true;
        }
        return false;

    }
    boolean isTeamAlreadyPlaying(Team team)
    {
        for(int i=1;i<=linked_list.size();i++)
        {
            if(linked_list.get(i).team1==team||linked_list.get(i).team2==team)
                return true;
        }
        return false;

    }
    ICompetition[] GetCompetitions()
    {
        ICompetition[] competitions=new ICompetition[linked_list.size()];
        for(int i=0;i<competitions.length;i++)
            competitions[i]=linked_list.get(i+1);
        return competitions;
    }
    public void EndCompetition(Competition competition, Team winningTeam)
    {
        for(int i=0;i<linked_list.size();i++)
        {
            if(linked_list.get(i+1)==competition)
            {
                linked_list.get(i).setWinningTeam(winningTeam);
                linked_list.remove(i+1);
            }

        }


    }

}

class CompetitionLinkedList {

    private Competition head;
    private int listCount;

    // LinkedList constructor
    public CompetitionLinkedList() {

        head = new Competition(null,null,null);
        listCount = 0;
    }

    public void add(Event event,Team team1,Team team2)
    {
        Competition Temp = new Competition(event,team1,team2);
        Competition current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(Temp);
        listCount++;// increment the number of elements variable
    }

    public void add(Event event,Team team1,Team team2, int index)
    // inserts the specified element at the specified position in this list
    {
        Competition Temp = new Competition(event,team1,team2);
        Competition current = head;
        for (int i = 1; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        Temp.setNext(current.getNext());
        current.setNext(Temp);
        listCount++;// increment the number of elements variable
    }

    public Competition get(int index)
    // returns the element at the specified position in this list.
    {
        // index must be 1 or higher
        if (index <= 0)
            return null;

        Competition current = head.getNext();
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null)
                return null;

            current = current.getNext();
        }
        return current;
    }

    public boolean remove(int index)
    // removes the element at the specified position in this list.
    {
        if (index < 1 || index > size())
            return false;

        Competition current = head;
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null)
                return false;

            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        listCount--;
        return true;
    }

    public int size()
    {
        return listCount;
    }



}

