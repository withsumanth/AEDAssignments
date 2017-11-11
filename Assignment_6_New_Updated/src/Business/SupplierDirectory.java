/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sumanth
 */
public class SupplierDirectory {
    private static int supplierId=0;

    private ArrayList<Supplier> supplierDir;
    public SupplierDirectory() {
    
        supplierDir = new ArrayList<Supplier>();
    }

    public static int getSupplierId() {
        return supplierId;
    }

    public static void setSupplierId(int supplierId) {
        SupplierDirectory.supplierId = supplierId;
    }

    public ArrayList<Supplier> getSupplierDir() {
        return supplierDir;
    }

    public void setSupplierDir(ArrayList<Supplier> supplierDir) {
        this.supplierDir = supplierDir;
    }
    
    public Supplier addSupplier(){
        Supplier s = new Supplier();
        supplierDir.add(s);
        return s;
    }
    
    public void removeSupplier(Supplier s){
        supplierDir.remove(s);
    }
    
    public Supplier searchSupplier(String keyword){
        for (Supplier supplier : supplierDir) {
            if(supplier.getSuppUserName().equals(keyword)){
                return supplier;
            }
        }
        return null;
    }
    
    public int supplierId() {
        supplierId++;
        return supplierId;
    }
    
    public Supplier isValidUser(String userName, String password){
        for(Supplier s:supplierDir){
            if(s.getSuppUserName().equals(userName) && s.getSuppPassword().toString().equals(password.toString()) && s.getSuppAccStatus().equals("Active")){
                return s;
            }
        }
        return null;
    }
    
    public boolean checkUserName(String userName){
        for(Supplier s:supplierDir){
            if(s.getSuppUserName().equals(userName)){
                return true;
            }
        }
        return false;
    }
}
