/*
 * To change this template, choose Tools | Templates
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

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Clinic.getValue())){
            organization = new ClinicOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Supplier.getValue())){
            organization = new SupplierOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Dealer.getValue())){
            organization = new DealerOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.InventorySupplier.getValue())){
            organization = new InventorySupplierOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.InventoryDistributor.getValue())){
            organization = new InventoryDistributorOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}