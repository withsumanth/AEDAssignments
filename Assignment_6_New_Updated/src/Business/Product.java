/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author JAI JINENDRA
 */
public class Product {
    //test

    private String prodName;
    public int price;
    private int modelNumber;
    private int avail;
    MarketOfferCatalogue marketOfferCatalogue;
    private static int count = 0;
    

    public MarketOfferCatalogue getMarketOfferCatalogue() {
        return marketOfferCatalogue;
    }

    public void setMarketOfferCatalogue(MarketOfferCatalogue marketOfferCatalogue) {
        this.marketOfferCatalogue = marketOfferCatalogue;
    }


    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }

    @Override
    public String toString() {
        return prodName; //To change body of generated methods, choose Tools | Templates.
    }

    public Product() {
        count++;
        modelNumber = count;
        marketOfferCatalogue = new MarketOfferCatalogue();
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

}
