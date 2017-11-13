/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdministrativeRole;

import Business.Disease.Disease;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Inventory.Inventory;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Supplier;
import Business.Organization.OrganizationDirectory;
import Business.Supplier.Supplier;
import Business.Vaccine.Vaccine;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sumanth
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageEmployeeJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDir, Enterprise enterprise,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        this.enterprise = enterprise;
        this.system = system;
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
    }

    public void populateVaccineCombo() {
        vaccineCatalogBox.removeAllItems();
        for (Vaccine v : system.getVaccineCatalog().getVaccineCatalog()) {
            vaccineCatalogBox.addItem(v);
        }
    }

    public void populateDiseaseCombo() {
        diseaseCatalogCombo.removeAllItems();
        for (Disease v : system.getDiseaseCatalog().getDiseaseCatalog()) {
            diseaseCatalogCombo.addItem(v);
        }
    }

    public void populateOrganizationComboBox() {
        organizationJComboBox.removeAllItems();
        ArrayList<Organization> organization = organizationDir.getOrganizationList();
        for (int i = 0; i < organization.size(); i++) {
            if (enterprise.getEnterPriseType().equals(Enterprise.EnterPriseType.Distributor)) {
                if (organization.get(i).toString().equals(Organization.Type.Dealer.getValue()) || organization.get(i).toString().equals(Organization.Type.Inventory.getValue())) {
                    if (i == 0) {
                        if (!organization.get(i).toString().equals(Organization.Type.Inventory.getValue()) || !organization.get(i).toString().equals(Organization.Type.Clinic.getValue())) {
                            diseaseLabel.setVisible(true);
                            vaccineLabel.setVisible(true);
                            vaccineCatalogBox.setVisible(true);
                            diseaseCatalogCombo.setVisible(true);
                            populateVaccineCombo();
                            populateDiseaseCombo();

                        } else {
                            diseaseLabel.setVisible(false);
                            vaccineLabel.setVisible(false);
                            vaccineCatalogBox.setVisible(false);
                            diseaseCatalogCombo.setVisible(false);
                        }
                    }
                    organizationJComboBox.addItem(organization.get(i));
                }
            }else if (enterprise.getEnterPriseType().equals(Enterprise.EnterPriseType.Hospital)) {
                if (organization.get(i).toString().equals(Organization.Type.Clinic.getValue())){
                    organizationJComboBox.addItem(organization.get(i));
                }
            }else if (enterprise.getEnterPriseType().equals(Enterprise.EnterPriseType.Provider)) {
                if (organization.get(i).toString().equals(Organization.Type.Clinic.getValue()) || organization.get(i).toString().equals(Organization.Type.Inventory.getValue())) {
                    if (i == 0) {
                        if (organization.get(i).toString().equals(Organization.Type.Inventory.getValue())) {
                            diseaseLabel.setVisible(true);
                            vaccineLabel.setVisible(true);
                            vaccineCatalogBox.setVisible(true);
                            diseaseCatalogCombo.setVisible(true);
                            populateVaccineCombo();
                            populateDiseaseCombo();

                        } else {
                            diseaseLabel.setVisible(false);
                            vaccineLabel.setVisible(false);
                            vaccineCatalogBox.setVisible(false);
                            diseaseCatalogCombo.setVisible(false);
                        }
                    }
                    organizationJComboBox.addItem(organization.get(i));
                }
            }
        }
    }

    public void populateOrganizationEmpComboBox() {
        organizationEmpJComboBox.removeAllItems();

        for (Organization organization : organizationDir.getOrganizationList()) {
            if (enterprise.getEnterPriseType().equals(Enterprise.EnterPriseType.Distributor)) {
                if (organization.toString().equals(Organization.Type.Dealer.getValue()) || organization.toString().equals(Organization.Type.Inventory.getValue())) {
                    organizationEmpJComboBox.addItem(organization);
                }
            }
        }
    }

    private void populateTable(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        vaccineLabel = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        vaccineCatalogBox = new javax.swing.JComboBox();
        diseaseCatalogCombo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        diseaseLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 60, 480, 92));

        addJButton.setText("Create Employee");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, -1, -1));

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 34, 216, -1));

        jLabel1.setText("Organization");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 37, -1, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        vaccineLabel.setText("Vaccine Catalog");
        add(vaccineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 350, 110, -1));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 126, -1));

        organizationEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationEmpJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationEmpJComboBoxActionPerformed(evt);
            }
        });
        add(organizationEmpJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 202, -1));

        jLabel3.setText("Organization");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        vaccineCatalogBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccineCatalogBoxActionPerformed(evt);
            }
        });
        add(vaccineCatalogBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 202, -1));

        diseaseCatalogCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diseaseCatalogComboActionPerformed(evt);
            }
        });
        add(diseaseCatalogCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 202, -1));

        jLabel4.setText("Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 260, 50, -1));

        diseaseLabel.setText("Disease Catalog");
        add(diseaseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 310, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        String name = nameJTextField.getText();
        boolean check = false;
        if (organization.equals(Organization.Type.Inventory)) {
            Inventory inventory = new Inventory();
            inventory.setQuantity(0);
            inventory.setType(enterprise.getEnterPriseType());
            organization.setInventory(inventory);
        }else if(organization.equals(Organization.Type.Clinic)){
            Inventory inventory = new Inventory();
            inventory.setQuantity(0);
            inventory.setType(enterprise.getEnterPriseType());
            organization.setInventory(inventory);
        }else if(organization.equals(Organization.Type.Dealer)){
            check = true;
        }else if(organization.equals(Organization.Type.Supplier)){
            check = true;
            Supplier s = organization.getSupplierDirectory().addSupplier();
            s.setName(name);
        }
        Employee emp = organization.getEmployeeDirectory().createEmployee(name);
        if(check){
            Vaccine v = (Vaccine) vaccineCatalogBox.getSelectedItem();
            Disease d = (Disease) diseaseCatalogCombo.getSelectedItem();
            emp.setVaccine(v);
            emp.setDisease(d);
        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null) {
            populateTable(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void organizationEmpJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationEmpJComboBoxActionPerformed
        Organization org = (Organization) organizationEmpJComboBox.getSelectedItem();
        if (org != null) {
            if (!org.toString().equals(Organization.Type.Inventory.getValue()) || !org.toString().equals(Organization.Type.Clinic.getValue())) {
                diseaseLabel.setVisible(true);
                vaccineLabel.setVisible(true);
                vaccineCatalogBox.setVisible(true);
                diseaseCatalogCombo.setVisible(true);
                populateVaccineCombo();
                populateDiseaseCombo();
            } else {
                diseaseLabel.setVisible(false);
                vaccineLabel.setVisible(false);
                vaccineCatalogBox.setVisible(false);
                diseaseCatalogCombo.setVisible(false);
            }
        }
    }//GEN-LAST:event_organizationEmpJComboBoxActionPerformed

    private void vaccineCatalogBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccineCatalogBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vaccineCatalogBoxActionPerformed

    private void diseaseCatalogComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diseaseCatalogComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diseaseCatalogComboActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox diseaseCatalogCombo;
    private javax.swing.JLabel diseaseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JComboBox vaccineCatalogBox;
    private javax.swing.JLabel vaccineLabel;
    // End of variables declaration//GEN-END:variables
}
