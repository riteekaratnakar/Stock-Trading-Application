/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.User.UserAccount;
import Utility.Constant;

/**
 *
 * @author Waqar
 */
public class SellShare {

    String companyName;
    int noPurchasedShares;
    float atPrice;
    UserAccount customerAccount;
    Constant.RequestStatus requestStatus;

    public Constant.RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(Constant.RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getNoPurchasedShares() {
        return noPurchasedShares;
    }

    public void setNoPurchasedShares(int noPurchasedShares) {
        this.noPurchasedShares = noPurchasedShares;
    }

    public float getAtPrice() {
        return atPrice;
    }

    public void setAtPrice(float atPrice) {
        this.atPrice = atPrice;
    }

    public void setAtPrice(int atPrice) {
        this.atPrice = atPrice;
    }

    public UserAccount getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(UserAccount customerAccount) {
        this.customerAccount = customerAccount;
    }
}
