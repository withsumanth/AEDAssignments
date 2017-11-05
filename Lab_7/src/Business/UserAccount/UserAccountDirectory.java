/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory(){
        userAccountList = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount createUserAccount(String userName, String pass, Employee emp, Role role){
        UserAccount u = new UserAccount();
        u.setEmployee(emp);
        u.setPassword(pass);
        u.setRole(role);
        u.setUsername(userName);
        userAccountList.add(u);
        return u;
    }
    
    public UserAccount authenticateUser(String userName, String pass){
        for(UserAccount u:userAccountList){
            if(u.getUsername().equals(userName) && u.getPassword().equals(pass)){
                return u;
            }
        }
        return null;
    }
}
