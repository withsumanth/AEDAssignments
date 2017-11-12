/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import Business.Disease.Disease;
import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class SupplierDirectory {
     ArrayList<Supplier> supplierCatalog;
     
     public SupplierDirectory(){
         supplierCatalog = new ArrayList();
     }

    public ArrayList<Supplier> getSupplierCatalog() {
        return supplierCatalog;
    }

    public void setSupplierCatalog(ArrayList<Supplier> supplierCatalog) {
        this.supplierCatalog = supplierCatalog;
    }
     
     public Supplier addSupplier(){
        Supplier v = new Supplier();
        supplierCatalog.add(v);
        return v;
    }
}
