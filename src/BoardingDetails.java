/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.ImageIcon;

public class BoardingDetails extends javax.swing.JFrame {
    BookTickets BooK = new BookTickets(270);
    static String BookId;

    public BoardingDetails() {
        initComponents();
        // to set Icon image  for a Frame 
        ImageIcon icon = new ImageIcon(getClass().getResource("Logo.jpg"));
        this.setIconImage(icon.getImage());
    }

    public BoardingDetails(String fullName, String passportNo, String mobile, String seat) {
        initComponents();
        // to set Icon image  for a Frame 
        ImageIcon icon = new ImageIcon(getClass().getResource("Logo.jpg"));
        this.setIconImage(icon.getImage());

        FullNameShow.setText(fullName);
        PassportNoShow.setText(passportNo);
        MobileShow.setText(mobile);
        SeatTextShow.setText(seat);

        jLabel1.setText(PassengerDetails.depCity);
        jLabel2.setText(PassengerDetails.arrCity);
        FlightNo.setText(PassengerDetails.FlightNO);
        BookId = BooK.generateBookingID();
        jLabel3.setText(BookId);

    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BoardingDetails().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSMaterialButtonCircleBeanInfo1 = new rojerusan.RSMaterialButtonCircleBeanInfo();
        jPanel1 = new javax.swing.JPanel();
        MobileShow = new javax.swing.JLabel();
        Label_1 = new javax.swing.JLabel();
        Header = new javax.swing.JLabel();
        Label_3 = new javax.swing.JLabel();
        DestinationCountry = new javax.swing.JLabel();
        PlaneIcon = new javax.swing.JLabel();
        DeptCountry = new javax.swing.JLabel();
        FullNameShow = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ImageLabel = new javax.swing.JLabel();
        Label_2 = new javax.swing.JLabel();
        PassportNoShow = new javax.swing.JLabel();
        SeatHeader = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        SeatTextShow = new javax.swing.JLabel();
        FlightNoHeader = new javax.swing.JLabel();
        FlightNo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BacktoMenuButton = new rojerusan.RSMaterialButtonCircle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Airline Reservation System");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MobileShow.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MobileShow.setText("XXXXXX");
        jPanel1.add(MobileShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 230, 40));

        Label_1.setBackground(new java.awt.Color(255, 255, 255));
        Label_1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Label_1.setForeground(new java.awt.Color(102, 102, 102));
        Label_1.setText("FIRST NAME");
        jPanel1.add(Label_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 100, 20));

        Header.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Header.setText("Booking information");
        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 370, 50));

        Label_3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Label_3.setForeground(new java.awt.Color(102, 102, 102));
        Label_3.setText("Mobile number");
        jPanel1.add(Label_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 130, 20));

        DestinationCountry.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DestinationCountry.setForeground(new java.awt.Color(102, 102, 102));
        DestinationCountry.setText("TO");
        jPanel1.add(DestinationCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 20, 20));

        PlaneIcon.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        PlaneIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smallplane.png"))); // NOI18N
        jPanel1.add(PlaneIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 40, 40));

        DeptCountry.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DeptCountry.setForeground(new java.awt.Color(102, 102, 102));
        DeptCountry.setText("FROM");
        jPanel1.add(DeptCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, 20));

        FullNameShow.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FullNameShow.setText("XXXXXX");
        jPanel1.add(FullNameShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 300, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 550, 30));

        ImageLabel.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        ImageLabel.setForeground(new java.awt.Color(255, 255, 255));
        ImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barcode.png"))); // NOI18N
        jPanel1.add(ImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 270, 70));

        Label_2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Label_2.setForeground(new java.awt.Color(102, 102, 102));
        Label_2.setText("PASSPORT NO.");
        jPanel1.add(Label_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 130, 20));

        PassportNoShow.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        PassportNoShow.setText("XXXXXX");
        jPanel1.add(PassportNoShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 320, 40));

        SeatHeader.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SeatHeader.setForeground(new java.awt.Color(102, 102, 102));
        SeatHeader.setText("SEAT");
        jPanel1.add(SeatHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 40, 20));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setForeground(new java.awt.Color(207, 0, 15));

        SeatTextShow.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        SeatTextShow.setForeground(new java.awt.Color(255, 255, 255));
        SeatTextShow.setText("XX");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(SeatTextShow)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SeatTextShow, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 90, 50));

        FlightNoHeader.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader.setText("FLIGHT");
        jPanel1.add(FlightNoHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 70, 20));

        FlightNo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FlightNo.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(FlightNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 70, 40));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 90, 30));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 90, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 120, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Booking ID :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, -1));

        BacktoMenuButton.setBackground(new java.awt.Color(102, 102, 102));
        BacktoMenuButton.setText("Back to Menu");
        BacktoMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BacktoMenuButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BacktoMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 300, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BacktoMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BacktoMenuButtonActionPerformed
        this.setVisible(false);
        // Open Airline menu
        AirlineMenu menu = new AirlineMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_BacktoMenuButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonCircle BacktoMenuButton;
    private javax.swing.JLabel DeptCountry;
    private javax.swing.JLabel DestinationCountry;
    private javax.swing.JLabel FlightNo;
    private javax.swing.JLabel FlightNoHeader;
    protected javax.swing.JLabel FullNameShow;
    private javax.swing.JLabel Header;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JLabel Label_1;
    private javax.swing.JLabel Label_2;
    private javax.swing.JLabel Label_3;
    private javax.swing.JLabel MobileShow;
    private javax.swing.JLabel PassportNoShow;
    private javax.swing.JLabel PlaneIcon;
    private javax.swing.JLabel SeatHeader;
    private javax.swing.JLabel SeatTextShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private rojerusan.RSMaterialButtonCircleBeanInfo rSMaterialButtonCircleBeanInfo1;
    // End of variables declaration//GEN-END:variables
}
