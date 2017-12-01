/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupplierRole;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sumanth
 */
public class SupplierAddQuantityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplierAddQuantityJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    WorkRequest request;
    Organization org;
    UserAccount currentAccount;

    SupplierAddQuantityJPanel(JPanel userProcessContainer, UserAccount account, WorkRequest request, Organization org, UserAccount currentAccount) {
         initComponents();
         this.userProcessContainer = userProcessContainer;
         this.account = account;
         this.request = request;
         this.org = org;
         this.currentAccount = currentAccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reqQuantTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        submBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(reqQuantTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 140, -1));

        jLabel2.setText("Enter Quantity");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 109, 46));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        submBtn.setText("Submit");
        submBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submBtnActionPerformed(evt);
            }
        });
        add(submBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 130, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Adding Quantity");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 360, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SupplierCheckJPanel dwjp = (SupplierCheckJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submBtnActionPerformed
        String value = reqQuantTxt.getText();
        if (value.trim().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Please enter quantity");
            return;
        }
        try {
            int q = Integer.parseInt(value);
                org.getInventory().setQuantity(q);
                JOptionPane.showMessageDialog(null, "Quantity Sent successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter Integer Values");
            return;
        }
    }//GEN-LAST:event_submBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField reqQuantTxt;
    private javax.swing.JButton submBtn;
    // End of variables declaration//GEN-END:variables
}
