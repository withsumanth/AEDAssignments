/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HumanResources.PersonDirectory;

import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class PersonDirectory {
    ArrayList<Person> personDirectory;

    public PersonDirectory(){
        personDirectory = new ArrayList<Person>();
    }
    
    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public Person findPersonByLastName(String lName){
        for(Person p:personDirectory){
            if(p.getlName().equals(lName)){
                return p;
            }
        }
        return null;
    }
    
    public Person addPerson(){
        Person person = new Person();
        personDirectory.add(person);
        return person;
    }
}
