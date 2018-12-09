/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.User.UserAccount;

/**
 *
 * @author Waqar
 */
public class Customer {

    String name;
    String email;
    float balance;
    UserAccount userAccount;
    PurchasedSharesDirectory purchasedSharesDirectory;

    public Customer() {
        this.userAccount = new UserAccount();
        this.purchasedSharesDirectory = new PurchasedSharesDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public PurchasedSharesDirectory getPurchasedSharesDirectory() {
        return purchasedSharesDirectory;
    }

    public void setPurchasedSharesDirectory(PurchasedSharesDirectory purchasedSharesDirectory) {
        this.purchasedSharesDirectory = purchasedSharesDirectory;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
