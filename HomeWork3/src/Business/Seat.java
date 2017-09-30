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
public class Seat {
    
    public int seatType(String type){
        int value = 0;
        if(type.equals("window")){
            value = 500;
        }else if(type.equals("middle")){
            value = 400;
        }else{
            value = 300;
        }
         return value;
    }
}
