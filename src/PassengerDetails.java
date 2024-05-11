
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
public class PassengerDetails extends javax.swing.JFrame {

    private AvailableFlights Airlines = new AvailableFlights();
    public static String depCity;
    public static String arrCity;
    public static String FlightNO;

    public PassengerDetails() {
        initComponents();

    }

    public PassengerDetails(String departureCity, String arrivalCity) {
        initComponents();
        // to set Icon image  for a Frame 
        ImageIcon icon = new ImageIcon(getClass().getResource("Logo.jpg"));
        this.setIconImage(icon.getImage());
        // Convert the first character to uppercase
        depCity = Character.toUpperCase(departureCity.charAt(0)) + departureCity.substring(1);
        arrCity = Character.toUpperCase(arrivalCity.charAt(0)) + arrivalCity.substring(1);
        DepartCountry.setText(depCity);
        arrival_Country.setText(arrCity);
        SeatTextShow.setText(BookFrame.seatcode);
        // Read flights from the file and store them in an array
        Flight[] flights = Airlines.readFlightsFromFile("flights.txt");
        for (Flight flight : flights) {
            if (flight != null && flight.getDepartureCity().equalsIgnoreCase(departureCity)
                    && flight.getArrivalCity().equalsIgnoreCase(arrivalCity)) {
                FlightNo.setText(flight.getFlightNumber());
                FlightNO = flight.getFlightNumber();
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        VerticalSeperator1 = new javax.swing.JSeparator();
        WarningText3 = new javax.swing.JLabel();
        FullNameField = new javax.swing.JTextField();
        MobileText = new javax.swing.JLabel();
        MobileField = new javax.swing.JTextField();
        PassportNoText = new javax.swing.JLabel();
        PassportNoField = new javax.swing.JTextField();
        ContinueButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        SeatTextShow = new javax.swing.JLabel();
        arrival_Country = new javax.swing.JLabel();
        DestinationCountry = new javax.swing.JLabel();
        PlaneIcon = new javax.swing.JLabel();
        HorizontalSeperator1 = new javax.swing.JSeparator();
        OriginCountry1 = new javax.swing.JLabel();
        DepartCountry = new javax.swing.JLabel();
        DepartHeader3 = new javax.swing.JLabel();
        FlightNo = new javax.swing.JLabel();
        FlightNoHeader9 = new javax.swing.JLabel();
        FlightNoHeader10 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        FirstNameText1 = new javax.swing.JLabel();
        WarningText1 = new javax.swing.JLabel();
        WarningText2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Airline Resevation System");
        setResizable(false);

        Main.setBackground(new java.awt.Color(255, 255, 255));
        Main.setForeground(new java.awt.Color(255, 255, 255));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VerticalSeperator1.setBackground(new java.awt.Color(0, 0, 0));
        VerticalSeperator1.setForeground(new java.awt.Color(0, 0, 0));
        VerticalSeperator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Main.add(VerticalSeperator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 10, 360));

        WarningText3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        WarningText3.setForeground(new java.awt.Color(207, 0, 15));
        Main.add(WarningText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 210, 50));

        FullNameField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FullNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNameFieldActionPerformed(evt);
            }
        });
        Main.add(FullNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 390, 40));

        MobileText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        MobileText.setText("Mobile number :");
        Main.add(MobileText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, 50));

        MobileField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Main.add(MobileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 390, 40));

        PassportNoText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PassportNoText.setText("Passport No.");
        Main.add(PassportNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, 50));

        PassportNoField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PassportNoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassportNoFieldActionPerformed(evt);
            }
        });
        Main.add(PassportNoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 390, 40));

        ContinueButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ContinueButton.setText("CONTINUE");
        ContinueButton.setFocusPainted(false);
        ContinueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueButtonActionPerformed(evt);
            }
        });
        Main.add(ContinueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, 160, 60));

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        SeatTextShow.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        SeatTextShow.setForeground(new java.awt.Color(255, 255, 255));
        SeatTextShow.setText("XX");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(SeatTextShow)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SeatTextShow, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        Main.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 100, 50));

        arrival_Country.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        arrival_Country.setForeground(new java.awt.Color(102, 102, 102));
        Main.add(arrival_Country, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 90, 30));

        DestinationCountry.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DestinationCountry.setForeground(new java.awt.Color(102, 102, 102));
        DestinationCountry.setText("TO");
        Main.add(DestinationCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, -1, 12));

        PlaneIcon.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Main.add(PlaneIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 40, -1));
        Main.add(HorizontalSeperator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 280, 10));

        OriginCountry1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        OriginCountry1.setForeground(new java.awt.Color(102, 102, 102));
        OriginCountry1.setText("FROM");
        Main.add(OriginCountry1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, -1, 12));

        DepartCountry.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DepartCountry.setForeground(new java.awt.Color(102, 102, 102));
        Main.add(DepartCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 70, 30));

        DepartHeader3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        DepartHeader3.setText("Passenger Details");
        Main.add(DepartHeader3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 340, 50));

        FlightNo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FlightNo.setForeground(new java.awt.Color(0, 0, 153));
        Main.add(FlightNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 70, 40));

        FlightNoHeader9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader9.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader9.setText("SEAT");
        Main.add(FlightNoHeader9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 70, 20));

        FlightNoHeader10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader10.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader10.setText("FLIGHT");
        Main.add(FlightNoHeader10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 70, 20));

        BackButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BackButton.setText("BACK");
        BackButton.setFocusPainted(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        Main.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 100, 60));

        FirstNameText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FirstNameText1.setText("Full name :");
        Main.add(FirstNameText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, 50));

        WarningText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        WarningText1.setForeground(new java.awt.Color(207, 0, 15));
        Main.add(WarningText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 210, 50));

        WarningText2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        WarningText2.setForeground(new java.awt.Color(207, 0, 15));
        Main.add(WarningText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 210, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smallplane.png"))); // NOI18N
        Main.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 40, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FullNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullNameFieldActionPerformed

    private void PassportNoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassportNoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassportNoFieldActionPerformed

    private void ContinueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueButtonActionPerformed
        if (FullNameField.getText().isEmpty() && PassportNoField.getText().isEmpty() && MobileField.getText().isEmpty()) {
            WarningText1.setText("* Full Name is Required");
            WarningText2.setText("* Passport No. is Required");
            WarningText3.setText("* Mobile number is Required");
        } else if (FullNameField.getText().isEmpty() && PassportNoField.getText().isEmpty()) {
            WarningText1.setText("* Full Name is Required");
            WarningText2.setText("* Passport No. is Required");
            WarningText3.setText("");
        } else if (FullNameField.getText().isEmpty() && MobileField.getText().isEmpty()) {
            WarningText1.setText("* Full Name is Required");
            WarningText2.setText("");
            WarningText3.setText("* Mobile number is Required");
        } else if (MobileField.getText().isEmpty() && PassportNoField.getText().isEmpty()) {
            WarningText1.setText("");
            WarningText2.setText("* Passport No. is Required");
            WarningText3.setText("* Mobile number is Required");
        } else if (FullNameField.getText().isEmpty()) {
            WarningText1.setText("* Full Name is Required");
            WarningText2.setText("");
            WarningText3.setText("");
        } else if (PassportNoField.getText().isEmpty()) {
            WarningText1.setText("");
            WarningText2.setText("* Passport No. is Required");
            WarningText3.setText("");
        } else if (MobileField.getText().isEmpty()) {
            WarningText1.setText("");
            WarningText2.setText("");
            WarningText3.setText("* Mobile number is Required");
        } else {
            String firstName = FullNameField.getText();
            String passportNo = PassportNoField.getText();
            String Mobile = MobileField.getText();
            String seat = SeatTextShow.getText();
            new BoardingDetails(firstName, passportNo, Mobile, seat).setVisible(true); //Passing seat, firstName, lastName, passportNo to ConfirmationForm
            this.setVisible(false);
        }
    }//GEN-LAST:event_ContinueButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        BookFrame book = new BookFrame();
        book.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PassengerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PassengerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PassengerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PassengerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PassengerDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ContinueButton;
    private javax.swing.JLabel DepartCountry;
    private javax.swing.JLabel DepartHeader3;
    private javax.swing.JLabel DestinationCountry;
    private javax.swing.JLabel FirstNameText1;
    private javax.swing.JLabel FlightNo;
    private javax.swing.JLabel FlightNoHeader10;
    private javax.swing.JLabel FlightNoHeader9;
    public static javax.swing.JTextField FullNameField;
    private javax.swing.JSeparator HorizontalSeperator1;
    private javax.swing.JPanel Main;
    public static javax.swing.JTextField MobileField;
    private javax.swing.JLabel MobileText;
    private javax.swing.JLabel OriginCountry1;
    public static javax.swing.JTextField PassportNoField;
    private javax.swing.JLabel PassportNoText;
    private javax.swing.JLabel PlaneIcon;
    private javax.swing.JLabel SeatTextShow;
    private javax.swing.JSeparator VerticalSeperator1;
    private javax.swing.JLabel WarningText1;
    private javax.swing.JLabel WarningText2;
    private javax.swing.JLabel WarningText3;
    private javax.swing.JLabel arrival_Country;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
