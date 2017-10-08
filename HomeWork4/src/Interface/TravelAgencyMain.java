/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.TravelAgency;
import Interface.ManageAirlines.ManageAirlinersWorkAreaJPanel;
import Interface.ManageCustomers.ManageCustomersWorkAreaJPanel;
import Interface.ManageTravelAgency.ManageTravelAgencyWorkAreaJPanel;
import java.awt.CardLayout;

/**
 *
 * @author Sumanth
 */
public class TravelAgencyMain extends javax.swing.JFrame {

    /**
     * Creates new form TravelAgencyMain
     */
    private TravelAgency travelAgency;
    public TravelAgencyMain() {
        initComponents();
        travelAgency = new TravelAgency();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        mngTravelAgenybtn = new javax.swing.JButton();
        mngAirlineBtn = new javax.swing.JButton();
        ManageCustomers = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setLastDividerLocation(1);

        mngTravelAgenybtn.setText("Manage Travel Agency");
        mngTravelAgenybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngTravelAgenybtnActionPerformed(evt);
            }
        });

        mngAirlineBtn.setText("Manage Airlines");
        mngAirlineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngAirlineBtnActionPerformed(evt);
            }
        });

        ManageCustomers.setText("Manage Customers");
        ManageCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageCustomersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mngTravelAgenybtn, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(mngAirlineBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ManageCustomers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(mngTravelAgenybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mngAirlineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mngTravelAgenybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngTravelAgenybtnActionPerformed
        ManageTravelAgencyWorkAreaJPanel panel = new ManageTravelAgencyWorkAreaJPanel(userProcessContainer,travelAgency);
        userProcessContainer.add("ManageTravelAgencyWorkAreaJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);    
    }//GEN-LAST:event_mngTravelAgenybtnActionPerformed

    private void mngAirlineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngAirlineBtnActionPerformed
        ManageAirlinersWorkAreaJPanel panel = new ManageAirlinersWorkAreaJPanel(userProcessContainer,travelAgency);
        userProcessContainer.add("ManageAirlinersWorkAreaJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_mngAirlineBtnActionPerformed

    private void ManageCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageCustomersActionPerformed
        /*ManageCustomersWorkAreaJPanel panel = new ManageCustomersWorkAreaJPanel(userProcessContainer,travelAgency);
        userProcessContainer.add("ManageCustomersWorkAreaJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);*/
    }//GEN-LAST:event_ManageCustomersActionPerformed

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
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelAgencyMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageCustomers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton mngAirlineBtn;
    private javax.swing.JButton mngTravelAgenybtn;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
