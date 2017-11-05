/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory(){
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization org = null;
        if(type.getValue().equals(Type.Doctor.getValue())){
            org = new DoctorOrganization();
            organizationList.add(org);
        }else if(type.getValue().equals(Type.Lab.getValue())){
            org = new LabOrganization();
            organizationList.add(org);
        }
        return org;
    }
}
