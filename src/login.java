
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */

//java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because the return value of "login.getUsername()" is null

public class login extends javax.swing.JFrame {
    
    String url = "jdbc:mysql://localhost:3306/Airline";
    String user = "root";
    String databasepassword = "";
    
    private String username, password;
    public login() {
        initComponents();
        fPassword.setText("<html><u>Forgot Password</u></html>");
        jReg.setText("<html><u>Don't have an account?</u></html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tPassword = new javax.swing.JPasswordField();
        tUsername = new javax.swing.JTextField();
        fPassword = new javax.swing.JLabel();
        checkbox = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jReg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255,80));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Thibus29STru", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 540, 62));

        jLabel3.setFont(new java.awt.Font("Thibus29STru", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Username");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 139, 38));

        jLabel4.setFont(new java.awt.Font("Thibus29STru", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 139, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Thibus29STru", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Exit");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 146, 48));

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setFont(new java.awt.Font("Thibus29STru", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Login");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 146, 48));

        tPassword.setBackground(new java.awt.Color(255, 255, 255,0));
        tPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        tPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(tPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 244, 40));

        tUsername.setBackground(new java.awt.Color(255, 255, 255,0));
        tUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 3, true));
        jPanel2.add(tUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 244, 38));

        fPassword.setFont(new java.awt.Font("Thibus29STru", 1, 18)); // NOI18N
        fPassword.setForeground(new java.awt.Color(0, 0, 0));
        fPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fPasswordMouseClicked(evt);
            }
        });
        jPanel2.add(fPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 270, 40));

        checkbox.setFont(new java.awt.Font("Thibus29STru", 1, 14)); // NOI18N
        checkbox.setForeground(new java.awt.Color(0, 0, 0));
        checkbox.setText("Show Password");
        checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxActionPerformed(evt);
            }
        });
        jPanel2.add(checkbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 540, 310));

        jLabel5.setFont(new java.awt.Font("Abbey-Medium", 1, 48)); // NOI18N
        jLabel5.setText("Welcome to Sri Lankan Airline");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 680, 70));

        jReg.setFont(new java.awt.Font("Thibus29STru", 1, 14)); // NOI18N
        jReg.setForeground(new java.awt.Color(0, 0, 0));
        jReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jReg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRegMouseClicked(evt);
            }
        });
        getContentPane().add(jReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 210, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 770, 530));

        setSize(new java.awt.Dimension(785, 548));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPasswordActionPerformed

    public void setDetails(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    
    
    private void jRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegMouseClicked
        // TODO add your handling code here:
        Register reg = new Register();
        reg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jRegMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    
        String tusername = tUsername.getText();
        String tpassword = tPassword.getText();
        
        
       
          String query = "SELECT username,password FROM users where username = '"+tusername+"' and password = '"+tpassword+"' ";
          
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, databasepassword);

            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            
            String Dusername ,Dpassword;
            if(result.next()) { // Check if there's a matching record
                JOptionPane.showMessageDialog(rootPane, "Welcome to Sri Lankan Airline Booking System");
                    Mainmenu mainmenu = new Mainmenu();
                    mainmenu.setVisible(true);
                    this.dispose();
            }
            
            else{
                JOptionPane.showMessageDialog(rootPane, "Username and password is not match..Try again");
            }
            
              
            connection.close();
        
 
        } catch (Exception e) {
            System.out.println(e);
       
        }
        
        
        /*
        
         Mainmenu mainmenu = new Mainmenu();
        mainmenu.setVisible(true);
        this.dispose();
        */
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int YesNo = JOptionPane.showConfirmDialog(this,"Do you Want to Exit?","Exit",JOptionPane.YES_NO_OPTION);
         
         if(YesNo== JOptionPane.YES_OPTION){
             this.dispose();
         }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fPasswordMouseClicked
        // TODO add your handling code here:
        ForgotPassword password = new ForgotPassword();
        password.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_fPasswordMouseClicked

    private void checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxActionPerformed
        // TODO add your handling code here:

        if(checkbox.isSelected()){
            tPassword.setEchoChar((char)0);
        }
        else{
            tPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_checkboxActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkbox;
    private javax.swing.JLabel fPassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jReg;
    private javax.swing.JPasswordField tPassword;
    private javax.swing.JTextField tUsername;
    // End of variables declaration//GEN-END:variables
}
