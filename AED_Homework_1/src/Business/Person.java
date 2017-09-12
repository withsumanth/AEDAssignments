/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Sumanth
 */
public class Person {
    String fName;
    String lName;
    String dob;
    Address address;
    CreditCard credCrdInfo;
    License licInfo;
    Spouse spoInfo;
    FinancialAccounts finAccInfo;

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
