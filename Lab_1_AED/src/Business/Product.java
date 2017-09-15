/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Sumanth H G
 */
public class Product {
     
    private String nameOfProduct;
    private String priceOfProduct;
    private String availablityNum;
    private String descOfProduct; 

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(String priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    public String getAvailablityNum() {
        return availablityNum;
    }

    public void setAvailablityNum(String availablityNum) {
        this.availablityNum = availablityNum;
    }

    public String getDescOfProduct() {
        return descOfProduct;
    }

    public void setDescOfProduct(String descOfProduct) {
        this.descOfProduct = descOfProduct;
    }
    
}
