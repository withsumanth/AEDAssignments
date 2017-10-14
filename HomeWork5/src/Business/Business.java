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
    PasswordEncryption encryption;
    
    public Business() {
        userAccountDirectory = new UserAccountDirectory();
        personDirectory = new PersonDirectory();
        encryption = new PasswordEncryption();
    }

    public PasswordEncryption getEncryption() {
        return encryption;
    }

    public void setEncryption(PasswordEncryption encryption) {
        this.encryption = encryption;
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
