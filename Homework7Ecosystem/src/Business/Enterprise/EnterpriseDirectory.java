/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterPriseList;
    
    public EnterpriseDirectory(){
        enterPriseList = new ArrayList();
    }

    public ArrayList<Enterprise> getEnterPriseList() {
        return enterPriseList;
    }

    public void setEnterPriseList(ArrayList<Enterprise> enterPriseList) {
        this.enterPriseList = enterPriseList;
    }
    
    public Enterprise createAndAddEnterPrise(String name, Enterprise.EnterPriseType type){
        Enterprise enterprise = null;
        if(type==Enterprise.EnterPriseType.Provider){
            enterprise = new ProviderEnterprise(name);
            enterPriseList.add(enterprise);
        }else if(type==Enterprise.EnterPriseType.Distributor){
            enterprise = new DistributorEnterprise(name);
            enterPriseList.add(enterprise);
        }else if(type==Enterprise.EnterPriseType.CDC){
            enterprise = new CdcEnterprise(name);
            enterPriseList.add(enterprise);
        }
        return enterprise;
    }
}
