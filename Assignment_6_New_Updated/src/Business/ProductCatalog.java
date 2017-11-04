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
 * @author JAI JINENDRA
 */
public class ProductCatalog {
    
    private ArrayList<Product> productCatalogDir;

    public ProductCatalog() {
    productCatalogDir = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductCatalogDir() {
        return productCatalogDir;
    }

    public void setProductCatalogDir(ArrayList<Product> productCatalogDir) {
        this.productCatalogDir = productCatalogDir;
    }
    
    public Product addProduct(){
        Product p = new Product();
        productCatalogDir.add(p);
        return p;
    }
    
    public void removeProduct(Product p){
        productCatalogDir.remove(p);
    }
    
    public Product searchProduct(int id){
        for (Product product : productCatalogDir) {
            if(product.getModelNumber()==id){
                return product;
            }
        }
        return null;
    }
}
