/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.EnterpriseAdminRole;

import Business.Agent.Agent;
import Business.Enterprice.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Utility.Constant.UserType;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Utility.Validation;

/**
 *
 * @author Waqar
 */
public class CreateAgentJPanel extends javax.swing.JPanel {

    JPanel rightContainer;
    Enterprise enterprise;
    private String email;

    /**
     * Creates new form CreateAgentJPanel
     */
    public CreateAgentJPanel(JPanel rightContainer, Enterprise enterprise) {
        initComponents();

        this.rightContainer = rightContainer;
        this.enterprise = enterprise;
        this.populateTable();
        this.populateAgentTable();
    }

    public void mail() {

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("riteekaratnakar95@gmail.com", "Riteeka_30");
                    }
                }
        );
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("riteekaratnakar95@gmail.com"));
            System.out.print(email);
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
            message.setSubject("Welcome to the JCoders project");
            message.setText("Hi new sign up done successfully");
            Transport.send(message);
            JOptionPane.showMessageDialog(null, "Mail is sent");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private boolean passwordRegex(String key) {
        Pattern userName = Pattern.compile("(?=.*[A-Za-z0-9])(?=.*[+_$]).{5,15}");
        Matcher m = userName.matcher(key);
        boolean matches = m.matches();
        return matches;
    }

    private boolean matchPassword(String key) {
        boolean match = false;
        if (key.equals(passwordJPasswordField.getText())) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isEmpty(String value) {
        Pattern userName = Pattern.compile("^(?=\\s*\\S).*$");
        Matcher m = userName.matcher(value);
        boolean matches = m.matches();
        return !matches;
    }

    /* private boolean validations() {

     usernameJTextField.setBackground(Color.decode("#FFFFFF"));
     passwordJPasswordField.setBackground(Color.decode("#FFFFFF"));
     retypepasswordJPasswordField.setBackground(Color.decode("#FFFFFF"));
     brokerageTextField.setBackground(Color.decode("#FFFFFF"));
     emailTextField.setBackground(Color.decode("#FFFFFF"));

     if ( this.isEmpty(usernameJTextField.getText()) || this.isEmpty(brokerageTextField.getText())|| this.isEmpty(emailTextField.getText())) {
     JOptionPane.showMessageDialog(this, "Please enter valid inputs");
     //    usernameJTextField.setBackground(Color.decode("#FF9999"));
     passwordJPasswordField.setBackground(Color.decode("#FFFFFF"));
     retypepasswordJPasswordField.setBackground(Color.decode("#FFFFFF"));
     brokerageTextField.setBackground(Color.decode("#FFFFFF"));
     emailTextField.setBackground(Color.decode("#FFFFFF"));
     return false;
     }
     else if (!(passwordRegex(passwordJPasswordField.getText())) || this.isEmpty(passwordJPasswordField.getText())) {
     JOptionPane.showMessageDialog(this, "Enter valid Password.");
     passwordJPasswordField.setBackground(Color.decode("#FF9999"));
     return false;
     } else if (!(matchPassword(retypepasswordJPasswordField.getText()))) {
     JOptionPane.showMessageDialog(this, "Passwords not matching.");
     retypepasswordJPasswordField.setBackground(Color.decode("#FF9999"));
     return false;
     }
     return true;

     } */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCompany = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        usernameJTextField = new javax.swing.JTextField();
        nameJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        createJButton = new javax.swing.JButton();
        emailTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        brokerageTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAgentDetails = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        retypepasswordJPasswordField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        tableCompany.setBackground(new java.awt.Color(204, 204, 255));
        tableCompany.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Company Type", "Company Name"
            }
        ));
        jScrollPane1.setViewportView(tableCompany);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(54, 232, 306, 166);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel1.setText("List of available companies");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(54, 206, 198, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Username:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(440, 240, 98, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Password:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(440, 280, 98, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Name:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(440, 200, 128, 17);
        jPanel1.add(passwordJPasswordField);
        passwordJPasswordField.setBounds(590, 270, 134, 30);
        jPanel1.add(usernameJTextField);
        usernameJTextField.setBounds(590, 230, 136, 30);
        jPanel1.add(nameJTextField);
        nameJTextField.setBounds(590, 190, 136, 30);

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton);
        backJButton.setBounds(54, 463, 103, 29);

        createJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        createJButton.setText("Create");
        createJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(createJButton);
        createJButton.setBounds(473, 463, 253, 29);
        jPanel1.add(emailTextField);
        emailTextField.setBounds(590, 346, 136, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Email ID:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(440, 360, 86, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Brokerage(%):");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(440, 400, 116, 17);
        jPanel1.add(brokerageTextField);
        brokerageTextField.setBounds(590, 390, 136, 30);

        tableAgentDetails.setBackground(new java.awt.Color(204, 204, 255));
        tableAgentDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "User Name", "Password", "Email ID", "Brokerage(%)", "Associated Companies"
            }
        ));
        jScrollPane2.setViewportView(tableAgentDetails);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(54, 34, 835, 131);

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel2.setText("List of Agents");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(424, 11, 102, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Re-type Password:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(440, 320, 136, 17);
        jPanel1.add(retypepasswordJPasswordField);
        retypepasswordJPasswordField.setBounds(590, 305, 134, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/EnterpriseAdminRole/stock.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(28, -6, 1130, 580);

        add(jPanel1);
        jPanel1.setBounds(-30, 0, 940, 570);
    }// </editor-fold>//GEN-END:initComponents

    private void createJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJButtonActionPerformed
        //  if(validations() ){
        try {
            String username = usernameJTextField.getText();
            String password = String.valueOf(passwordJPasswordField.getPassword());
            String name = nameJTextField.getText();
            String retypePassword = String.valueOf(retypepasswordJPasswordField.getPassword());
            email = emailTextField.getText();
            float brokerage = Float.parseFloat(brokerageTextField.getText());

            if (username.length() == 0 || username == null || password.length() == 0 || password == null || name.length() == 0 || retypePassword.length() == 0 || email.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please complete all required fields");
            } else if (!Validation.isStringOnlyAlphabet(nameJTextField.getText())) {
                JOptionPane.showMessageDialog(null, "Please enter a valid text");

            } else if (String.valueOf(brokerage).matches("[a-zA-Z]")) {
                JOptionPane.showMessageDialog(null, "Please Enter Numeric Values");
            } else if (!Validation.validateTextFieldForPercentage(brokerageTextField)) {
                JOptionPane.showMessageDialog(null, "Please enter valid brokerage");
            } else if (!Validation.checkUniquenessOfUserName(username, enterprise)) {
                JOptionPane.showMessageDialog(null, "Username Already Exists");
            } else if (!Validation.validateTextFieldsForEmailId(emailTextField)) {
                JOptionPane.showMessageDialog(null, "Please enter valid email -id ");
            } else if (!password.equals(retypePassword)) {
                JOptionPane.showMessageDialog(null, "Password does not match");
            } else if (!(passwordRegex(passwordJPasswordField.getText()))) {
                JOptionPane.showMessageDialog(this, "Enter valid Password.");
                passwordJPasswordField.setBackground(Color.decode("#FF9999"));
            } else {
                Agent agent = enterprise.getAgentDirectoryList().createAndAddAgent();
                agent.getUserAccount().setName(name);
                agent.getUserAccount().setUserName(username);
                agent.getUserAccount().setPassword(password);
                agent.getUserAccount().setType(UserType.Agent);
                agent.setName(name);
                agent.setBrokeragePercent(brokerage);
                agent.setEmail(email);
                for (int selectedRow : this.tableCompany.getSelectedRows()) {
                    Organization obj = this.enterprise.getOrganizationDirectoryList().getOrganizationList().get(selectedRow);
                    agent.getSelectedOrganizationDirectoryList().addOrganization(obj);
                }
                this.populateAgentTable();
                
                mail();

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid inputs", "Incorrect Input", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_createJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        rightContainer.remove(this);
        Component[] componentArray = rightContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) rightContainer.getLayout();
        layout.previous(rightContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) this.tableCompany.getModel();
        model.setRowCount(0);
        System.out.println(enterprise.getOrganizationDirectoryList().getOrganizationList());
        for (Organization organization : this.enterprise.getOrganizationDirectoryList().getOrganizationList()) {
            Object[] row = new Object[2];
            row[0] = organization.getCompnayType();
            row[1] = organization.getCompanyName();
            model.addRow(row);
        }
    }

    private void populateAgentTable() {
        DefaultTableModel model = (DefaultTableModel) this.tableAgentDetails.getModel();
        model.setRowCount(0);
        for (Agent agent : this.enterprise.getAgentDirectoryList().getAgentList()) {
            Object[] row = new Object[6];
            row[0] = agent.getName();
            row[1] = agent.getUserAccount().getUserName();
            row[2] = agent.getUserAccount().getPassword();
            row[3] = agent.getEmail();
            row[4] = agent.getBrokeragePercent();

            String CompanyName = "";
            for (Organization organization : agent.getSelectedOrganizationDirectoryList().getOrganizationList()) {
                CompanyName += organization.getCompanyName() + ", ";
            }
            row[5] = CompanyName;
            model.addRow(row);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField brokerageTextField;
    private javax.swing.JButton createJButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JPasswordField retypepasswordJPasswordField;
    private javax.swing.JTable tableAgentDetails;
    private javax.swing.JTable tableCompany;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
