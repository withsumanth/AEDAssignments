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
public class AirplaneDetailsHistory {
    private ArrayList<AirplaneDetails> airDetHist;
    
    public AirplaneDetailsHistory(){
        airDetHist = new ArrayList<AirplaneDetails>();
    }

    public ArrayList<AirplaneDetails> getAirDetHist() {
        return airDetHist;
    }

    public void setAirDetHist(ArrayList<AirplaneDetails> airDetHist) {
        this.airDetHist = airDetHist;
    }
    
    public AirplaneDetails addDetails(){
        AirplaneDetails details = new AirplaneDetails();
        airDetHist.add(details);
        return details;
    }
}
