/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SalesPerson;

import Business.AdminLogin;
import Business.Business;
import Business.SalesPerson;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author JAI JINENDRA
 */
public class SalesPersonWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SalesPersonWorkAreaJPanel
     */
   
    
    private JPanel userProcessContainer;
    Business business;
    SalesPerson salesPerson;
    
    public SalesPersonWorkAreaJPanel(JPanel userProcessContainer, Business business, SalesPerson salesPerson) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
        this.salesPerson = salesPerson;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageSupplierandSalesPerson = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageSupplierandSalesPerson.setText("Manage Suppliers and Sales Person >>");
        btnManageSupplierandSalesPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSupplierandSalesPersonActionPerformed(evt);
            }
        });
        add(btnManageSupplierandSalesPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Sales Person WorkArea");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 230, 45));

        jLabel2.setText("SalesPerson:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel3.setText("SalesPerson User id:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageSupplierandSalesPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSupplierandSalesPersonActionPerformed
        // TODO add your handling code here:
        //ManageSuppliers ms = new ManageSuppliers(userProcessContainer, supplierDirectory);
        //userProcessContainer.add("ManageSuppliers", ms);
        CardLayout layout =(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageSupplierandSalesPersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageSupplierandSalesPerson;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
