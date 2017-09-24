/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author Sumanth
 */
public class AirplaneDetails {
    private String airplaneName;
    private Date dateOfFly; 
    private int yearOfMan;
    private int numOfSeats;
    private String serNo;
    private String modelNo;
    private Date timeOfFleetCat;
    private String maintCertExp;
    private String availablity;
    private String airportName;
    private String manuName;
    private String origin;
    private String destination;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    

    public String getSerNo() {
        return serNo;
    }

    public void setSerNo(String serNo) {
        this.serNo = serNo;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public Date getTimeOfFleetCat() {
        return timeOfFleetCat;
    }

    public void setTimeOfFleetCat(Date timeOfFleetCat) {
        this.timeOfFleetCat = timeOfFleetCat;
    }

    public Date getDateOfFly() {
        return dateOfFly;
    }

    public void setDateOfFly(Date dateOfFly) {
        this.dateOfFly = dateOfFly;
    }

    public String getManuName() {
        return manuName;
    }

    public void setManuName(String manuName) {
        this.manuName = manuName;
    }

    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    public int getYearOfMan() {
        return yearOfMan;
    }

    public void setYearOfMan(int yearOfMan) {
        this.yearOfMan = yearOfMan;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public String getMaintCertExp() {
        return maintCertExp;
    }

    public void setMaintCertExp(String maintCertExp) {
        this.maintCertExp = maintCertExp;
    }

    public String getAvailablity() {
        return availablity;
    }

    public void setAvailablity(String availablity) {
        this.availablity = availablity;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }
    
    @Override
    public String toString(){
        return this.airplaneName;
    }
    
}
