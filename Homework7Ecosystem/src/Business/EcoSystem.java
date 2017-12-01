/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    
    public static EcoSystem getInstance(){
        if(business==null){
            business = new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public Network searchNetwork(String name){
        for(Network n:networkList){
            if(n.getName().equals(name)){
                return n;
            }
        }
        return null;
    }
    
    public void deleteNetwork(Network ntw){
        networkList.remove(ntw);
    }

    private EcoSystem(){
        super(null);
        networkList = new ArrayList();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    public boolean checkIfUserNameIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        
        return true;
    }
}
