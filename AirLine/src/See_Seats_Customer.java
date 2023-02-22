import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class See_Seats_Customer extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    public See_Seats_Customer() {
        initComponents();
    }
    public See_Seats_Customer(String s){
        initComponents();
        Connect();
        jLabel1.setText(s);
        jLabel1.setVisible(false);
        try{
                
                String Log_in = jLabel1.getText().trim();
                String sql=" select ticket_reservation.customer_id,customer.name,flights.flight_id,ticket_reservation.seat_id,flights.flight_name,flights.origin,flights.destination,flights.departure_time,flights.arrival_time,flights.date,flights.flight_charge from ticket_reservation,customer,flights where ticket_reservation.customer_id=customer.customer_id AND "
                        + "ticket_reservation.flight_id=flights.flight_id AND id='"+Log_in+"';";
                rs=stmt.executeQuery(sql);                
                DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
                model.setRowCount(0);
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("customer_id"),rs.getString("name"),rs.getString("flight_id"),rs.getString("seat_id"),rs.getString("flight_name"),rs.getString("origin"),rs.getString("destination"),rs.getString("departure_time"),rs.getString("arrival_time"),rs.getString("date"),rs.getString("flight_charge")});
            }
            jScrollPane1.setVisible(true);
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    public void Connect(){
        try{
       con= DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","3308");
       stmt=con.createStatement();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1800, 40, 100, 30);

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel3.setText("Your Registered Flights ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(720, 60, 720, 110);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer id", "Customer Name", "Flight ID", "Seat ID", "Flight Name", "Origin", "Destination", "Departure Time", "Arrival Time", "Date", "Flight Charge"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 400, 1900, 402);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/show flights.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1920, 1080);

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
            java.util.logging.Logger.getLogger(See_Seats_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(See_Seats_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(See_Seats_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(See_Seats_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new See_Seats_Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}