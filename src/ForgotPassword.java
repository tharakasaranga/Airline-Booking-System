

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class ForgotPassword extends javax.swing.JFrame {

    String url = "jdbc:mysql://localhost:3306/Airline";
    String user = "root";
    String databasepassword = "";
    
    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tEmpId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        tPassword = new javax.swing.JPasswordField();
        tPassword1 = new javax.swing.JPasswordField();
        checkbox = new javax.swing.JCheckBox();
        checkbox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Forgot Password/Reset Password");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reset Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 15, 720, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 100));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Thibus29STru", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Username");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 90, 20));

        tUsername.setBackground(new java.awt.Color(255, 255, 255));
        tUsername.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        jPanel2.add(tUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 270, 40));

        jLabel3.setFont(new java.awt.Font("Thibus29STru", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Retype New Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 190, 20));

        tEmpId.setBackground(new java.awt.Color(255, 255, 255));
        tEmpId.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tEmpId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tEmpId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        jPanel2.add(tEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 270, 40));

        jLabel4.setFont(new java.awt.Font("Thibus29STru", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Employee Id");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 130, 20));

        jLabel5.setFont(new java.awt.Font("Thibus29STru", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("New Password");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 130, 20));

        jButton6.setBackground(new java.awt.Color(0, 0, 255));
        jButton6.setFont(new java.awt.Font("Thibus29STru", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Cancel");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 170, 50));

        jButton7.setBackground(new java.awt.Color(0, 0, 255));
        jButton7.setFont(new java.awt.Font("Thibus29STru", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Reset ");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 170, 50));

        tPassword.setBackground(new java.awt.Color(255, 255, 255));
        tPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        tPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(tPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 270, 40));

        tPassword1.setBackground(new java.awt.Color(255, 255, 255));
        tPassword1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tPassword1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tPassword1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        tPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPassword1ActionPerformed(evt);
            }
        });
        jPanel2.add(tPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 270, 40));

        checkbox.setFont(new java.awt.Font("Thibus29STru", 1, 18)); // NOI18N
        checkbox.setForeground(new java.awt.Color(0, 0, 0));
        checkbox.setText("Show Password");
        checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxActionPerformed(evt);
            }
        });
        jPanel2.add(checkbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 160, 50));

        checkbox1.setFont(new java.awt.Font("Thibus29STru", 1, 18)); // NOI18N
        checkbox1.setForeground(new java.awt.Color(0, 0, 0));
        checkbox1.setText("Show Password");
        checkbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox1ActionPerformed(evt);
            }
        });
        jPanel2.add(checkbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 160, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 730, 340));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String username = tUsername.getText();
        String EmpId = tEmpId.getText();
        String password1 = tPassword.getText();
        String password2 = tPassword.getText();
        
        
       
        
        if(password1.equals(password2)){
            String query = "SELECT EmployeeId , username FROM users where username = '"+username+"'";
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, databasepassword);

            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            if(result.next()) { // Check if there's a matching record
                String DEmpId = result.getString("EmployeeId");
                String Dusername = result.getString("Username");
         
                              
            
                if(Dusername.equals(username) && DEmpId.equals(EmpId)){

                    String sql = "UPDATE users SET Password = ? WHERE username = ?";

                    try (Connection conn = DriverManager.getConnection(url, user, databasepassword);
                         PreparedStatement pstmt = conn.prepareStatement(sql)) {

                        pstmt.setString(1, password1);
                        pstmt.setString(2, username);
                        pstmt.executeUpdate();

                        JOptionPane.showMessageDialog(rootPane,"Password is successfully Reset.\nNew Password = " + password1);
                        new login().setVisible(true);
                        this.dispose();

                    } catch (SQLException e) {
                        System.out.println("Error updating record: " + e.getMessage());
                    }
                 
               
                }
                else if(!(Dusername.equals(username) && DEmpId.equals(EmpId))) {
                    JOptionPane.showMessageDialog(rootPane, "Username or Employee Id is not correct..Please try again");
               
                }
                else{
                    System.out.println("Try again");
                }
                
                
            }

            connection.close();
        
 
        } catch (Exception e) {
            System.out.println(e);
       
        }
    
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Password should be same.");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void tPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPasswordActionPerformed

    private void tPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPassword1ActionPerformed

    private void checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxActionPerformed
        // TODO add your handling code here:

        if(checkbox.isSelected()){
            tPassword1.setEchoChar((char)0);
        }
        else{
            tPassword1.setEchoChar('*');
        }
    }//GEN-LAST:event_checkboxActionPerformed

    private void checkbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox1ActionPerformed
        // TODO add your handling code here:   
        if(checkbox1.isSelected()){
            tPassword.setEchoChar((char)0);
        }
        else{
            tPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_checkbox1ActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkbox;
    private javax.swing.JCheckBox checkbox1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tEmpId;
    private javax.swing.JPasswordField tPassword;
    private javax.swing.JPasswordField tPassword1;
    private javax.swing.JTextField tUsername;
    // End of variables declaration//GEN-END:variables
}
