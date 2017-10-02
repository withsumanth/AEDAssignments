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
public class Airlines {
    private ArrayList<Flight> airLinesDet;

    public Airlines() {
        airLinesDet = new ArrayList<Flight>();
    }

    public ArrayList<Flight> getAirLinesDet() {
        return airLinesDet;
    }

    public void setAirLinesDet(ArrayList<Flight> airLinesDet) {
        this.airLinesDet = airLinesDet;
    }
    
    public Flight addDetails(){
        Flight details = new Flight();
        airLinesDet.add(details);
        return details;
    }
}
