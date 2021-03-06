/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DistributorRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.SupplierOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MessageWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sumanth
 */
public class DistributorCheckJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    WorkRequest request;
    ArrayList<Organization> orgListDist;
    UserAccount currentAccount;

    /**
     * Creates new form RequestLabTestJPanel
     */
    public DistributorCheckJPanel(JPanel userProcessContainer, UserAccount account, WorkRequest request, ArrayList<Organization> orgListDist, UserAccount currentAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.request = request;
        this.orgListDist = orgListDist;
        this.currentAccount = currentAccount;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for (Organization o : orgListDist) {
            if (o.toString().equals(Organization.Type.Dealer.getValue())) {
                for (Employee e : o.getEmployeeDirectory().getEmployeeList()) {
                    if (o.getInventory().getVaccine().equals(request.getInventory().getVaccine())) {
                        Object[] row = new Object[4];
                        row[0] = e;
                        row[1] = o;
                        row[2] = o.getInventory().getVaccine();
                        row[3] = o.getInventory().getQuantity();
                        model.addRow(row);
                    }
                }
            }
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

        requestTestJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setText("Send Vaccine to Clinic");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 170, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Distributor Inventory");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 430, 30));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Organization", "Vaccine", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 760, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select Any Row");
            return;
        }
        int quantity = (int) workRequestJTable.getValueAt(selectedRow, 3);
        if (quantity <= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "There is no vaccine available for selected row. Do you want to send request to Supplier?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                if (request.getStatus().equals("Sent to Distributor")) {
                    //if (request.getOrganization() == null) {
                        //request.setOrganization((Organization) workRequestJTable.getValueAt(selectedRow, 1));
                        request.setSender(currentAccount);
                        request.setReceiver(null);
                        request.setStatus("Sent to Provider");
                        JOptionPane.showMessageDialog(null, "Request Sent to provider");
                    //} else {
                      //  JOptionPane.showMessageDialog(null, "Request has been sent to supplier already");
                        //return;
                    //}
                } else {
                    JOptionPane.showMessageDialog(null, "Request has already been sent/Not approved");
                    return;
                }
            }
        } else {
            Organization org = (Organization) workRequestJTable.getValueAt(selectedRow, 1);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("DistributorEnterQuantityJPanel", new DistributorEnterQuantityJPanel(userProcessContainer, account, request, org, currentAccount));
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DistributorWorkAreaJPanel dwjp = (DistributorWorkAreaJPanel) component;
        dwjp.populateTableAfter();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
