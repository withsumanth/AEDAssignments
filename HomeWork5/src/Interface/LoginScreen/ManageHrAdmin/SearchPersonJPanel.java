/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.LoginScreen.ManageHrAdmin;

import Business.Business;
import Business.HumanResources.PersonDirectory.Person;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sumanth
 */
public class SearchPersonJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Business business;
    SearchPersonJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
    }
    
    private void populateSearchTable(ArrayList<Person> personList) {
        DefaultTableModel dtm = (DefaultTableModel) searchPersonJTable.getModel();
        dtm.setRowCount(0);
        searchPersonJTable.getColumnModel().getColumn(0).setMinWidth(0);
        searchPersonJTable.getColumnModel().getColumn(0).setMaxWidth(0);
        searchPersonJTable.getColumnModel().getColumn(0).setWidth(0);
        ArrayList<Person> tempPersonDetails = new ArrayList();
        ArrayList<Person> getAllPersonDetails = personList;
        for(int i = 0;i<getAllPersonDetails.size();i++){
            if(getAllPersonDetails.get(i).getUser()!=null){
                tempPersonDetails.add(getAllPersonDetails.get(i));
            }else{
                boolean check = false;
                for(int j=i+1;j<getAllPersonDetails.size();j++){
                    if(getAllPersonDetails.get(i).getfName().equals(getAllPersonDetails.get(j).getfName()) && getAllPersonDetails.get(i).getlName().equals(getAllPersonDetails.get(j).getlName())){
                        if(getAllPersonDetails.get(j).getUser()!=null){
                            //tempPersonDetails.add(getAllPersonDetails.get(j));
                            check = true;
                            break;
                        }
                    }
                }
                if(!check){
                        tempPersonDetails.add(getAllPersonDetails.get(i));
                    }
            }
        }
        for (Person u : tempPersonDetails) {
            Object[] row = new Object[5];
            row[0] = u;
            row[1] = u.getfName();
            row[2] = u.getlName();
            if(u.getUser()==null){
                row[3] = "---";
            }else{
                row[3] = u.getUser().getUserName();
            }
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

        jLabel1 = new javax.swing.JLabel();
        fNameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchPersonJTable = new javax.swing.JTable();
        lNameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("                            Search Person Directory");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 410, 60));
        add(fNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 140, 50));

        jLabel2.setText("          Enter First Name: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 140, 40));

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 110, 30));

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        searchPersonJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "FirstName", "LastName", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(searchPersonJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 680, 119));
        add(lNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 140, 50));

        jLabel3.setText("       Enter Last Name: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 120, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) searchPersonJTable.getModel();
        String fName = fNameTxt.getText();
        String lName = lNameTxt.getText();
        if(fName.trim().length()==0 || lName.trim().length()==0){
            dtm.setRowCount(0);
            JOptionPane.showMessageDialog(null, "Please enter First Name and Last Name");
            return;
        }
        if (!(Pattern.matches("^[a-zA-Z]+$", fNameTxt.getText())) || !(Pattern.matches("^[a-zA-Z]+$", lNameTxt.getText()))) {
    JOptionPane.showMessageDialog(null, "Please enter a valid character for first name and last name");
    return;
}
        ArrayList<Person> userList = new ArrayList();
        for(Person p:business.getPersonDirectory().getPersonDirectory()){
            if(p.getfName().equals(fName) && p.getlName().equals(lName)){
                userList.add(p);
            }
        }
        if(userList.size()==0){
            dtm.setRowCount(0);
            JOptionPane.showMessageDialog(null, "First Name and Last Name entered is Invalid");
            return;
        }
        populateSearchTable(userList);
    }//GEN-LAST:event_searchBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField fNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lNameTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTable searchPersonJTable;
    // End of variables declaration//GEN-END:variables

}
