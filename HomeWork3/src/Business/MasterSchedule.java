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
public class MasterSchedule {
    private ArrayList<FlightSchedule> masterSch;
    
    public MasterSchedule(){
        masterSch = new ArrayList<FlightSchedule>();
    }

    public ArrayList<FlightSchedule> getMasterSch() {
        return masterSch;
    }

    public void setMasterSch(ArrayList<FlightSchedule> masterSch) {
        this.masterSch = masterSch;
    }
    
    public FlightSchedule addDetails(){
        FlightSchedule details = new FlightSchedule();
        masterSch.add(details);
        return details;
    }
}
