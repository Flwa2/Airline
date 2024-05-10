import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
public class AvailableFlights extends javax.swing.JFrame {

    public AvailableFlights() {
        initComponents();
        // to set Icon image  for a Frame 
        ImageIcon icon = new ImageIcon(getClass().getResource("Logo.jpg"));
        this.setIconImage(icon.getImage());
        Flight[] flights = readFlightsFromFile("flights.txt");
        FlightsToTable();
    }

    protected void FlightsToTable() {
        Flight[] flights = readFlightsFromFile("flights.txt");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (Flight flight : flights) {
            model.addRow(new Object[]{flight.getFlightNumber(), flight.getDepartureCity(), flight.getArrivalCity(),
                flight.getDeparture_time(), flight.getArrival_time()});
        }

        jTable1.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 24));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(32, 136, 203));
        jTable1.getTableHeader().setForeground(new Color(255, 255, 255));
        jTable1.setRowHeight(40);

        //  DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        // Align table content to center
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    protected Flight[] readFlightsFromFile(String filename) {
        Flight[] flights = new Flight[100]; // Assuming a maximum of 100 flights
        int count = 0;
        try (FileInputStream fis = new FileInputStream(new File(filename)); Scanner scanner = new Scanner(fis)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    Flight flight = new Flight(parts[0], parts[1], parts[2], parts[3], parts[4]);
                    flights[count] = flight;
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Flight[] Available_Flights = new Flight[count];
        // Copy flights into the new array
        for (int i = 0; i < count; i++) {
            Available_Flights[i] = flights[i];
        }
        return Available_Flights;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customUI1 = new necesario.CustomUI();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Airline Resevation System");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight ID", "Departure City", "Arrival City", "Departure Time", "Arrival Time"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 850, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 3, 24)); // NOI18N
        jLabel1.setText("Available flights ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 48)); // NOI18N
        jLabel4.setText("<");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 23, 40, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // Close the current frame (SecondFrame)
        dispose();

        // Open the first frame (MainFrame) again
        Airline_Menu Menu = new Airline_Menu();
        Menu.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    public static void main(String args[]) {

        SwingUtilities.invokeLater(AvailableFlights::new);

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AvailableFlights().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private necesario.CustomUI customUI1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
