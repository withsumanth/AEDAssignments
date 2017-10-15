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
            user.setUserName("s");
            user.setPassword(business.getEncryption().encrypt("1"));
            user.setAccountStatus("Active");
            user.setRole("System Admin");
            findPerson1.setUser(user);
        }
        Person p2 = business.getPersonDirectory().addPerson();
        p2.setfName("Sumanth");
        p2.setlName("hg");
        Users user2 = business.getUserAccountDirectory().addUser();
            user2.setUserName("sumanth");
            user2.setPassword(business.getEncryption().encrypt("1"));
            user2.setAccountStatus("Active");
            user2.setRole("System Admin");
            p2.setUser(user2);
        Person p1 = business.getPersonDirectory().addPerson();
        p1.setfName("vikram");
        p1.setlName("aa");
        Person findPerson2 = business.getPersonDirectory().findPersonByLastName("aa");
        if(findPerson2!=null){
            Users user = business.getUserAccountDirectory().addUser();
            user.setUserName("h");
            user.setPassword(business.getEncryption().encrypt("2"));
            user.setAccountStatus("Active");
            user.setRole("HR Admin");
            findPerson2.setUser(user);
        }
        return business;
    }
    
}
