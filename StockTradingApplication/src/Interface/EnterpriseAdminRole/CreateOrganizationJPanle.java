/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.EnterpriseAdminRole;

import Business.Enterprice.Enterprise;
import Business.Organization.Organization;
import Utility.Validation;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Waqar
 */
public class CreateOrganizationJPanle extends javax.swing.JPanel {

    JPanel rightContainer;
    Enterprise enterPrise;

    /**
     * Creates new form ManageOrganizationJPanle
     */
    public CreateOrganizationJPanle(JPanel rightContainer, Enterprise enterPrise) {
        initComponents();

        this.rightContainer = rightContainer;
        this.enterPrise = enterPrise;
        this.populateTable();
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableCompany4 = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        textFieldCompnayType4 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        textFieldNumberOfShares3 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        textFieldFaceValue3 = new javax.swing.JTextField();
        textFieldValuePerShare3 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        buttonBack4 = new javax.swing.JButton();
        buttonAddOrganization4 = new javax.swing.JButton();
        textFieldCompnayName3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        tableCompany4.setBackground(new java.awt.Color(204, 204, 255));
        tableCompany4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Company Type", "Company Name", "Total Number of Shares", "Face Value", "Value per Share"
            }
        ));
        jScrollPane6.setViewportView(tableCompany4);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Comapny Type:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Company Name:");

        textFieldCompnayType4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCompnayType4ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Total Number of Shares:");

        textFieldNumberOfShares3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumberOfShares3ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Face Value:");

        textFieldFaceValue3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldFaceValue3ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Share Per Value");

        buttonBack4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonBack4.setText("<<BACK");
        buttonBack4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBack4buttonBackActionPerformed(evt);
            }
        });

        buttonAddOrganization4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonAddOrganization4.setText("Add Organization");
        buttonAddOrganization4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddOrganization4buttonAddOrganizationActionPerformed(evt);
            }
        });

        textFieldCompnayName3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCompnayName3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Add Companies");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(434, 434, 434)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(textFieldNumberOfShares3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel27)
                        .addGap(102, 102, 102)
                        .addComponent(textFieldFaceValue3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel28))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(textFieldValuePerShare3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel26))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGap(301, 301, 301)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textFieldCompnayType4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel25)))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGap(472, 472, 472)
                            .addComponent(textFieldCompnayName3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(buttonBack4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonAddOrganization4)
                .addGap(267, 267, 267))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel25))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jLabel26))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)
                                .addComponent(textFieldNumberOfShares3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel27))
                                    .addComponent(textFieldFaceValue3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel28))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textFieldCompnayType4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addComponent(textFieldValuePerShare3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textFieldCompnayName3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonAddOrganization4)
                            .addComponent(buttonBack4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 260, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCompnayType4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCompnayType4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCompnayType4ActionPerformed

    private void textFieldNumberOfShares3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumberOfShares3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumberOfShares3ActionPerformed

    private void textFieldFaceValue3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldFaceValue3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldFaceValue3ActionPerformed

    private void buttonBack4buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBack4buttonBackActionPerformed
        // TODO add your handling code here:
        rightContainer.remove(this);
        Component[] componentArray = rightContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) rightContainer.getLayout();
        layout.previous(rightContainer);
    }//GEN-LAST:event_buttonBack4buttonBackActionPerformed

    private void buttonAddOrganization4buttonAddOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddOrganization4buttonAddOrganizationActionPerformed
        // TODO add your handling code here:
       try{
           String companyType = textFieldCompnayType4.getText();
           String companyName = textFieldCompnayName3.getText();
           Integer totalNoOfShares = Integer.parseInt(textFieldNumberOfShares3.getText());
           Integer faceValue = Integer.parseInt(textFieldFaceValue3.getText());
           Integer shareValue = Integer.parseInt(textFieldValuePerShare3.getText());
           if(companyType.length() == 0 || companyName== null){
            JOptionPane.showMessageDialog(null, "Please complete all required fields");
        }
            else if(!Validation.isStringOnlyAlphabet(textFieldCompnayType4.getText())){
            JOptionPane.showMessageDialog(null, "Please enter a valid comapany type");    
        }
              else if(!Validation.isStringOnlyAlphabet(textFieldCompnayName3.getText())){
            JOptionPane.showMessageDialog(null, "Please enter a valid company name");    
        }
            else if(!Validation.validateTextFieldsForAmount(textFieldNumberOfShares3)){
            JOptionPane.showMessageDialog(null, "Please enter valid amount ");
        }
            else if(!Validation.validateTextFieldsForAmount(textFieldFaceValue3)){
            JOptionPane.showMessageDialog(null, "Please enter valid amount ");
        }
           else if(!Validation.validateTextFieldsForAmount(textFieldValuePerShare3)){
            JOptionPane.showMessageDialog(null, "Please enter valid amount ");
        }
         
           else{
            Organization obj = this.enterPrise.getOrganizationDirectoryList().createAndAddOrganization();
            obj.setCompnayType(this.textFieldCompnayType4.getText());
            obj.setCompanyName(this.textFieldCompnayName3.getText());
            obj.setTotalNoOfshares(Integer.parseInt(this.textFieldNumberOfShares3.getText()));
            obj.setFaceValue(Integer.parseInt(this.textFieldFaceValue3.getText()));
            obj.setShareVale(Integer.parseInt(this.textFieldValuePerShare3.getText()));
            this.populateTable();}}
       catch(NumberFormatException e){
               JOptionPane.showMessageDialog(null, "Please enter valid inputs","Incorrect Input", JOptionPane.WARNING_MESSAGE);

       }
    }//GEN-LAST:event_buttonAddOrganization4buttonAddOrganizationActionPerformed

    private void textFieldCompnayName3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCompnayName3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCompnayName3ActionPerformed

    private void populateTable() {
        if (this.enterPrise.getOrganizationDirectoryList() != null) {

            DefaultTableModel model = (DefaultTableModel) this.tableCompany4.getModel();
            model.setRowCount(0);
            for (Organization organization : this.enterPrise.getOrganizationDirectoryList().getOrganizationList()) {
                Object[] row = new Object[5];
                row[0] = organization.getCompnayType();
                row[1] = organization.getCompanyName();
                row[2] = organization.getTotalNoOfshares();
                row[3] = organization.getFaceValue();
                row[4] = organization.getShareVale();
                model.addRow(row);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddOrganization4;
    private javax.swing.JButton buttonBack4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tableCompany4;
    private javax.swing.JTextField textFieldCompnayName3;
    private javax.swing.JTextField textFieldCompnayType4;
    private javax.swing.JTextField textFieldFaceValue3;
    private javax.swing.JTextField textFieldNumberOfShares3;
    private javax.swing.JTextField textFieldValuePerShare3;
    // End of variables declaration//GEN-END:variables
}
