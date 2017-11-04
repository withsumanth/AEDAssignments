/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SalesPerson;

import Business.Business;
import Business.Customer;
import Business.CustomerDirectory;
import Business.Market;
import Business.SalesPerson;
import Business.Supplier;
import Interface.AdminLogin.ManageSalesPerson;
import Interface.AdminLogin.ManageSupplierJPanel;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Scarstruck4
 */
public class MarketAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MarketAreaJPanel
     */
    JPanel userProcessContainer;
    Business business;
    SalesPerson salesPerson;
    public MarketAreaJPanel(JPanel userProcessContainer, Business business, SalesPerson salesPerson) {
         initComponents();
         this.userProcessContainer=userProcessContainer;
         this.business=business;
         this.salesPerson=salesPerson;
         salesPersonTxt.setText(salesPerson.getSalesUserName());
         if(business.getMarketDirectory().getMarketDirectory().size()==0){
            addAllMarkets();
            ArrayList<Market> market = business.getMarketDirectory().getMarketDirectory();
            for(Market m:market){
                addAllCustomers(m.getMarketName(),m);
            }
           }
         marketComboBox.removeAllItems();
         for (Market s : business.getMarketDirectory().getMarketDirectory()) {
            marketComboBox.addItem(s);
         }
    }

    public void addAllMarkets(){
        String csvFile = "Market.csv";
	        BufferedReader bufferedReader = null;
	        String line = "";
	        String cvsSplitBy = ",";
	        try {
	            bufferedReader = new BufferedReader(new FileReader(csvFile));
                    ArrayList<String[]> dataCsvArr = new ArrayList();
                    int count = 0;
	            while ((line = bufferedReader.readLine()) != null) {
	                String[] dataFromCsv = line.split(cvsSplitBy);
                        dataCsvArr.add(count,dataFromCsv);
                        count++;
	            }
                    for(int i=1;i<dataCsvArr.size();i++){
                        Market marketDet = business.getMarketDirectory().addMarket();
                        String valuesOfArray[] = dataCsvArr.get(i);
                        marketDet.setMarketName(valuesOfArray[0]);
                    }
	            bufferedReader.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	  } catch (IOException ex) {
               Logger.getLogger(ManageSupplierJPanel.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
    
    public void addAllCustomers(String marketName,Market market){
        String csvFile = marketName+".csv";
	        BufferedReader bufferedReader = null;
	        String line = "";
	        String cvsSplitBy = ",";
	        try {
	            bufferedReader = new BufferedReader(new FileReader(csvFile));
                    ArrayList<String[]> dataCsvArr = new ArrayList();
                    int count = 0;
	            while ((line = bufferedReader.readLine()) != null) {
	                String[] dataFromCsv = line.split(cvsSplitBy);
                        dataCsvArr.add(count,dataFromCsv);
                        count++;
	            }
                    for(int i=1;i<dataCsvArr.size();i++){
                        Customer cust = market.getCustomerDirectory().addCustomer();
                        String valuesOfArray[] = dataCsvArr.get(i);
                        cust.setCustomerName(valuesOfArray[0]);
                    }
	            bufferedReader.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	  } catch (IOException ex) {
               Logger.getLogger(ManageSupplierJPanel.class.getName()).log(Level.SEVERE, null, ex);
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
        marketComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        customerComboBox = new javax.swing.JComboBox();
        browseBtn = new javax.swing.JButton();
        selectBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        salesPersonTxt = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Select a Market:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        marketComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                marketComboBoxItemStateChanged(evt);
            }
        });
        marketComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marketComboBoxActionPerformed(evt);
            }
        });
        add(marketComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 240, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Sales Person Market Area");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 300, -1));

        jLabel3.setText("Select a Customer:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        customerComboBox.setEnabled(false);
        add(customerComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 350, -1));

        browseBtn.setText("Browse and Select Products >>");
        browseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtnActionPerformed(evt);
            }
        });
        add(browseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 330, 280, -1));

        selectBtn.setText("Select");
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });
        add(selectBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 80, -1));

        jLabel4.setText("Sales Person UserName");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 30));

        salesPersonTxt.setEnabled(false);
        add(salesPersonTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void marketComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marketComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marketComboBoxActionPerformed

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed
        customerComboBox.setEnabled(true);
        customerComboBox.removeAllItems();
        Market getSelectedMarket = (Market) marketComboBox.getSelectedItem();
        ArrayList<Customer> getAllCustomer = getSelectedMarket.getCustomerDirectory().getCustomerCatalogue();
        for (Customer s : getAllCustomer) {
            customerComboBox.addItem(s);
        }
    }//GEN-LAST:event_selectBtnActionPerformed

    private void marketComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_marketComboBoxItemStateChanged
        customerComboBox.setEnabled(false);
        customerComboBox.removeAllItems();
    }//GEN-LAST:event_marketComboBoxItemStateChanged

    private void browseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtnActionPerformed
        Market market = (Market) marketComboBox.getSelectedItem();
        Customer customer = (Customer) customerComboBox.getSelectedItem();
        if(market==null || customer==null){
            JOptionPane.showMessageDialog(null, "Please select Market and customer");
        }
        BrowseProducts panel = new BrowseProducts(userProcessContainer,business,market,customer, business.getMasterOrderCatalog(),salesPerson);
        userProcessContainer.add("BrowseProducts", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_browseBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseBtn;
    private javax.swing.JComboBox customerComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox marketComboBox;
    private javax.swing.JTextField salesPersonTxt;
    private javax.swing.JButton selectBtn;
    // End of variables declaration//GEN-END:variables
}
