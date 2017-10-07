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
public class AirlineDir {
    ArrayList<Airline> airlineDir = new ArrayList<Airline>();

    public ArrayList<Airline> getAirlineDir() {
        return airlineDir;
    }

    public void setAirlineDir(ArrayList<Airline> airlineDir) {
        this.airlineDir = airlineDir;
    }
    
    public Airline addDetails(){
        Airline airline = new Airline();
        airlineDir.add(airline);
        return airline;
    }
    
    public void deleteDetails(Airline airline){
        airlineDir.remove(airline);
    }
}
