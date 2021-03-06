/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.LoginScreen.ManageHrAdmin;

import Business.Business;
import Business.HumanResources.PersonDirectory.Person;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sumanth
 */
public class AddPersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPersonJPanel
     */
    JPanel userProcessContainer;
    Business business;
    AddPersonJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
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
        jLabel4 = new javax.swing.JLabel();
        lNameTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        saveUserBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        fNameTxt = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("                            Add Person Directory");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 410, 60));

        jLabel4.setText("First Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 120, 40));
        add(lNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 140, 40));

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        saveUserBtn.setText("Save");
        saveUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveUserBtnActionPerformed(evt);
            }
        });
        add(saveUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 80, 30));

        jLabel6.setText("Last Name");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 110, 40));
        add(fNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 140, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageHrAdminJPanel panel = (ManageHrAdminJPanel) component;
        panel.populateJTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveUserBtnActionPerformed
        String fName = fNameTxt.getText();
        String lName = lNameTxt.getText();
        if(fName.trim().length()==0 || lName.trim().length()==0){
            JOptionPane.showMessageDialog(null, "Please enter all the fields");
            return;
        }
        if (!(Pattern.matches("^[a-zA-Z]+$", fNameTxt.getText())) || !(Pattern.matches("^[a-zA-Z]+$", lNameTxt.getText()))) {
    JOptionPane.showMessageDialog(null, "Please enter a valid character for first name and last name");
    return;
}
        Person person = business.getPersonDirectory().addPerson();
        person.setfName(fName);
        person.setlName(lName);
        fNameTxt.setText("");
        lNameTxt.setText("");
        JOptionPane.showMessageDialog(null, "User Created Successfully");
    }//GEN-LAST:event_saveUserBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField fNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField lNameTxt;
    private javax.swing.JButton saveUserBtn;
    // End of variables declaration//GEN-END:variables
}
