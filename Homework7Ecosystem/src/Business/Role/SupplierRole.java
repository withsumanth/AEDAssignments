/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ClinicOrganization;
import Business.Organization.Organization;
import Business.Organization.SupplierOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.DistributorRole.DistributorWorkAreaJPanel;
import UserInterface.IndividualProvidersWorkArea.IndividualProvidersJpanel;
import UserInterface.SupplierRole.SupplierWorkAreaJPanel;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Sumanth
 */
public class SupplierRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
       if(organization.toString().equals(Organization.Type.InventorySupplier.getValue())){
            ArrayList<Organization> orgListHosp = new ArrayList();
            ArrayList<Organization> orgListSupp = new ArrayList();
            ArrayList<Organization> orgListDist = new ArrayList();
        for(Network n:business.getNetworkList()){
            for(Enterprise e:n.getEnterpriseDirectory().getEnterPriseList()){
                if(e.getEnterPriseType().getValue().equals(Enterprise.EnterPriseType.Hospital.getValue())){
                    for(Organization org:e.getOrganizationDirectory().getOrganizationList()){
                        orgListHosp.add(org);
                    }
                }else if(e.getEnterPriseType().getValue().equals(Enterprise.EnterPriseType.Provider.getValue())){
                    for(Organization org:e.getOrganizationDirectory().getOrganizationList()){
                        orgListSupp.add(org);
                    }
                }else if(e.getEnterPriseType().getValue().equals(Enterprise.EnterPriseType.Distributor.getValue())){
                    for(Organization org:e.getOrganizationDirectory().getOrganizationList()){
                        orgListDist.add(org);
                    }
                }
            }
        }
            return new SupplierWorkAreaJPanel(userProcessContainer,enterprise, account, organization,orgListHosp,orgListSupp,orgListDist);
        }else if(organization.toString().equals(Organization.Type.Supplier.getValue())){
            return new IndividualProvidersJpanel(userProcessContainer,enterprise, account,organization);
        }
        return null;
    }
}
