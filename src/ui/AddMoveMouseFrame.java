/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import domain.DomainController;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Gebruiker
 */
public class AddMoveMouseFrame extends javax.swing.JFrame implements KeyListener {

    Timer t;
    private int x, y;
    int number = -1;
    /**
     * Creates new form AddMoveMouseFrame
     */
    public AddMoveMouseFrame(){
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/images/icon16.png")).getImage());
        t = new Timer(100, new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                if (jToggleButtonGetMouseLocation.isSelected())
                {
                    jLabelX.setText(String.format("X: %d", MouseInfo.getPointerInfo().getLocation().x));
                    jLabelY.setText(String.format("Y: %d", MouseInfo.getPointerInfo().getLocation().y));
                    x = MouseInfo.getPointerInfo().getLocation().x;
                    y = MouseInfo.getPointerInfo().getLocation().y;
                }
            }
        });
        addKeyListener(this);
        this.requestFocus();
    }
    
    public AddMoveMouseFrame(int i, long minp, long maxp, int mx, int my)
    {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/images/icon16.png")).getImage());
        t = new Timer(100, new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                if (jToggleButtonGetMouseLocation.isSelected())
                {
                    jLabelX.setText(String.format("X: %d", MouseInfo.getPointerInfo().getLocation().x));
                    jLabelY.setText(String.format("Y: %d", MouseInfo.getPointerInfo().getLocation().y));
                    x = MouseInfo.getPointerInfo().getLocation().x;
                    y = MouseInfo.getPointerInfo().getLocation().y;
                }
            }
        });
        addKeyListener(this);
        this.requestFocus();
        
        
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
        
        x = mx;
        y = my;
        this.jLabelX.setText(String.format("X: %d", x));
        this.jLabelY.setText(String.format("Y: %d", y));
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

        jButtonAdd = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jCheckBoxRandomize = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPause = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldMinPause = new javax.swing.JTextField();
        jTextFieldMaxPause = new javax.swing.JTextField();
        jToggleButtonGetMouseLocation = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabelX = new javax.swing.JLabel();
        jLabelY = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add MoveMouse");

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

        jLabel6.setText("ms");

        jCheckBoxRandomize.setText("Randomize");
        jCheckBoxRandomize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxRandomizeActionPerformed(evt);
            }
        });

        jLabel4.setText("ms");

        jLabel5.setText("ms");

        jTextFieldPause.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldPause.setText("1");
        jTextFieldPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPauseActionPerformed(evt);
            }
        });

        jLabel3.setText("Max.Pause:");

        jLabel2.setText("Min. Pause:");

        jLabel1.setText("Pause:");

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

        jToggleButtonGetMouseLocation.setText("Get Mouse Location");
        jToggleButtonGetMouseLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonGetMouseLocationActionPerformed(evt);
            }
        });

        jLabel7.setText(" (Press \"C\" to record current mouse position)");

        jLabelX.setText("X: 0");

        jLabelY.setText("Y: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jToggleButtonGetMouseLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 49, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelX, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelY, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPause, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jTextFieldMinPause)
                            .addComponent(jTextFieldMaxPause))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxRandomize)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldPause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jCheckBoxRandomize))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .addComponent(jLabelX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelY, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldMinPause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldMaxPause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jToggleButtonGetMouseLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void keyPressed(KeyEvent e)
    {
        if (e.getKeyCode() == KeyEvent.VK_C)
        {
            jToggleButtonGetMouseLocation.setSelected(false);
        }
    }
    
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        long minPause=1, maxPause=1;

        if (!jCheckBoxRandomize.isSelected() && jTextFieldPause.getText().length() == 0)
        jTextFieldPause.setText("1");
        else if (jCheckBoxRandomize.isSelected() && jTextFieldMinPause.getText().length() == 0)
        jTextFieldMinPause.setText("1");
        else if (jCheckBoxRandomize.isSelected() && jTextFieldMaxPause.getText().length() == 0)
        jTextFieldMaxPause.setText("1");
        else
        {
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
            if (number == -1)
                DomainController.addEvent(domain.Event.Type.MOVEMOUSE, minPause, maxPause, x, y, false, false, false, "", "", Color.white, 0, 0);
            else
            {
                DomainController.er.getEventList().get(number).setMinPause(minPause);
                DomainController.er.getEventList().get(number).setMaxPause(maxPause);
                DomainController.er.getEventList().get(number).setMouseX(x);
                DomainController.er.getEventList().get(number).setMouseY(y);
            }
            
            DomainController.hf.updateTable();
        }
        this.dispose();
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

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

    private void jToggleButtonGetMouseLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonGetMouseLocationActionPerformed
        this.requestFocus();
        if (jToggleButtonGetMouseLocation.isSelected())
        {
            t.start();
        }
        else
        {
            t.stop();
        }
    }//GEN-LAST:event_jToggleButtonGetMouseLocationActionPerformed

    private void jTextFieldPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPauseActionPerformed
        jButtonAdd.doClick();// TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPauseActionPerformed

    private void jTextFieldMinPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMinPauseActionPerformed
        this.jTextFieldMaxPause.requestFocus();// TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMinPauseActionPerformed

    private void jTextFieldMaxPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMaxPauseActionPerformed
        jButtonAdd.doClick();// TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMaxPauseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JCheckBox jCheckBoxRandomize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelX;
    private javax.swing.JLabel jLabelY;
    private javax.swing.JTextField jTextFieldMaxPause;
    private javax.swing.JTextField jTextFieldMinPause;
    private javax.swing.JTextField jTextFieldPause;
    private javax.swing.JToggleButton jToggleButtonGetMouseLocation;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyReleased(KeyEvent ke) {}
}
