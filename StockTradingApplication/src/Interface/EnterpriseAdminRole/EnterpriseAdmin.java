/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.EnterpriseAdminRole;

import Business.Enterprice.Enterprise;
import Business.Network.Network;
import Business.StockTrading;
import Business.User.UserAccount;
import Interface.EnterpriseAdminRole.ManageRequest.ManageRequestJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Waqar
 */
public class EnterpriseAdmin extends javax.swing.JPanel {

    JPanel rightContainer;
    Network network;
    Enterprise enterprice;
    StockTrading stockInstance;
    UserAccount userAccount;

    /**
     * Creates new form EterpriceAdminRole
     */
    public EnterpriseAdmin(JPanel rightContainer, Network network, Enterprise enterprice, StockTrading stockInstance, UserAccount userAccount) {
        initComponents();
        this.rightContainer = rightContainer;
        this.network = network;
        this.enterprice = enterprice;
        this.stockInstance = stockInstance;
        this.userAccount = userAccount;

        this.lableNetwork.setText(network.getName());
        this.labelEnterprise.setText(enterprice.getEnterpriseName());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        labelEnterprise = new javax.swing.JLabel();
        manageOrganizationJButton = new javax.swing.JButton();
        manageAgentJButton = new javax.swing.JButton();
        userJButton = new javax.swing.JButton();
        enterpriseLabel1 = new javax.swing.JLabel();
        lableNetwork = new javax.swing.JLabel();
        userJButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Enterprise Admin");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 50, 205, 29);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        jPanel1.add(enterpriseLabel);
        enterpriseLabel.setBounds(290, 120, 120, 30);

        labelEnterprise.setText("<value>");
        jPanel1.add(labelEnterprise);
        labelEnterprise.setBounds(430, 130, 130, 16);

        manageOrganizationJButton.setBackground(new java.awt.Color(204, 255, 204));
        manageOrganizationJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        manageOrganizationJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/EnterpriseAdminRole/icons8_Organization_50px.png"))); // NOI18N
        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(manageOrganizationJButton);
        manageOrganizationJButton.setBounds(260, 170, 240, 40);

        manageAgentJButton.setBackground(new java.awt.Color(204, 255, 204));
        manageAgentJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        manageAgentJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/EnterpriseAdminRole/icons8_Management_64px_1.png"))); // NOI18N
        manageAgentJButton.setText("Manage Agent");
        manageAgentJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manageAgentJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAgentJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(manageAgentJButton);
        manageAgentJButton.setBounds(260, 220, 240, 40);

        userJButton.setBackground(new java.awt.Color(204, 255, 204));
        userJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/EnterpriseAdminRole/icons8_Request_Money_50px.png"))); // NOI18N
        userJButton.setText("Manage Request");
        userJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(userJButton);
        userJButton.setBounds(260, 320, 240, 40);

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel1.setText("Network");
        jPanel1.add(enterpriseLabel1);
        enterpriseLabel1.setBounds(290, 80, 120, 30);

        lableNetwork.setText("<value>");
        jPanel1.add(lableNetwork);
        lableNetwork.setBounds(430, 90, 130, 16);

        userJButton1.setBackground(new java.awt.Color(204, 255, 204));
        userJButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/EnterpriseAdminRole/icons8_Customer_50px.png"))); // NOI18N
        userJButton1.setText("Manage Customer");
        userJButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(userJButton1);
        userJButton1.setBounds(260, 270, 240, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/EnterpriseAdminRole/stock.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 740, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        CreateOrganizationJPanle manageOrganizationJPanel = new CreateOrganizationJPanle(rightContainer, this.enterprice);
        rightContainer.add(manageOrganizationJPanel);
        CardLayout layout = (CardLayout) rightContainer.getLayout();
        layout.next(rightContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void manageAgentJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAgentJButtonActionPerformed

        CreateAgentJPanel createAgentJPanel = new CreateAgentJPanel(rightContainer, this.enterprice);
        rightContainer.add(createAgentJPanel);
        CardLayout layout = (CardLayout) rightContainer.getLayout();
        layout.next(rightContainer);

    }//GEN-LAST:event_manageAgentJButtonActionPerformed

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageRequestJPanel manageRequest = new ManageRequestJPanel(rightContainer, this.stockInstance, this.enterprice, this.userAccount);
        rightContainer.add(manageRequest);
        CardLayout layout = (CardLayout) rightContainer.getLayout();
        layout.next(rightContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void userJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButton1ActionPerformed
        // TODO add your handling code here:
        
        CreateCustomerJPanel createCustomer = new CreateCustomerJPanel(rightContainer, this.enterprice);
        rightContainer.add(createCustomer);
        CardLayout layout = (CardLayout) rightContainer.getLayout();
        layout.next(rightContainer);

    }//GEN-LAST:event_userJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEnterprise;
    private javax.swing.JLabel lableNetwork;
    private javax.swing.JButton manageAgentJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    private javax.swing.JButton userJButton1;
    // End of variables declaration//GEN-END:variables
}
