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
public class OrderList {

    private ArrayList<Order> orderList;
    private int orderNumber;
    private static int count = 0;

    public OrderList() {
        orderList = new ArrayList<Order>();

        count++;
        orderNumber = count;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Order addOrderItem(Product product, int quantity, double salesPrice,SalesPerson salesPerson,Customer customer,Market market,MarketOffer offer) {

        Order orderItem = new Order();
        orderItem.setProduct(product);
        orderItem.setQuantity(quantity);
        orderItem.setSalesPrice(salesPrice);
        orderItem.setMarket(market);
        orderItem.setSalesPerson(salesPerson);
        orderItem.setCustomer(customer);
        orderItem.setOffer(offer);
        orderList.add(orderItem);
        return orderItem;
    }

    public void removeOrderItem(Order orderItem) {
        orderList.remove(orderItem);
    }
}
