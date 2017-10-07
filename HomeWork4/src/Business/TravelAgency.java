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
public class TravelAgency {
    AirlineDir airLineDir;
    CustomerDir cusomerDir;
    FlightDir flightDir;
    
    public TravelAgency(){
        airLineDir = new AirlineDir();
        cusomerDir = new CustomerDir();
        flightDir = new FlightDir();
    }

    public AirlineDir getAirLineDir() {
        return airLineDir;
    }

    public void setAirLineDir(AirlineDir airLineDir) {
        this.airLineDir = airLineDir;
    }

    public CustomerDir getCusomerDir() {
        return cusomerDir;
    }

    public void setCusomerDir(CustomerDir cusomerDir) {
        this.cusomerDir = cusomerDir;
    }

    public FlightDir getFlightDir() {
        return flightDir;
    }

    public void setFlightDir(FlightDir flightDir) {
        this.flightDir = flightDir;
    }
}
