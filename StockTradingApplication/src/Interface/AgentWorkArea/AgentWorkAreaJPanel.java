/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AgentWorkArea;

import Business.Agent.Agent;
import Business.Customer.PurchasedShares;
import Business.Enterprice.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Waqar
 */
public class AgentWorkAreaJPanel extends javax.swing.JPanel {

    Network network;
    Enterprise enterprise;
    Agent agent;
    JPanel rightContainer;

    /**
     * Creates new form AgentWorkAreaJPanel
     */
    public AgentWorkAreaJPanel(JPanel rightContainer, Network network, Enterprise enterprise, Agent agent) {
        initComponents();

        this.labelEnterprise.setText(enterprise.getEnterpriseName());
        this.lableNetwork.setText(network.getName());
        this.labelAgentName.setText(agent.getName());
        this.labelEmailID.setText(agent.getEmail());
        this.labelBokerage.setText(String.valueOf(agent.getBrokeragePercent()));

        this.rightContainer = rightContainer;
        this.network = network;
        this.enterprise = enterprise;
        this.agent = agent;
        this.populateTable();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) this.tableCompany.getModel();
        model.setRowCount(0);

        for (Organization organization : this.agent.getSelectedOrganizationDirectoryList().getOrganizationList()) {
            Object[] row = new Object[5];
            row[0] = organization.getCompnayType();
            row[1] = organization.getCompanyName();
            row[2] = organization.getTotalNoOfshares();
            row[3] = organization.getFaceValue();
            row[4] = organization.getShareVale();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCompany = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lableNetwork = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        labelEnterprise = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        labelEmailID = new javax.swing.JLabel();
        labelAgentName = new javax.swing.JLabel();
        labelBokerage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Associated Companies");
        add(jLabel1);
        jLabel1.setBounds(385, 57, 200, 17);

        tableCompany.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableCompany);

        add(jScrollPane1);
        jScrollPane1.setBounds(19, 82, 602, 174);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Portfolio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(265, 289, 110, 29);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(111, 289, 100, 29);

        lableNetwork.setText("<value>");
        add(lableNetwork);
        lableNetwork.setBounds(145, 11, 130, 16);

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel1.setText("Network");
        add(enterpriseLabel1);
        enterpriseLabel1.setBounds(19, 0, 120, 30);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(319, 1, 120, 30);

        labelEnterprise.setText("<value>");
        add(labelEnterprise);
        labelEnterprise.setBounds(457, 12, 130, 16);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setText("Agent Name:");
        add(jLabel6);
        jLabel6.setBounds(652, 82, 100, 20);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setText("Email ID:");
        add(jLabel7);
        jLabel7.setBounds(652, 114, 90, 17);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setText("Brokerage(%):");
        add(jLabel8);
        jLabel8.setBounds(656, 152, 100, 17);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Request to Add Companies");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5);
        jButton5.setBounds(398, 289, 230, 29);

        labelEmailID.setText("jLabel2");
        add(labelEmailID);
        labelEmailID.setBounds(727, 114, 100, 16);

        labelAgentName.setText("jLabel2");
        add(labelAgentName);
        labelAgentName.setBounds(760, 80, 70, 16);

        labelBokerage.setText("jLabel2");
        add(labelBokerage);
        labelBokerage.setBounds(757, 152, 70, 16);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/AgentWorkArea/stock.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(2, -3, 830, 410);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        rightContainer.remove(this);
        Component[] componentArray = rightContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) rightContainer.getLayout();
        layout.previous(rightContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
               DefaultCategoryDataset dataset = new DefaultCategoryDataset();
                for (Organization e : enterprise.getOrganizationDirectoryList().getOrganizationList()) {
                        dataset.setValue(e.getTotalNoOfshares(), "Total Price", e.getCompanyName());
                    
                }
            
        JFreeChart chart =  ChartFactory.createBarChart3D("Shares Report", "Company Name", "No of shares purchased", dataset, PlotOrientation.VERTICAL, false, true, false);
        chart.setBackgroundPaint(Color.GRAY);
        chart.getTitle().setPaint(Color.BLUE);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLACK);
        ChartFrame frame = new ChartFrame("Bar Chart for Customer", chart);
        frame.setVisible(true);
        frame.setSize(450, 350);

        try {
            final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
            final File file1 = new File("Customer_Report.png");
            ChartUtilities.saveChartAsPNG(file1, chart, 600, 400, info);

        } catch (Exception e) {

        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAgentName;
    private javax.swing.JLabel labelBokerage;
    private javax.swing.JLabel labelEmailID;
    private javax.swing.JLabel labelEnterprise;
    private javax.swing.JLabel lableNetwork;
    private javax.swing.JTable tableCompany;
    // End of variables declaration//GEN-END:variables
}
