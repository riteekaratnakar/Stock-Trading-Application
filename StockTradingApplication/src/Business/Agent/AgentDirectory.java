/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Agent;

import java.util.ArrayList;

/**
 *
 * @author Waqar
 */
public class AgentDirectory {

   private ArrayList<Agent> agentList;


    public AgentDirectory() {
        agentList = new ArrayList<Agent>();
    }

    public ArrayList<Agent> getAgentList() {
        return agentList;
    }

    public void setAgentList(ArrayList<Agent> agentList) {
        this.agentList = agentList;
    }

    //Create enterprise
    public Agent createAndAddAgent() {

        Agent agent = new Agent();
        agentList.add(agent);
        return agent;
    }



}
