/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HumanResources.PersonDirectory;

import Business.SystemAdministration.Users;

/**
 *
 * @author Sumanth
 */
public class Person {
    private String fName;
    private String lName;
    Users user;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
    
    public String toString(){
        return fName+" "+lName;
    }
}
