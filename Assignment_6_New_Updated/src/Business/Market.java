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
public class Market {

    private String marketName;
    CustomerDirectory customerDirectory;
    MarketOffer offer;

    public Market() {
        customerDirectory = new CustomerDirectory();
        offer = new MarketOffer();
    }
    

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    @Override
    public String toString(){
        return marketName;
    }

}
