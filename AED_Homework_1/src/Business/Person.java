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
    Address spouseDetails;
    ImageIcon personPicture;
    Address address;
    CreditCard credCrdInfo;
    License licInfo;
    FinancialAccounts finAccInfo;

    public Person() {
       address = new Address();
       spouseDetails = new Address();
       credCrdInfo = new CreditCard();
       licInfo = new License();
       finAccInfo = new FinancialAccounts();
    }

    public Address getSpouseDetails() {
        return spouseDetails;
    }

    public void setSpouseDetails(Address spouseDetails) {
        this.spouseDetails = spouseDetails;
    }

    public ImageIcon getPersonPicture() {
        return personPicture;
    }

    public void setPersonPicture(ImageIcon personPicture) {
        this.personPicture = personPicture;
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

    public FinancialAccounts getFinAccInfo() {
        return finAccInfo;
    }

    public void setFinAccInfo(FinancialAccounts finAccInfo) {
        this.finAccInfo = finAccInfo;
    }
    
}
