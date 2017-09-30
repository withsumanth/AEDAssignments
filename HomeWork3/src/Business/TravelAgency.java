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
    CustomerDet customerDet; 
    AirlinesDet airlinesDet; 

    public TravelAgency() {
        customerDet = new CustomerDet();
        airlinesDet = new AirlinesDet();
    }

    public CustomerDet getCustomerDet() {
        return customerDet;
    }

    public void setCustomerDet(CustomerDet customerDet) {
        this.customerDet = customerDet;
    }

    public AirlinesDet getAirlinesDet() {
        return airlinesDet;
    }

    public void setAirlinesDet(AirlinesDet airlinesDet) {
        this.airlinesDet = airlinesDet;
    }
}
