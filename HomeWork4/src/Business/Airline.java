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
public class Airline {
    String name;
    int noOfFlights;
    int airlinerId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfFlights() {
        return noOfFlights;
    }

    public void setNoOfFlights(int noOfFlights) {
        this.noOfFlights = noOfFlights;
    }

    public int getAirlinerId() {
        return airlinerId;
    }

    public void setAirlinerId(int airlinerId) {
        this.airlinerId = airlinerId;
    }
}
