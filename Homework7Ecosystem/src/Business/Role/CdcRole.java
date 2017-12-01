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
import Business.UserAccount.UserAccount;
import UserInterface.CDCRole.CdcWorkAreaJPanel;
import UserInterface.DistributorRole.DistributorWorkAreaJPanel;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Sumanth
 */
public class CdcRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        ArrayList<Organization> o = new ArrayList();
        for(Network n:business.getNetworkList()){
            for(Enterprise e:n.getEnterpriseDirectory().getEnterPriseList()){
                if(e.getEnterPriseType().getValue().equals(Enterprise.EnterPriseType.Hospital.getValue())){
                    for(Organization org:e.getOrganizationDirectory().getOrganizationList()){
                        o.add(org);
                    }
                }
            }
        }
        return new CdcWorkAreaJPanel(userProcessContainer, account, enterprise,o);
    }
}
