/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

/**
 *
 * @author Waqar
 */
public class Constant {

    public enum EnterpriseType {

        National("National"),
        Domestic("Domestic");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public enum UserType {

        SystemAdmin("System Admin"),
        EnterpriseAdmin("Enterprise Admin"),
        Company("Company"),
        Agent("Agent"),
        Customer("Customer");

        private String value;

        private UserType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public enum RequestStatus {

        Approve("Approve"),
        Pending("Pending"),
        Decline("Decline");

        private String value;

        private RequestStatus(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public enum RequestRaiser {

        Agent("Agent"),
        EnterpriseAdmin("EnterpriseAdmin");

        private String value;

        private RequestRaiser(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
}
