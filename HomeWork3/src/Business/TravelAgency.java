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
    Airlines airlinesDet;
    Seat seatType;
    MasterSchedule masterSch;

    public TravelAgency() {
        customerDet = new CustomerDet();
        airlinesDet = new Airlines();
        seatType = new Seat();
        masterSch = new MasterSchedule(); 
    }

    public MasterSchedule getMasterSch() {
        return masterSch;
    }

    public void setMasterSch(MasterSchedule masterSch) {
        this.masterSch = masterSch;
    }

    public CustomerDet getCustomerDet() {
        return customerDet;
    }

    public void setCustomerDet(CustomerDet customerDet) {
        this.customerDet = customerDet;
    }

    public Airlines getAirlinesDet() {
        return airlinesDet;
    }

    public void setAirlinesDet(Airlines airlinesDet) {
        this.airlinesDet = airlinesDet;
    }
}
