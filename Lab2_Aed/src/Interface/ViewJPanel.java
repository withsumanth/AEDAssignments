/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sumanth
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    private VitalSignHistory vitSignHist;
    public ViewJPanel(VitalSignHistory vitSignHist) {
        initComponents();
        this.vitSignHist = vitSignHist;
        populateJTable();
    }
    
    public void populateJTable(){
        DefaultTableModel defTabModel = (DefaultTableModel) tableVitSign.getModel();
        defTabModel.setRowCount(0);
        for(VitalSigns vs : vitSignHist.getVitSignHist() ){
            Object row[] = new Object[2];
            row[0] = vs;
            row[1] = vs.getBloodPre();
            defTabModel.addRow(row);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVitSign = new javax.swing.JTable();
        viewVitJBtn = new javax.swing.JButton();
        delVitJBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tempTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bloodPreTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pulseTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dateTxt = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View Vital Sign");

        tableVitSign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Blood Pressure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableVitSign);

        viewVitJBtn.setText("View Details");
        viewVitJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVitJBtnActionPerformed(evt);
            }
        });

        delVitJBtn.setText("Delete Details");
        delVitJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delVitJBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Temperature");

        tempTxt.setEnabled(false);
        tempTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempTxtActionPerformed(evt);
            }
        });

        jLabel3.setText("Blood Pressure");

        bloodPreTxt.setEnabled(false);
        bloodPreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodPreTxtActionPerformed(evt);
            }
        });

        jLabel4.setText("Pulse");

        pulseTxt.setEnabled(false);
        pulseTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulseTxtActionPerformed(evt);
            }
        });

        jLabel5.setText("Date");

        dateTxt.setEnabled(false);
        dateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(66, 66, 66)
                                .addComponent(pulseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(66, 66, 66)
                                .addComponent(bloodPreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(66, 66, 66)
                                .addComponent(tempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(66, 66, 66)
                                .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(viewVitJBtn))
                        .addGap(23, 23, 23)
                        .addComponent(delVitJBtn)))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewVitJBtn)
                    .addComponent(delVitJBtn))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bloodPreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pulseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void delVitJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delVitJBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableVitSign.getSelectedRow();
        if(selectedRow>=0){
            VitalSigns vitalSigns = (VitalSigns) tableVitSign.getValueAt(selectedRow, 0);
            vitSignHist.deleteVitalSigns(vitalSigns);
            JOptionPane.showMessageDialog(null, "Vital Sign deleted Successfully");
            populateJTable();
            emptyTextBox();
        }else{
            JOptionPane.showMessageDialog(null, "Please select any row");
        }
    }
        
    public void emptyTextBox(){
        tempTxt.setText("");
        bloodPreTxt.setText("");
        pulseTxt.setText("");
        dateTxt.setText("");
    }//GEN-LAST:event_delVitJBtnActionPerformed

    private void tempTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempTxtActionPerformed

    private void bloodPreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodPreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodPreTxtActionPerformed

    private void pulseTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulseTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pulseTxtActionPerformed

    private void dateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTxtActionPerformed

    private void viewVitJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVitJBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableVitSign.getSelectedRow();
        if(selectedRow>=0){
            VitalSigns vitalSigns = (VitalSigns) tableVitSign.getValueAt(selectedRow, 0);
            bloodPreTxt.setText(String.valueOf(vitalSigns.getBloodPre()));
            dateTxt.setText(vitalSigns.getDate());
            tempTxt.setText(String.valueOf(vitalSigns.getTemp()));
            pulseTxt.setText(String.valueOf(vitalSigns.getPulse()));
        }else{
            JOptionPane.showMessageDialog(null, "Please select any row");
        }
    }//GEN-LAST:event_viewVitJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bloodPreTxt;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JButton delVitJBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pulseTxt;
    private javax.swing.JTable tableVitSign;
    private javax.swing.JTextField tempTxt;
    private javax.swing.JButton viewVitJBtn;
    // End of variables declaration//GEN-END:variables
}
