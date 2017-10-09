/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageAirlines;

import Business.Airline;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Sumanth
 */
public class ManageFlightWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageFlightWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Airline airline;
    TravelAgency travelAgency;
    ManageFlightWorkAreaJPanel(JPanel userProcessContainer, TravelAgency travelAgency, Airline airline) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.airline = airline;
        this.travelAgency = travelAgency;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        createFlightBtn = new javax.swing.JButton();
        viewFlightBtn = new javax.swing.JButton();
        backBtnMngFlight = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Manage Flights");

        createFlightBtn.setText("Create New Flights");
        createFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFlightBtnActionPerformed(evt);
            }
        });

        viewFlightBtn.setText("View Flights");
        viewFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFlightBtnActionPerformed(evt);
            }
        });

        backBtnMngFlight.setText("<<back");
        backBtnMngFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnMngFlightActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(109, 109, 109)
                            .addComponent(createFlightBtn))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(109, 109, 109)
                            .addComponent(viewFlightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(backBtnMngFlight))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(39, 39, 39)
                    .addComponent(createFlightBtn)
                    .addGap(29, 29, 29)
                    .addComponent(viewFlightBtn)
                    .addGap(58, 58, 58)
                    .addComponent(backBtnMngFlight)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFlightBtnActionPerformed
        // TODO add your handling code here:
        CreateNewFlightJPanel panel = new CreateNewFlightJPanel(userProcessContainer,travelAgency,airline);
        userProcessContainer.add("CreateNewFlightJPanel", panel);
        CardLayout layout2 = (CardLayout) userProcessContainer.getLayout();
        layout2.next(userProcessContainer);
    }//GEN-LAST:event_createFlightBtnActionPerformed

    private void viewFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFlightBtnActionPerformed
        // TODO add your handling code here:
        ViewFlightsJPanel panel = new ViewFlightsJPanel(userProcessContainer,travelAgency,airline);
        userProcessContainer.add("ViewFlightsJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewFlightBtnActionPerformed

    private void backBtnMngFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnMngFlightActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnMngFlightActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtnMngFlight;
    private javax.swing.JButton createFlightBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton viewFlightBtn;
    // End of variables declaration//GEN-END:variables
}