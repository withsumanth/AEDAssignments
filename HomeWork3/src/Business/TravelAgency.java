/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class TravelAgency {
    private ArrayList<CustomerDet> customerDet; 
    private ArrayList<Airlines> airlines; 

    public ArrayList<CustomerDet> getCustomerDet() {
        return customerDet;
    }

    public void setCustomerDet(ArrayList<CustomerDet> customerDet) {
        this.customerDet = customerDet;
    }

    public ArrayList<Airlines> getAirlines() {
        return airlines;
    }

    public void setAirlines(ArrayList<Airlines> airlines) {
        this.airlines = airlines;
    }
    
    public static void main(String[] args) {
        
        
    }
}
