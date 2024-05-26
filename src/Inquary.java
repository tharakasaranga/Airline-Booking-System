import java.awt.Color;
import java.awt.Font;
import net.proteanit.sql.DbUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class Inquary extends javax.swing.JFrame {

    
        String url = "jdbc:mysql://localhost:3306/Airline";
        String user = "root";
        String databasepassword = ""; 
    /**
     * Creates new form Inquary
     */
    public Inquary() {
        initComponents();
        center();
        setWidth();
        setFlightDetails();
        setPassengerDetails();
        
    }

    
    public void setWidth(){
        TableColumnModel columnModel = tblFlight.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(100);  // FlightNumber
        columnModel.getColumn(1).setPreferredWidth(100);  // Destination
        columnModel.getColumn(2).setPreferredWidth(100);  // Arrival_time
        columnModel.getColumn(3).setPreferredWidth(100);  // Departure_time
        columnModel.getColumn(4).setPreferredWidth(100);  // Available Seats
        columnModel.getColumn(5).setPreferredWidth(100);  // Class
        columnModel.getColumn(6).setPreferredWidth(100);  // Base amount


        TableColumnModel columnMode2 = tblPassenger.getColumnModel();
        columnMode2.getColumn(0).setPreferredWidth(70); 
        columnMode2.getColumn(1).setPreferredWidth(50); 
        columnMode2.getColumn(2).setPreferredWidth(50); 
        columnMode2.getColumn(3).setPreferredWidth(120); 
        columnMode2.getColumn(4).setPreferredWidth(100); 
        columnMode2.getColumn(5).setPreferredWidth(50); 
        columnMode2.getColumn(6).setPreferredWidth(20); 
        columnMode2.getColumn(7).setPreferredWidth(70); 
        columnMode2.getColumn(8).setPreferredWidth(50); 
        columnMode2.getColumn(9).setPreferredWidth(40); 
        columnMode2.getColumn(10).setPreferredWidth(40); 
        columnMode2.getColumn(11).setPreferredWidth(80); 
     
        
        tblPassenger.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        tblPassenger.getTableHeader().setOpaque(false);
        tblPassenger.getTableHeader().setBackground(new Color(32,136,203));
        tblPassenger.getTableHeader().setForeground(new Color(0,0,0));
        tblPassenger.setRowHeight(30);
        
        
        tblFlight.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        tblFlight.getTableHeader().setOpaque(false);
        tblFlight.getTableHeader().setBackground(new Color(32,136,203));
        tblFlight.getTableHeader().setForeground(new Color(0,0,0));
        tblFlight.setRowHeight(30);
       
        
        
    }
    public void center(){
        /*
         DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Apply the renderer to all columns of the tblPassenger table
        int columnCount = tblPassenger.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            tblPassenger.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);   
        }
        
        
        int columnCount2 = tblFlight.getColumnCount();
        for (int i = 0; i < columnCount2; i++) {
            tblFlight.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);   
        }
        */
    }
    
    public void search(){
        center();
       String search = tSearch.getText();
        
            try {
               String sql = "SELECT c.IdNumber as IdNumber, c.firstname as FirstName, c.lastName as LastName, c.email as Email, c.phoneNumber as PhoneNumber, c.address as Address, c.sex as Sex, " +
                            "t.TicketId, t.destination as Destination, " +
                            "p.payementMethod as PaymentMethod, p.paidAmount as Amount " +
                            "FROM customer c " +
                            "JOIN ticket t ON c.IdNumber = t.IDnumber " +
                            "JOIN payment p ON p.ticketid = t.ticketid " +
                            "WHERE c.firstname LIKE '%" + search + "%' OR " +
                            "c.lastName LIKE '%" + search + "%' OR " +
                            "c.address LIKE '%" + search + "%' OR " +
                            "c.IdNumber LIKE '%" + search + "%' OR " +
                            "c.sex LIKE '%" + search + "%' OR " +
                            "c.email LIKE '%" + search + "%' OR " +
                            "t.TicketId LIKE '%" + search + "%' OR " +
                            "t.destination LIKE '%" + search + "%' OR " +
                            "p.payementMethod LIKE '%" + search + "%' OR " +
                            "p.paidAmount LIKE '%" + search + "%'";

               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection connection = DriverManager.getConnection(url, user, databasepassword);
               Statement statement = connection.createStatement();
               ResultSet result = statement.executeQuery(sql);
               tblPassenger.setModel(DbUtils.resultSetToTableModel(result));
           } catch (Exception e) {
               JOptionPane.showMessageDialog(rootPane, e);
           }


         try {
             String sql2 = "SELECT f.flightNumber AS FlightNumber, f.destination AS Destination, " +
                  "f.Arrival_time AS Arrival_time, f.Departure_time AS Departure_Time, " +
                  "fc.NumberOfSeats AS Available_Seats, fc.className AS Class, " +
                  "fc.Baseprice AS Base_Amount " +
                  "FROM flight f " +
                  "JOIN flightClass fc ON f.flightNumber = fc.flightNumber " +
                  "WHERE f.flightNumber LIKE '%" + search + "%' " +
                  "OR f.Arrival_time LIKE '%" + search + "%' " +
                  "OR f.Departure_time LIKE '%" + search + "%' " +
                  "OR f.destination LIKE '%" + search + "%' " +
                  "OR fc.className LIKE '%" + search + "%' " +
                  "OR fc.Baseprice LIKE '%" + search + "%' " +
                  "OR fc.NumberOfSeats LIKE '%" + search + "%'";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,user,databasepassword);
            Statement statement = connection.createStatement();
            ResultSet result2 = statement.executeQuery(sql2);
            tblFlight.setModel(DbUtils.resultSetToTableModel(result2));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);         
        }
        

        
    }
    
    
    
   public void setPassengerDetails(){
    String query = "SELECT c.firstName, c.Lastname, c.email, c.PhoneNumber, c.Address, c.IdNumber, c.sex, " +
                   "p.payementMethod, p.paidAmount, t.ticketId, t.FlightNumber, t.destination " +
                   "FROM customer c " +
                   "JOIN ticket t ON t.IDNumber = c.IdNumber " +
                   "JOIN payment p ON p.CustomerID = c.IdNumber";

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, user, databasepassword);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery(query);

        DefaultTableModel model = (DefaultTableModel) tblPassenger.getModel();

        // Clear existing rows in the model
        model.setRowCount(0);

        while (resultSet.next()) {
            String FirstName = resultSet.getString("firstName");
            String Lastname = resultSet.getString("Lastname");
            String email = resultSet.getString("email");
            String PhoneNumber = resultSet.getString("PhoneNumber");
            String Address = resultSet.getString("Address");
            String IdNumber = resultSet.getString("IdNumber");
            String sex = resultSet.getString("sex");
            String paymentMethod = resultSet.getString("payementMethod");
            String paidAmount = resultSet.getString("paidAmount");
            String ticketId = resultSet.getString("ticketId");
            String FlightNumber = resultSet.getString("FlightNumber");
            String destination = resultSet.getString("destination");

            String[] rowData = {IdNumber, FirstName, Lastname, email, PhoneNumber, Address, sex, paymentMethod, destination, FlightNumber, ticketId, paidAmount};
            model.addRow(rowData);
        }

        resultSet.close();
        statement.close();
        connection.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    
    
    public void setFlightDetails(){
        String query = "SELECT fc.ClassName, fc.BasePrice, fc.NumberOfSeats, f.FlightNumber, f.Arrival_time, f.Departure_time, f.Destination " +
                       "FROM flight f " +
                       "JOIN flightclass fc ON fc.flightNumber = f.flightNumber";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, databasepassword);
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = statement.executeQuery(query);

            DefaultTableModel model = (DefaultTableModel) tblFlight.getModel();

            // Clear existing rows in the model
           model.setRowCount(0);

            while (resultSet.next()) {
                String className = resultSet.getString("ClassName");
                String basePrice = resultSet.getString("BasePrice");
                String seatCount = resultSet.getString("NumberOfSeats");
                String flightNumber = resultSet.getString("FlightNumber");
                String arrivalTime = resultSet.getString("Arrival_time");
                String departureTime = resultSet.getString("Departure_time");
                String destination = resultSet.getString("Destination");

                String[] rowData = {flightNumber, destination, arrivalTime, departureTime, seatCount, className, basePrice};
                model.addRow(rowData);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jOption = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFlight = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPassenger = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Information Inquary");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        jPanel1.setForeground(new java.awt.Color(255, 204, 51));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 60, 60));

        tSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSearchActionPerformed(evt);
            }
        });
        tSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tSearchKeyReleased(evt);
            }
        });
        jPanel1.add(tSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 270, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Information Inquary");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 360, 60));

        jOption.setBackground(new java.awt.Color(0, 0, 255));
        jOption.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flight Infomation", "Passenger Information" }));
        jOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOptionActionPerformed(evt);
            }
        });
        jPanel1.add(jOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 70, 260, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 120));

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 510, 150, 50));

        jTabbedPane1.setEnabled(false);

        tblFlight.setAutoCreateRowSorter(true);
        tblFlight.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tblFlight.setFont(new java.awt.Font("Thibus29STru", 0, 14)); // NOI18N
        tblFlight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "FlightNumber", "Destination", "Arrival_Time", "Departure_Time", "Available Seats", "Class", "Base_Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFlight.setToolTipText("");
        tblFlight.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblFlight.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblFlight.setDoubleBuffered(true);
        tblFlight.setDragEnabled(true);
        tblFlight.setRowHeight(30);
        tblFlight.setRowMargin(2);
        jScrollPane1.setViewportView(tblFlight);
        if (tblFlight.getColumnModel().getColumnCount() > 0) {
            tblFlight.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        jTabbedPane1.addTab("Flights Information", jScrollPane1);

        tblPassenger.setAutoCreateRowSorter(true);
        tblPassenger.setFont(new java.awt.Font("Thibus29STru", 0, 14)); // NOI18N
        tblPassenger.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Number", "First Name", "Last Name", "Email", "Phone Number", "Address", "Sex", "Payment Method", "Destination", "Flight Number", "Ticket Id", "Paid Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPassenger.setRowHeight(30);
        tblPassenger.setSelectionBackground(new java.awt.Color(255, 0, 0));
        tblPassenger.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblPassenger);
        if (tblPassenger.getColumnModel().getColumnCount() > 0) {
            tblPassenger.getColumnModel().getColumn(6).setPreferredWidth(30);
        }

        jTabbedPane1.addTab("Passenger Infotmation", jScrollPane2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1170, 370));

        jButton5.setBackground(new java.awt.Color(153, 153, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Book");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 150, 50));

        jButton6.setBackground(new java.awt.Color(153, 153, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Cancelling");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 150, 50));

        setSize(new java.awt.Dimension(1183, 619));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int YesNo = JOptionPane.showConfirmDialog(this,"Do you Want to Exit?","Exit",JOptionPane.YES_NO_OPTION);
         
         if(YesNo== JOptionPane.YES_OPTION){
             new Mainmenu().setVisible(true);
             this.dispose();
         }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOptionActionPerformed
        // TODO add your handling code here:
        String option = jOption.getSelectedItem().toString();
        if(option.equals("Flight Infomation")){
           jTabbedPane1.setSelectedIndex(0);
        }
         
        //Flight Infomation, Passenger Information
        else if(option.equals("Passenger Information")){
           jTabbedPane1.setSelectedIndex(1);
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"error.....");
        }
        
        
    }//GEN-LAST:event_jOptionActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int YesNo = JOptionPane.showConfirmDialog(this,"Do you Want to Book?","Book",JOptionPane.YES_NO_OPTION);
         
         if(YesNo== JOptionPane.YES_OPTION){
             new Booking().setVisible(true);
             this.dispose();
         }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new Cancelling().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tSearchKeyReleased
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_tSearchKeyReleased

    private void tSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tSearchActionPerformed

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
            java.util.logging.Logger.getLogger(Inquary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inquary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inquary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inquary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inquary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> jOption;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField tSearch;
    private javax.swing.JTable tblFlight;
    private javax.swing.JTable tblPassenger;
    // End of variables declaration//GEN-END:variables
}
