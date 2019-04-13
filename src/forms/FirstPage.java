/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package forms;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVOPC
 */
public class FirstPage extends javax.swing.JFrame {

    /**
     * Creates new form FirstPage
     */
    static String AdminId = null ;
    static String ManagerId = null;
    static int userId;
    public FirstPage() {
        initComponents();
        jPanelAdminLogin.setVisible(false);
        jPanelComplaintManager.setVisible(false);
        jPanelSignup.setVisible(false);
        jLabel15.setBackground(Color.BLACK);
        jLabel15.setForeground(Color.red);
        jPanelAdminLogin.setBackground(Color.ORANGE);
        jPanelComplaintManager.setBackground(Color.ORANGE);
        jPanelSignup.setBackground(Color.ORANGE);
    }
  
     
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelUserLogin = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        LbUsername = new javax.swing.JLabel();
        LbPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPasswordUser = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jPanelAdminLogin = new javax.swing.JPanel();
        txtIdAdmin = new javax.swing.JTextField();
        LabelId = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();
        btnLogin1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSlider1 = new javax.swing.JSlider();
        jPanelComplaintManager = new javax.swing.JPanel();
        lbId = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        txtManagerId = new javax.swing.JTextField();
        btnLoginManager = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPasswordManager = new javax.swing.JPasswordField();
        lbForgetPass = new javax.swing.JLabel();
        jPanelSignup = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtUser1 = new javax.swing.JTextField();
        txtEmailId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSignupConfirmed = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jCheckBoxGear = new javax.swing.JCheckBox();
        jCheckBoxNonGear = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPasswordFieldUser = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelUserLogin.setOpaque(false);

        LbUsername.setText("UserId");

        LbPassword.setText("Password");

        btnLogin.setBackground(new java.awt.Color(0, 0, 204));
        btnLogin.setForeground(new java.awt.Color(0, 255, 0));
        btnLogin.setText("Login");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnSignUp.setBackground(new java.awt.Color(255, 0, 0));
        btnSignUp.setText("Signup");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(51, 204, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forms/UserLogin.gif"))); // NOI18N
        jLabel9.setText("       User Login");

        jLabel15.setBackground(new java.awt.Color(0, 51, 51));
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("Forget Password");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelUserLoginLayout = new javax.swing.GroupLayout(jPanelUserLogin);
        jPanelUserLogin.setLayout(jPanelUserLoginLayout);
        jPanelUserLoginLayout.setHorizontalGroup(
            jPanelUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserLoginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUserLoginLayout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelUserLoginLayout.createSequentialGroup()
                        .addGroup(jPanelUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelUserLoginLayout.createSequentialGroup()
                                .addGroup(jPanelUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LbPassword)
                                    .addComponent(LbUsername))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(jPasswordUser)))
                            .addGroup(jPanelUserLoginLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLogin)
                                .addGap(57, 57, 57)
                                .addComponent(btnSignUp)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanelUserLoginLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelUserLoginLayout.setVerticalGroup(
            jPanelUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserLoginLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(49, 49, 49)
                .addGroup(jPanelUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanelUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbPassword)
                    .addComponent(jPasswordUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanelUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSignUp)
                    .addComponent(btnLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(37, 37, 37))
        );

        getContentPane().add(jPanelUserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 300, 320));

        jPanelAdminLogin.setOpaque(false);

        txtIdAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAdminActionPerformed(evt);
            }
        });

        LabelId.setText("Admin Id");

        LabelPassword.setText("Password");

        btnLogin1.setBackground(new java.awt.Color(0, 51, 255));
        btnLogin1.setText("Login");
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(0, 255, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forms/images (2).jpg"))); // NOI18N
        jLabel10.setText("       Admin Login");

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("Forget Password");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelAdminLoginLayout = new javax.swing.GroupLayout(jPanelAdminLogin);
        jPanelAdminLogin.setLayout(jPanelAdminLoginLayout);
        jPanelAdminLoginLayout.setHorizontalGroup(
            jPanelAdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdminLoginLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanelAdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addGroup(jPanelAdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LabelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(60, 60, 60)
                .addGroup(jPanelAdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdminLoginLayout.createSequentialGroup()
                        .addGroup(jPanelAdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelAdminLoginLayout.setVerticalGroup(
            jPanelAdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdminLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(38, 38, 38)
                .addGroup(jPanelAdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelId)
                    .addComponent(txtIdAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanelAdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPassword)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanelAdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin1)
                    .addComponent(jLabel13))
                .addContainerGap())
        );

        getContentPane().add(jPanelAdminLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 390, 290));

        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, -1, -1));

        lbId.setText("ManagerId");

        lbPassword.setText("Password");

        txtManagerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManagerIdActionPerformed(evt);
            }
        });

        btnLoginManager.setBackground(new java.awt.Color(0, 0, 255));
        btnLoginManager.setText("Login");
        btnLoginManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginManagerMouseClicked(evt);
            }
        });
        btnLoginManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginManagerActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(0, 204, 0));
        jLabel12.setText("       Manager Login");

        lbForgetPass.setBackground(new java.awt.Color(0, 0, 0));
        lbForgetPass.setForeground(new java.awt.Color(255, 0, 0));
        lbForgetPass.setText("Forget Password");
        lbForgetPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbForgetPassMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelComplaintManagerLayout = new javax.swing.GroupLayout(jPanelComplaintManager);
        jPanelComplaintManager.setLayout(jPanelComplaintManagerLayout);
        jPanelComplaintManagerLayout.setHorizontalGroup(
            jPanelComplaintManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelComplaintManagerLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(lbForgetPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLoginManager)
                .addGap(66, 66, 66))
            .addGroup(jPanelComplaintManagerLayout.createSequentialGroup()
                .addGroup(jPanelComplaintManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelComplaintManagerLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanelComplaintManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbId)
                            .addComponent(lbPassword))
                        .addGap(35, 35, 35)
                        .addGroup(jPanelComplaintManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtManagerId, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jPasswordManager)))
                    .addGroup(jPanelComplaintManagerLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelComplaintManagerLayout.setVerticalGroup(
            jPanelComplaintManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComplaintManagerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanelComplaintManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtManagerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbId))
                .addGap(18, 18, 18)
                .addGroup(jPanelComplaintManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPassword)
                    .addComponent(jPasswordManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelComplaintManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoginManager)
                    .addComponent(lbForgetPass))
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanelComplaintManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 485, 270, 190));

        jLabel3.setText("User Id");

        jLabel5.setText("email-Id");

        jLabel6.setText("Contact No");

        txtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNoActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUser1ActionPerformed(evt);
            }
        });

        txtEmailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIdActionPerformed(evt);
            }
        });

        jLabel7.setText("Gender");

        buttonGroup1.add(jRadioButtonMale);
        jRadioButtonMale.setText("Male");

        buttonGroup1.add(jRadioButtonFemale);
        jRadioButtonFemale.setText("Female");

        jLabel8.setText("Can drive");

        btnBack.setBackground(new java.awt.Color(51, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSignupConfirmed.setBackground(new java.awt.Color(255, 0, 0));
        btnSignupConfirmed.setText("Signup");
        btnSignupConfirmed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupConfirmedActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(51, 255, 0));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/signup-icon.png"))); // NOI18N

        jCheckBoxGear.setText("Gear");

        jCheckBoxNonGear.setText("Non gear");

        jLabel4.setText("Name");

        jLabel14.setText("Password");

        javax.swing.GroupLayout jPanelSignupLayout = new javax.swing.GroupLayout(jPanelSignup);
        jPanelSignup.setLayout(jPanelSignupLayout);
        jPanelSignupLayout.setHorizontalGroup(
            jPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSignupLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSignupConfirmed)
                .addGap(142, 142, 142))
            .addGroup(jPanelSignupLayout.createSequentialGroup()
                .addGroup(jPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSignupLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel14)
                            .addComponent(jLabel3))
                        .addGap(72, 72, 72)
                        .addGroup(jPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtContactNo, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                .addComponent(txtEmailId)
                                .addComponent(jCheckBoxGear)
                                .addComponent(jCheckBoxNonGear)
                                .addComponent(txtName)
                                .addComponent(jPasswordFieldUser)
                                .addGroup(jPanelSignupLayout.createSequentialGroup()
                                    .addComponent(jRadioButtonMale)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButtonFemale)))
                            .addComponent(txtUser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelSignupLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel11)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanelSignupLayout.setVerticalGroup(
            jPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSignupLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jPasswordFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(jPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonMale)
                    .addComponent(jRadioButtonFemale)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxGear)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxNonGear)
                .addGap(36, 36, 36)
                .addGroup(jPanelSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignupConfirmed)
                    .addComponent(btnBack))
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanelSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 480, 540));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 70, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forms/Bikes WALLPAPERS.JPG"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 820));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        // TODO add your handling code here:
        int id = Integer.parseInt(txtUsername.getText());
        String password = new String(jPasswordUser.getPassword());
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scooter_landing","root","root");
            PreparedStatement ps = con.prepareStatement("select * from adminlogin where id =? and password =?");
            ps.setInt(1,id);
            ps.setString(2,password);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                JOptionPane.showMessageDialog(this,"welcome");
            }
            else
            JOptionPane.showMessageDialog(this,"Invalid id or password");
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnLoginMouseClicked

    private void txtIdAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAdminActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        int value =jSlider1.getValue();
        if(value == 100){
            jPanelAdminLogin.setVisible(true);
        }
        else if(value <40)
            jPanelAdminLogin.setVisible(false);
    }//GEN-LAST:event_jSlider1StateChanged

    private void txtManagerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManagerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManagerIdActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String UserId = txtUsername.getText();
        String password = new String(jPasswordUser.getPassword());
       
        if(UserId.equals(""))
            JOptionPane.showMessageDialog(this, "id field is required");
        else if(password.equals(""))
            JOptionPane.showMessageDialog(this, "password field is required");
        else
        {
                 userId = Integer.parseInt(txtUsername.getText());
            try{
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scooter_landing","root","root");
                PreparedStatement ps = con.prepareStatement("select * from user where id =? and password =?");
                ps.setInt(1,userId);
                ps.setString(2,password);
                ResultSet rs = ps.executeQuery();
                if(rs.next())
                {
                    JOptionPane.showMessageDialog(this,"welcome");
                    UserHome ref = new UserHome();
                    ref.setVisible(true);
                    dispose();
                }
                else
                    JOptionPane.showMessageDialog(this,"Invalid id or password");
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        // TODO add your handling code here:
        AdminId = txtIdAdmin.getText();
        String password = new String(jPasswordField1.getPassword());
        if(AdminId.equals(""))
            JOptionPane.showMessageDialog(this, "id field is required");
        else if(password.equals(""))
            JOptionPane.showMessageDialog(this, "password field is required");
        else{
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scooter_landing","root","root");
                PreparedStatement ps = con.prepareStatement("select * from adminlogin where id =? and password =?");
                ps.setString(1, AdminId);
                ps.setString(2, password);
                ResultSet rs = ps.executeQuery();
                if(rs.next())
                {
                    //JOptionPane.showMessageDialog(this,"Welcome");
                    AdminHome1 ref= new AdminHome1();
                    ref.setVisible(true);
                    dispose();
                }
                else
                    JOptionPane.showMessageDialog(this,"Invalid id or password");
           }
           catch(ClassNotFoundException | SQLException e){
                e.printStackTrace();
           }
        }
    }//GEN-LAST:event_btnLogin1ActionPerformed

    private void btnLoginManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginManagerActionPerformed
        ManagerId = txtManagerId.getText();
        String password = new String(jPasswordManager.getPassword());
        if(ManagerId.equals(""))
            JOptionPane.showMessageDialog(this, "id field is required");
        else if(password.equals(""))
            JOptionPane.showMessageDialog(this, "password field is required");
        else{
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scooter_landing","root","root");
                PreparedStatement ps = con.prepareStatement("select * from complaintmanager where id = ? and password = ?");
                ps.setString(1, ManagerId);
                ps.setString(2, password);
                ResultSet rs = ps.executeQuery();
                if(rs.next())
                {
                  //JOptionPane.showMessageDialog(this,"Welcome");
                    ManagerHome1 ref = new ManagerHome1();
                    ref.setVisible(true);
                    dispose();
                }
                else
                    JOptionPane.showMessageDialog(this,"Invalid id or password");
           }
           catch(ClassNotFoundException | SQLException e){
                e.printStackTrace();
           }
        }
        
    }//GEN-LAST:event_btnLoginManagerActionPerformed
        int COUNT = 0;
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       
      
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
         ++COUNT;
       if(COUNT == 3)
           jPanelComplaintManager.setVisible(true);
       if(COUNT == 6){
           jPanelComplaintManager.setVisible(false);
           COUNT = 0;
       
       }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnLoginManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginManagerMouseClicked
        String id = txtManagerId.getText();
        String password = new String(jPasswordManager.getPassword());
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:33306/scooter_landing","root","root");
            PreparedStatement ps = con.prepareStatement("select * from complaintManager where id ="+id+" and passsword = "+password);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
                JOptionPane.showMessageDialog(this,"welcome Manager");
            else
                JOptionPane.showMessageDialog(this,"Invalid Manager");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnLoginManagerMouseClicked

    private void txtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUser1ActionPerformed

    private void txtEmailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIdActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
       jPanelAdminLogin.setVisible(false);
       jPanelComplaintManager.setVisible(false);
       jPanelUserLogin.setVisible(false);
       jPanelSignup.setVisible(true);
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        jPanelSignup.setVisible(false);
        jPanelUserLogin.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSignupConfirmedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupConfirmedActionPerformed
        int id =Integer.parseInt(txtUser1.getText());
        String password = new String(jPasswordFieldUser.getPassword());
        String name = txtName.getText();
        long contactNo = Long.parseLong(txtContactNo.getText());
        String email = txtEmailId.getText();
        String gender = null;
        if(jRadioButtonMale.isSelected())
            gender = "male";
        if(jRadioButtonFemale.isSelected())
            gender = "female";
        String canDrive="";
       if(jCheckBoxGear.isSelected()){
            canDrive += "Gear";
        }
        if(jCheckBoxNonGear.isSelected())
            canDrive += "Non gear";
       
//        boolean bikeAbove100CC ,bikeBelow100CC,scooty,scooter;
//        if(jCheckBoxAbove100CC.isSelected()){
//            bikeAbove100CC = true;
//            bikeBelow100CC = true;
//        }
//        if(jCheckBoxBelow100CC.isSelected())
//            bikeBelow100CC = true;
//        if(jCheckBoxScooter.isSelected())
//            scooter = true;
//        if(jCheckBoxScooty.isSelected())
//            scooty = true;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scooter_landing","root","root");
            PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
            ps.setInt(1, id);
            ps.setString(2, password);
            ps.setString(3, name);
            ps.setLong(4, contactNo);
            ps.setString(5, email);
            ps.setString(6,gender);
            ps.setString(7,canDrive);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"Done");
            txtUser1.setText("");
            txtContactNo.setText("");
            txtEmailId.setText("");
            buttonGroup1.clearSelection();
            jCheckBoxGear.setSelected(false);
            jCheckBoxNonGear.setSelected(false);
            
        }
        catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSignupConfirmedActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        AdminId = txtIdAdmin.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scooter_landing","root","root");
            PreparedStatement ps = con.prepareStatement("select * from adminlogin where id = ?");
            ps.setString(1, AdminId);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                ForgetPasswordAdmin ref = new ForgetPasswordAdmin();
                ref.setVisible(true);
                
                dispose();
            }
            else
                JOptionPane.showMessageDialog(this, "Invalid id");
            }
        catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
            
    }//GEN-LAST:event_jLabel13MouseClicked

    private void lbForgetPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbForgetPassMouseClicked
        // TODO add your handling code here:
        String id = txtManagerId.getText();
        if(id.equals(""))
            JOptionPane.showMessageDialog(this, "Id field is required");
        else
        {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scooter_landing","root","root");
                PreparedStatement ps = con.prepareStatement("select * from complaintmanager where id = ?");
                ps.setString(1,id);
                ResultSet rs = ps.executeQuery();
                if(rs.next())
                {
                    JOptionPane.showMessageDialog(this, "your request has been sent to the admin\nYou can login after 2 hrs");
                    jPanelComplaintManager.setVisible(false);
                }
                else
                   JOptionPane.showMessageDialog(this, "Invalid id");
            }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_lbForgetPassMouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        userId = Integer.parseInt(txtUsername.getText());
       
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scooter_landing","root","root");
            PreparedStatement ps = con.prepareStatement("select * from user where id = ?");
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                forgetPasswordUser ref = new forgetPasswordUser();
                ref.setVisible(true);
                
                dispose();
            }
            else
                JOptionPane.showMessageDialog(this, "Invalid id");
            }
        catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelId;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LbPassword;
    private javax.swing.JLabel LbUsername;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JButton btnLoginManager;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JButton btnSignupConfirmed;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBoxGear;
    private javax.swing.JCheckBox jCheckBoxNonGear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelAdminLogin;
    private javax.swing.JPanel jPanelComplaintManager;
    private javax.swing.JPanel jPanelSignup;
    private javax.swing.JPanel jPanelUserLogin;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordFieldUser;
    private javax.swing.JPasswordField jPasswordManager;
    private javax.swing.JPasswordField jPasswordUser;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lbForgetPass;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtIdAdmin;
    private javax.swing.JTextField txtManagerId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUser1;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
