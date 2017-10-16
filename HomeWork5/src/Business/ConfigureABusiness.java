/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.HumanResources.PersonDirectory.Person;
import Business.HumanResources.PersonDirectory.PersonDirectory;
import Business.SystemAdministration.Users;

/**
 *
 * @author Sumanth
 */
public class ConfigureABusiness {
    Business business ;
    
    public  Business ConfigureABusiness(){
        business = new Business();
        Person p = business.getPersonDirectory().addPerson();
        p.setfName("Sumanth");
        p.setlName("hg");
        Person findPerson1 = business.getPersonDirectory().findPersonByLastName("hg");
        if(findPerson1!=null){
            Users user = business.getUserAccountDirectory().addUser();
            user.setUserName("sumanth");
            user.setPassword(business.getEncryption().encrypt("password"));
            user.setAccountStatus("Active");
            user.setRole("System Admin");
            findPerson1.setUser(user);
        }
        return business;
    }
    
}
