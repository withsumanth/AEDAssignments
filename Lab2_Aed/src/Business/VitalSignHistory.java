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
public class VitalSignHistory {
    private ArrayList<VitalSigns> vitSignHist;
    
    public VitalSignHistory(){
        vitSignHist = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitSignHist() {
        return vitSignHist;
    }

    public void setVitSignHist(ArrayList<VitalSigns> vitSignHist) {
        this.vitSignHist = vitSignHist;
    }
}
