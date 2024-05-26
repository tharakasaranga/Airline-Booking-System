
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class TicketReciept extends javax.swing.JFrame {

    
    /**
     * Creates new form TicketReciept
     */
    public TicketReciept() {
        initComponents();
    }

    // ticket.setDetails(FirstName,LastName,time,flightNumber,className,TicketId);
    
    public void setDetails(String FirstName,String LastName,String time,String flightNumber,String className,String TicketId,String destination){
        tFirstName.setText(FirstName + " " + LastName);
        tName.setText(FirstName + " " + LastName);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String dateString = dateFormat.format(date);
        tDate.setText(dateString);
        tDate2.setText(dateString);
        tFrom.setText("Sri Lanka");
        tTime.setText(time);
        tTime2.setText(time);
        tFlightNumber.setText(flightNumber);
        tClass.setText(className);
        tTicketNumber.setText(TicketId);
        tTo.setText(destination);
        tTo2.setText(destination);
        
        tDate2.setText(dateString);
        tFrom2.setText("Sri Lanka");
        tTime2.setText(time);
        tFlightNumber2.setText(flightNumber);
        tClass2.setText(className);
        tTicketNumber2.setText(TicketId);
        
        
        printTicket(ticketPanel);
    }
    
    
    public void printTicket(JPanel panel){
        PrinterJob printjob = PrinterJob.getPrinterJob();
        printjob.setJobName("Print Ticket");
        printjob.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
              if(pageIndex > 0){
                  return Printable.NO_SUCH_PAGE;
              }
              
              Graphics2D graphic2D = (Graphics2D)graphics;
              graphic2D.translate(pageFormat.getImageableX()*2, pageFormat.getImageableY()*2);
              
              graphic2D.scale(0.5, 0.5);
              panel.paint(graphic2D);
              return Printable.PAGE_EXISTS;
              
            }
        });
        
            boolean returnResult = printjob.printDialog();
            
            if(returnResult){
                try{
                    printjob.print();
                }catch(PrinterException printerException){
                    JOptionPane.showMessageDialog(this, " Print error" + printerException.getMessage());
                }
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

        ticketPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tFirstName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tFrom = new javax.swing.JTextField();
        tClass = new javax.swing.JTextField();
        tDate = new javax.swing.JTextField();
        tTo = new javax.swing.JTextField();
        tTicketNumber = new javax.swing.JTextField();
        tTime = new javax.swing.JTextField();
        tFlightNumber = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tDate2 = new javax.swing.JTextField();
        tFrom2 = new javax.swing.JTextField();
        tTo2 = new javax.swing.JTextField();
        tTicketNumber2 = new javax.swing.JTextField();
        tClass2 = new javax.swing.JTextField();
        tTime2 = new javax.swing.JTextField();
        tFlightNumber2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tName = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ticketPanel.setBackground(new java.awt.Color(255, 255, 255));
        ticketPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("From");
        ticketPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 110, 40));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Time");
        ticketPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 110, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Ticket Number");
        ticketPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 110, 40));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("To");
        ticketPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 110, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Class");
        ticketPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 110, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barcode.png"))); // NOI18N
        ticketPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 70, 40));

        jLabel22.setFont(new java.awt.Font("Addict", 3, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 153));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Sri Lankan Airline");
        ticketPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 200, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barcode.png"))); // NOI18N
        ticketPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 70, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Date");
        ticketPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 90, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Flight Number");
        ticketPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 110, 40));

        tFirstName.setFont(new java.awt.Font("Thibus29STru", 1, 18)); // NOI18N
        tFirstName.setForeground(new java.awt.Color(0, 0, 0));
        tFirstName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ticketPanel.add(tFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 720, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-flight-64.png"))); // NOI18N
        ticketPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 60, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BOARDING PASS");
        ticketPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 210, 20));

        tFrom.setBackground(new java.awt.Color(255, 255, 255));
        tFrom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tFrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tFrom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        ticketPanel.add(tFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 160, 30));

        tClass.setBackground(new java.awt.Color(255, 255, 255));
        tClass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tClass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tClass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        ticketPanel.add(tClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 160, 30));

        tDate.setBackground(new java.awt.Color(255, 255, 255));
        tDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        ticketPanel.add(tDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 240, 30));

        tTo.setBackground(new java.awt.Color(255, 255, 255));
        tTo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tTo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tTo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        ticketPanel.add(tTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 160, 30));

        tTicketNumber.setBackground(new java.awt.Color(255, 255, 255));
        tTicketNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tTicketNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tTicketNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        ticketPanel.add(tTicketNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 160, 30));

        tTime.setBackground(new java.awt.Color(255, 255, 255));
        tTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tTime.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        ticketPanel.add(tTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 160, 30));

        tFlightNumber.setBackground(new java.awt.Color(255, 255, 255));
        tFlightNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tFlightNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tFlightNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        ticketPanel.add(tFlightNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 160, 30));

        jPanel3.setBackground(new java.awt.Color(0, 0, 204));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 2, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        ticketPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 720, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/worldmap.jpg"))); // NOI18N
        ticketPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tDate2.setBackground(new java.awt.Color(255, 255, 255));
        tDate2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tDate2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tDate2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        jPanel2.add(tDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 160, 30));

        tFrom2.setBackground(new java.awt.Color(255, 255, 255));
        tFrom2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tFrom2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tFrom2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        jPanel2.add(tFrom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 160, 30));

        tTo2.setBackground(new java.awt.Color(255, 255, 255));
        tTo2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tTo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tTo2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        jPanel2.add(tTo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 160, 30));

        tTicketNumber2.setBackground(new java.awt.Color(255, 255, 255));
        tTicketNumber2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tTicketNumber2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tTicketNumber2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        jPanel2.add(tTicketNumber2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 160, 30));

        tClass2.setBackground(new java.awt.Color(255, 255, 255));
        tClass2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tClass2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tClass2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        jPanel2.add(tClass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 160, 30));

        tTime2.setBackground(new java.awt.Color(255, 255, 255));
        tTime2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tTime2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tTime2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        jPanel2.add(tTime2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 160, 30));

        tFlightNumber2.setBackground(new java.awt.Color(255, 255, 255));
        tFlightNumber2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tFlightNumber2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tFlightNumber2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        jPanel2.add(tFlightNumber2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 160, 30));

        jPanel4.setBackground(new java.awt.Color(0, 0, 204));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 2, true));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 320, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BOARDING PASS");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("From");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 90, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Ticket Number");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 90, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("To");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Date");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Time");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 90, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Class");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 90, 40));

        tName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tName.setForeground(new java.awt.Color(0, 0, 0));
        tName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(tName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 290, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Flight Number");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 40));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barcode.png"))); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 70, 40));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barcode.png"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 70, 40));

        jLabel24.setFont(new java.awt.Font("Addict", 3, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 153));
        jLabel24.setText("Sri Lankan Airline");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 130, 30));

        ticketPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 310, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ticketPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ticketPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TicketReciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketReciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketReciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketReciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketReciept().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField tClass;
    private javax.swing.JTextField tClass2;
    private javax.swing.JTextField tDate;
    private javax.swing.JTextField tDate2;
    private javax.swing.JLabel tFirstName;
    private javax.swing.JTextField tFlightNumber;
    private javax.swing.JTextField tFlightNumber2;
    private javax.swing.JTextField tFrom;
    private javax.swing.JTextField tFrom2;
    private javax.swing.JLabel tName;
    private javax.swing.JTextField tTicketNumber;
    private javax.swing.JTextField tTicketNumber2;
    private javax.swing.JTextField tTime;
    private javax.swing.JTextField tTime2;
    private javax.swing.JTextField tTo;
    private javax.swing.JTextField tTo2;
    private javax.swing.JPanel ticketPanel;
    // End of variables declaration//GEN-END:variables
}