/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package photographyportfolio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class AdminChatProfile extends javax.swing.JFrame {

    /**
     * Creates new form AdminChatProfile
     */
    private static final String DB_URL = "jdbc:mysql://localhost:3306/portfolio";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "root";
    String uname;

    private Connection connection;

    public AdminChatProfile() {
        initComponents();

         try {
            initComponents();
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            uname = username.getText();
            displayMessages();
            displayMessages2();
        } catch (SQLException ex) {
            Logger.getLogger(SuperAdminChat.class.getName()).log(Level.SEVERE, null, ex);
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

        msg_text = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        msg_area_received = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        msg_area_send = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(msg_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 640, -1));

        msg_area_received.setColumns(20);
        msg_area_received.setRows(5);
        msg_area_received.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        msg_area_received.setEnabled(false);
        jScrollPane1.setViewportView(msg_area_received);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 330, 320));

        msg_area_send.setColumns(20);
        msg_area_send.setRows(5);
        msg_area_send.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        msg_area_send.setEnabled(false);
        jScrollPane2.setViewportView(msg_area_send);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 330, 320));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText("Drop a Message for Admin");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 340, 30));

        username.setText("ayush");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 550, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photographyportfolio/photoport (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String messageText = msg_text.getText();
       

        if (!messageText.isEmpty()) {
            try {
                java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/portfolio", "root", "root");
                // Insert the message into the database
                String insertQuery = "INSERT INTO messages_send (username, msg, time) VALUES (?, ?, NOW())";
                java.sql.PreparedStatement preparedStatement = conn.prepareStatement(insertQuery);
                System.out.print(preparedStatement);
                preparedStatement.setString(1, uname);
                preparedStatement.setString(2, messageText);
                preparedStatement.executeUpdate();
                preparedStatement.close();

                // Clear the text field
                msg_text.setText("");

                // Refresh and display messages
                displayMessages();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void displayMessages() {
        try {
            // Query the database to retrieve messages
            String query = "SELECT msg, time FROM messages_send WHERE username = '" + uname +"'ORDER BY time";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            // Clear the message area
            msg_area_send.setText("");

            while (resultSet.next()) {

                String sender = resultSet.getString("msg");
                String timestamp = resultSet.getString("time");

                // Display messages in msg_area_send
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = sdf.parse(timestamp);
                sdf.applyPattern("HH:mm:ss");
                String formattedTime = sdf.format(date);

                msg_area_send.append("[" + formattedTime + "] " + sender + "\n");
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void displayMessages2() {
        try {
            // Query the database to retrieve messages
            String query = "SELECT msg, time FROM message_admin_send WHERE username = '" + uname + "' ORDER BY time";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            System.out.print(resultSet);

            // Clear the message area
            msg_area_received.setText("");

            while (resultSet.next()) {

                String sender = resultSet.getString("msg");
                String timestamp = resultSet.getString("time");

                // Display messages in msg_area_send
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = sdf.parse(timestamp);
                sdf.applyPattern("HH:mm:ss");
                String formattedTime = sdf.format(date);

                msg_area_received.append("[" + formattedTime + "] " + sender + "\n");
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
            java.util.logging.Logger.getLogger(AdminChatProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminChatProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminChatProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminChatProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new AdminChatProfile().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTextArea msg_area_received;
    private static javax.swing.JTextArea msg_area_send;
    private javax.swing.JTextField msg_text;
    public javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
