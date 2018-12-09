/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.User.UserAccount;
import Utility.Constant.RequestRaiser;
import Utility.Constant.RequestStatus;
import java.util.Date;

/**
 *
 * @author Riteeka
 */
public class WorkRequest {

    private UserAccount sender;
    private RequestStatus status;
    private RequestRaiser requestRaiser;

    private Date requestDate;
    String networkName;
    String EnterpriseName;
    String CompanyName;

    public WorkRequest() {
        requestDate = new Date();

    }

    public RequestRaiser getRequestRaiser() {
        return requestRaiser;
    }

    public void setRequestRaiser(RequestRaiser requestRaiser) {
        this.requestRaiser = requestRaiser;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public RequestStatus getStatus() {
        return status;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public String getEnterpriseName() {
        return EnterpriseName;
    }

    public void setEnterpriseName(String EnterpriseName) {
        this.EnterpriseName = EnterpriseName;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    

}
