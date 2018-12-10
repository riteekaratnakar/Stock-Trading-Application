/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Agent;

import Business.Customer.CustomerDirectory;
import Business.Customer.SellShareDirectory;
import Business.Organization.OrganizationDirectory;
import Business.User.*;

/**
 *
 * @author Waqar
 */
public class Agent {

    String name;
    String email;
    float brokeragePercent;
    float totalProfit;
    OrganizationDirectory selectedOrganizationDirectoryList;
    UserAccount userAccount;
    CustomerDirectory customerDirectoryList;
    SellShareDirectory sellShareDirectoryList;

    public Agent() {
        this.selectedOrganizationDirectoryList = new OrganizationDirectory();
        this.userAccount = new UserAccount();
        this.customerDirectoryList = new CustomerDirectory();
        this.sellShareDirectoryList = new SellShareDirectory();
    }

    public SellShareDirectory getSellShareDirectoryList() {
        return sellShareDirectoryList;
    }

    public void setSellShareDirectoryList(SellShareDirectory sellShareDirectoryList) {
        this.sellShareDirectoryList = sellShareDirectoryList;
    }

    public CustomerDirectory getCustomerDirectoryList() {
        return customerDirectoryList;
    }

    public void setCustomerDirectoryList(CustomerDirectory customerDirectoryList) {
        this.customerDirectoryList = customerDirectoryList;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getBrokeragePercent() {
        return brokeragePercent;
    }

    public void setBrokeragePercent(float brokeragePercent) {
        this.brokeragePercent = brokeragePercent;
    }

    public float getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(float totalProfit) {
        this.totalProfit = totalProfit;
    }

    public OrganizationDirectory getSelectedOrganizationDirectoryList() {
        return selectedOrganizationDirectoryList;
    }

    public void setSelectedOrganizationDirectoryList(OrganizationDirectory selectedOrganizationDirectoryList) {
        this.selectedOrganizationDirectoryList = selectedOrganizationDirectoryList;
    }

    @Override
    public String toString() {
        return this.name; //To change body of generated methods, choose Tools | Templates.
    }

}
