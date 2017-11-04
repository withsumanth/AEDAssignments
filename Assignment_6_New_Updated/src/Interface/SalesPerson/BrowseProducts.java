/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SalesPerson;

import Business.Business;
import Business.Customer;
import Business.Market;
import Business.MarketOffer;
import Business.MasterOrderCatalog;
import Business.OrderList;
import Business.Order;
import Business.Product;
import Business.SalesPerson;
import Business.Supplier;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Scarstruck4
 */
public class BrowseProducts extends javax.swing.JPanel {

    /**
     * Creates new form BrowseProucts
     */
    JPanel userProcessContainer;
    SupplierDirectory supplierDirectory;
    MasterOrderCatalog masterOrderCatalog;
    OrderList orderList;
    Market market;
    Customer customer;
    Business business;
    SalesPerson salesPerson;

    private boolean isCheckedOut = false;

    /**
     * Creates new form BrowseProducts
     */
    public BrowseProducts(JPanel userProcessContainer, Business business, Market market, Customer customer, MasterOrderCatalog masterOrderCatalog, SalesPerson salesPerson) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplierDirectory = supplierDirectory;
        this.masterOrderCatalog = masterOrderCatalog;
        this.business = business;
        this.salesPerson = salesPerson;
        this.customer = customer;
        this.market = market;
        salesPersTxt.setText(salesPerson.getSalesUserName());
        custNameTxt.setText(customer.getCustomerName());
        markNameTxt.setText(market.getMarketName());
        if (!isCheckedOut) {
            orderList = new OrderList();
        }
        populateSupplierCombo();
        if (customer != null) {
            getAllOffers();
        }
    }

    public void getAllOffers() {
        Map<MarketOffer, String> map = new HashMap();
        for (Supplier s : business.getSupplierDir().getSupplierDir()) {
            for (Product p : s.getProductCatalag().getProductCatalogDir()) {
                for (MarketOffer m : p.getMarketOfferCatalogue().getOfferCatalogue()) {
                    map.put(m, m.getOfferPrice());
                }
                if (map.size() != 0) {
                    break;
                }
            }
        }
        ArrayList<MarketOffer> offers = new ArrayList();
        for (Map.Entry<MarketOffer, String> entry : map.entrySet()) {
            if (market.getMarketName().equals("Educational")) {
                if (entry.getValue().equals("Floor")) {
                    offers.add(entry.getKey());
                }
            } else if (market.getMarketName().equals("Sports")) {
                if (entry.getValue().equals("Target Price")) {
                    offers.add(entry.getKey());
                }
            } else if (market.getMarketName().equals("Automotive")) {
                if (entry.getValue().equals("Ceil")) {
                    offers.add(entry.getKey());
                }
            } else if (market.getMarketName().equals("Transportation")) {
                if (entry.getValue().equals("Actual Price")) {
                    offers.add(entry.getKey());
                }
            } else if (market.getMarketName().equals("Ecommerce")) {
                if (entry.getValue().equals("Target Price")) {
                    offers.add(entry.getKey());
                }
            } else if (market.getMarketName().equals("Media")) {
                if (entry.getValue().equals("Actual Price")) {
                    offers.add(entry.getKey());
                }
            } else if (market.getMarketName().equals("Government")) {
                if (entry.getValue().equals("Floor")) {
                    offers.add(entry.getKey());
                }
            } else if (market.getMarketName().equals("Military")) {
                if (entry.getValue().equals("Floor")) {
                    offers.add(entry.getKey());
                }
            } else if (market.getMarketName().equals("Medical")) {
                if (entry.getValue().equals("Ceil")) {
                    offers.add(entry.getKey());
                }
            } else if (market.getMarketName().equals("Aerospace")) {
                if (entry.getValue().equals("Target Price")) {
                    offers.add(entry.getKey());
                }
            } else if (market.getMarketName().equals("Banking")) {
                if (entry.getValue().equals("Ceil")) {
                    offers.add(entry.getKey());
                }
            } else if (market.getMarketName().equals("Entertainment")) {
                if (entry.getValue().equals("Ceil")) {
                    offers.add(entry.getKey());
                }
            } else if (market.getMarketName().equals("Music")) {
                if (entry.getValue().equals("Target Price")) {
                    offers.add(entry.getKey());
                }
            } else if (market.getMarketName().equals("Tourism")) {
                if (entry.getValue().equals("Actual Price")) {
                    offers.add(entry.getKey());
                }
            } else if (market.getMarketName().equals("Agricultural")) {
                if (entry.getValue().equals("Floor")) {
                    offers.add(entry.getKey());
                }
            }
        }
        offerCombBox.removeAllItems();
        HashSet<MarketOffer> hashSet = new HashSet<MarketOffer>(offers);
        List<MarketOffer> uniqueList = new ArrayList<MarketOffer>();
        for(int i=0;i<offers.size();i++){
                for(int j=i+1;j<offers.size();j++){
                    if(offers.get(i).getOfferName().equals(offers.get(j).getOfferName())){
                        offers.remove(j);
                        j--;
                    }
                }
            }
        for (MarketOffer s : offers) {
            offerCombBox.addItem(s);
        }
    }

    public void populateSupplierCombo() {

        suppComboBox.removeAllItems();

        for (Supplier s : business.getSupplierDir().getSupplierDir()) {
            suppComboBox.addItem(s);
        }

        populateTable();

    }

    public void refreshOrderTable() {

        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        model.setRowCount(0);

        for (Order oi : orderList.getOrderList()) {

            Object row[] = new Object[4];
            row[0] = oi;
            row[1] = oi.getSalesPrice();
            row[2] = oi.getQuantity();
            row[3] = oi.getQuantity() * oi.getSalesPrice();
            model.addRow(row);
        }
    }

    public void refreshProductTable(String prodName) {

        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        model.setRowCount(0);
        Supplier selSupp = (Supplier) suppComboBox.getSelectedItem();
        List<Product> selectedList = selSupp.getProductCatalag().getProductCatalogDir();
        for (Product p : selectedList) {
            if (p.getProdName().equalsIgnoreCase(prodName)) {
                Object row[] = new Object[4];
                row[0] = p;
                row[1] = p.getModelNumber();
                row[2] = p.getPrice();
                row[3] = p.getAvail();
                model.addRow(row);
            }
        }

    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        model.setRowCount(0);
        Supplier supplier = (Supplier) suppComboBox.getSelectedItem();
        for (Product p : supplier.getProductCatalag().getProductCatalogDir()) {
            Object row[] = new Object[4];
            row[0] = p;
            row[1] = p.getModelNumber();
            row[2] = p.getPrice();
            row[3] = p.getAvail();
            model.addRow(row);
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
        productTable = new javax.swing.JTable();
        suppComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        viewProdjButton2 = new javax.swing.JButton();
        addtoCartButton6 = new javax.swing.JButton();
        quantitySpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        btnSearchProduct = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        btnViewOrderItem = new javax.swing.JButton();
        btnModifyQuantity = new javax.swing.JButton();
        btnRemoveOrderItem = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        txtSearchKeyWord = new javax.swing.JTextField();
        txtNewQuantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        salesPersTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        custNameTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        markNameTxt = new javax.swing.JTextField();
        offerCombBox = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Welcome to the Catalog!");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 250, 50));

        productTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product Id", "Actual Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 720, 100));

        suppComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppComboBoxActionPerformed(evt);
            }
        });
        add(suppComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 290, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Supplier");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 110, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Supplier Product Catalog");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 240, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 100, -1));

        viewProdjButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        viewProdjButton2.setText("View Product Detail");
        viewProdjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProdjButton2ActionPerformed(evt);
            }
        });
        add(viewProdjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 160, -1));

        addtoCartButton6.setText("ADD TO CART");
        addtoCartButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtoCartButton6ActionPerformed(evt);
            }
        });
        add(addtoCartButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, -1, -1));

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(quantitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 80, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, -1, -1));

        btnSearchProduct.setText("Search Product");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });
        add(btnSearchProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Item in cart");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Net Price", "Quantity", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 580, 110));

        btnViewOrderItem.setText("View Item");
        btnViewOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderItemActionPerformed(evt);
            }
        });
        add(btnViewOrderItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, -1));

        btnModifyQuantity.setText("Modify Quantity");
        btnModifyQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyQuantityActionPerformed(evt);
            }
        });
        add(btnModifyQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 610, -1, -1));

        btnRemoveOrderItem.setText("Remove");
        btnRemoveOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOrderItemActionPerformed(evt);
            }
        });
        add(btnRemoveOrderItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 610, -1, -1));

        btnCheckOut.setText("CHECK OUT");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });
        add(btnCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 610, -1, -1));
        add(txtSearchKeyWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 110, -1));
        add(txtNewQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 70, -1));

        jLabel4.setText("Sales Person UserName");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, 30));

        salesPersTxt.setEnabled(false);
        add(salesPersTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 110, 30));

        jLabel8.setText("Customer Name");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, 30));

        custNameTxt.setEnabled(false);
        add(custNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 280, 30));

        jLabel9.setText("Market Name");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 80, 30));

        markNameTxt.setEnabled(false);
        add(markNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 210, 30));

        add(offerCombBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 200, -1));

        jLabel10.setText("Select Offer");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 90, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void suppComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppComboBoxActionPerformed
        populateTable();
    }//GEN-LAST:event_suppComboBoxActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        if(orderTable.getRowCount()<=0){
            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please Checkout/Remove items selected in the card", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void viewProdjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProdjButton2ActionPerformed
        // TODO add your handling code here:
        int row = productTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Product p = (Product) productTable.getValueAt(row, 0);
        ViewProductDetailJPanel vpdjp = new ViewProductDetailJPanel(userProcessContainer, p);
        userProcessContainer.add("ViewProductDetailJPanelCust", vpdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_viewProdjButton2ActionPerformed

    private void addtoCartButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtoCartButton6ActionPerformed
        // TODO add your handling code here:
        int selectedROw = productTable.getSelectedRow();

        if (selectedROw < 0) {
            JOptionPane.showMessageDialog(null, "Please Select the Row");
            return;
        }
        Product selectedProduct = (Product) productTable.getValueAt(selectedROw, 0);
        int fetchQty = (Integer) quantitySpinner.getValue();
        if (fetchQty <= 0) {
            JOptionPane.showMessageDialog(null, "Quantity cannot be Zero");
            return;
        }

        double price = getPriceFromOffer(selectedProduct.getPrice());
        if(price==0.0000000){
            JOptionPane.showMessageDialog(null, "Please request admin to give offers for products", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (fetchQty <= selectedProduct.getAvail()) {
            boolean alreadyPresent = false;
            for (Order oi : orderList.getOrderList()) {
                if (oi.getProduct() == selectedProduct) {
                    int oldAvailability = selectedProduct.getAvail();
                    int newAvailability = oldAvailability - fetchQty;
                    selectedProduct.setAvail(newAvailability);
                    oi.setQuantity(fetchQty + oi.getQuantity());
                    alreadyPresent = true;
                    populateTable();
                    refreshOrderTable();
                    break;
                }
            }
            if (!alreadyPresent) {
                int oldAvailability = selectedProduct.getAvail();
                int newAvailability = oldAvailability - fetchQty;
                selectedProduct.setAvail(newAvailability);
                orderList.addOrderItem(selectedProduct, fetchQty, price, salesPerson, customer, market, (MarketOffer) offerCombBox.getSelectedItem());
                populateTable();
                refreshOrderTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Quantity is greater than the listed Qty", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

    }//GEN-LAST:event_addtoCartButton6ActionPerformed

    private double getPriceFromOffer(int price) {
        MarketOffer offer = (MarketOffer) offerCombBox.getSelectedItem();
        if(offer!=null){
            if (offer.getOfferPrice().equals("Floor")) {
                return price * 0.5;
            } else if (offer.getOfferPrice().equals("Ceil")) {
                return price * 1.5;
            } else if (offer.getOfferPrice().equals("Target Price")) {
                return price * 1.2;
            } else if (offer.getOfferPrice().equals("Actual Price")) {
                return price;
            }
        }else{
            return 0.0000000;
        }
        return 0;
    }
    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed
        String prodName = txtSearchKeyWord.getText();
        Supplier selSupp = (Supplier) suppComboBox.getSelectedItem();
        List<Product> selectedList = selSupp.getProductCatalag().getProductCatalogDir();
        ArrayList<Product> searchProducts = new ArrayList();
        for (Product p : selectedList) {
            if (p.getProdName().equalsIgnoreCase(prodName)) {
                searchProducts.add(p);
            }
        }
        if(searchProducts.size()<=0 && prodName.trim().length()!=0){
            DefaultTableModel model = (DefaultTableModel) productTable.getModel();
            model.setRowCount(0);
            JOptionPane.showMessageDialog(null, "Product Name entered is invalid", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (prodName.trim().length() == 0) {
            populateTable();
        } else {
            refreshProductTable(prodName);
        }
    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void btnViewOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderItemActionPerformed
        int row = orderTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Order oi = (Order) orderTable.getValueAt(row, 0);
        ViewOrderItemDetailJPanel voijp = new ViewOrderItemDetailJPanel(userProcessContainer, oi);
        userProcessContainer.add("ViewOrderItemDetailJPanel", voijp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewOrderItemActionPerformed

    private void btnModifyQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyQuantityActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(txtNewQuantity.getText().trim().length()==0){
            JOptionPane.showMessageDialog(null, "Please enter quantity", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Order oi = (Order) orderTable.getValueAt(selectedRow, 0);

        int currentAvail = oi.getProduct().getAvail();
        int oldqty = oi.getQuantity();
        int newqty = Integer.parseInt(txtNewQuantity.getText());

        if (newqty > (currentAvail + oldqty)) {
            JOptionPane.showMessageDialog(null, "Quantity > Availability", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            if (newqty <= 0) {
                JOptionPane.showMessageDialog(null, "Quantity should be greater than ZERO", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            oi.setQuantity(newqty);
            oi.getProduct().setAvail(currentAvail + (oldqty - newqty));
            populateTable();
            refreshOrderTable();
        }
    }//GEN-LAST:event_btnModifyQuantityActionPerformed

    private void btnRemoveOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOrderItemActionPerformed
        int row = orderTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Order oi = (Order) orderTable.getValueAt(row, 0);
        int oldAvail = oi.getProduct().getAvail();
        int oldqty = oi.getQuantity();
        int newqty = oldAvail + oldqty;

        oi.getProduct().setAvail(newqty);

        orderList.removeOrderItem(oi);

        JOptionPane.showMessageDialog(null, "Order Removed from the Cart");

        refreshOrderTable();
        populateTable();
    }//GEN-LAST:event_btnRemoveOrderItemActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
        if (orderList.getOrderList().size() > 0) {
            masterOrderCatalog.addOrder(orderList);
            JOptionPane.showMessageDialog(null, "Order Placed Sucessfully");
            orderList = new OrderList();
            refreshOrderTable();
            populateTable();
            isCheckedOut = true;
        } else {
            JOptionPane.showMessageDialog(null, "Cart is Empty", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnCheckOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtoCartButton6;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnModifyQuantity;
    private javax.swing.JButton btnRemoveOrderItem;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JButton btnViewOrderItem;
    private javax.swing.JTextField custNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField markNameTxt;
    private javax.swing.JComboBox offerCombBox;
    private javax.swing.JTable orderTable;
    private javax.swing.JTable productTable;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JTextField salesPersTxt;
    private javax.swing.JComboBox suppComboBox;
    private javax.swing.JTextField txtNewQuantity;
    private javax.swing.JTextField txtSearchKeyWord;
    private javax.swing.JButton viewProdjButton2;
    // End of variables declaration//GEN-END:variables
}
