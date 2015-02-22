package domain;

import java.awt.Color;

public class Event implements java.io.Serializable
{
    public enum Type {CLICK, MOVEMOUSE, MOVEMOUSEPLUSCLICK, ONEKEY, ONEKEYPRESS, ONEKEYRELEASE, RELEASEALLKEYS, STRING, WAITFORCOLOR, LOOP, LOOPEND};
    private Type type;
    private String key = "", string = "";
    private Color color = Color.WHITE;
    private long minPause, maxPause;
    private int mouseX, mouseY, numberOfLoopTimes = 0, numberOfLoopEvent = -1, numberOfLoopsCompleted = 0;
    private boolean leftClick, rightClick, middleClick, fff;
    
    public Event(Type t, long p, boolean left, boolean right, boolean middle) // indien enkel click zonder random
    {
        this.setType(t);
        this.setMinPause(p);
        this.setMaxPause(p);
        this.setMouseX(-1);
        this.setMouseY(-1);
        this.setLeftClick(left);
        this.setRightClick(right);
        this.setMiddleClick(middle);
    }
    public Event(Type t, long minp, long maxp, boolean left, boolean right, boolean middle) // indien enkel click met random
    {
        this.setType(t);
        this.setMinPause(minp);
        this.setMaxPause(maxp);
        this.setMouseX(-1);
        this.setMouseY(-1);
        this.setLeftClick(left);
        this.setRightClick(right);
        this.setMiddleClick(middle);
    }
    public Event(Type t, long p, int x, int y) // indien enkel move zonder random
    {
        this.setType(t);
        this.setMinPause(p);
        this.setMaxPause(p);
        this.setMouseX(x);
        this.setMouseY(y);
        this.setLeftClick(false);
        this.setRightClick(false);
        this.setMiddleClick(false);
    }
    public Event(Type t, long minp, long maxp, int x, int y) // indien enkel move met random
    {
        this.setType(t);
        this.setMinPause(minp);
        this.setMaxPause(maxp);
        this.setMouseX(x);
        this.setMouseY(y);
        this.setLeftClick(false);
        this.setRightClick(false);
        this.setMiddleClick(false);
    }
    public Event(Type t, long p, int x, int y, boolean left, boolean right, boolean middle) // move en click zonder random
    {
        this.setType(t);
        this.setMinPause(p);
        this.setMaxPause(p);
        this.setMouseX(x);
        this.setMouseY(y);
        this.setLeftClick(left);
        this.setRightClick(right);
        this.setMiddleClick(middle);
    }
    public Event(Type t, long minp, long maxp, int x, int y, boolean left, boolean right, boolean middle) // move en click met random
    {
        this.setType(t);
        this.setMinPause(minp);
        this.setMaxPause(maxp);
        this.setMouseX(x);
        this.setMouseY(y);
        this.setLeftClick(left);
        this.setRightClick(right);
        this.setMiddleClick(middle);
    }
    public Event(Type t, long p, String k) // One Key zonder random
    {
        this.setType(t);
        this.setMinPause(p);
        this.setMaxPause(p);
        this.setKey(k);
    }
    public Event(Type t, long minp, long maxp, String k) // One Key met random
    {
        this.setType(t);
        this.setMinPause(minp);
        this.setMaxPause(maxp);
        this.setKey(k);
    }
    public Event(Type t, long p, String k, String s) // String zonder random
    {
        this.setType(t);
        this.setMinPause(p);
        this.setMaxPause(p);
        this.setKey(k);
        this.setString(s);
        
    }
    public Event(Type t, long minp, long maxp, String k, String s) // String met random
    {
        this.setType(t);
        this.setMinPause(minp);
        this.setMaxPause(maxp);
        this.setKey(k);
        this.setString(s);
    }
    public Event(Type t, long p) // One Key zonder random
    {
        this.setType(t);
        this.setMinPause(p);
        this.setMaxPause(p);
    }
    public Event(Type t, long minp, long maxp) // One Key met random
    {
        this.setType(t);
        this.setMinPause(minp);
        this.setMaxPause(maxp);
    }
    public Event(Type t, int x, int y, long p, Color c) // WaitForColor of ExecuteWhenColor zonder random
    {
        this.setType(t);
        this.setMinPause(p);
        this.setMaxPause(p);
        this.setColor(c);
        this.setMouseX(x);
        this.setMouseY(y);
    }
    
    public Event(Type t, int x, int y, long minp, long maxp, Color c) // WaitForColor of ExecuteWhenColor met random
    {
        this.setType(t);
        this.setMinPause(minp);
        this.setMaxPause(maxp);
        this.setColor(c);
        this.setMouseX(x);
        this.setMouseY(y);
    }
    
    public Event(Type t, int loops, int numberOfLoop) // Loop
    {
        this.setType(t);
        this.setMinPause(1);
        this.setMaxPause(1);
        this.setNumberOfLoopTimes(loops);
        this.setNumberOfLoopEvent(numberOfLoop);
        this.setNumberOfLoopsCompleted(0);
    }
    
    public Event(Type t, int numberOfLoop) // LoopEnd
    {
        this.setType(t);
        this.setMinPause(1);
        this.setMaxPause(1);
        this.setNumberOfLoopEvent(numberOfLoop);
    }
    

    
    
    public int getNumberOfLoopsCompleted() {
        return numberOfLoopsCompleted;
    }

    // Setters and Getters
    public void setNumberOfLoopsCompleted(int numberOfLoopsCompleted) {
        this.numberOfLoopsCompleted = numberOfLoopsCompleted;
    }

    public int getNumberOfLoopEvent() {
        return numberOfLoopEvent;
    }

    public void setNumberOfLoopEvent(int numberOfLoopEvent) {
        this.numberOfLoopEvent = numberOfLoopEvent;
    }
    
    public int getNumberOfLoopTimes() {
        return numberOfLoopTimes;
    }
    public void setNumberOfLoopTimes(int numberOfLoopTimes) {    
        this.numberOfLoopTimes = numberOfLoopTimes;
    }

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public long getMinPause() {
        return minPause;
    }
    public void setMinPause(long minPause) {
        if (minPause < 1)
            minPause = 1;
        this.minPause = minPause;
    }
    public long getMaxPause() {
        return maxPause;
    }
    public void setMaxPause(long maxPause) {
        if (maxPause < 1)
            maxPause = 1;
        if (maxPause < minPause)
            maxPause = minPause;
        this.maxPause = maxPause;
    }
    public int getMouseX() {
        return mouseX;
    }
    public void setMouseX(int mouseX) {
        if (mouseX < -1)
            mouseX = 0;
        this.mouseX = mouseX;
    }
    public int getMouseY() {
        return mouseY;
    }
    public void setMouseY(int mouseY) {
        if (mouseY < -1)
            mouseY = 0;
        this.mouseY = mouseY;
    }
    public boolean isLeftClick() {
        return leftClick;
    }
    public void setLeftClick(boolean leftClick) {
        this.leftClick = leftClick;
    }
    public boolean isRightClick() {
        return rightClick;
    }
    public void setRightClick(boolean rightClick) {
        this.rightClick = rightClick;
    }
    public boolean isMiddleClick() {
        return middleClick;
    }
    public void setMiddleClick(boolean middleClick) {
        this.middleClick = middleClick;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
