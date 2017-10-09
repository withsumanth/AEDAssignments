/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author Sumanth
 */
public class Customer {
    private String userName;
    private int id;
    private String fliSerNo;
    private String fliName;
    Seat seat;

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFliSerNo() {
        return fliSerNo;
    }

    public void setFliSerNo(String fliSerNo) {
        this.fliSerNo = fliSerNo;
    }

    public String getFliName() {
        return fliName;
    }

    public void setFliName(String fliName) {
        this.fliName = fliName;
    }
}
