/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import domain.DomainController;
import domain.Event;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Gebruiker
 */
public class AddClickFrame extends javax.swing.JFrame {

    int number = -1;
    /**
     * Creates new form AddClickFrame
     */
    public AddClickFrame() {
        initComponents();
    }
    
    public AddClickFrame(int i, String click, long minp, long maxp)
    {
        initComponents();
        switch (click)
        {
            case "left":
                this.buttonGroupClick.setSelected(this.jRadioButtonLeft.getModel(), true);
                break;
            case "middle":
                this.buttonGroupClick.setSelected(this.jRadioButtonMiddle.getModel(), true);
                break;
            case "right":
                this.buttonGroupClick.setSelected(this.jRadioButtonRight.getModel(), true);
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

        buttonGroupClick = new javax.swing.ButtonGroup();
        jRadioButtonLeft = new javax.swing.JRadioButton();
        jRadioButtonMiddle = new javax.swing.JRadioButton();
        jRadioButtonRight = new javax.swing.JRadioButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Click");

        buttonGroupClick.add(jRadioButtonLeft);
        jRadioButtonLeft.setSelected(true);
        jRadioButtonLeft.setText("Left Click");

        buttonGroupClick.add(jRadioButtonMiddle);
        jRadioButtonMiddle.setText("Middle Click");

        buttonGroupClick.add(jRadioButtonRight);
        jRadioButtonRight.setText("Right Click");

        jLabel1.setText("Pause:");

        jLabel2.setText("Min. Pause:");

        jLabel3.setText("Max.Pause:");

        jTextFieldPause.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldPause.setText("1");

        jTextFieldMinPause.setBackground(new java.awt.Color(153, 153, 153));
        jTextFieldMinPause.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldMinPause.setText("1");
        jTextFieldMinPause.setEnabled(false);

        jTextFieldMaxPause.setBackground(new java.awt.Color(153, 153, 153));
        jTextFieldMaxPause.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldMaxPause.setText("1");
        jTextFieldMaxPause.setEnabled(false);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonLeft)
                            .addComponent(jRadioButtonMiddle)
                            .addComponent(jRadioButtonRight))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPause)
                            .addComponent(jTextFieldMinPause)
                            .addComponent(jTextFieldMaxPause, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxRandomize))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonLeft)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldPause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jCheckBoxRandomize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonMiddle)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldMinPause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonRight)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldMaxPause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
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
        
        if (!jRadioButtonLeft.isSelected() && !jRadioButtonMiddle.isSelected() && !jRadioButtonRight.isSelected())
            JOptionPane.showMessageDialog(this, "You must select a type.", "Error", JOptionPane.ERROR_MESSAGE);
        else if (!jCheckBoxRandomize.isSelected() && jTextFieldPause.getText().length() == 0)
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
            if(number == -1)
                DomainController.addEvent(Event.Type.CLICK, minPause, maxPause, 0, 0, jRadioButtonLeft.isSelected(), jRadioButtonRight.isSelected(), jRadioButtonMiddle.isSelected(), "", "");
            else
            {
                DomainController.er.getEventList().get(number).setLeftClick(jRadioButtonLeft.isSelected());
                DomainController.er.getEventList().get(number).setMiddleClick(jRadioButtonMiddle.isSelected());
                DomainController.er.getEventList().get(number).setRightClick(jRadioButtonRight.isSelected());
                DomainController.er.getEventList().get(number).setMinPause(minPause);
                DomainController.er.getEventList().get(number).setMaxPause(maxPause);
            }
            DomainController.hf.updateTable();
        }
        this.dispose();
    }//GEN-LAST:event_jButtonAddActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddClickFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddClickFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddClickFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddClickFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddClickFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupClick;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JCheckBox jCheckBoxRandomize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButtonLeft;
    private javax.swing.JRadioButton jRadioButtonMiddle;
    private javax.swing.JRadioButton jRadioButtonRight;
    private javax.swing.JTextField jTextFieldMaxPause;
    private javax.swing.JTextField jTextFieldMinPause;
    private javax.swing.JTextField jTextFieldPause;
    // End of variables declaration//GEN-END:variables
}
