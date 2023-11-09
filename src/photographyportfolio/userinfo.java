/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package photographyportfolio;

import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


/**
 *
 * @author dell
 */
public class userinfo extends javax.swing.JFrame {
        String usernamebyid;
        
    /**
     * Creates new form userinfo
     */
    public userinfo(String username){
        initComponents();
         usernamebyid = username;
             
         System.out.println("Username: " + usernamebyid);
         if(!usernamebyid.isEmpty()){
        try {
           
            
            java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/portfolio","root","root");
            
            
            String sql = "Select * from images where username='"+usernamebyid+"'";
            
             java.sql.ResultSet rs = conn.createStatement().executeQuery(sql);
             System.out.println("SQL Query: " + sql);

            
             if (rs.next()) {
        byte[] imageBytes = rs.getBytes("image");
        
        ImageIcon originalIcon = new ImageIcon(imageBytes); // Your original ImageIcon
    int labelWidth = uphoto.getWidth(); // Width of the label
    int labelHeight = uphoto.getHeight(); // Height of the label

    Image image = originalIcon.getImage();
    Image scaledImage = image.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
    ImageIcon scaledIcon = new ImageIcon(scaledImage);



        
        nameofuser.setText(rs.getString(2));
       uphoto.setIcon(scaledIcon);
        udesc.setText("<html>"+ rs.getString(3) +"</html>");
    } else {
         javax.swing.JOptionPane.showMessageDialog(this, "No Data");
    }

   } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, e);
        }
         }
        
  
        
        
  }

    private userinfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameofuser = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        udesc = new javax.swing.JLabel();
        uphoto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        usernamelabel = new javax.swing.JLabel();
        clientusername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameofuser.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        nameofuser.setText("//ITS A NAME LABEL");
        getContentPane().add(nameofuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 430, 50));

        button1.setBackground(new java.awt.Color(204, 255, 153));
        button1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        button1.setLabel("Next");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, -1, -1));

        button2.setActionCommand("Previous");
        button2.setBackground(new java.awt.Color(255, 102, 102));
        button2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        button2.setLabel("Previous");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        getContentPane().add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 80, -1));

        udesc.setBackground(new java.awt.Color(0, 0, 0));
        udesc.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        udesc.setText("udesc");
        udesc.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        udesc.setAutoscrolls(true);
        udesc.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(udesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 420, 350));
        getContentPane().add(uphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 210, 180));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Review");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photographyportfolio/photoport.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        usernamelabel.setText("Ayush");
        getContentPane().add(usernamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));

        clientusername.setText("jLabel4");
        getContentPane().add(clientusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        userphoto userphotoFrame = null;
        String username =usernamelabel.getText();
        try {
            userphotoFrame = new userphoto();
        } catch (SQLException ex) {
            Logger.getLogger(userinfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        userphotoFrame.usern.setText(usernamelabel.getText());
        userphotoFrame.setVisible(true);
        userphotoFrame.pack();
        userphotoFrame.setLocationRelativeTo(userphotoFrame);
        this.dispose();
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
      // TODO add your handling code here:
     Mainpage MainpageFrame = null;
        try {
            MainpageFrame = new Mainpage();
        } catch (SQLException ex) {
            Logger.getLogger(userinfo.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (IOException ex) {
                Logger.getLogger(userinfo.class.getName()).log(Level.SEVERE, null, ex);
            }
      MainpageFrame.setVisible(true);
        MainpageFrame.pack();
        MainpageFrame.setLocationRelativeTo(MainpageFrame);
        this.dispose();

      
      
    }//GEN-LAST:event_button2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            AdminReview review = new AdminReview();
            review.username.setText(usernamelabel.getText());
            review.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(userinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new userinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    public javax.swing.JLabel clientusername;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameofuser;
    private javax.swing.JLabel udesc;
    private javax.swing.JLabel uphoto;
    public javax.swing.JLabel usernamelabel;
    // End of variables declaration//GEN-END:variables
}
