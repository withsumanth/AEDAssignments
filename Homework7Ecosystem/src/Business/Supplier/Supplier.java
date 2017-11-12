/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import Business.Inventory.Inventory;

/**
 *
 * @author Sumanth
 */
public class Supplier {
    Supplier name;
    Inventory inventory;

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Supplier getName() {
        return name;
    }

    public void setName(Supplier name) {
        this.name = name;
    }
}
