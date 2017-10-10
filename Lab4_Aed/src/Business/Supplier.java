/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Sumanth
 */
public class Supplier {
    private String suppName;
    private ProductCatalog prodCatalog;
    
    public Supplier(){
        prodCatalog = new ProductCatalog();
    }

    public String getSuppName() {
        return suppName;
    }

    public void setSuppName(String suppName) {
        this.suppName = suppName;
    }

    public ProductCatalog getProdCatalog() {
        return prodCatalog;
    }

}
