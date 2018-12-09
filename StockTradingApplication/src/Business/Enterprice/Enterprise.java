/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprice;

import Business.Agent.AgentDirectory;
import Business.Organization.OrganizationDirectory;
import Business.User.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import Utility.Constant.EnterpriseType;

/**
 *
 * @author Waqar
 */
public class Enterprise {

    String enterpriseName;
    String country;
    EnterpriseType enterpriseType;
    UserAccountDirectory userAccountDirectory;
    OrganizationDirectory organizationDirectoryList;
    AgentDirectory agentDirectoryList;
    WorkQueue workQueueDirecoryRecieved;
    WorkQueue workQueueDirecorySent;


    // private OrganizationDirectory organizationDirectory;
    public Enterprise(String name, EnterpriseType type, String country) {
        this.enterpriseType = type;
        this.enterpriseName = name;
        this.country = country;
        this.userAccountDirectory = new UserAccountDirectory();
        this.organizationDirectoryList = new OrganizationDirectory();
        this.agentDirectoryList = new AgentDirectory();
        this.workQueueDirecoryRecieved = new WorkQueue();
        this.workQueueDirecorySent = new WorkQueue();

    }

    public WorkQueue getWorkQueueDirecoryRecieved() {
        return workQueueDirecoryRecieved;
    }

    public void setWorkQueueDirecoryRecieved(WorkQueue workQueueDirecoryRecieved) {
        this.workQueueDirecoryRecieved = workQueueDirecoryRecieved;
    }

    public WorkQueue getWorkQueueDirecorySent() {
        return workQueueDirecorySent;
    }

    public void setWorkQueueDirecorySent(WorkQueue workQueueDirecorySent) {
        this.workQueueDirecorySent = workQueueDirecorySent;
    }

   

    public AgentDirectory getAgentDirectoryList() {
        return agentDirectoryList;
    }

    public void setAgentDirectoryList(AgentDirectory agentDirectoryList) {
        this.agentDirectoryList = agentDirectoryList;
    }

    public OrganizationDirectory getOrganizationDirectoryList() {
        return organizationDirectoryList;
    }

    public void setOrganizationDirectoryList(OrganizationDirectory organizationDirectoryList) {
        this.organizationDirectoryList = organizationDirectoryList;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    @Override
    public String toString() {
        return enterpriseName; //To change body of generated methods, choose Tools | Templates.
    }

}
