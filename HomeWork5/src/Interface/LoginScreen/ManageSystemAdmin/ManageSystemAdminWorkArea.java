/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.LoginScreen.ManageSystemAdmin;

import Business.Business;
import Business.SystemAdministration.Users;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Sumanth
 */
public class ManageSystemAdminWorkArea extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Business business;
    Users user;

    public ManageSystemAdminWorkArea(JPanel userProcessContainer, Business business, Users user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.user = user;
        userNameTxt.setText(user.getUserName());
        nameTxt.setText(user.getPerson().toString());
        roleTxt.setText(user.getRole());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        roleTxt = new javax.swing.JTextField();
        mngUserAccBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("UserName:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 80, 40));

        userNameTxt.setEnabled(false);
        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtActionPerformed(evt);
            }
        });
        add(userNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 150, 50));

        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, 40));

        nameTxt.setEnabled(false);
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 150, 50));

        jLabel3.setText("Role:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 80, 40));

        roleTxt.setEnabled(false);
        roleTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleTxtActionPerformed(evt);
            }
        });
        add(roleTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 150, 50));

        mngUserAccBtn.setText("Manage User Accounts >>");
        mngUserAccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngUserAccBtnActionPerformed(evt);
            }
        });
        add(mngUserAccBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 230, 80));
    }// </editor-fold>//GEN-END:initComponents

    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtActionPerformed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void roleTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleTxtActionPerformed

    private void mngUserAccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngUserAccBtnActionPerformed
         ManageSystemAdminJPanel panel = new ManageSystemAdminJPanel(userProcessContainer,business,user);
         userProcessContainer.add("ManageSystemAdminJPanel", panel);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         layout.next(userProcessContainer); 
    }//GEN-LAST:event_mngUserAccBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton mngUserAccBtn;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField roleTxt;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
