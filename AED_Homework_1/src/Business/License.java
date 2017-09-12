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
public class License {
    String licNo;
    String licDateOfIssue;
    String licDateOfExpiry;
    String licClass;
    String licIssueCity;

    public String getLicNo() {
        return licNo;
    }

    public void setLicNo(String licNo) {
        this.licNo = licNo;
    }

    public String getLicDateOfIssue() {
        return licDateOfIssue;
    }

    public void setLicDateOfIssue(String licDateOfIssue) {
        this.licDateOfIssue = licDateOfIssue;
    }

    public String getLicDateOfExpiry() {
        return licDateOfExpiry;
    }

    public void setLicDateOfExpiry(String licDateOfExpiry) {
        this.licDateOfExpiry = licDateOfExpiry;
    }

    public String getLicClass() {
        return licClass;
    }

    public void setLicClass(String licClass) {
        this.licClass = licClass;
    }

    public String getLicIssueCity() {
        return licIssueCity;
    }

    public void setLicIssueCity(String licIssueCity) {
        this.licIssueCity = licIssueCity;
    }
    
}
