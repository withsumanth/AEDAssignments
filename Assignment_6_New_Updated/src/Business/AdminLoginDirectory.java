/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class AdminLoginDirectory {
    private ArrayList<AdminLogin> adminLoginDirectory;
    
    public AdminLoginDirectory(){
        adminLoginDirectory = new ArrayList<AdminLogin>();
    }
    
    public AdminLogin addAdmin(){
        AdminLogin p = new AdminLogin();
        adminLoginDirectory.add(p);
        return p;
    }
        
    public AdminLogin isValidUser(String userName, String password){
        for(AdminLogin s:adminLoginDirectory){
            if(s.getAdminUserName().equals(userName) && s.getAdminPassword().toString().equals(password.toString()) && s.getAccountStatus().equals("Active")){
                return s;
            }
        }
        return null;
    }
    
    public boolean checkUserName(String userName){
        for(AdminLogin s:adminLoginDirectory){
            if(s.getAdminUserName().equals(userName)){
                return true;
            }
        }
        return false;
    }
}
