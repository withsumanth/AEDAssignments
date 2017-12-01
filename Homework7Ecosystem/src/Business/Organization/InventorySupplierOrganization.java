/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DistributorRole;
import Business.Role.Role;
import Business.Role.SupplierRole;
import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class InventorySupplierOrganization extends Organization{
    public InventorySupplierOrganization() {
        super(Organization.Type.InventorySupplier.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupplierRole());
        return roles;
    }
}
