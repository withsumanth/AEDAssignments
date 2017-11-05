/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Organization.OrganizationDirectory;

/**
 *
 * @author Sumanth
 */
public class Business {
    private static Business business;
    private OrganizationDirectory organizationDirectory;
    
    private Business(){
        organizationDirectory = new OrganizationDirectory();
    }
    
    public static Business getInstance(){
        if(business==null){
            business = new Business();
        }
        return business;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
}
