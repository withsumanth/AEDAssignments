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
public class ProductCatalog {
    private ArrayList<Product> prodCatalog;
    
    public ProductCatalog(){
        prodCatalog = new ArrayList();
    }

    public ArrayList<Product> getProdCatalog() {
        return prodCatalog;
    }
    
    public Product addProduct(){
        Product p = new Product();
        prodCatalog.add(p);
        return p;
    }
    
    public void deleteProduct(Product p){
        prodCatalog.remove(p);
    }
    
    public Product searchProduct(int id){
        for(Product p:prodCatalog){
            if(p.getModNo() == id){
                return p;
            }
        }
        return null;
    }
        
}
