/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.User.UserAccount;
import Utility.Constant;
import java.util.ArrayList;

/**
 *
 * @author Riteeka
 */
public class WorkQueue {

    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void setWorkRequestList(ArrayList<WorkRequest> workRequestList) {
        this.workRequestList = workRequestList;
    }

    public WorkRequest createWorkQueueAccount() {

        WorkRequest workRequest = new WorkRequest();

        this.workRequestList.add(workRequest);
        
        return workRequest;
    }

}
