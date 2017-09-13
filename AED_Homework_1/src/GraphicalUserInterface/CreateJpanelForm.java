/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphicalUserInterface;

import Business.Address;
import Business.CreditCard;
import Business.FinancialAccounts;
import Business.License;
import Business.Person;
import Business.Spouse;
import javax.swing.JOptionPane;

/**
 *
 * @author Sumanth
 */
public class CreateJpanelForm extends javax.swing.JPanel {

    /**
     * Creates new form CreateJpanelForm
     */
    private Person person;
    public CreateJpanelForm(Person person) {
        initComponents();
        this.person = person;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        fnameTxt = new javax.swing.JTextField();
        strLine1Txt = new javax.swing.JTextField();
        strLine2Txt = new javax.swing.JTextField();
        lNameTxt = new javax.swing.JTextField();
        cityTxt = new javax.swing.JTextField();
        stateTxt = new javax.swing.JTextField();
        countryTxt = new javax.swing.JTextField();
        licNotxt = new javax.swing.JTextField();
        licClassTxt = new javax.swing.JTextField();
        dobTxt = new javax.swing.JTextField();
        zipCodeTxt = new javax.swing.JTextField();
        creCrdNoTxt = new javax.swing.JTextField();
        creCrdDateOfIssueTxt = new javax.swing.JTextField();
        creCrdDateOfExpiryTxt = new javax.swing.JTextField();
        creCrdTypeTxt = new javax.swing.JTextField();
        creCrdBankTxt = new javax.swing.JTextField();
        licDateOfIssueTxt = new javax.swing.JTextField();
        licDateOfExpiryTxt = new javax.swing.JTextField();
        licIssueCityTxt = new javax.swing.JTextField();
        spoLasNameTxt = new javax.swing.JTextField();
        spoNumTxt = new javax.swing.JTextField();
        spoEmailTxt = new javax.swing.JTextField();
        spoDobTxt = new javax.swing.JTextField();
        spoFirNameTxt = new javax.swing.JTextField();
        chkAccCreaDateTxt = new javax.swing.JTextField();
        chkAccDebtAmtTxt = new javax.swing.JTextField();
        svgAccActiveTxt = new javax.swing.JTextField();
        svgAccCreaDateTxt = new javax.swing.JTextField();
        svgAccDebtAmtTxt = new javax.swing.JTextField();
        svgAccCreAmtTxt = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        chkAccCreAmtTxt = new javax.swing.JTextField();
        chkAccActiveTxt = new javax.swing.JTextField();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Create the details");
        add(jLabel1);
        jLabel1.setBounds(380, 0, 210, 28);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Personnel Details");
        add(jLabel2);
        jLabel2.setBounds(37, 35, 131, 17);

        jLabel3.setText("First Name");
        add(jLabel3);
        jLabel3.setBounds(10, 130, 80, 14);

        jLabel4.setText("Last Name");
        add(jLabel4);
        jLabel4.setBounds(10, 180, 80, 14);

        jLabel5.setText("Date Of Birth");
        add(jLabel5);
        jLabel5.setBounds(10, 230, 80, 14);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("Address");
        add(jLabel6);
        jLabel6.setBounds(60, 270, 90, 17);

        jLabel7.setText("Street Line 1");
        add(jLabel7);
        jLabel7.setBounds(10, 320, 80, 14);

        jLabel8.setText("Picture");
        add(jLabel8);
        jLabel8.setBounds(10, 80, 80, 14);

        jLabel9.setText("Street Line 2");
        add(jLabel9);
        jLabel9.setBounds(10, 360, 80, 14);

        jLabel10.setText("City");
        add(jLabel10);
        jLabel10.setBounds(10, 400, 80, 14);

        jLabel11.setText("State");
        add(jLabel11);
        jLabel11.setBounds(10, 440, 80, 14);

        jLabel12.setText("Country");
        add(jLabel12);
        jLabel12.setBounds(10, 480, 80, 14);

        jLabel13.setText("Zip Code");
        add(jLabel13);
        jLabel13.setBounds(10, 520, 80, 14);

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel14.setText("License Details");
        add(jLabel14);
        jLabel14.setBounds(300, 30, 120, 17);

        jLabel15.setText("Number");
        add(jLabel15);
        jLabel15.setBounds(250, 70, 80, 14);

        jLabel17.setText("Date Of Issue");
        add(jLabel17);
        jLabel17.setBounds(250, 150, 80, 14);

        jLabel18.setText("Date of Expiry");
        add(jLabel18);
        jLabel18.setBounds(250, 190, 80, 14);

        jLabel19.setText("Class");
        add(jLabel19);
        jLabel19.setBounds(250, 110, 80, 14);

        jLabel23.setText("Issued City");
        add(jLabel23);
        jLabel23.setBounds(250, 230, 80, 14);

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel16.setText("Credit Card Details");
        add(jLabel16);
        jLabel16.setBounds(290, 270, 140, 17);

        jLabel20.setText("Credit Card Number");
        add(jLabel20);
        jLabel20.setBounds(220, 320, 140, 14);

        jLabel21.setText("Date of Issue");
        add(jLabel21);
        jLabel21.setBounds(220, 370, 80, 14);

        jLabel22.setText("Dateof Expiry");
        add(jLabel22);
        jLabel22.setBounds(220, 420, 80, 14);

        jLabel24.setText("Credit Card Type");
        add(jLabel24);
        jLabel24.setBounds(220, 470, 100, 14);

        jLabel25.setText("Credit Card Bank");
        add(jLabel25);
        jLabel25.setBounds(220, 520, 100, 14);

        jLabel26.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel26.setText("Spouse Details");
        add(jLabel26);
        jLabel26.setBounds(580, 30, 130, 17);

        jLabel27.setText("First Name");
        add(jLabel27);
        jLabel27.setBounds(530, 70, 80, 14);

        jLabel28.setText("Last Name");
        add(jLabel28);
        jLabel28.setBounds(530, 110, 80, 14);

        jLabel29.setText("Date Of Birth");
        add(jLabel29);
        jLabel29.setBounds(530, 230, 80, 14);

        jLabel30.setText("Ph No");
        add(jLabel30);
        jLabel30.setBounds(530, 150, 80, 14);

        jLabel31.setText("Email");
        add(jLabel31);
        jLabel31.setBounds(530, 190, 80, 14);

        jLabel32.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel32.setText("Financial Account Details");
        add(jLabel32);
        jLabel32.setBounds(600, 270, 180, 17);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("Checking Account");
        add(jLabel33);
        jLabel33.setBounds(520, 310, 100, 14);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setText("Savings Account");
        add(jLabel34);
        jLabel34.setBounds(740, 310, 93, 14);

        jLabel35.setText("Created Date");
        add(jLabel35);
        jLabel35.setBounds(470, 350, 80, 14);

        jLabel36.setText("Created Date");
        add(jLabel36);
        jLabel36.setBounds(680, 350, 80, 14);

        jLabel37.setText("Debited Amount");
        add(jLabel37);
        jLabel37.setBounds(470, 410, 100, 14);

        jLabel38.setText("Credited Amount");
        add(jLabel38);
        jLabel38.setBounds(470, 460, 110, 14);

        jLabel39.setText("Is Active?");
        add(jLabel39);
        jLabel39.setBounds(470, 520, 80, 14);

        jLabel40.setText("Debited Amount");
        add(jLabel40);
        jLabel40.setBounds(680, 410, 100, 14);

        jLabel41.setText("Credited Amount");
        add(jLabel41);
        jLabel41.setBounds(680, 460, 100, 14);

        jLabel42.setText("Is Active?");
        add(jLabel42);
        jLabel42.setBounds(690, 520, 70, 10);

        fnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameTxtActionPerformed(evt);
            }
        });
        add(fnameTxt);
        fnameTxt.setBounds(80, 130, 133, 25);
        add(strLine1Txt);
        strLine1Txt.setBounds(79, 314, 133, 25);
        add(strLine2Txt);
        strLine2Txt.setBounds(80, 360, 133, 25);
        add(lNameTxt);
        lNameTxt.setBounds(80, 180, 133, 25);
        add(cityTxt);
        cityTxt.setBounds(80, 400, 133, 25);
        add(stateTxt);
        stateTxt.setBounds(80, 440, 133, 25);
        add(countryTxt);
        countryTxt.setBounds(80, 480, 133, 25);
        add(licNotxt);
        licNotxt.setBounds(340, 70, 133, 25);
        add(licClassTxt);
        licClassTxt.setBounds(340, 110, 133, 25);

        dobTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobTxtActionPerformed(evt);
            }
        });
        add(dobTxt);
        dobTxt.setBounds(80, 230, 133, 25);

        zipCodeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipCodeTxtActionPerformed(evt);
            }
        });
        add(zipCodeTxt);
        zipCodeTxt.setBounds(80, 520, 133, 25);
        add(creCrdNoTxt);
        creCrdNoTxt.setBounds(330, 320, 133, 25);
        add(creCrdDateOfIssueTxt);
        creCrdDateOfIssueTxt.setBounds(330, 370, 133, 25);
        add(creCrdDateOfExpiryTxt);
        creCrdDateOfExpiryTxt.setBounds(330, 420, 133, 25);
        add(creCrdTypeTxt);
        creCrdTypeTxt.setBounds(330, 470, 133, 25);
        add(creCrdBankTxt);
        creCrdBankTxt.setBounds(330, 520, 133, 25);
        add(licDateOfIssueTxt);
        licDateOfIssueTxt.setBounds(340, 150, 133, 25);
        add(licDateOfExpiryTxt);
        licDateOfExpiryTxt.setBounds(340, 190, 133, 25);
        add(licIssueCityTxt);
        licIssueCityTxt.setBounds(340, 230, 133, 25);
        add(spoLasNameTxt);
        spoLasNameTxt.setBounds(620, 110, 133, 25);

        spoNumTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spoNumTxtActionPerformed(evt);
            }
        });
        add(spoNumTxt);
        spoNumTxt.setBounds(620, 150, 133, 25);
        add(spoEmailTxt);
        spoEmailTxt.setBounds(620, 190, 133, 25);
        add(spoDobTxt);
        spoDobTxt.setBounds(620, 230, 133, 25);
        add(spoFirNameTxt);
        spoFirNameTxt.setBounds(620, 70, 133, 25);
        add(chkAccCreaDateTxt);
        chkAccCreaDateTxt.setBounds(570, 350, 100, 25);
        add(chkAccDebtAmtTxt);
        chkAccDebtAmtTxt.setBounds(570, 410, 100, 25);
        add(svgAccActiveTxt);
        svgAccActiveTxt.setBounds(770, 510, 100, 25);
        add(svgAccCreaDateTxt);
        svgAccCreaDateTxt.setBounds(770, 350, 100, 25);
        add(svgAccDebtAmtTxt);
        svgAccDebtAmtTxt.setBounds(770, 410, 100, 25);
        add(svgAccCreAmtTxt);
        svgAccCreAmtTxt.setBounds(770, 460, 100, 25);

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        add(createButton);
        createButton.setBounds(410, 580, 160, 23);
        add(chkAccCreAmtTxt);
        chkAccCreAmtTxt.setBounds(570, 460, 100, 25);
        add(chkAccActiveTxt);
        chkAccActiveTxt.setBounds(570, 510, 100, 25);
    }// </editor-fold>//GEN-END:initComponents

    private void fnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameTxtActionPerformed

    private void dobTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobTxtActionPerformed

    private void spoNumTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spoNumTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spoNumTxtActionPerformed

    private void zipCodeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipCodeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipCodeTxtActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        Address address = new Address();
        CreditCard creditCard = new CreditCard();
        License license = new License();
        FinancialAccounts financialAccounts = new FinancialAccounts();
        Spouse spouse = new Spouse();
        
        //Set Person Details on Create
        person.setfName(fnameTxt.getText());
        person.setlName(lNameTxt.getText());
        person.setDob(dobTxt.getText());
        
        //Set Address Details on Create
        address.setStrLine1(strLine1Txt.getText());
        address.setStrLine2(strLine2Txt.getText());
        address.setCity(cityTxt.getText());
        address.setState(stateTxt.getText());
        address.setCountry(countryTxt.getText());
        address.setZipCode(zipCodeTxt.getText());
        person.setAddress(address);
        
        //Set Credit Card Details on Create
        creditCard.setCreCrdNo(creCrdNoTxt.getText());
        creditCard.setCreCrdType(creCrdTypeTxt.getText());
        creditCard.setCreCrdDateOfIssue(creCrdDateOfIssueTxt.getText());
        creditCard.setCreCrdDateOfExpiry(creCrdDateOfExpiryTxt.getText());
        creditCard.setCreCrdBank(creCrdBankTxt.getText());
        person.setCredCrdInfo(creditCard);
        
        //Set License details on Create
        license.setLicNo(licNotxt.getText());
        license.setLicDateOfIssue(licDateOfIssueTxt.getText());
        license.setLicDateOfExpiry(licDateOfExpiryTxt.getText());
        license.setLicClass(licClassTxt.getText());
        license.setLicIssueCity(licIssueCityTxt.getText());
        person.setLicInfo(license);
        
        //Set Spouse details on Create
        spouse.setSpoFirName(spoFirNameTxt.getText());
        spouse.setSpoLasName(spoLasNameTxt.getText());
        spouse.setSpoDob(spoDobTxt.getText());
        spouse.setSpoEmail(spoEmailTxt.getText());
        spouse.setSpoNum(spoNumTxt.getText());
        person.setSpoInfo(spouse);
        
        //Set Financial Accounts Details on create
        financialAccounts.setChkAccCreAmt(chkAccCreAmtTxt.getText());
        financialAccounts.setChkAccCreaDate(chkAccCreaDateTxt.getText());
        financialAccounts.setChkAccDebtAmt(chkAccDebtAmtTxt.getText());
        financialAccounts.setChkAccActive(chkAccActiveTxt.getText());
        financialAccounts.setSvgAccCreAmt(svgAccCreAmtTxt.getText());
        financialAccounts.setSvgAccCreaDate(svgAccCreaDateTxt.getText());
        financialAccounts.setSvgAccDebtAmt(svgAccDebtAmtTxt.getText());
        financialAccounts.setSvgAccActive(svgAccActiveTxt.getText());
        person.setFinAccInfo(financialAccounts);
        
        //To Display message on click of create button
        JOptionPane.showMessageDialog(null, "Created Person Details Successfully");
    }//GEN-LAST:event_createButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chkAccActiveTxt;
    private javax.swing.JTextField chkAccCreAmtTxt;
    private javax.swing.JTextField chkAccCreaDateTxt;
    private javax.swing.JTextField chkAccDebtAmtTxt;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JTextField countryTxt;
    private javax.swing.JTextField creCrdBankTxt;
    private javax.swing.JTextField creCrdDateOfExpiryTxt;
    private javax.swing.JTextField creCrdDateOfIssueTxt;
    private javax.swing.JTextField creCrdNoTxt;
    private javax.swing.JTextField creCrdTypeTxt;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField dobTxt;
    private javax.swing.JTextField fnameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lNameTxt;
    private javax.swing.JTextField licClassTxt;
    private javax.swing.JTextField licDateOfExpiryTxt;
    private javax.swing.JTextField licDateOfIssueTxt;
    private javax.swing.JTextField licIssueCityTxt;
    private javax.swing.JTextField licNotxt;
    private javax.swing.JTextField spoDobTxt;
    private javax.swing.JTextField spoEmailTxt;
    private javax.swing.JTextField spoFirNameTxt;
    private javax.swing.JTextField spoLasNameTxt;
    private javax.swing.JTextField spoNumTxt;
    private javax.swing.JTextField stateTxt;
    private javax.swing.JTextField strLine1Txt;
    private javax.swing.JTextField strLine2Txt;
    private javax.swing.JTextField svgAccActiveTxt;
    private javax.swing.JTextField svgAccCreAmtTxt;
    private javax.swing.JTextField svgAccCreaDateTxt;
    private javax.swing.JTextField svgAccDebtAmtTxt;
    private javax.swing.JTextField zipCodeTxt;
    // End of variables declaration//GEN-END:variables
}
