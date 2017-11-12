/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author Sumanth
 */
public abstract class Enterprise extends Organization{
    
    private EnterPriseType enterPriseType;
    private OrganizationDirectory organizationDirectory;

    public void setEnterPriseType(EnterPriseType enterPriseType) {
        this.enterPriseType = enterPriseType;
    }

    public EnterPriseType getEnterPriseType() {
        return enterPriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterPriseType{
        Distributor("Distributor"),
        Provider("Provider"),
        CDC("CDC"),
        Hospital("Hospital");
        private String value;
        
        private EnterPriseType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        public String toString(){
            return value;
        }
    }
    
    public Enterprise(String name,EnterPriseType type){
        super(name);
        enterPriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }
    
}
