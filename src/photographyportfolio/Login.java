/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package photographyportfolio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 *
 * @author dell
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        button1 = new java.awt.Button();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 180, -1));

        jLabel2.setFont(new java.awt.Font("Harrington", 1, 36)); // NOI18N
        jLabel2.setText("Login");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jLabel3.setText("Username");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 270, 180, -1));

        button1.setBackground(new java.awt.Color(17, 244, 144));
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button1.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        button1.setForeground(new java.awt.Color(0, 0, 0));
        button1.setLabel("Login");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 122, 52));

        jButton1.setFont(new java.awt.Font("Swis721 Blk BT", 3, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photographyportfolio/photoport (4).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 610));

        setSize(new java.awt.Dimension(814, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Registartion  RegistartionFrame = new  Registartion();
        RegistartionFrame.setVisible(true);
        RegistartionFrame.pack();
        RegistartionFrame.setLocationRelativeTo(RegistartionFrame);
        this.dispose();   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        
        String username = jTextField1.getText();
        String Password = new String(password.getPassword());
        //JOptionPane.showMessageDialog(this, Password);
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/portfolio","root","root");
            Statement stm = conn.createStatement();
            String sql = "select * from users where username = '"+username+"' and pass = '"+Password+"';";
            //JOptionPane.showMessageDialog(this, sql);
            java.sql.ResultSet rst = stm .executeQuery(sql);
            if(rst.next()){
                 javax.swing.JOptionPane.showMessageDialog(this, "Login Successfully");
                admininfo admininfoFrame = new admininfo();
                admininfoFrame.jLabel2.setText(username);
                admininfoFrame.displayMessagesForUser();
                admininfoFrame.show();
                dispose();
            }else{
                javax.swing.JOptionPane.showMessageDialog(this, "Invalid Credentials");
            }
            
            
            
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, e);
        }
        
        
        
        
    }//GEN-LAST:event_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
