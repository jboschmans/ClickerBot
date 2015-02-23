package domain;
import ui.*;
import data.*;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DomainController
{
    private final static String version = "ClickerBot v1.0";
    public static HomeFrame hf;
    public static EventRepository er;
    public static String path = System.getProperty("user.dir");
    public static void main(String[] args)
    {
        if (DataController.licenseExists(path))
        {
            er = new EventRepository();

            hf = new HomeFrame();
            hf.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent we)
                { 
                    if (JOptionPane.showConfirmDialog(null, "Are you sure you want to quit? All unsaved progress will be lost.","Quit",JOptionPane.YES_NO_OPTION) == 0)
                        System.exit(0);
                }
            });

            hf.setLocationRelativeTo(null);
            hf.setVisible(true);
        }
        else
        {
            CheckLicenseFrame clf = new CheckLicenseFrame();
            clf.setLocationRelativeTo(null);
            clf.setVisible(true);
        }
    }
    
    public static void addEvent(Event.Type type, long minP, long maxP, int x, int y, boolean left, boolean right, boolean middle, String key, String string, Color color, int numberOfLoops, int loopEvent)
    {
        er.addEvent(type,  minP,  maxP,  x,  y,  left,  right,  middle, key, string, color, numberOfLoops, loopEvent);
    }

    public static Object[][] getData()
    {
        Object[][] o = new Object[er.getEventList().size()][er.getColumnNames().length];
        for (int rij = 0; rij < er.getEventList().size(); rij++)
        {
            String type="", button="", x="", y="", minp="", maxp="";
            switch(er.getEventList().get(rij).getType())
            {
                case CLICK:
                    type = "Click";
                    break;
                case MOVEMOUSE:
                    type = "MoveMouse";
                    break;
                case MOVEMOUSEPLUSCLICK:
                    type = "Move+Click";
                    break;
                case ONEKEY:
                    type = "OneKey";
                    break;
                case ONEKEYPRESS:
                    type = "OneKeyPress";
                    break;
                case ONEKEYRELEASE:
                    type = "OneKeyRelease";
                    break;
                case RELEASEALLKEYS:
                    type = "ReleaseAllKeys";
                    break;
                case STRING:
                    type = "InputString";
                    break;
                case WAITFORCOLOR:
                    type = "WaitForColor";
                    break;
                case LOOP:
                    type = "START LOOP " + er.getEventList().get(rij).getNumberOfLoopEvent();
                    break;
                case LOOPEND:
                    type = "END LOOP " + er.getEventList().get(rij).getNumberOfLoopEvent();
                    break;
                default:
                    type = "Click";
                    break;
            }
            if (er.getEventList().get(rij).isLeftClick())
                button = "LeftClick";
            else if (er.getEventList().get(rij).isRightClick())
                button = "RightClick";
            else if (er.getEventList().get(rij).isMiddleClick())
                button = "MiddleClick";
            else if (er.getEventList().get(rij).getKey().length() > 0)
                button = er.getEventList().get(rij).getKey();
            else if (er.getEventList().get(rij).getString().length() > 0)
                button = er.getEventList().get(rij).getString();
            else if (er.getEventList().get(rij).getType() == domain.Event.Type.LOOP)
                button = String.format("%d times",er.getEventList().get(rij).getNumberOfLoopTimes());
            if (er.getEventList().get(rij).getMouseX() == -1)
                x = "N/A";
            else
                x = String.format("%d", er.getEventList().get(rij).getMouseX());
            if (er.getEventList().get(rij).getMouseY() == -1)
                y = "N/A";
            else
                y = String.format("%d", er.getEventList().get(rij).getMouseY());
            minp = String.format("%d", er.getEventList().get(rij).getMinPause());
            maxp = String.format("%d", er.getEventList().get(rij).getMaxPause());
            
            o[rij][0] = type;
            o[rij][1] = button;
            o[rij][2] = x;
            o[rij][3] = y;
            o[rij][4] = minp;
            o[rij][5] = maxp;
        }
        return o;
    }
    
    public static Object[] getKolomNamen()
    {
        return er.getColumnNames();
    }
    
    public static void deleteEvent(int i)
    {
        er.deleteEvent(i);
    }
    
    public static int[] getAllKeys()
    {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(KeyEvent.VK_ESCAPE);
        a.add(KeyEvent.VK_F1);
        a.add(KeyEvent.VK_F2);
        a.add(KeyEvent.VK_F3);
        a.add(KeyEvent.VK_F4);
        a.add(KeyEvent.VK_F5);
        a.add(KeyEvent.VK_F6);
        a.add(KeyEvent.VK_F7);
        a.add(KeyEvent.VK_F8);
        a.add(KeyEvent.VK_F9);
        a.add(KeyEvent.VK_F10);
        a.add(KeyEvent.VK_F11);
        a.add(KeyEvent.VK_F12);
        a.add(KeyEvent.VK_NUMPAD0);
        a.add(KeyEvent.VK_NUMPAD1);
        a.add(KeyEvent.VK_NUMPAD2);
        a.add(KeyEvent.VK_NUMPAD3);
        a.add(KeyEvent.VK_NUMPAD4);
        a.add(KeyEvent.VK_NUMPAD5);
        a.add(KeyEvent.VK_NUMPAD6);
        a.add(KeyEvent.VK_NUMPAD7);
        a.add(KeyEvent.VK_NUMPAD8);
        a.add(KeyEvent.VK_NUMPAD9);
        a.add(KeyEvent.VK_TAB);
        a.add(KeyEvent.VK_CAPS_LOCK);
        a.add(KeyEvent.VK_SHIFT);
        a.add(KeyEvent.VK_CONTROL);
        a.add(KeyEvent.VK_WINDOWS);
        a.add(KeyEvent.VK_ALT);
        a.add(KeyEvent.VK_ALT_GRAPH);
        a.add(KeyEvent.VK_ENTER);
        a.add(KeyEvent.VK_BACK_SPACE);
        a.add(KeyEvent.VK_PRINTSCREEN);
        a.add(KeyEvent.VK_SCROLL_LOCK);
        a.add(KeyEvent.VK_PAUSE);
        a.add(KeyEvent.VK_INSERT);
        a.add(KeyEvent.VK_HOME);
        a.add(KeyEvent.VK_PAGE_UP);
        a.add(KeyEvent.VK_DELETE);
        a.add(KeyEvent.VK_END);
        a.add(KeyEvent.VK_PAGE_DOWN);
        a.add(KeyEvent.VK_LEFT);
        a.add(KeyEvent.VK_UP);
        a.add(KeyEvent.VK_DOWN);
        a.add(KeyEvent.VK_RIGHT);
        a.add(KeyEvent.VK_NUM_LOCK);
        a.add(KeyEvent.VK_DIVIDE);
        a.add(KeyEvent.VK_MINUS);
        a.add(KeyEvent.VK_MULTIPLY);
        a.add(KeyEvent.VK_PLUS);
        a.add(KeyEvent.VK_PERIOD);
        int[] i = new int[a.size()];
        for (int j = 0; j < a.size(); j++)
        {
            i[j] = a.get(j);
        }
        return i;
    }
    
    public static int calcOneKeyEvent(String s)
    {
        int keyevent;
        switch (s)
        {
            case "escape":
                keyevent = KeyEvent.VK_ESCAPE;
                break;
            case "f1":
                keyevent = KeyEvent.VK_F1;
                break;
            case "f2":
                keyevent = KeyEvent.VK_F2;
                break;
            case "f3":
                keyevent = KeyEvent.VK_F3;
                break;
            case "f4":
                keyevent = KeyEvent.VK_F4;
                break;
            case "f5":
                keyevent = KeyEvent.VK_F5;
                break;
            case "f6":
                keyevent = KeyEvent.VK_F6;
                break;
            case "f7":
                keyevent = KeyEvent.VK_F7;
                break;
            case "f8":
                keyevent = KeyEvent.VK_F8;
                break;
            case "f9":
                keyevent = KeyEvent.VK_F9;
                break;
            case "f10":
                keyevent = KeyEvent.VK_F10;
                break;
            case "f11":
                keyevent = KeyEvent.VK_F11;
                break;
            case "f12":
                keyevent = KeyEvent.VK_F12;
                break;
            case "tab":
                keyevent = KeyEvent.VK_TAB;
                break;
            case "capslock":
                keyevent = KeyEvent.VK_CAPS_LOCK;
                break;
            case "shift":
                keyevent = KeyEvent.VK_SHIFT;
                break;
            case "control":
                keyevent = KeyEvent.VK_CONTROL;
                break;
            case "windows":
                keyevent = KeyEvent.VK_WINDOWS;
                break;
            case "alt":
                keyevent = KeyEvent.VK_ALT;
                break;
            case "altgr":
                keyevent = KeyEvent.VK_ALT_GRAPH;
                break;
            case "enter":
                keyevent = KeyEvent.VK_ENTER;
                break;
            case "backspace":
                keyevent = KeyEvent.VK_BACK_SPACE;
                break;
            case "printscreen":
                keyevent = KeyEvent.VK_PRINTSCREEN;
                break;
            case "scrolllock":
                keyevent = KeyEvent.VK_SCROLL_LOCK;
                break;
            case "pausebreak":
                keyevent = KeyEvent.VK_PAUSE;
                break;
            case "insert":
                keyevent = KeyEvent.VK_INSERT;
                break;
            case "home":
                keyevent = KeyEvent.VK_HOME;
                break;
            case "pageup":
                keyevent = KeyEvent.VK_PAGE_UP;
                break;
            case "delete":
                keyevent = KeyEvent.VK_DELETE;
                break;
            case "end":
                keyevent = KeyEvent.VK_END;
                break;
            case "pagedown":
                keyevent = KeyEvent.VK_PAGE_DOWN;
                break;
            case "left":
                keyevent = KeyEvent.VK_LEFT;
                break;
            case "up":
                keyevent = KeyEvent.VK_UP;
                break;
            case "down":
                keyevent = KeyEvent.VK_DOWN;
                break;
            case "right":
                keyevent = KeyEvent.VK_RIGHT;
                break;
            case "0":
                keyevent = KeyEvent.VK_NUMPAD0;
                break;
            case "1":
                keyevent = KeyEvent.VK_NUMPAD1;
                break;
            case "2":
                keyevent = KeyEvent.VK_NUMPAD2;
                break;
            case "3":
                keyevent = KeyEvent.VK_NUMPAD3;
                break;
            case "4":
                keyevent = KeyEvent.VK_NUMPAD4;
                break;
            case "5":
                keyevent = KeyEvent.VK_NUMPAD5;
                break;
            case "6":
                keyevent = KeyEvent.VK_NUMPAD6;
                break;
            case "7":
                keyevent = KeyEvent.VK_NUMPAD7;
                break;
            case "8":
                keyevent = KeyEvent.VK_NUMPAD8;
                break;
            case "9":
                keyevent = KeyEvent.VK_NUMPAD9;
                break;
            case "numlock":
                keyevent = KeyEvent.VK_NUM_LOCK;
                break;
            case "divide":
                keyevent = KeyEvent.VK_DIVIDE;
                break;
            case "multiply":
                keyevent = KeyEvent.VK_MULTIPLY;
                break;
            case "minus":
                keyevent = KeyEvent.VK_MINUS;
                break;
            case "plus":
                keyevent = KeyEvent.VK_ADD;
                break;
            case "dot":
                keyevent = KeyEvent.VK_DECIMAL;
                break;
            default:
                keyevent = -1;
                break;
        }
        return keyevent;
    }
    
    public static int calcStringKeyEvent(char c)
    {
        int i = -1;
        
        switch (c)
        {
            case '0':
                i = KeyEvent.VK_NUMPAD0;
                break;
            case '1':
                i = KeyEvent.VK_NUMPAD1;
                break;
            case '2':
                i = KeyEvent.VK_NUMPAD2;
                break;
            case '3':
                i = KeyEvent.VK_NUMPAD3;
                break;
            case '4':
                i = KeyEvent.VK_NUMPAD4;
                break;
            case '5':
                i = KeyEvent.VK_NUMPAD5;
                break;
            case '6':
                i = KeyEvent.VK_NUMPAD6;
                break;
            case '7':
                i = KeyEvent.VK_NUMPAD7;
                break;
            case '8':
                i = KeyEvent.VK_NUMPAD8;
                break;
            case '9':
                i = KeyEvent.VK_NUMPAD9;
                break;
            case 'a':
                i = KeyEvent.VK_A;
                break;
            case 'b':
                i = KeyEvent.VK_B;
                break;
            case 'c':
                i = KeyEvent.VK_C;
                break;
            case 'd':
                i = KeyEvent.VK_D;
                break;
            case 'e':
                i = KeyEvent.VK_E;
                break;
            case 'f':
                i = KeyEvent.VK_F;
                break;
            case 'g':
                i = KeyEvent.VK_G;
                break;
            case 'h':
                i = KeyEvent.VK_H;
                break;
            case 'i':
                i = KeyEvent.VK_I;
                break;
            case 'j':
                i = KeyEvent.VK_J;
                break;
            case 'k':
                i = KeyEvent.VK_K;
                break;
            case 'l':
                i = KeyEvent.VK_L;
                break;
            case 'm':
                i = KeyEvent.VK_M;
                break;
            case 'n':
                i = KeyEvent.VK_N;
                break;
            case 'o':
                i = KeyEvent.VK_O;
                break;
            case 'p':
                i = KeyEvent.VK_P;
                break;
            case 'q':
                i = KeyEvent.VK_Q;
                break;
            case 'r':
                i = KeyEvent.VK_R;
                break;
            case 's':
                i = KeyEvent.VK_S;
                break;
            case 't':
                i = KeyEvent.VK_T;
                break;
            case 'u':
                i = KeyEvent.VK_U;
                break;
            case 'v':
                i = KeyEvent.VK_V;
                break;
            case 'w':
                i = KeyEvent.VK_W;
                break;
            case 'x':
                i = KeyEvent.VK_X;
                break;
            case 'y':
                i = KeyEvent.VK_Y;
                break;
            case 'z':
                i = KeyEvent.VK_Z;
                break;
            case ' ':
                i = KeyEvent.VK_SPACE;
        }
        return i;
    }
    
    public static void save()
    {
        DataController.save();
    }
    
    public static void open()
    {
        DataController.open();
    }

    public static String getVersion() {
        return version;
    }
    
    
}
