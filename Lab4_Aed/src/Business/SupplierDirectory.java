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
public class SupplierDirectory {
    private ArrayList<Supplier> suppDir;
    
    public SupplierDirectory(){
        suppDir = new ArrayList<Supplier>();
    }

    public ArrayList<Supplier> getSuppDir() {
        return suppDir;
    }
    
    public Supplier addSupp(){
        Supplier s = new Supplier();
        suppDir.add(s);
        return s;
    }
    
    public void removeSupp(Supplier s){
        suppDir.remove(s);
    }
    
    public Supplier searchSupp(String name){
        for(Supplier s:suppDir){
            if(s.getSuppName().equals(name)){
                return s;
            }
        }
        return null;
    }
}
