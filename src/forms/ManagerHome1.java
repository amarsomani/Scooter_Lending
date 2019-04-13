/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import static forms.FirstPage.ManagerId;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 */
public class ManagerHome1 extends javax.swing.JFrame {

    /**
     * Creates new form ManagerHome1
     */
    public ManagerHome1() {
        initComponents();
        jPanelHome.setBackground(Color.black);
        jPanelFeedback.setBackground(Color.ORANGE);
        jTextField1.setText(FirstPage.ManagerId);
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scooter_landing","root","root"); 
           //PreparedStatement ps = con.prepareStatement("select a.vehicle_id,v.vname,v.vehicle_type,a.date,a.start_time,a.duration,a.status,a.customer_id from availability as a left join vehicle as v on vehicle_id = vid and cutomer_id is null");
           PreparedStatement ps = con.prepareStatement("select * from vehicle_feedback");
           ResultSet rs = ps.executeQuery();
           DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
           while(rs.next())
           {
               Object obj[] = {rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4)};
               dtm.addRow(obj);
               
           }
       }catch(ClassNotFoundException | SQLException e){
           e.printStackTrace();
       }
        
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scooter_landing","root","root"); 
           //PreparedStatement ps = con.prepareStatement("select a.vehicle_id,v.vname,v.vehicle_type,a.date,a.start_time,a.duration,a.status,a.customer_id from availability as a left join vehicle as v on vehicle_id = vid and cutomer_id is null");
           PreparedStatement ps = con.prepareStatement("select * from feedbackform");
           ResultSet rs = ps.executeQuery();
           DefaultTableModel dtm = (DefaultTableModel)jTable2.getModel();
           while(rs.next())
           {
               Object obj[] = {rs.getInt(1),rs.getInt(2),rs.getString(3)};
               dtm.addRow(obj);
           }
       }catch(ClassNotFoundException | SQLException e){
           e.printStackTrace();
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
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelHome = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanelChangePassword = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        txtOldPassword = new javax.swing.JPasswordField();
        txtNewPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnUpdatePassword = new javax.swing.JButton();
        jPanelFeedback = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jPanelComplaint = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/managers1.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanelHome.setOpaque(false);
        jPanelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 0));
        jLabel7.setText("               Welcome");
        jPanelHome.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 309, 104));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Helmets-and-Tires-.jpg"))); // NOI18N
        jPanelHome.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 460));

        jTabbedPane.addTab("Home", new javax.swing.ImageIcon(getClass().getResource("/forms/home-icon.png")), jPanelHome); // NOI18N

        jPanelChangePassword.setBackground(new java.awt.Color(0, 51, 51));
        jPanelChangePassword.setOpaque(false);

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 51, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Confirm Password");
        jLabel4.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(0, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("New Password");
        jLabel3.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Old Password");
        jLabel2.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(0, 51, 51));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("Id");
        jLabel5.setOpaque(true);

        btnUpdatePassword.setBackground(new java.awt.Color(255, 0, 0));
        btnUpdatePassword.setText("Update");
        btnUpdatePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelChangePasswordLayout = new javax.swing.GroupLayout(jPanelChangePassword);
        jPanelChangePassword.setLayout(jPanelChangePasswordLayout);
        jPanelChangePasswordLayout.setHorizontalGroup(
            jPanelChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChangePasswordLayout.createSequentialGroup()
                .addGroup(jPanelChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelChangePasswordLayout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(btnUpdatePassword))
                    .addGroup(jPanelChangePasswordLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanelChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanelChangePasswordLayout.createSequentialGroup()
                                .addGroup(jPanelChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(143, 143, 143)
                                .addGroup(jPanelChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                        .addComponent(txtNewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                        .addComponent(jTextField1)))))))
                .addContainerGap(357, Short.MAX_VALUE))
        );
        jPanelChangePasswordLayout.setVerticalGroup(
            jPanelChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChangePasswordLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanelChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(52, 52, 52)
                .addGroup(jPanelChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanelChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanelChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(70, 70, 70)
                .addComponent(btnUpdatePassword)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Change Password", new javax.swing.ImageIcon(getClass().getResource("/forms/change.png")), jPanelChangePassword); // NOI18N

        jPanelFeedback.setOpaque(false);
        jPanelFeedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelFeedbackMouseClicked(evt);
            }
        });

        jTable2.setBackground(new java.awt.Color(0, 204, 51));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "User Id", "Feedback"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jScrollPane4.setViewportView(jScrollPane2);

        jButton3.setBackground(new java.awt.Color(153, 153, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jButton3.setText("Remove this feedback");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFeedbackLayout = new javax.swing.GroupLayout(jPanelFeedback);
        jPanelFeedback.setLayout(jPanelFeedbackLayout);
        jPanelFeedbackLayout.setHorizontalGroup(
            jPanelFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFeedbackLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(95, 95, 95))
        );
        jPanelFeedbackLayout.setVerticalGroup(
            jPanelFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFeedbackLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(78, 78, 78))
        );

        jTabbedPane.addTab("Feedback", jPanelFeedback);

        jPanelComplaint.setOpaque(false);
        jPanelComplaint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelComplaintMouseClicked(evt);
            }
        });
        jPanelComplaint.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jButton2.setText("Remove this complaint");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelComplaint.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, -1));

        jTable1.setBackground(new java.awt.Color(0, 255, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Complaint ID", "user Id", "Vehicle_Id", "Complaint"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanelComplaint.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 330));

        jTabbedPane.addTab("Complaints", new javax.swing.ImageIcon(getClass().getResource("/images/complaint.png")), jPanelComplaint); // NOI18N

        getContentPane().add(jTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 850, 510));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout2.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 100, 80));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/anders_malmberg-shop.jpg"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -20, 1200, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnUpdatePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePasswordActionPerformed

        String oldPass = new String(txtOldPassword.getPassword());
        String newPass = new String(txtNewPassword.getPassword());
        String confirmPass = new String(txtConfirmPassword.getPassword());
        if(oldPass.equals(""))
            JOptionPane.showMessageDialog(this, "Old password field is required");
        else if(newPass.equals(""))
            JOptionPane.showMessageDialog(this, "New password field is required");
        else if(confirmPass.equals(""))
            JOptionPane.showMessageDialog(this, "confirm Password field is required");
        else{
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scooter_landing","root","root");
                PreparedStatement ps = con.prepareStatement("select * from complaintmanager where id = ? and password = ?");
                ps.setString(1,ManagerId);
                ps.setString(2,oldPass);
                ResultSet rs = ps.executeQuery();
                if(rs.next())
                {
                    if(newPass.equals(confirmPass))
                    {
                        PreparedStatement ps1 = con.prepareStatement("update complaintmanager set password = ? where id = ?");
                        ps1.setString(1, newPass);
                        ps1.setString(2, ManagerId);
                        ps1.executeUpdate();
                        JOptionPane.showMessageDialog(this,"hey thats great !!! its changed");

                    }
                    else
                    JOptionPane.showMessageDialog(this,"new pass & confirm new pwd are not same");
                }
                else
                    JOptionPane.showMessageDialog(this,"old password is incorrect");
            }catch(SQLException | ClassNotFoundException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnUpdatePasswordActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Do ypu want to delete the Complaint", "Warning!!!", JOptionPane.YES_NO_OPTION);
        if(confirm == 0)
        {
        int row = jTable1.getSelectedRow();
        String value = jTable1.getModel().getValueAt(row, 0).toString();
        int idToDelete = Integer.parseInt(value);
        ((DefaultTableModel)jTable1.getModel()).removeRow(row);
        System.out.println(idToDelete);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scooter_landing","root","root");
            PreparedStatement ps = con.prepareStatement("delete from vehicle_feedback where complaint_id  = ?");
            ps.setInt(1,idToDelete);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Complaint removed successfully");
        }catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        // TODO add your handling code here:
//        jButton2.setBackground(Color.red);
       
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Do ypu want to delete the feedback", "Warning!!!", JOptionPane.YES_NO_OPTION);
        if(confirm == 0)
        {
        int row = jTable2.getSelectedRow();
        
        int feedbackId =Integer.parseInt(jTable2.getModel().getValueAt(row, 0).toString());
        ((DefaultTableModel)jTable2.getModel()).removeRow(row);
        System.out.println(feedbackId);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scooter_landing","root","root");
            PreparedStatement ps = con.prepareStatement("delete from feedbackform where id = ?");
            ps.setInt(1,feedbackId);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Feedback removed successfully");
          }catch(ClassNotFoundException | SQLException e)
          {
            e.printStackTrace();
          }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        FirstPage ref = new FirstPage();
        ref.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanelFeedbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFeedbackMouseClicked
         try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scooter_landing","root","root"); 
           //PreparedStatement ps = con.prepareStatement("select a.vehicle_id,v.vname,v.vehicle_type,a.date,a.start_time,a.duration,a.status,a.customer_id from availability as a left join vehicle as v on vehicle_id = vid and cutomer_id is null");
           PreparedStatement ps = con.prepareStatement("select * from feedbackform");
           ResultSet rs = ps.executeQuery();
           DefaultTableModel dtm = (DefaultTableModel)jTable2.getModel();
           while(rs.next())
           {
               Object obj[] = {rs.getInt(1),rs.getInt(2),rs.getString(3)};
               dtm.addRow(obj);
           }
       }catch(ClassNotFoundException | SQLException e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_jPanelFeedbackMouseClicked

    private void jPanelComplaintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelComplaintMouseClicked
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scooter_landing","root","root"); 
           //PreparedStatement ps = con.prepareStatement("select a.vehicle_id,v.vname,v.vehicle_type,a.date,a.start_time,a.duration,a.status,a.customer_id from availability as a left join vehicle as v on vehicle_id = vid and cutomer_id is null");
           PreparedStatement ps = con.prepareStatement("select * from vehicle_feedback");
           ResultSet rs = ps.executeQuery();
           DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
           while(rs.next())
           {
               Object obj[] = {rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4)};
               dtm.addRow(obj);
               
           }
       }catch(ClassNotFoundException | SQLException e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_jPanelComplaintMouseClicked

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
            java.util.logging.Logger.getLogger(ManagerHome1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerHome1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerHome1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerHome1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerHome1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdatePassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelChangePassword;
    private javax.swing.JPanel jPanelComplaint;
    private javax.swing.JPanel jPanelFeedback;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtOldPassword;
    // End of variables declaration//GEN-END:variables
}