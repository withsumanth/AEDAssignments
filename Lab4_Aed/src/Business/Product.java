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
public class Product {
    private int price;
    private String prodName;
    private int modNo;
    private static int count = 0;
    
    public Product(){
        count++;
        modNo = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getModNo() {
        return modNo;
    }

    public void setModNo(int modNo) {
        this.modNo = modNo;
    }
}
