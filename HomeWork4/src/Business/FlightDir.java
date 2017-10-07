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
public class FlightDir {
    ArrayList<Flight> flightDir = new ArrayList<Flight>();

    public ArrayList<Flight> getFlightDir() {
        return flightDir;
    }

    public void setFlightDir(ArrayList<Flight> flightDir) {
        this.flightDir = flightDir;
    }

    public Flight addDetails(){
        Flight flight = new Flight();
        flightDir.add(flight);
        return flight;
    }
    
    public void deleteDetails(Flight flight){
        flightDir.remove(flight);
    }
}
