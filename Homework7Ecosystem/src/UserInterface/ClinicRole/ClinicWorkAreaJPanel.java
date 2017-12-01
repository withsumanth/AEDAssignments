/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ClinicRole;

import Business.Disease.Disease;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Inventory.Inventory;
import Business.Organization.ClinicOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Vaccine.Vaccine;
import Business.WorkQueue.WorkRequest;
import UserInterface.AdministrativeRole.ManageUserAccountJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sumanth
 */
public class ClinicWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClinicWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    ClinicOrganization clinicOrganization;
    Enterprise enterprise;
    EcoSystem system;

    public ClinicWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ClinicOrganization clinicOrganization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.clinicOrganization = clinicOrganization;
        this.enterprise = enterprise;
        this.system = system;
        enterPrText.setText(enterprise.getName());
        orgText.setText(clinicOrganization.getName());
        empNameTxt.setText(account.getEmployee().getName());
        populateVaccineCombo();
        populateDiseaseCombo();
    }

    public void populateVaccineCombo() {
        vaccineCombo.removeAllItems();
        for (Vaccine v : system.getVaccineCatalog().getVaccineCatalog()) {
            vaccineCombo.addItem(v);
        }
    }

    public void populateDiseaseCombo() {
        diseaseCombo.removeAllItems();
        for (Disease v : system.getDiseaseCatalog().getDiseaseCatalog()) {
            diseaseCombo.addItem(v);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        checkBtn = new javax.swing.JButton();
        diseaseCombo = new javax.swing.JComboBox();
        vaccineCombo = new javax.swing.JComboBox();
        enterpriseLabel = new javax.swing.JLabel();
        empNameTxt = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        enterPrText = new javax.swing.JLabel();
        enterpriseLabel2 = new javax.swing.JLabel();
        orgText = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Disease:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 60, 40));

        jLabel2.setText("Vaccine:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 80, 40));

        checkBtn.setText("Check In Inventory");
        checkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBtnActionPerformed(evt);
            }
        });
        add(checkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 170, 50));

        diseaseCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        diseaseCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diseaseComboActionPerformed(evt);
            }
        });
        add(diseaseCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 180, 30));

        vaccineCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        vaccineCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccineComboActionPerformed(evt);
            }
        });
        add(vaccineCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 180, 30));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Employee Name:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        empNameTxt.setText("<Value>");
        add(empNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 120, 20));

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel1.setText("EnterPrise :");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        enterPrText.setText("<value>");
        add(enterPrText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 120, 20));

        enterpriseLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel2.setText("Organization:");
        add(enterpriseLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 50, 130, -1));

        orgText.setText("<value>");
        add(orgText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 120, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void checkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBtnActionPerformed
        Inventory inv = clinicOrganization.getInventory();
        Vaccine v = (Vaccine) vaccineCombo.getSelectedItem();
        Disease d = (Disease) diseaseCombo.getSelectedItem();
        int quantity = 0;
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
            if (request.getInventory().getVaccine().equals(v)) {
                if (request.getStatus().equals("Approved and Sent to Clinic")) {
                    if (request.getInventory().getQuantity() > 0) {
                        quantity = request.getInventory().getQuantity();
                         break;
                    }
                }
            }
        }
        if (quantity <= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "There is no stock in the inventory. Please request CDC ", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                //Inventory newInv = new Inventory();
                //newInv.setVaccine(v);
                //newInv.setDisease(d);
                ClinicInventoryJPanel muajp = new ClinicInventoryJPanel(userProcessContainer, account, clinicOrganization, enterprise, system, v, d);
                userProcessContainer.add("ClinicInventoryJPanel", muajp);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Stock is available in inventory. Do you want to proceed with entering quantity?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                ClinicInventoryJPanel muajp = new ClinicInventoryJPanel(userProcessContainer, account, clinicOrganization, enterprise, system, v, d);
                userProcessContainer.add("ClinicInventoryJPanel", muajp);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                //stockPanel.setVisible(true);
                //quantTxt.setText(String.valueOf(inv.getQuantity()));
            }
        }
    }//GEN-LAST:event_checkBtnActionPerformed

    private void diseaseComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diseaseComboActionPerformed
    }//GEN-LAST:event_diseaseComboActionPerformed

    private void vaccineComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccineComboActionPerformed
    }//GEN-LAST:event_vaccineComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkBtn;
    private javax.swing.JComboBox diseaseCombo;
    private javax.swing.JLabel empNameTxt;
    private javax.swing.JLabel enterPrText;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel enterpriseLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel orgText;
    private javax.swing.JComboBox vaccineCombo;
    // End of variables declaration//GEN-END:variables
}
