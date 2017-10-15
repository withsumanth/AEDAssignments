/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SystemAdministration;

import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class UserAccountDirectory {
    private ArrayList<Users> userAccountDirectory= new ArrayList<Users>();

    public ArrayList<Users> getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(ArrayList<Users> userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
    public Users addUser(){
        Users user = new Users();
        userAccountDirectory.add(user);
        return user;
    }
    
    public ArrayList<Users> searchUser(String userNameGiven){
       ArrayList<Users> searchedUsers = new ArrayList();
       for(Users u:userAccountDirectory){
           if(u.getUserName().equals(userNameGiven)){
               searchedUsers.add(u);
           }
       }
       return searchedUsers;
    }
    
    public Users isValidUser(String userName, String password){
        for(Users u:userAccountDirectory){
            if(u.getUserName().equals(userName) && u.getPassword().toString().equals(password.toString()) && u.getAccountStatus().equals("Active")){
                return u;
            }
        }
        return null;
    }
}
