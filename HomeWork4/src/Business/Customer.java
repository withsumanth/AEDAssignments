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
    private String name;
    private int age;
    private int phNo;
    private String addr;
    private String fliSerNo;
    private String fliName;
    private Date fliDeparture;
    private String fliOrigin;
    private String fliDestination;
    private String dliTimeOfDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhNo() {
        return phNo;
    }

    public void setPhNo(int phNo) {
        this.phNo = phNo;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
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

    public Date getFliDeparture() {
        return fliDeparture;
    }

    public void setFliDeparture(Date fliDeparture) {
        this.fliDeparture = fliDeparture;
    }

    public String getFliOrigin() {
        return fliOrigin;
    }

    public void setFliOrigin(String fliOrigin) {
        this.fliOrigin = fliOrigin;
    }

    public String getFliDestination() {
        return fliDestination;
    }

    public void setFliDestination(String fliDestination) {
        this.fliDestination = fliDestination;
    }

    public String getDliTimeOfDay() {
        return dliTimeOfDay;
    }

    public void setDliTimeOfDay(String dliTimeOfDay) {
        this.dliTimeOfDay = dliTimeOfDay;
    }
}
