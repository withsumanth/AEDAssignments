/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Sumanth
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        airDetTable = new javax.swing.JTable();
        viewAirDetJBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        yearOfManLabel3 = new javax.swing.JLabel();
        numOfSeatsLabel3 = new javax.swing.JLabel();
        serNoLabel3 = new javax.swing.JLabel();
        modelNoLabel3 = new javax.swing.JLabel();
        timeOfFleetCatLabel3 = new javax.swing.JLabel();
        maintCertExpLabel3 = new javax.swing.JLabel();
        availablityLabel3 = new javax.swing.JLabel();
        airportNameLabel9 = new javax.swing.JLabel();
        airplaneNameTxt3 = new javax.swing.JTextField();
        yearOfManTxt3 = new javax.swing.JTextField();
        numOfSeatsTxt3 = new javax.swing.JTextField();
        serNoTxt3 = new javax.swing.JTextField();
        modelNoTxt3 = new javax.swing.JTextField();
        airplaneNameLabel3 = new javax.swing.JLabel();
        timeOfFleetCatTxt3 = new javax.swing.JTextField();
        airportNameTxt3 = new javax.swing.JTextField();
        maintCertExpChkBox3 = new javax.swing.JCheckBox();
        availablityChkBox3 = new javax.swing.JCheckBox();
        airportNameLabel10 = new javax.swing.JLabel();
        manuNameTxt3 = new javax.swing.JTextField();
        airportNameLabel11 = new javax.swing.JLabel();
        dateOfFlyTxt3 = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("View Airplane Details");

        airDetTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airplane Name", "Date of Departure", "Serial Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(airDetTable);

        viewAirDetJBtn.setText("View");

        jButton2.setText("Update");

        yearOfManLabel3.setText("  Year of Manufacture: ");

        numOfSeatsLabel3.setText("Number of Seats:");

        serNoLabel3.setText("Serail Number:");

        modelNoLabel3.setText("Model Number:");

        timeOfFleetCatLabel3.setText("Fleet Catalog updated Date:");

        maintCertExpLabel3.setText("Maintainance Certficate Expired:");

        availablityLabel3.setText("Availablity of Airplane:");

        airportNameLabel9.setText("Airport Name:");

        airplaneNameTxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airplaneNameTxt3ActionPerformed(evt);
            }
        });

        airplaneNameLabel3.setText("Airplane Name:");

        availablityChkBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availablityChkBox3ActionPerformed(evt);
            }
        });

        airportNameLabel10.setText("Manufacturer Name:");

        airportNameLabel11.setText("Date of Departure:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewAirDetJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(airplaneNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numOfSeatsLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serNoLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelNoLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearOfManLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(modelNoTxt3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(serNoTxt3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numOfSeatsTxt3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yearOfManTxt3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(airplaneNameTxt3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(airportNameLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(availablityLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(timeOfFleetCatLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(maintCertExpLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(airportNameLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(airportNameLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(maintCertExpChkBox3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(availablityChkBox3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manuNameTxt3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(airportNameTxt3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateOfFlyTxt3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timeOfFleetCatTxt3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewAirDetJBtn)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(airplaneNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(airplaneNameTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearOfManLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearOfManTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numOfSeatsLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numOfSeatsTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serNoLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serNoTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelNoLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelNoTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(timeOfFleetCatLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeOfFleetCatTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maintCertExpLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maintCertExpChkBox3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(availablityLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availablityChkBox3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(airportNameLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(airportNameTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(manuNameTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(airportNameLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateOfFlyTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(airportNameLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(191, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void airplaneNameTxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airplaneNameTxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airplaneNameTxt3ActionPerformed

    private void availablityChkBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availablityChkBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availablityChkBox3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable airDetTable;
    private javax.swing.JLabel airplaneNameLabel;
    private javax.swing.JLabel airplaneNameLabel1;
    private javax.swing.JLabel airplaneNameLabel2;
    private javax.swing.JLabel airplaneNameLabel3;
    private javax.swing.JTextField airplaneNameTxt;
    private javax.swing.JTextField airplaneNameTxt1;
    private javax.swing.JTextField airplaneNameTxt2;
    private javax.swing.JTextField airplaneNameTxt3;
    private javax.swing.JLabel airportNameLabel;
    private javax.swing.JLabel airportNameLabel1;
    private javax.swing.JLabel airportNameLabel10;
    private javax.swing.JLabel airportNameLabel11;
    private javax.swing.JLabel airportNameLabel2;
    private javax.swing.JLabel airportNameLabel3;
    private javax.swing.JLabel airportNameLabel4;
    private javax.swing.JLabel airportNameLabel5;
    private javax.swing.JLabel airportNameLabel6;
    private javax.swing.JLabel airportNameLabel7;
    private javax.swing.JLabel airportNameLabel8;
    private javax.swing.JLabel airportNameLabel9;
    private javax.swing.JTextField airportNameTxt;
    private javax.swing.JTextField airportNameTxt1;
    private javax.swing.JTextField airportNameTxt2;
    private javax.swing.JTextField airportNameTxt3;
    private javax.swing.JCheckBox availablityChkBox;
    private javax.swing.JCheckBox availablityChkBox1;
    private javax.swing.JCheckBox availablityChkBox2;
    private javax.swing.JCheckBox availablityChkBox3;
    private javax.swing.JLabel availablityLabel;
    private javax.swing.JLabel availablityLabel1;
    private javax.swing.JLabel availablityLabel2;
    private javax.swing.JLabel availablityLabel3;
    private javax.swing.JTextField dateOfFlyTxt;
    private javax.swing.JTextField dateOfFlyTxt1;
    private javax.swing.JTextField dateOfFlyTxt2;
    private javax.swing.JTextField dateOfFlyTxt3;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelFromData;
    private javax.swing.JPanel jPanelFromData1;
    private javax.swing.JPanel jPanelFromData2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox maintCertExpChkBox;
    private javax.swing.JCheckBox maintCertExpChkBox1;
    private javax.swing.JCheckBox maintCertExpChkBox2;
    private javax.swing.JCheckBox maintCertExpChkBox3;
    private javax.swing.JLabel maintCertExpLabel;
    private javax.swing.JLabel maintCertExpLabel1;
    private javax.swing.JLabel maintCertExpLabel2;
    private javax.swing.JLabel maintCertExpLabel3;
    private javax.swing.JTextField manuNameTxt;
    private javax.swing.JTextField manuNameTxt1;
    private javax.swing.JTextField manuNameTxt2;
    private javax.swing.JTextField manuNameTxt3;
    private javax.swing.JLabel modelNoLabel;
    private javax.swing.JLabel modelNoLabel1;
    private javax.swing.JLabel modelNoLabel2;
    private javax.swing.JLabel modelNoLabel3;
    private javax.swing.JTextField modelNoTxt;
    private javax.swing.JTextField modelNoTxt1;
    private javax.swing.JTextField modelNoTxt2;
    private javax.swing.JTextField modelNoTxt3;
    private javax.swing.JLabel numOfSeatsLabel;
    private javax.swing.JLabel numOfSeatsLabel1;
    private javax.swing.JLabel numOfSeatsLabel2;
    private javax.swing.JLabel numOfSeatsLabel3;
    private javax.swing.JTextField numOfSeatsTxt;
    private javax.swing.JTextField numOfSeatsTxt1;
    private javax.swing.JTextField numOfSeatsTxt2;
    private javax.swing.JTextField numOfSeatsTxt3;
    private javax.swing.JLabel serNoLabel;
    private javax.swing.JLabel serNoLabel1;
    private javax.swing.JLabel serNoLabel2;
    private javax.swing.JLabel serNoLabel3;
    private javax.swing.JTextField serNoTxt;
    private javax.swing.JTextField serNoTxt1;
    private javax.swing.JTextField serNoTxt2;
    private javax.swing.JTextField serNoTxt3;
    private javax.swing.JLabel timeOfFleetCatLabel;
    private javax.swing.JLabel timeOfFleetCatLabel1;
    private javax.swing.JLabel timeOfFleetCatLabel2;
    private javax.swing.JLabel timeOfFleetCatLabel3;
    private javax.swing.JTextField timeOfFleetCatTxt;
    private javax.swing.JTextField timeOfFleetCatTxt1;
    private javax.swing.JTextField timeOfFleetCatTxt2;
    private javax.swing.JTextField timeOfFleetCatTxt3;
    private javax.swing.JButton viewAirDetJBtn;
    private javax.swing.JLabel yearOfManLabel;
    private javax.swing.JLabel yearOfManLabel1;
    private javax.swing.JLabel yearOfManLabel2;
    private javax.swing.JLabel yearOfManLabel3;
    private javax.swing.JTextField yearOfManTxt;
    private javax.swing.JTextField yearOfManTxt1;
    private javax.swing.JTextField yearOfManTxt2;
    private javax.swing.JTextField yearOfManTxt3;
    // End of variables declaration//GEN-END:variables
}
