/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sumanth
 */
public class UpdateEnterpriseJpanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateEnterpriseJpanel
     */
    public UpdateEnterpriseJpanel() {
        
    }
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    UpdateEnterpriseJpanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vacName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(vacName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 73, 130, 30));

        jLabel1.setText("Network Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 73, 90, 30));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 203, -1, -1));

        addBtn.setText("Update");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 133, 90, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageEnterpriseJPanel sysAdminwjp = (ManageEnterpriseJPanel) component;
        sysAdminwjp.populateTable();
        sysAdminwjp.populateComboBox();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String name = vacName.getText();
        if(name.trim().length()==0){
            JOptionPane.showMessageDialog(null, "Please enter Enterprise Name");
            return;
        }
        enterprise.setName(name);
        JOptionPane.showMessageDialog(null, "Network Updated Successfully");
    }//GEN-LAST:event_addBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField vacName;
    // End of variables declaration//GEN-END:variables
}
