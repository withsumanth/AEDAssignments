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
    int airlinerId;
    String airLineAddr;
    int totalFlightperDay;

    public String getAirLineAddr() {
        return airLineAddr;
    }

    public void setAirLineAddr(String airLineAddr) {
        this.airLineAddr = airLineAddr;
    }

    public int getTotalFlightperDay() {
        return totalFlightperDay;
    }

    public void setTotalFlightperDay(int totalFlightperDay) {
        this.totalFlightperDay = totalFlightperDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAirlinerId() {
        return airlinerId;
    }

    public void setAirlinerId(int airlinerId) {
        this.airlinerId = airlinerId;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
