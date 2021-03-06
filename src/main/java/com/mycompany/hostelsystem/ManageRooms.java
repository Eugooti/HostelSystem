/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hostelsystem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author 640
 */
public class ManageRooms extends javax.swing.JFrame {


    public void Clear(){
        RoomNumber.setText("");
        RoomNumber02.setText("");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);


    }

    public void tableDetails(){
        DefaultTableModel defaultTableModel=(DefaultTableModel) jTable1.getModel();
        defaultTableModel.setRowCount(0);

        try {
            Connection connection=MysqlConnections.dbConnection();
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT * FROM hosteldb.rooms");

            while (resultSet.next()){
                defaultTableModel.addRow(new Object[]{resultSet.getString(1),resultSet.getString(2),resultSet.getString(3)});

            }


        }
        catch (Exception e){

            JOptionPane.showMessageDialog(null, e);
        }


    }

    /**
     * Creates new form ManageRooms
     */
    public ManageRooms() {
        initComponents();
        tableDetails();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        RoomNumber = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        RoomNumber02 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 620, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Add Room");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, 40));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 610, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Update and Delete Room");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 610, 10));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Available Rooms");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(204, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Close");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ROOMS MANAGEMENT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 60));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RoomNumber.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RoomNumber.setForeground(new java.awt.Color(0, 51, 0));
        jPanel2.add(RoomNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 170, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, -1));

        jCheckBox1.setBackground(new java.awt.Color(204, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 51, 0));
        jCheckBox1.setText("Active");
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 0));
        jLabel3.setText("Room Number");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 620, 130));

        jPanel3.setBackground(new java.awt.Color(132, 168, 145));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RoomNumber02.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RoomNumber02.setForeground(new java.awt.Color(0, 51, 0));
        jPanel3.add(RoomNumber02, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 170, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 0));
        jLabel5.setText("Room Number");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jCheckBox2.setBackground(new java.awt.Color(132, 168, 145));
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(0, 51, 0));
        jCheckBox2.setText("Active");
        jPanel3.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 204, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 204, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 87, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 620, 130));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Room Number", "Active", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 590, 140));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 620, 240));

        setSize(new java.awt.Dimension(619, 562));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //new room save listener

        String Roomnumber=RoomNumber.getText();
        String status="Not Booked";
        String Activate;

        if (jCheckBox1.isSelected()) Activate="Yes";
        else Activate="No";

        try {
            Connection connection=MysqlConnections.dbConnection();
            PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO hosteldb.rooms (RoomNumber, ActivationStat, Status)VALUES (?,?,?)");
            preparedStatement.setString(1, Roomnumber);
            preparedStatement.setString(2, Activate);
            preparedStatement.setString(3, status);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            tableDetails();
            Clear();



        }
        catch (Exception e){

            JOptionPane.showMessageDialog(null, e);

        }



    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Search Listener

        String roomNumber=RoomNumber02.getText();

        int i=0;
        try {

            Connection connection=MysqlConnections.dbConnection();
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT * FROM hosteldb.rooms WHERE RoomNumber='"+roomNumber+"'");

            while (resultSet.next()){
                i=1;
                if (resultSet.getString(3).equals("Booked")){
                    JOptionPane.showMessageDialog(null, "Room is Booked");
                    Clear();
                }
                else {
                    RoomNumber02.setEditable(false);
                    
                    if (resultSet.getString(3).equals("Yes")) {
                        jCheckBox2.setSelected(true);

                    }else  jCheckBox2.setSelected(false);
                }
            }
            if (i==0){
                JOptionPane.showMessageDialog(null, "Room Number Does Not exist");
                Clear();
            }

        }
        catch (Exception e){

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //Update save listener

        String RoomNumber=RoomNumber02.getText();
        String Activation;
        if (jCheckBox2.isSelected())  Activation="Yes";
        else Activation="No";

        try {
            Connection connection=MysqlConnections.dbConnection();
            Statement statement=connection.createStatement();
            statement.executeUpdate("UPDATE hosteldb.rooms SET ActivationStat='"+Activation+"' WHERE RoomNumber='"+RoomNumber+"' AND Status='Not Booked'");

            JOptionPane.showMessageDialog(null, "Successfully Updated");
            tableDetails();
            Clear();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Unable to update at the moment");
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //delete listener

        String RoomNumber=RoomNumber02.getText();

        try {
            Connection connection=MysqlConnections.dbConnection();
            Statement statement=connection.createStatement();
            statement.executeUpdate("DELETE FROM hosteldb.rooms WHERE RoomNumber='"+RoomNumber+"' AND Status='Not Booked'");

            JOptionPane.showMessageDialog(null, "Deleted Successfully");
            tableDetails();
            Clear();
            jButton4.setEnabled(true);

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Unable to delete at the moment");

        }



    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //close listener

        JOptionPane.showMessageDialog(null, "Confirm Close","select",JOptionPane.YES_NO_OPTION);


            new NavigationPane().setVisible(true);
            setVisible(false);

    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RoomNumber;
    private javax.swing.JTextField RoomNumber02;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
