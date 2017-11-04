/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author eklav
 */
public class MasterOrderCatalog {
    private ArrayList<OrderList> orderList;
    
    public MasterOrderCatalog(){
        orderList = new ArrayList<OrderList>();
    }

    public ArrayList<OrderList> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<OrderList> orderList) {
        this.orderList = orderList;
    }
    
    public OrderList addOrder(OrderList order){
        
        orderList.add(order);
        return order;
    }
    
    public void removeOrder(OrderList order){
        orderList.remove(order);
    }
}
