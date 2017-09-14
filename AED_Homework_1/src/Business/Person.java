/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import javax.swing.ImageIcon;

/**
 *
 * @author Sumanth
 */
public class Person {
    String fName;
    String lName;
    String dob;
    Address address1;
    Person details;
    Person spouse  = null;
    ImageIcon personPicture;
    Address address;
    CreditCard credCrdInfo;
    License licInfo;
    Spouse spoInfo;
    FinancialAccounts finAccInfo;

    public Person() {
       address = new Address();
       address1 = new Address();
       credCrdInfo = new CreditCard();
       licInfo = new License();
       finAccInfo = new FinancialAccounts();
    }

    public Address getAddress1() {
        return address1;
    }

    public void setAddress1(Address address1) {
        this.address1 = address1;
    }

    public ImageIcon getPersonPicture() {
        return personPicture;
    }

    public Person getDetails() {
        return details;
    }

    public void setDetails(Person details) {
        this.details = details;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public void setPersonPicture(ImageIcon personPicture) {
        this.personPicture = personPicture;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public CreditCard getCredCrdInfo() {
        return credCrdInfo;
    }

    public void setCredCrdInfo(CreditCard credCrdInfo) {
        this.credCrdInfo = credCrdInfo;
    }

    public License getLicInfo() {
        return licInfo;
    }

    public void setLicInfo(License licInfo) {
        this.licInfo = licInfo;
    }

    public Spouse getSpoInfo() {
        return spoInfo;
    }

    public void setSpoInfo(Spouse spoInfo) {
        this.spoInfo = spoInfo;
    }

    public FinancialAccounts getFinAccInfo() {
        return finAccInfo;
    }

    public void setFinAccInfo(FinancialAccounts finAccInfo) {
        this.finAccInfo = finAccInfo;
    }
    
}
