/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.HumanResources.PersonDirectory.PersonDirectory;
import Business.SystemAdministration.UserAccountDirectory;

/**
 *
 * @author Sumanth
 */
public class Business {
    UserAccountDirectory userAccountDirectory;
    PersonDirectory personDirectory;
    
    public Business() {
        userAccountDirectory = new UserAccountDirectory();
        personDirectory = new PersonDirectory();
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }
}
