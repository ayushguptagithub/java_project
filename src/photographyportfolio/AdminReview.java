/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package photographyportfolio;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

import java.awt.print.*;
import javax.swing.JTable;

/**
 *
 * @author User
 */
public class AdminReview extends javax.swing.JFrame {

    /**
     * Creates new form AdminReview
     */
    public AdminReview() {
        initComponents();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        review = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        starRating1 = new star.rating.StarRating();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        clientusername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Client", "Name", "Review", "Ratings"
            }
        ));
        jTable1.setRowHeight(40);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        review.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        review.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter your review here"));
        review.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewActionPerformed(evt);
            }
        });
        getContentPane().add(review, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 290, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Give Your Review on this Project");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 255, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 255, 153));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Send");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 80, 30));

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("View Reviews");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));
        getContentPane().add(starRating1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 170, 50));

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("Previous");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        jButton5.setBackground(new java.awt.Color(153, 255, 153));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("Client Login");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Soham mini\\Photographyportfolio\\src\\photographyportfolio\\photoport (5).png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        username.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        username.setText("ayush");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 87, -1, 20));
        getContentPane().add(clientusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reviewActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Mainpage MainpageFrame = null;
        try {
            MainpageFrame = new Mainpage();
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(admincontact.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminReview.class.getName()).log(Level.SEVERE, null, ex);
        }
        MainpageFrame.setVisible(true);
        MainpageFrame.pack();
        MainpageFrame.setLocationRelativeTo(MainpageFrame);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String usern=username.getText();
        int selectedRating = starRating1.getStar();
        
        
        try {
            String Username,Review,query,client;
            java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/portfolio","root","root");
            java.sql.Statement stm = conn.createStatement();
            Username = username.getText();
            Review = review.getText();
            client = clientusername.getText();
          
            if(!client.isEmpty()){
                    if (!Review.isEmpty()){
                    query = "INSERT INTO reviews(username, review, star_rating, clientusername) VALUES (?, ?, ?, ?)";
                    java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query);
                    preparedStatement.setString(1, Username);
                    preparedStatement.setString(2, Review);
                    preparedStatement.setInt(3, selectedRating); // Assuming selectedRating is an integer
                    preparedStatement.setString(4, client);
                    preparedStatement.executeUpdate();
                    review.setText("");



                    javax.swing.JOptionPane.showMessageDialog(this, "Review Sent Successfully");
                    }else{
                        javax.swing.JOptionPane.showMessageDialog(this, "Entry fields can't be Empty");
                    }
            }else{
                        javax.swing.JOptionPane.showMessageDialog(this, "You need to login First");
                        ClientRegistartion  c = new ClientRegistartion();
                        c.username.setText(username.getText());
                        c.setVisible(true);
                        this.dispose();
                    }
            
            
            
                } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, e);
        }
        try {
            
            java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/portfolio","root","root");
            
            
            String sql = "Select * from reviews where username=?";
            
             java.sql.PreparedStatement preparedStatement = conn.prepareStatement(sql);
    
    // Set the value of the username in the prepared statement
                preparedStatement.setString(1, usern);

            java.sql.ResultSet rs = preparedStatement.executeQuery();
           
            
            
            
            DefaultTableModel tbModel = (DefaultTableModel) jTable1.getModel();
            tbModel.setRowCount(0); // Clear existing data

        while (rs.next()) {
                String client = rs.getString("clientusername");
                String Username = rs.getString("username");
                String Review = rs.getString("review");
                int Rating = rs.getInt("star_rating");
                
    
                Object[] rowData = {client,Username, Review,Rating};
                tbModel.addRow(rowData);
}

                } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            String usern=username.getText();
            java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/portfolio","root","root");           
            String sql = "Select * from reviews where username=?";
            java.sql.PreparedStatement preparedStatement = conn.prepareStatement(sql);
    // Set the value of the username in the prepared statement
            preparedStatement.setString(1, usern);

            java.sql.ResultSet rs = preparedStatement.executeQuery();
            
            DefaultTableModel tbModel = (DefaultTableModel) jTable1.getModel();
            tbModel.setRowCount(0); // Clear existing data

        while (rs.next()) {
            String client = rs.getString("clientusername");
                String Username = rs.getString("username");
                String Review = rs.getString("review");
                int Rating = rs.getInt("star_rating");
                Object[] rowData = {client,Username, Review,Rating};
                tbModel.addRow(rowData);
            }
                } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, e);

                }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        usercontact usercontactFrame = new usercontact();
        usercontactFrame.username.setText(username.getText());
        usercontactFrame.setVisible(true);
        usercontactFrame.pack();
        usercontactFrame.setLocationRelativeTo(usercontactFrame);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ClientRegistartion  c = new ClientRegistartion();
        c.username.setText(username.getText());
        c.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(AdminReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminReview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel clientusername;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField review;
    private star.rating.StarRating starRating1;
    public javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
