/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.DistributorRole.DistributorWorkAreaJPanel;
import UserInterface.IndividualDistributors.IndividualDistributorJpanel;
import UserInterface.SupplierRole.SupplierWorkAreaJPanel;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Sumanth
 */
public class DistributorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        if(organization.toString().equals(Organization.Type.InventoryDistributor.getValue())){
            ArrayList<Organization> orgListHosp = new ArrayList();
            ArrayList<Organization> orgListDist = new ArrayList();
        for(Network n:business.getNetworkList()){
            for(Enterprise e:n.getEnterpriseDirectory().getEnterPriseList()){
                if(e.getEnterPriseType().getValue().equals(Enterprise.EnterPriseType.Hospital.getValue())){
                    for(Organization org:e.getOrganizationDirectory().getOrganizationList()){
                        orgListHosp.add(org);
                    }
                }else if(e.getEnterPriseType().getValue().equals(Enterprise.EnterPriseType.Distributor.getValue())){
                    for(Organization org:e.getOrganizationDirectory().getOrganizationList()){
                        orgListDist.add(org);
                    }
                }
            }
        }
            return new DistributorWorkAreaJPanel(userProcessContainer,enterprise, account, organization,orgListHosp,orgListDist);
        }else if(organization.toString().equals(Organization.Type.Dealer.getValue())){
            return new IndividualDistributorJpanel(userProcessContainer,enterprise, account,organization);
        }
        return null;
    }
    
}
