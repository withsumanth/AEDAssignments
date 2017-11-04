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
public class MarketDirectory {
    private ArrayList<Market> marketDirectory;

    public MarketDirectory() {
        marketDirectory = new ArrayList();
    }

    public ArrayList<Market> getMarketDirectory() {
        return marketDirectory;
    }

    public void setMarketDirectory(ArrayList<Market> marketDirectory) {
        this.marketDirectory = marketDirectory;
    }
    
    public Market addMarket(){
        Market s = new Market();
        marketDirectory.add(s);
        return s;
    }
}
