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
public class UserDir {
    ArrayList<User> userDir = new ArrayList<User>();

    public ArrayList<User> getUserDir() {
        return userDir;
    }

    public void setUserDir(ArrayList<User> userDir) {
        this.userDir = userDir;
    }
    
    public User addDetails(){
        User user = new User();
        userDir.add(user);
        return user;
    }
    
    public void deleteDetails(User user){
        userDir.remove(user);
    }
}
