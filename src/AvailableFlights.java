


import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
public class AvailableFlights extends javax.swing.JFrame {

    public AvailableFlights() {
        initComponents();
        jTable1.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 24));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(32, 136, 203));
        jTable1.getTableHeader().setForeground(new Color(255, 255, 255));
        jTable1.setRowHeight(40);

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        Flight[] searchResults = searchFlights();

        for (Flight flight : searchResults) {
            model.addRow(new Object[]{flight.getFlightNumber(), flight.getDepartureCity(), flight.getArrivalCity(),
                flight.getDeparture_time(), flight.getArrival_time()});
        }

        // Align table content to center
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    private Flight[] searchFlights() {
        Flight[] searchResults = {
            new Flight("F100", "London", "Riyadh", "9:15", "14:30"),
            new Flight("F101", "New York", "Paris", "8:00", "21:45"),
            new Flight("F102", "Paris", "Jeddah", "10:30", "13:45"),
            new Flight("F103", "Riyadh", "Dubai", "11:45", "18:30"),
            new Flight("F104", "Tokyo", "Dammam", "15:20", "23:00"),
            new Flight("F105", "Berlin", "Hong Kong", "13:00", "4:30"),
            new Flight("F106", "Sydney", "Singapore", "10:45", "16:15"),
            new Flight("F107", "Los Angeles", "Chicago", "17:30", "9:00"),
            new Flight("F108", "Dubai", "Moscow", "14:15", "18:30"),
            new Flight("F109", "Beijing", "Tokyo", "8:30", "14:45"),
            new Flight("F110", "San Francisco ", "Seoul", "12:00", "15:30"),
            new Flight("F111", "Paris", "New Delhi", "20:00", "8:30"),
            new Flight("F112", "Rome", "Athens", "11:30", "13:15"),
            new Flight("F113", "Cairo", "Riyadh", "9:45", "12:00")
        };
        return searchResults;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customUI1 = new necesario.CustomUI();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

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

        setSize(new java.awt.Dimension(952, 731));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
