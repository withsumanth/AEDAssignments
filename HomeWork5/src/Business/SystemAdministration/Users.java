/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SystemAdministration;

import Business.HumanResources.PersonDirectory.Person;
import Business.PasswordEncryption;

/**
 *
 * @author Sumanth
 */
public class Users {
    private String userName;
    private String password;
    private String accountStatus;
    private String role;
    PasswordEncryption encryption;
    Person person;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = encryption.encrypt(password);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
