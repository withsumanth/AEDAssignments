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
public class VitalSigns {
    private double temp;
    private double bloodPre;
    private int pulse;
    private String date;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getBloodPre() {
        return bloodPre;
    }

    public void setBloodPre(double bloodPre) {
        this.bloodPre = bloodPre;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    @Override
    public String toString(){
        return this.date;
    }
    
}
