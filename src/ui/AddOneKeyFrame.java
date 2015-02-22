/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import domain.DomainController;
import domain.Event;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Gebruiker
 */
public class AddOneKeyFrame extends javax.swing.JFrame {

    int number = -1;
    private KeyEvent keyEvent;
    /**
     * Creates new form AddClickFrame
     */
    public AddOneKeyFrame() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/images/icon16.png")).getImage());
    }
    
    public AddOneKeyFrame(int i, Event.Type ty, String key, long minp, long maxp)
    {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/images/icon16.png")).getImage());
        switch (key)
        {
            case "escape":
                this.buttonGroup1.setSelected(jToggleButtonEscape.getModel(), true);
                break;
            case "f1":
                this.buttonGroup1.setSelected(jToggleButtonF1.getModel(), true);
                break;
            case "f2":
                this.buttonGroup1.setSelected(jToggleButtonF2.getModel(), true);
                break;
            case "f3":
                this.buttonGroup1.setSelected(jToggleButtonF3.getModel(), true);
                break;
            case "f4":
                this.buttonGroup1.setSelected(jToggleButtonF4.getModel(), true);
                break;
            case "f5":
                this.buttonGroup1.setSelected(jToggleButtonF5.getModel(), true);
                break;
            case "f6":
                this.buttonGroup1.setSelected(jToggleButtonF6.getModel(), true);
                break;
            case "f7":
                this.buttonGroup1.setSelected(jToggleButtonF7.getModel(), true);
                break;
            case "f8":
                this.buttonGroup1.setSelected(jToggleButtonF8.getModel(), true);
                break;
            case "f9":
                this.buttonGroup1.setSelected(jToggleButtonF9.getModel(), true);
                break;
            case "f10":
                this.buttonGroup1.setSelected(jToggleButtonF10.getModel(), true);
                break;
            case "f11":
                this.buttonGroup1.setSelected(jToggleButtonF11.getModel(), true);
                break;
            case "f12":
                this.buttonGroup1.setSelected(jToggleButtonF12.getModel(), true);
                break;
            case "tab":
                this.buttonGroup1.setSelected(jToggleButtonTab.getModel(), true);
                break;
            case "capslock":
                this.buttonGroup1.setSelected(jToggleButtonCapsLock.getModel(), true);
                break;
            case "shift":
                this.buttonGroup1.setSelected(jToggleButtonShiftRight.getModel(), true);
                break;
            case "control":
                this.buttonGroup1.setSelected(jToggleButtonControlRight.getModel(), true);
                break;
            case "windows":
                this.buttonGroup1.setSelected(jToggleButtonWindowsRight.getModel(), true);
                break;
            case "alt":
                this.buttonGroup1.setSelected(jToggleButtonAlt.getModel(), true);
                break;
            case "altgr":
                this.buttonGroup1.setSelected(jToggleButtonAltGr.getModel(), true);
                break;
            case "enter":
                this.buttonGroup1.setSelected(jToggleButtonEnterKey.getModel(), true);
                break;
            case "backspace":
                this.buttonGroup1.setSelected(jToggleButtonBackSpace.getModel(), true);
                break;
            case "printscreen":
                this.buttonGroup1.setSelected(jToggleButtonPrintScreen.getModel(), true);
                break;
            case "scrolllock":
                this.buttonGroup1.setSelected(jToggleButtonScrollLock.getModel(), true);
                break;
            case "pausebreak":
                this.buttonGroup1.setSelected(jToggleButtonPauseBreak.getModel(), true);
                break;
            case "insert":
                this.buttonGroup1.setSelected(jToggleButtonInsert.getModel(), true);
                break;
            case "home":
                this.buttonGroup1.setSelected(jToggleButtonHome.getModel(), true);
                break;
            case "pageup":
                this.buttonGroup1.setSelected(jToggleButtonPageUp.getModel(), true);
                break;
            case "delete":
                this.buttonGroup1.setSelected(jToggleButtonDelete.getModel(), true);
                break;
            case "end":
                this.buttonGroup1.setSelected(jToggleButtonEnd.getModel(), true);
                break;
            case "pagedown":
                this.buttonGroup1.setSelected(jToggleButtonPageDown.getModel(), true);
                break;
            case "left":
                this.buttonGroup1.setSelected(jToggleButtonLeft.getModel(), true);
                break;
            case "up":
                this.buttonGroup1.setSelected(jToggleButtonUp.getModel(), true);
                break;
            case "down":
                this.buttonGroup1.setSelected(jToggleButtonDown.getModel(), true);
                break;
            case "right":
                this.buttonGroup1.setSelected(jToggleButtonRight.getModel(), true);
                break;
            case "0":
                this.buttonGroup1.setSelected(jToggleButton0.getModel(), true);
                break;
            case "1":
                this.buttonGroup1.setSelected(jToggleButton1.getModel(), true);
                break;
            case "2":
                this.buttonGroup1.setSelected(jToggleButton2.getModel(), true);
                break;
            case "3":
                this.buttonGroup1.setSelected(jToggleButton3.getModel(), true);
                break;
            case "4":
                this.buttonGroup1.setSelected(jToggleButton4.getModel(), true);
                break;
            case "5":
                this.buttonGroup1.setSelected(jToggleButton5.getModel(), true);
                break;
            case "6":
                this.buttonGroup1.setSelected(jToggleButton6.getModel(), true);
                break;
            case "7":
                this.buttonGroup1.setSelected(jToggleButton7.getModel(), true);
                break;
            case "8":
                this.buttonGroup1.setSelected(jToggleButton8.getModel(), true);
                break;
            case "9":
                this.buttonGroup1.setSelected(jToggleButton9.getModel(), true);
                break;
            case "numlock":
                this.buttonGroup1.setSelected(jToggleButtonNumLock.getModel(), true);
                break;
            case "divide":
                this.buttonGroup1.setSelected(jToggleButtonDivide.getModel(), true);
                break;
            case "multiply":
                this.buttonGroup1.setSelected(jToggleButtonMultiply.getModel(), true);
                break;
            case "minus":
                this.buttonGroup1.setSelected(jToggleButtonMinus.getModel(), true);
                break;
            case "plus":
                this.buttonGroup1.setSelected(jToggleButtonPlus.getModel(), true);
                break;
            case "dot":
                this.buttonGroup1.setSelected(jToggleButtonDot.getModel(), true);
                break;
    
        }
        if (minp == maxp)
        {
            this.jTextFieldPause.setText(String.format("%d", minp));
        }
        else
        {
            this.jCheckBoxRandomize.setSelected(true);
            this.jTextFieldMinPause.setText(String.format("%d", minp));
            this.jTextFieldMaxPause.setText(String.format("%d", maxp));
            jTextFieldPause.setEnabled(false);
            jTextFieldPause.setBackground(new Color(153,153,153));
            jTextFieldMinPause.setEnabled(true);
            jTextFieldMinPause.setBackground(new Color(255,255,255));
            jTextFieldMaxPause.setEnabled(true);
            jTextFieldMaxPause.setBackground(new Color(255,255,255));
        }
        switch (ty)
        {
            case ONEKEY:
                jRadioButtonPressAndRelease.setSelected(true);
                break;
            case ONEKEYPRESS:
                jRadioButtonPress.setSelected(true);
                break;
            case ONEKEYRELEASE:
                jRadioButtonRelease.setSelected(true);
                break;
            default:
                jRadioButtonPressAndRelease.setSelected(true);
                break;
        }
        number = i;
        this.jButtonAdd.setText("Modify");
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPause = new javax.swing.JTextField();
        jTextFieldMinPause = new javax.swing.JTextField();
        jTextFieldMaxPause = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBoxRandomize = new javax.swing.JCheckBox();
        jButtonAdd = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jToggleButtonEnterKey = new javax.swing.JToggleButton();
        jToggleButtonF12 = new javax.swing.JToggleButton();
        jToggleButtonF3 = new javax.swing.JToggleButton();
        jToggleButtonF11 = new javax.swing.JToggleButton();
        jToggleButtonF1 = new javax.swing.JToggleButton();
        jToggleButtonF2 = new javax.swing.JToggleButton();
        jToggleButtonF10 = new javax.swing.JToggleButton();
        jToggleButtonF4 = new javax.swing.JToggleButton();
        jToggleButtonF9 = new javax.swing.JToggleButton();
        jToggleButtonF5 = new javax.swing.JToggleButton();
        jToggleButtonF6 = new javax.swing.JToggleButton();
        jToggleButtonF7 = new javax.swing.JToggleButton();
        jToggleButtonF8 = new javax.swing.JToggleButton();
        jToggleButtonEnterNum = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton0 = new javax.swing.JToggleButton();
        jToggleButtonDot = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButtonPlus = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButtonMinus = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButtonMultiply = new javax.swing.JToggleButton();
        jToggleButtonNumLock = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButtonDivide = new javax.swing.JToggleButton();
        jToggleButtonPauseBreak = new javax.swing.JToggleButton();
        jToggleButtonPrintScreen = new javax.swing.JToggleButton();
        jToggleButtonScrollLock = new javax.swing.JToggleButton();
        jToggleButtonPageUp = new javax.swing.JToggleButton();
        jToggleButtonInsert = new javax.swing.JToggleButton();
        jToggleButtonHome = new javax.swing.JToggleButton();
        jToggleButtonPageDown = new javax.swing.JToggleButton();
        jToggleButtonDelete = new javax.swing.JToggleButton();
        jToggleButtonEnd = new javax.swing.JToggleButton();
        jToggleButtonRight = new javax.swing.JToggleButton();
        jToggleButtonLeft = new javax.swing.JToggleButton();
        jToggleButtonDown = new javax.swing.JToggleButton();
        jToggleButtonUp = new javax.swing.JToggleButton();
        jToggleButtonTab = new javax.swing.JToggleButton();
        jToggleButtonEscape = new javax.swing.JToggleButton();
        jToggleButtonBackSpace = new javax.swing.JToggleButton();
        jToggleButtonControlRight = new javax.swing.JToggleButton();
        jToggleButtonWindowsRight = new javax.swing.JToggleButton();
        jToggleButtonAltGr = new javax.swing.JToggleButton();
        jToggleButtonWindowsLeft = new javax.swing.JToggleButton();
        jToggleButtonAlt = new javax.swing.JToggleButton();
        jToggleButtonShiftLeft = new javax.swing.JToggleButton();
        jToggleButtonControlLeft = new javax.swing.JToggleButton();
        jToggleButtonShiftRight = new javax.swing.JToggleButton();
        jToggleButtonCapsLock = new javax.swing.JToggleButton();
        jRadioButtonPressAndRelease = new javax.swing.JRadioButton();
        jRadioButtonPress = new javax.swing.JRadioButton();
        jRadioButtonRelease = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Click");
        setResizable(false);

        jLabel1.setText("Pause:");

        jLabel2.setText("Min. Pause:");

        jLabel3.setText("Max.Pause:");

        jTextFieldPause.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldPause.setText("1");
        jTextFieldPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPauseActionPerformed(evt);
            }
        });

        jTextFieldMinPause.setBackground(new java.awt.Color(153, 153, 153));
        jTextFieldMinPause.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldMinPause.setText("1");
        jTextFieldMinPause.setEnabled(false);
        jTextFieldMinPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMinPauseActionPerformed(evt);
            }
        });

        jTextFieldMaxPause.setBackground(new java.awt.Color(153, 153, 153));
        jTextFieldMaxPause.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldMaxPause.setText("1");
        jTextFieldMaxPause.setEnabled(false);
        jTextFieldMaxPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMaxPauseActionPerformed(evt);
            }
        });

        jLabel4.setText("ms");

        jLabel5.setText("ms");

        jLabel6.setText("ms");

        jCheckBoxRandomize.setText("Randomize");
        jCheckBoxRandomize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxRandomizeActionPerformed(evt);
            }
        });

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        buttonGroup1.add(jToggleButtonEnterKey);
        jToggleButtonEnterKey.setSelected(true);
        jToggleButtonEnterKey.setText("Enter");

        buttonGroup1.add(jToggleButtonF12);
        jToggleButtonF12.setText("F12");

        buttonGroup1.add(jToggleButtonF3);
        jToggleButtonF3.setText("F3");

        buttonGroup1.add(jToggleButtonF11);
        jToggleButtonF11.setText("F11");

        buttonGroup1.add(jToggleButtonF1);
        jToggleButtonF1.setText("F1");

        buttonGroup1.add(jToggleButtonF2);
        jToggleButtonF2.setText("F2");

        buttonGroup1.add(jToggleButtonF10);
        jToggleButtonF10.setText("F10");

        buttonGroup1.add(jToggleButtonF4);
        jToggleButtonF4.setText("F4");

        buttonGroup1.add(jToggleButtonF9);
        jToggleButtonF9.setText("F9");

        buttonGroup1.add(jToggleButtonF5);
        jToggleButtonF5.setText("F5");

        buttonGroup1.add(jToggleButtonF6);
        jToggleButtonF6.setText("F6");

        buttonGroup1.add(jToggleButtonF7);
        jToggleButtonF7.setText("F7");

        buttonGroup1.add(jToggleButtonF8);
        jToggleButtonF8.setText("F8");

        buttonGroup1.add(jToggleButtonEnterNum);
        jToggleButtonEnterNum.setText("Ent");

        buttonGroup1.add(jToggleButton3);
        jToggleButton3.setText("3");

        buttonGroup1.add(jToggleButton0);
        jToggleButton0.setText("0");
        jToggleButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton0ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jToggleButtonDot);
        jToggleButtonDot.setText(".");

        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setText("2");

        buttonGroup1.add(jToggleButton6);
        jToggleButton6.setText("6");

        buttonGroup1.add(jToggleButton5);
        jToggleButton5.setText("5");

        buttonGroup1.add(jToggleButtonPlus);
        jToggleButtonPlus.setText("+");

        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setText("1");

        buttonGroup1.add(jToggleButtonMinus);
        jToggleButtonMinus.setText("-");

        buttonGroup1.add(jToggleButton7);
        jToggleButton7.setText("7");

        buttonGroup1.add(jToggleButton8);
        jToggleButton8.setText("8");

        buttonGroup1.add(jToggleButton9);
        jToggleButton9.setText("9");

        buttonGroup1.add(jToggleButtonMultiply);
        jToggleButtonMultiply.setText("*");

        buttonGroup1.add(jToggleButtonNumLock);
        jToggleButtonNumLock.setText("Num");

        buttonGroup1.add(jToggleButton4);
        jToggleButton4.setText("4");

        buttonGroup1.add(jToggleButtonDivide);
        jToggleButtonDivide.setText("/");

        buttonGroup1.add(jToggleButtonPauseBreak);
        jToggleButtonPauseBreak.setText("Pause");
        jToggleButtonPauseBreak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPauseBreakActionPerformed(evt);
            }
        });

        buttonGroup1.add(jToggleButtonPrintScreen);
        jToggleButtonPrintScreen.setText("PrintScreen");

        buttonGroup1.add(jToggleButtonScrollLock);
        jToggleButtonScrollLock.setText("Scroll Lock");

        buttonGroup1.add(jToggleButtonPageUp);
        jToggleButtonPageUp.setText("Page Up");

        buttonGroup1.add(jToggleButtonInsert);
        jToggleButtonInsert.setText("Insert");

        buttonGroup1.add(jToggleButtonHome);
        jToggleButtonHome.setText("Home");
        jToggleButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonHomeActionPerformed(evt);
            }
        });

        buttonGroup1.add(jToggleButtonPageDown);
        jToggleButtonPageDown.setText("Page Down");

        buttonGroup1.add(jToggleButtonDelete);
        jToggleButtonDelete.setText("Delete");

        buttonGroup1.add(jToggleButtonEnd);
        jToggleButtonEnd.setText("End");

        buttonGroup1.add(jToggleButtonRight);
        jToggleButtonRight.setText("Right");

        buttonGroup1.add(jToggleButtonLeft);
        jToggleButtonLeft.setText("Left");

        buttonGroup1.add(jToggleButtonDown);
        jToggleButtonDown.setText("Down");

        buttonGroup1.add(jToggleButtonUp);
        jToggleButtonUp.setText("Up");

        buttonGroup1.add(jToggleButtonTab);
        jToggleButtonTab.setText("Tab");

        buttonGroup1.add(jToggleButtonEscape);
        jToggleButtonEscape.setText("Esc");

        buttonGroup1.add(jToggleButtonBackSpace);
        jToggleButtonBackSpace.setText("Backspace");

        buttonGroup1.add(jToggleButtonControlRight);
        jToggleButtonControlRight.setText("Ctrl");

        buttonGroup1.add(jToggleButtonWindowsRight);
        jToggleButtonWindowsRight.setText("Windows");

        buttonGroup1.add(jToggleButtonAltGr);
        jToggleButtonAltGr.setText("Alt Gr");

        buttonGroup1.add(jToggleButtonWindowsLeft);
        jToggleButtonWindowsLeft.setText("Windows");

        buttonGroup1.add(jToggleButtonAlt);
        jToggleButtonAlt.setText("Alt");

        buttonGroup1.add(jToggleButtonShiftLeft);
        jToggleButtonShiftLeft.setText("Shift");

        buttonGroup1.add(jToggleButtonControlLeft);
        jToggleButtonControlLeft.setText("Control");

        buttonGroup1.add(jToggleButtonShiftRight);
        jToggleButtonShiftRight.setText("Shift");

        buttonGroup1.add(jToggleButtonCapsLock);
        jToggleButtonCapsLock.setText("Caps Lock");

        buttonGroup2.add(jRadioButtonPressAndRelease);
        jRadioButtonPressAndRelease.setSelected(true);
        jRadioButtonPressAndRelease.setText("Press & Release");

        buttonGroup2.add(jRadioButtonPress);
        jRadioButtonPress.setText("Press Only");

        buttonGroup2.add(jRadioButtonRelease);
        jRadioButtonRelease.setText("Release Only");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButtonShiftLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButtonBackSpace, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButtonEnterKey, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButtonShiftRight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jToggleButtonAltGr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButtonWindowsRight)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButtonControlRight, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jToggleButtonInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButtonPrintScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButtonDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButtonScrollLock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButtonHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButtonEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButtonPageDown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButtonPageUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButtonPauseBreak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButtonTab, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButtonCapsLock, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButtonEscape, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButtonF1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButtonF2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButtonF3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButtonF4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButtonF5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButtonF6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButtonF7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButtonF8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButtonF9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButtonF10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButtonF11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButtonF12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(612, 612, 612)
                                .addComponent(jToggleButtonLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jToggleButtonUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButtonDown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButtonRight)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButtonControlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButtonWindowsLeft)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButtonAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 657, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldMinPause, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldPause, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldMaxPause, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxRandomize)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jToggleButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jToggleButtonMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jToggleButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jToggleButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButtonPressAndRelease)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jToggleButtonNumLock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jToggleButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jToggleButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jToggleButtonEnterNum, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jRadioButtonPress)
                                .addComponent(jRadioButtonRelease)))
                        .addContainerGap(83, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jToggleButtonPrintScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButtonScrollLock, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButtonPauseBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jToggleButtonEscape, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButtonF1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButtonF3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButtonF4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButtonF5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButtonF6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButtonF7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButtonF8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButtonF9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButtonF10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButtonF11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButtonF12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButtonF2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jToggleButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButtonPageUp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jToggleButtonPageDown, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jToggleButtonEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jToggleButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButtonUp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jToggleButtonBackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jToggleButtonEnterKey, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jToggleButtonTab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jToggleButtonCapsLock, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jToggleButtonShiftLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButtonShiftRight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jToggleButtonControlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButtonWindowsLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButtonAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButtonAltGr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButtonWindowsRight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButtonControlRight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 6, Short.MAX_VALUE)))
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jToggleButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButtonMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jToggleButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButtonEnterNum, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButtonNumLock, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jToggleButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonPressAndRelease)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonPress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonRelease)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jToggleButtonLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToggleButtonDown, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToggleButtonRight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldPause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jCheckBoxRandomize))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldMinPause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldMaxPause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxRandomizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxRandomizeActionPerformed
        if (jCheckBoxRandomize.isSelected())
        {
            jTextFieldPause.setEnabled(false);
            jTextFieldPause.setBackground(new Color(153,153,153));
            jTextFieldMinPause.setEnabled(true);
            jTextFieldMinPause.setBackground(new Color(255,255,255));
            jTextFieldMaxPause.setEnabled(true);
            jTextFieldMaxPause.setBackground(new Color(255,255,255));
        }
        else
        {
            jTextFieldPause.setEnabled(true);
            jTextFieldPause.setBackground(new Color(255,255,255));
            jTextFieldMinPause.setEnabled(false);
            jTextFieldMinPause.setBackground(new Color(153,153,153));
            jTextFieldMaxPause.setEnabled(false);
            jTextFieldMaxPause.setBackground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jCheckBoxRandomizeActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        long minPause=1, maxPause=1;
        
        if (!jCheckBoxRandomize.isSelected() && jTextFieldPause.getText().length() == 0)
            jTextFieldPause.setText("1");
        if (jCheckBoxRandomize.isSelected() && jTextFieldMinPause.getText().length() == 0)
            jTextFieldMinPause.setText("1");
        if (jCheckBoxRandomize.isSelected() && jTextFieldMaxPause.getText().length() == 0)
            jTextFieldMaxPause.setText("1");
        if (!jCheckBoxRandomize.isSelected())
        {
            try
            {
                minPause = Long.parseLong(jTextFieldPause.getText());
                maxPause = Long.parseLong(jTextFieldPause.getText());
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(this, "Pause value is not a number.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        else
        {
            try
            {
                minPause = Long.parseLong(jTextFieldMinPause.getText());
                maxPause = Long.parseLong(jTextFieldMaxPause.getText());
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(this, "Pause value is not a number.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        String k = "";
        if (jToggleButtonEscape.isSelected())
            k = "escape";
        else if (jToggleButtonF1.isSelected())
            k = "f1";
        else if (jToggleButtonF2.isSelected())
            k = "f2";
        else if (jToggleButtonF3.isSelected())
            k = "f3";
        else if (jToggleButtonF4.isSelected())
            k = "f4";
        else if (jToggleButtonF5.isSelected())
            k = "f5";
        else if (jToggleButtonF6.isSelected())
            k = "f6";
        else if (jToggleButtonF7.isSelected())
            k = "f7";
        else if (jToggleButtonF8.isSelected())
            k = "f8";
        else if (jToggleButtonF9.isSelected())
            k = "f9";
        else if (jToggleButtonF10.isSelected())
            k = "f10";
        else if (jToggleButtonF11.isSelected())
            k = "f11";
        else if (jToggleButtonF12.isSelected())
            k = "f12";
        else if (jToggleButtonTab.isSelected())
            k = "tab";
        else if (jToggleButtonCapsLock.isSelected())
            k = "capslock";
        else if (jToggleButtonShiftLeft.isSelected() || jToggleButtonShiftRight.isSelected())
            k = "shift";
        else if (jToggleButtonControlLeft.isSelected() || jToggleButtonControlRight.isSelected())
            k = "control";
        else if (jToggleButtonWindowsLeft.isSelected() || jToggleButtonWindowsRight.isSelected())
            k = "windows";
        else if (jToggleButtonAlt.isSelected())
            k = "alt";
        else if (jToggleButtonAltGr.isSelected())
            k = "altgr";
        else if (jToggleButtonEnterKey.isSelected() || jToggleButtonEnterNum.isSelected())
            k = "enter";
        else if (jToggleButtonBackSpace.isSelected())
            k = "backspace";
        else if (jToggleButtonPrintScreen.isSelected())
            k = "printscreen";
        else if (jToggleButtonScrollLock.isSelected())
            k = "scrolllock";
        else if (jToggleButtonPauseBreak.isSelected())
            k = "pausebreak";
        else if (jToggleButtonInsert.isSelected())
            k = "insert";
        else if (jToggleButtonHome.isSelected())
            k = "home";
        else if (jToggleButtonPageUp.isSelected())
            k = "pageup";
        else if (jToggleButtonDelete.isSelected())
            k = "delete";
        else if (jToggleButtonEnd.isSelected())
            k = "end";
        else if (jToggleButtonPageDown.isSelected())
            k = "pagedown";
        else if (jToggleButtonLeft.isSelected())
            k = "left";
        else if (jToggleButtonUp.isSelected())
            k = "up";
        else if (jToggleButtonDown.isSelected())
            k = "down";
        else if (jToggleButtonRight.isSelected())
            k = "right";
        else if (jToggleButtonNumLock.isSelected())
            k = "numlock";
        else if (jToggleButton0.isSelected())
            k = "0";
        else if (jToggleButton1.isSelected())
            k = "1";
        else if (jToggleButton2.isSelected())
            k = "2";
        else if (jToggleButton3.isSelected())
            k = "3";
        else if (jToggleButton4.isSelected())
            k = "4";
        else if (jToggleButton5.isSelected())
            k = "5";
        else if (jToggleButton6.isSelected())
            k = "6";
        else if (jToggleButton7.isSelected())
            k = "7";
        else if (jToggleButton8.isSelected())
            k = "8";
        else if (jToggleButton9.isSelected())
            k = "9";
        else if (jToggleButtonDivide.isSelected())
            k = "divide";
        else if (jToggleButtonMultiply.isSelected())
            k = "multiply";
        else if (jToggleButtonMinus.isSelected())
            k = "minus";
        else if (jToggleButtonPlus.isSelected())
            k = "plus";
        else if (jToggleButtonDot.isSelected())
            k = "dot";
        
        Event.Type ty;
        if (jRadioButtonPressAndRelease.isSelected())
            ty = Event.Type.ONEKEY;
        else if (jRadioButtonPress.isSelected())
            ty = Event.Type.ONEKEYPRESS;
        else
            ty = Event.Type.ONEKEYRELEASE;
        
        if(number == -1)
            DomainController.addEvent(ty, minPause, maxPause, 0, 0, false, false, false, k, "", Color.white, 0, 0);
        else
        {
            DomainController.er.getEventList().get(number).setType(ty);
            DomainController.er.getEventList().get(number).setKey(k);
            DomainController.er.getEventList().get(number).setMinPause(minPause);
            DomainController.er.getEventList().get(number).setMaxPause(maxPause);
        }
        DomainController.hf.updateTable();
        this.dispose();
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jToggleButtonPauseBreakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPauseBreakActionPerformed
        
    }//GEN-LAST:event_jToggleButtonPauseBreakActionPerformed

    private void jToggleButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton0ActionPerformed
        
    }//GEN-LAST:event_jToggleButton0ActionPerformed

    private void jToggleButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonHomeActionPerformed
        
    }//GEN-LAST:event_jToggleButtonHomeActionPerformed

    private void jTextFieldPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPauseActionPerformed
        jButtonAdd.doClick();// TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPauseActionPerformed

    private void jTextFieldMinPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMinPauseActionPerformed
        this.jTextFieldMaxPause.requestFocus();// TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMinPauseActionPerformed

    private void jTextFieldMaxPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMaxPauseActionPerformed
        jButtonAdd.doClick();// TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMaxPauseActionPerformed

    public KeyEvent getKeyEvent() {
        return keyEvent;
    }

    public void setKeyEvent(KeyEvent keyEvent) {
        this.keyEvent = keyEvent;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JCheckBox jCheckBoxRandomize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButtonPress;
    private javax.swing.JRadioButton jRadioButtonPressAndRelease;
    private javax.swing.JRadioButton jRadioButtonRelease;
    private javax.swing.JTextField jTextFieldMaxPause;
    private javax.swing.JTextField jTextFieldMinPause;
    private javax.swing.JTextField jTextFieldPause;
    private javax.swing.JToggleButton jToggleButton0;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    private javax.swing.JToggleButton jToggleButtonAlt;
    private javax.swing.JToggleButton jToggleButtonAltGr;
    private javax.swing.JToggleButton jToggleButtonBackSpace;
    private javax.swing.JToggleButton jToggleButtonCapsLock;
    private javax.swing.JToggleButton jToggleButtonControlLeft;
    private javax.swing.JToggleButton jToggleButtonControlRight;
    private javax.swing.JToggleButton jToggleButtonDelete;
    private javax.swing.JToggleButton jToggleButtonDivide;
    private javax.swing.JToggleButton jToggleButtonDot;
    private javax.swing.JToggleButton jToggleButtonDown;
    private javax.swing.JToggleButton jToggleButtonEnd;
    public javax.swing.JToggleButton jToggleButtonEnterKey;
    private javax.swing.JToggleButton jToggleButtonEnterNum;
    private javax.swing.JToggleButton jToggleButtonEscape;
    private javax.swing.JToggleButton jToggleButtonF1;
    private javax.swing.JToggleButton jToggleButtonF10;
    private javax.swing.JToggleButton jToggleButtonF11;
    private javax.swing.JToggleButton jToggleButtonF12;
    private javax.swing.JToggleButton jToggleButtonF2;
    private javax.swing.JToggleButton jToggleButtonF3;
    private javax.swing.JToggleButton jToggleButtonF4;
    private javax.swing.JToggleButton jToggleButtonF5;
    private javax.swing.JToggleButton jToggleButtonF6;
    private javax.swing.JToggleButton jToggleButtonF7;
    private javax.swing.JToggleButton jToggleButtonF8;
    private javax.swing.JToggleButton jToggleButtonF9;
    private javax.swing.JToggleButton jToggleButtonHome;
    private javax.swing.JToggleButton jToggleButtonInsert;
    private javax.swing.JToggleButton jToggleButtonLeft;
    private javax.swing.JToggleButton jToggleButtonMinus;
    private javax.swing.JToggleButton jToggleButtonMultiply;
    private javax.swing.JToggleButton jToggleButtonNumLock;
    private javax.swing.JToggleButton jToggleButtonPageDown;
    private javax.swing.JToggleButton jToggleButtonPageUp;
    private javax.swing.JToggleButton jToggleButtonPauseBreak;
    private javax.swing.JToggleButton jToggleButtonPlus;
    private javax.swing.JToggleButton jToggleButtonPrintScreen;
    private javax.swing.JToggleButton jToggleButtonRight;
    private javax.swing.JToggleButton jToggleButtonScrollLock;
    private javax.swing.JToggleButton jToggleButtonShiftLeft;
    private javax.swing.JToggleButton jToggleButtonShiftRight;
    private javax.swing.JToggleButton jToggleButtonTab;
    private javax.swing.JToggleButton jToggleButtonUp;
    private javax.swing.JToggleButton jToggleButtonWindowsLeft;
    private javax.swing.JToggleButton jToggleButtonWindowsRight;
    // End of variables declaration//GEN-END:variables
}
