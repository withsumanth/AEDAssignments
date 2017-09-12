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
public class Address {
    String strLine1;
    String strLine2;
    String city;
    String state;
    String zipCode;
    String country;

    public String getStrLine1() {
        return strLine1;
    }

    public void setStrLine1(String strLine1) {
        this.strLine1 = strLine1;
    }

    public String getStrLine2() {
        return strLine2;
    }

    public void setStrLine2(String strLine2) {
        this.strLine2 = strLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
}
