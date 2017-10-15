/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.LoginScreen.ManageSystemAdmin;

import Business.Business;
import Business.HumanResources.PersonDirectory.Person;
import Business.SystemAdministration.Users;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sumanth
 */
public class AddUserJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddUserJPanel
     */
    JPanel userProcessContainer;
    Business business;
    AddUserJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        List<String> listForCombo = new ArrayList();
        for(Person p:business.getPersonDirectory().getPersonDirectory()){
            listForCombo.add(p.toString());
        }
        listForCombo = listForCombo.stream().distinct().collect(Collectors.toList());
        for(String p:listForCombo){
            addUserCombo.addItem(p);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addUserCombo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        roleCombo = new javax.swing.JComboBox<>();
        userNameTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        saveUserBtn = new javax.swing.JButton();
        confirmPassTxt = new javax.swing.JPasswordField();
        passwordTxt = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add(addUserCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 120, 140, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("                            Add User Account Directory");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 410, 60));

        jLabel2.setText("Select Role");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 120, 40));

        jLabel3.setText("Select Person");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 120, 40));

        jLabel4.setText("UserName:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 120, 40));

        jLabel5.setText("Confirm Password:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 110, 40));

        roleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System Admin", "HR Admin" }));
        add(roleCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 130, 50));
        add(userNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 140, 40));

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
        add(confirmPassTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 140, 40));
        add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 140, 40));

        jLabel6.setText("Password:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 110, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageSystemAdminJPanel panel = (ManageSystemAdminJPanel) component;
        panel.populateJTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveUserBtnActionPerformed
        String newUserName = userNameTxt.getText();
        String password = passwordTxt.getText();
        String confirmPass = confirmPassTxt.getText();
        if(newUserName.trim().length() == 0 || password.trim().length() == 0 || confirmPass.trim().length() == 0 ){
            JOptionPane.showMessageDialog(null, "Please enter all the fields");
            return;
        }
        String passwordEncrypt = business.getEncryption().encrypt(password).toString();
        String confirmPassEncrypt = business.getEncryption().encrypt(confirmPass).toString();
        if(!passwordEncrypt.equals(confirmPassEncrypt)){
            JOptionPane.showMessageDialog(null, "Confirm Password did not match");
            return;
        }
        ArrayList<Users> userList = business.getUserAccountDirectory().getUserAccountDirectory();
        for(Users u:userList){
            if(u.getUserName().equals(newUserName)){
                JOptionPane.showMessageDialog(null, "UserName already exists. Please enter different username");
                return;
            }
        }
        Person personAdd = business.getPersonDirectory().addPerson();
        Users userAdd = business.getUserAccountDirectory().addUser();
        String getName = (String) addUserCombo.getSelectedItem().toString();
        String[] splitNames = getName.split("\\s+");
        personAdd.setfName(splitNames[0]);
        personAdd.setlName(splitNames[1]);
        userAdd.setUserName(newUserName);
        userAdd.setPassword(passwordEncrypt);
        userAdd.setAccountStatus("Active");
        userAdd.setRole((String) roleCombo.getSelectedItem());
        personAdd.setUser(userAdd);
        userNameTxt.setText("");
        passwordTxt.setText("");
        confirmPassTxt.setText("");        
        JOptionPane.showMessageDialog(null, "User Created Successfully");
    }//GEN-LAST:event_saveUserBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox addUserCombo;
    private javax.swing.JButton backBtn;
    private javax.swing.JPasswordField confirmPassTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JComboBox<String> roleCombo;
    private javax.swing.JButton saveUserBtn;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
