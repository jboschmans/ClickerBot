package domain;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class EventRepository implements java.io.Serializable
{
    private ArrayList<Event> eventList = new ArrayList<>();
    private final Object[] columnNames = {"Type","Button/Key/Text","x","y","Min. pauze","Max. pause"};
    private int numberOfLoops = 1;
    
    public void addEvent(Event.Type type, long minP, long maxP, int x, int y, boolean left, boolean right, boolean middle, String key, String string, Color color, int numberOfLoops, int loopEvent)
    {
        switch(type)
        {
            case CLICK:
                if (minP == maxP)//zonder random
                    eventList.add(new Event(type,minP,left,right,middle));
                else//met random
                    eventList.add(new Event(type,minP,maxP,left,right,middle));
                break;
                
            case MOVEMOUSE:
                if (minP == maxP)//zonder random
                    eventList.add(new Event(type,minP,x,y));
                else//met random
                    eventList.add(new Event(type,minP,maxP,x,y));
                break;
                
            case MOVEMOUSEPLUSCLICK:
                if (minP == maxP)//zonder random
                    eventList.add(new Event(type,minP,x,y,left,right,middle));
                else//met random
                    eventList.add(new Event(type,minP,maxP,x,y,left,right,middle));
                break;
                
            case ONEKEY:
            case ONEKEYPRESS:
            case ONEKEYRELEASE:
                if (minP == maxP)//zonder random
                    eventList.add(new Event(type,minP,key));
                else//met random
                    eventList.add(new Event(type,minP,maxP,key));
                break;
                
            case RELEASEALLKEYS:
                if (minP == maxP)//zonder random
                    eventList.add(new Event(type,minP));
                else//met random
                    eventList.add(new Event(type,minP,maxP));
                break;
                
            case STRING:
                if (minP == maxP)//zonder random
                    eventList.add(new Event(type,minP,"",string));
                else//met random
                    eventList.add(new Event(type,minP,maxP,"",string));
                break;
                
            case WAITFORCOLOR:
                if (minP == maxP)//zonder randol
                    eventList.add(new Event(type,x,y,minP,color));
                else//met random
                    eventList.add(new Event(type,x,y,minP,maxP,color));
                break;
                
            case LOOP:
                eventList.add(new Event(type, numberOfLoops, loopEvent));
                break;
                
            case LOOPEND:
                eventList.add(new Event(type, loopEvent));
                break;
                
            default:
                System.out.println("Geen geldig type gevonden bij aanmaak event");
                break;
        }
    }
    
    
    public void deleteEvent(int i)
    {
        this.eventList.remove(i);
    }
    
    public ArrayList<Event> getEventList() {
        return eventList;
    }
    public void setEventList(ArrayList<Event> eventList) {
        this.eventList = eventList;
    }
    public Object[] getColumnNames() {
        return columnNames;
    }

    public int getNumberOfLoops() {
        return numberOfLoops;
    }

    public void setNumberOfLoops(int numberOfLoops) {
        if (numberOfLoops < 1)
            numberOfLoops = 1;
        this.numberOfLoops = numberOfLoops;
    }
    
    
}
