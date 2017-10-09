/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageAirlines;

import Business.Airline;
import Business.Seat;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sumanth
 */
public class ManageAirlinersWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirlinersWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private TravelAgency travelAgency;
    
    public ManageAirlinersWorkAreaJPanel(JPanel userProcessContainer, TravelAgency travelAgency) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.travelAgency = travelAgency;
        populateJTableForAirline();
    }

    public void populateJTableForAirline() {
        DefaultTableModel dtm = (DefaultTableModel) airlineJTable.getModel();
        dtm.setRowCount(0);
        for (Airline ta : travelAgency.getAirLineDir().getAirlineDir()) {
            Object[] row = new Object[4];
            row[0] = ta;
            row[1] = ta.getAirlinerId();
            row[2] = ta.getAirLineAddr();
            row[3] = ta.getTotalFlightperDay();
            dtm.addRow(row);
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

        createJBtn = new javax.swing.JButton();
        searchAirlineBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        airlineJTable = new javax.swing.JTable();
        searchAirlineTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        updateAirlinerBtn = new javax.swing.JButton();
        mngflightBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        searchAirlTable = new javax.swing.JTable();
        deleteAirlineBtn = new javax.swing.JButton();

        createJBtn.setText("Create New Airliners");
        createJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJBtnActionPerformed(evt);
            }
        });

        searchAirlineBtn.setText("Search Airliners");
        searchAirlineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAirlineBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Search Airliners Results");

        airlineJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airline Name", "Airline Id", "Airline Address", "Number of Flights per Day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(airlineJTable);

        jLabel2.setText("Airliners");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Manage Airliners");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("All Airliners");

        updateAirlinerBtn.setText("View Airline");
        updateAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAirlinerBtnActionPerformed(evt);
            }
        });

        mngflightBtn.setText("Select and Manage Flights");
        mngflightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngflightBtnActionPerformed(evt);
            }
        });

        searchAirlTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airline Name", "Airline Id", "Airline Address", "Number of Flights per Day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(searchAirlTable);

        deleteAirlineBtn.setText("Delete Airline");
        deleteAirlineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAirlineBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(mngflightBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(createJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(updateAirlinerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteAirlineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchAirlineTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(searchAirlineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createJBtn)
                    .addComponent(updateAirlinerBtn)
                    .addComponent(deleteAirlineBtn))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchAirlineTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchAirlineBtn))
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(mngflightBtn)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJBtnActionPerformed
        // TODO add your handling code here:
        CreateNewAirlinersJPanel panel = new CreateNewAirlinersJPanel(userProcessContainer, travelAgency);
        userProcessContainer.add("CreateNewAirlinersJPanel", panel);
        CardLayout layout1 = (CardLayout) userProcessContainer.getLayout();
        layout1.next(userProcessContainer);

    }//GEN-LAST:event_createJBtnActionPerformed

    private void searchAirlineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAirlineBtnActionPerformed
        String airlinerName = searchAirlineTxtField.getText();
        if (airlinerName.trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please enter Airliner Name");
            return;
        }
        Airline result = travelAgency.getAirLineDir().searchAirline(airlinerName);
        if (result == null) {
            JOptionPane.showMessageDialog(null, "Airliner Name entered is Invalid");
            return;
        } else {
            ArrayList<Airline> airLineValues = new ArrayList();
            ArrayList<Airline> listOfAirlines = travelAgency.getAirLineDir().getAirlineDir();
            int count = 0;
            for (int i = 0; i < listOfAirlines.size(); i++) {
                if (listOfAirlines.get(i).getName().equals(airlinerName)) {
                    airLineValues.add(count, listOfAirlines.get(i));
                    count++;
                }
            }
            populateJTable1(airLineValues);
        }

    }//GEN-LAST:event_searchAirlineBtnActionPerformed

    public void populateJTable1(ArrayList<Airline> populateArrayList) {
        DefaultTableModel tabMod = (DefaultTableModel) searchAirlTable.getModel();
        tabMod.setRowCount(0);
        for (Airline ad : populateArrayList) {
            Object row[] = new Object[4];
            row[0] = ad;
            row[1] = ad.getAirlinerId();
            row[2] = ad.getAirLineAddr();
            row[3] = ad.getTotalFlightperDay();
            tabMod.addRow(row);
        }
    }

    private void mngflightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngflightBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = searchAirlTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select Any Row");
            return;
        } else {
            Airline airline = (Airline) searchAirlTable.getValueAt(selectedRow, 0);
            ManageFlightWorkAreaJPanel panel = new ManageFlightWorkAreaJPanel(userProcessContainer,travelAgency, airline);
            userProcessContainer.add("ManageFlightWorkAreaJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_mngflightBtnActionPerformed

    private void updateAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAirlinerBtnActionPerformed
        int selectedRow = airlineJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select Any Row");
            return;
        } else {
            Airline airline = (Airline) airlineJTable.getValueAt(selectedRow, 0);
            UpdateAirlineJPanel panel = new UpdateAirlineJPanel(userProcessContainer, airline);
            userProcessContainer.add("UpdateAirlineJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_updateAirlinerBtnActionPerformed

    private void deleteAirlineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAirlineBtnActionPerformed
        int selectedRow = airlineJTable.getSelectedRow();
        if(selectedRow>=0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null,"Would you like to delete the account details", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                Airline airline = (Airline) airlineJTable.getValueAt(selectedRow,0);
                travelAgency.getAirLineDir().deleteDetails(airline);
                populateJTableForAirline();
                DefaultTableModel tabMod = (DefaultTableModel) searchAirlTable.getModel();
                tabMod.setRowCount(0);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please Select Any Row","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteAirlineBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable airlineJTable;
    private javax.swing.JButton createJBtn;
    private javax.swing.JButton deleteAirlineBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton mngflightBtn;
    private javax.swing.JTable searchAirlTable;
    private javax.swing.JButton searchAirlineBtn;
    private javax.swing.JTextField searchAirlineTxtField;
    private javax.swing.JButton updateAirlinerBtn;
    // End of variables declaration//GEN-END:variables

}