/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package photographyportfolio;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author shigvan
 */
public class social extends javax.swing.JFrame {

         private List<byte[]> imageBytesList = new ArrayList<>();
    private List<String> nameList = new ArrayList<>();
    private JLabel[] imageLabels = new JLabel[5];
    private JLabel[] nameLabels = new JLabel[5];
    private List<String> usernameList = new ArrayList<>();
    
     private List<Integer> ratingList = new ArrayList<>();
    private List<Integer> ratingList2 = new ArrayList<>();
    private List<Integer> ratingList3 = new ArrayList<>();
    private List<Integer> ratingList4 = new ArrayList<>();
    private List<Integer> ratingList5 = new ArrayList<>();
    /**
     * Creates new form social
     */
    public social() throws SQLException, IOException {
        initComponents();
        imageLabels[0] = img1;
        imageLabels[1] = img2;
        imageLabels[2] = img3;
        imageLabels[3] = img4;
        nameLabels[0] = name1;
        nameLabels[1] = name2;
        nameLabels[2] = name3;
        nameLabels[3] = name4;
        
       
        fetchImageDataFromDatabase();
        updateLabelsBasedOnData();
        fetchnameDataFromDatabase();
        updatenameLabelsBasedOnData();
        fetchusernameDataFromDatabase();
        
        int size = usernameList.size();
       
       if(size==0){
       
       }
       else if(size==1){
       fetchuser1RatingFromDatabase();
       }
       else if(size==1){
        fetchuser1RatingFromDatabase();
        
       }
       else if(size==2){
        fetchuser1RatingFromDatabase();
        fetchuser2RatingFromDatabase();
      
       }
       else if(size==3){
        fetchuser1RatingFromDatabase();
        fetchuser2RatingFromDatabase();
       fetchuser3RatingFromDatabase();
       
       }
       else if(size==4){
        fetchuser1RatingFromDatabase();
        fetchuser2RatingFromDatabase();
       fetchuser3RatingFromDatabase();
       fetchuser4RatingFromDatabase();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        img4 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        starr1 = new javax.swing.JLabel();
        stara1 = new javax.swing.JLabel();
        starb1 = new javax.swing.JLabel();
        starc1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        clientusername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton9.setText("ALL");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -7, -1, 60));

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton10.setText("WILDLIFE");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, 60));

        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton11.setText("WEDDING");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, 60));

        jButton12.setBackground(new java.awt.Color(0, 255, 255));
        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton12.setText("SOCIAL EVENTS");
        jPanel7.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, 60));

        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton13.setText("SPORTS");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, 60));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 800, 50));

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setText("join with us");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        img4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img4MouseClicked(evt);
            }
        });
        jPanel2.add(img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 90, 90));
        jPanel2.add(name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        img3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img3MouseClicked(evt);
            }
        });
        jPanel2.add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 90, 90));
        jPanel2.add(name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));
        jPanel2.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));
        jPanel2.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        img2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img2MouseClicked(evt);
            }
        });
        jPanel2.add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 90, 90));

        img1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img1MouseClicked(evt);
            }
        });
        jPanel2.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 90, 90));
        jPanel2.add(starr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 80, 20));
        jPanel2.add(stara1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 60, 20));
        jPanel2.add(starb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 70, 20));
        jPanel2.add(starc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 70, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photographyportfolio/photoport (5).png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 590));

        clientusername.setText("jLabel4");
        jPanel2.add(clientusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void updateLabelsBasedOnData() {
        int numLabels = imageBytesList.size();
        
        for (int i = 0; i < numLabels && i < imageLabels.length; i++) {
            byte[] imageBytes = imageBytesList.get(i);
            ImageIcon imageIcon = new ImageIcon(imageBytes);
    
    
            int labelWidth = imageLabels[i].getWidth();
            int labelHeight = imageLabels[i].getHeight();

            Image image = imageIcon.getImage();
            Image scaledImage = image.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);
            imageLabels[i].setIcon(scaledIcon);
        }
       
       
    }
     
     private void updatenameLabelsBasedOnData(){
     int unameLabels = nameList.size();
        
      for (int i = 0; i < unameLabels && i < nameLabels.length; i++) {
            String textData = nameList.get(i);
            nameLabels[i].setText(textData);
        }

     }
    
     private void fetchImageDataFromDatabase() throws SQLException {
         java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/portfolio", "root", "root");
         java.sql.Statement stm = conn.createStatement();
         // Create a table named 'images' with a column 'image_data' in your SQLite database
         // The table should have rows with image data
         // Execute a query to retrieve image data from the 'images' table
         java.sql.ResultSet resultSet = stm.executeQuery("SELECT image FROM images where category='social_events'");
         while (resultSet.next()) {
             byte[] imageBytes = resultSet.getBytes("image");
             imageBytesList.add(imageBytes);
         }
    }
    
     private void fetchnameDataFromDatabase() throws SQLException {
         java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/portfolio", "root", "root");
         java.sql.Statement stm = conn.createStatement();
         // Create a table named 'images' with a column 'image_data' in your SQLite database
         // The table should have rows with image data
         // Execute a query to retrieve image data from the 'images' table
         java.sql.ResultSet resultSet = stm.executeQuery("SELECT fname FROM images where category='social_events'");
         while (resultSet.next()) {
            String username = resultSet.getString("fname");
             nameList.add(username);
         }
    }
     private void fetchusernameDataFromDatabase() throws SQLException {
         java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/portfolio", "root", "root");
         java.sql.Statement stm = conn.createStatement();
         // Create a table named 'images' with a column 'image_data' in your SQLite database
         // The table should have rows with image data
         // Execute a query to retrieve image data from the 'images' table
         java.sql.ResultSet resultSet = stm.executeQuery("SELECT username FROM images where category='social_events'");
         while (resultSet.next()) {
            String username = resultSet.getString("username");
             usernameList.add(username);
         }
    }
    
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
sports sportsFrame = null;
             try {
                 sportsFrame = new sports();
             } catch (SQLException ex) {
                 Logger.getLogger(social.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException ex) {
                 Logger.getLogger(social.class.getName()).log(Level.SEVERE, null, ex);
             }
        sportsFrame.setVisible(true);
        sportsFrame.pack();
        sportsFrame.setLocationRelativeTo(sportsFrame);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
wildlife wildlifeFrame = null;
             try {
                 wildlifeFrame = new wildlife();
             } catch (SQLException ex) {
                 Logger.getLogger(social.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException ex) {
                 Logger.getLogger(social.class.getName()).log(Level.SEVERE, null, ex);
             }
        wildlifeFrame.setVisible(true);
        wildlifeFrame.pack();
        wildlifeFrame.setLocationRelativeTo(wildlifeFrame);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
wedding weddingFrame = null;
             try {
                 weddingFrame = new wedding();
             } catch (SQLException ex) {
                 Logger.getLogger(social.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException ex) {
                 Logger.getLogger(social.class.getName()).log(Level.SEVERE, null, ex);
             }
        weddingFrame.setVisible(true);
        weddingFrame.pack();
        weddingFrame.setLocationRelativeTo(weddingFrame);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Registartion  RegistartionFrame = new  Registartion();
        RegistartionFrame.setVisible(true);
        RegistartionFrame.pack();
        RegistartionFrame.setLocationRelativeTo(RegistartionFrame);
        this.dispose();              // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Mainpage MainpageFrame = null;
        try {
            MainpageFrame = new Mainpage();
        } catch (SQLException ex) {
            Logger.getLogger(social.class.getName()).log(Level.SEVERE, null, ex);
        }    catch (IOException ex) {
                 Logger.getLogger(social.class.getName()).log(Level.SEVERE, null, ex);
             }
        MainpageFrame.setVisible(true);
        MainpageFrame.pack();
        MainpageFrame.setLocationRelativeTo(MainpageFrame);
        this.dispose();             // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void img1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img1MouseClicked
        // TODO add your handling code here:
        String usernamefor = usernameList.get(0);
        userinfo userinfopage = new userinfo(usernamefor);
        
        userinfopage.usernamelabel.setText(usernameList.get(0));
        userinfopage.setVisible(true);
        userinfopage.pack();
        userinfopage.setLocationRelativeTo(userinfopage); 
    }//GEN-LAST:event_img1MouseClicked

    private void img2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img2MouseClicked
        // TODO add your handling code here:
        String usernamefor = usernameList.get(1);
        userinfo userinfopage = new userinfo(usernamefor);
        userinfopage.usernamelabel.setText(usernameList.get(1));
        userinfopage.setVisible(true);
        userinfopage.pack();
        userinfopage.setLocationRelativeTo(userinfopage); 
    }//GEN-LAST:event_img2MouseClicked

    private void img3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img3MouseClicked
        // TODO add your handling code here:
        String usernamefor = usernameList.get(2);
        userinfo userinfopage = new userinfo(usernamefor);
        userinfopage.usernamelabel.setText(usernameList.get(2));
        userinfopage.setVisible(true);
        userinfopage.pack();
        userinfopage.setLocationRelativeTo(userinfopage); 
    }//GEN-LAST:event_img3MouseClicked

    private void img4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img4MouseClicked
        // TODO add your handling code here:
       String usernamefor = usernameList.get(3);
        userinfo userinfopage = new userinfo(usernamefor);
        userinfopage.usernamelabel.setText(usernameList.get(3));
        userinfopage.setVisible(true);
        userinfopage.pack();
        userinfopage.setLocationRelativeTo(userinfopage); 
    }//GEN-LAST:event_img4MouseClicked

    private void fetchuser1RatingFromDatabase() throws java.sql.SQLException, IOException {
         java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/portfolio", "root", "root");
         java.sql.Statement stm = conn.createStatement();
         
         String usernameforRating =usernameList.get(0);
         
         java.sql.ResultSet resultSet = stm.executeQuery("SELECT star_rating FROM reviews WHERE username = '" + usernameforRating + "'");
         while (resultSet.next()) {
             int rate = resultSet.getInt("star_rating");
             ratingList.add(rate);
         }
     
         int average = calculateAverage(ratingList);
         System.out.print(average);
         // Define the path to the image you want to display
    String nostar = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\nostar.png";
    String star1 = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\star.png";
    String star2 = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\star2.png";
    String star3 = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\star3.png";
    String star4 = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\star4.png";
    String star5 = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\star5.png";
    
    
        if (average == 0) {
        Image image = ImageIO.read(new File(nostar));
//        image = image.getScaledInstance(starr1.getWidth(), starr1.getHeight(), Image.SCALE_SMOOTH);
        starr1.setIcon(new ImageIcon(image));
        
        }
        else if (average == 1) {
        Image image = ImageIO.read(new File(star1));
//        image = image.getScaledInstance(starr1.getWidth(), starr1.getHeight(), Image.SCALE_SMOOTH);
        starr1.setIcon(new ImageIcon(image));
        
        } else if (average == 2) {

        Image image = ImageIO.read(new File(star2));

        starr1.setIcon(new ImageIcon(image));
        } else if (average == 3) {

        Image image = ImageIO.read(new File(star3));

        starr1.setIcon(new ImageIcon(image));
        } else if (average == 4) {
        Image image = ImageIO.read(new File(star4));
//       
        starr1.setIcon(new ImageIcon(image));
//        
        
            }
        else if (average == 5){
        Image image = ImageIO.read(new File(star5));
//        image = image.getScaledInstance(starr1.getWidth(), starr1.getHeight(), Image.SCALE_SMOOTH);
        starr1.setIcon(new ImageIcon(image));
        }
     
     
    }
     public static int calculateAverage(List<Integer> ratingList) {
        if (ratingList.isEmpty()) {
            return 0; // Handle the case when the list is empty.
        }

        int sum = 0;
        for (int number : ratingList) {
            sum += number;
        }

        return sum / ratingList.size(); // The result is an integer.
    }
     
    private void fetchuser2RatingFromDatabase() throws java.sql.SQLException, IOException {
         java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/portfolio", "root", "root");
         java.sql.Statement stm = conn.createStatement();
         
         String usernameforRating =usernameList.get(1);
         
         java.sql.ResultSet resultSet = stm.executeQuery("SELECT star_rating FROM reviews WHERE username = '" + usernameforRating + "'");
         while (resultSet.next()) {
             int rate = resultSet.getInt("star_rating");
             ratingList2.add(rate);
            }
         
         int average = calculateAverage2(ratingList2);
         System.out.print(average);
         // Define the path to the image you want to display
    String nostar = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\nostar.png";
    String star1 = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\star.png";
    String star2 = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\star2.png";
    String star3 = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\star3.png";
    String star4 = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\star4.png";
    String star5 = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\star5.png";
    if (average == 0) {
        Image image = ImageIO.read(new File(nostar));
//        image = image.getScaledInstance(starr1.getWidth(), starr1.getHeight(), Image.SCALE_SMOOTH);
        stara1.setIcon(new ImageIcon(image));
        
        }    
    else if (average == 1) {
        Image image = ImageIO.read(new File(star1));
//        image = image.getScaledInstance(starr1.getWidth(), starr1.getHeight(), Image.SCALE_SMOOTH);
        stara1.setIcon(new ImageIcon(image));
        
        } else if (average == 2) {

        Image image = ImageIO.read(new File(star2));

        stara1.setIcon(new ImageIcon(image));
        } else if (average == 3) {

        Image image = ImageIO.read(new File(star3));

        stara1.setIcon(new ImageIcon(image));
        } else if (average == 4) {
        Image image = ImageIO.read(new File(star4));
//       
        stara1.setIcon(new ImageIcon(image));
//        
        
            }
        else if (average == 5){
        Image image = ImageIO.read(new File(star5));
//        image = image.getScaledInstance(starr1.getWidth(), starr1.getHeight(), Image.SCALE_SMOOTH);
        stara1.setIcon(new ImageIcon(image));
        }
    }
    public static int calculateAverage2(List<Integer> ratingList2) {
        if (ratingList2.isEmpty()) {
            return 0; // Handle the case when the list is empty.
        }

        int sum = 0;
        for (int number : ratingList2) {
            sum += number;
        }

        return sum / ratingList2.size(); // The result is an integer.
    }
    
    private void fetchuser3RatingFromDatabase() throws java.sql.SQLException, IOException {
         java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/portfolio", "root", "root");
         java.sql.Statement stm = conn.createStatement();
         
         String usernameforRating =usernameList.get(2);
         
         java.sql.ResultSet resultSet = stm.executeQuery("SELECT star_rating FROM reviews WHERE username = '" + usernameforRating + "'");
         while (resultSet.next()) {
             int rate = resultSet.getInt("star_rating");
             ratingList3.add(rate);
         }
         
         int average = calculateAverage3(ratingList3);
         System.out.print(average);
    String nostar = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\nostar.png";
    String star1 = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\star.png";
    String star2 = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\star2.png";
    String star3 = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\star3.png";
    String star4 = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\star4.png";
    String star5 = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\star5.png";
    if (average == 0) {
        Image image = ImageIO.read(new File(nostar));
//        image = image.getScaledInstance(starr1.getWidth(), starr1.getHeight(), Image.SCALE_SMOOTH);
        starb1.setIcon(new ImageIcon(image));
        
        }   
        else if (average == 1) {
        Image image = ImageIO.read(new File(star1));
//        image = image.getScaledInstance(starr1.getWidth(), starr1.getHeight(), Image.SCALE_SMOOTH);
        starb1.setIcon(new ImageIcon(image));
        
        } else if (average == 2) {

        Image image = ImageIO.read(new File(star2));

        starb1.setIcon(new ImageIcon(image));
        } else if (average == 3) {

        Image image = ImageIO.read(new File(star3));

        starb1.setIcon(new ImageIcon(image));
        } else if (average == 4) {
        Image image = ImageIO.read(new File(star4));
//       
        starb1.setIcon(new ImageIcon(image));
//        
        
            }
        else if (average == 5){
        Image image = ImageIO.read(new File(star5));
//        image = image.getScaledInstance(starr1.getWidth(), starr1.getHeight(), Image.SCALE_SMOOTH);
        starb1.setIcon(new ImageIcon(image));
        }
    }
    public static int calculateAverage3(List<Integer> ratingList3) {
        if (ratingList3.isEmpty()) {
            return 0; // Handle the case when the list is empty.
        }

        int sum = 0;
        for (int number : ratingList3) {
            sum += number;
        }

        return sum / ratingList3.size(); // The result is an integer.
    }
    private void fetchuser4RatingFromDatabase() throws java.sql.SQLException, IOException {
         java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/portfolio", "root", "root");
         java.sql.Statement stm = conn.createStatement();
         
         String usernameforRating =usernameList.get(3);
         
         java.sql.ResultSet resultSet = stm.executeQuery("SELECT star_rating FROM reviews WHERE username = '" + usernameforRating + "'");
         while (resultSet.next()) {
             int rate = resultSet.getInt("star_rating");
             ratingList4.add(rate);
         }
         
         int average = calculateAverage4(ratingList4);
         System.out.print(average);
         // Define the path to the image you want to display
    String nostar = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\nostar.png";
    String star1 = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\star.png";
    String star2 = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\star2.png";
    String star3 = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\star3.png";
    String star4 = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\star4.png";
    String star5 = "C:\\\\Users\\\\User\\\\Desktop\\\\Soham mini\\\\Photographyportfolio\\\\src\\\\photographyportfolio\\\\star5.png";
    
    if (average == 0) {
        Image image = ImageIO.read(new File(nostar));
//        image = image.getScaledInstance(starr1.getWidth(), starr1.getHeight(), Image.SCALE_SMOOTH);
        starc1.setIcon(new ImageIcon(image));
        
        }   
    else if (average == 1) {
        Image image = ImageIO.read(new File(star1));
//        image = image.getScaledInstance(starr1.getWidth(), starr1.getHeight(), Image.SCALE_SMOOTH);
        starc1.setIcon(new ImageIcon(image));
        
        } else if (average == 2) {

        Image image = ImageIO.read(new File(star2));

        starc1.setIcon(new ImageIcon(image));
        } else if (average == 3) {

        Image image = ImageIO.read(new File(star3));

        starc1.setIcon(new ImageIcon(image));
        } else if (average == 4) {
        Image image = ImageIO.read(new File(star4));
//       
        starc1.setIcon(new ImageIcon(image));
//        
        
            }
        else if (average == 5){
        Image image = ImageIO.read(new File(star5));
//        image = image.getScaledInstance(starr1.getWidth(), starr1.getHeight(), Image.SCALE_SMOOTH);
        starc1.setIcon(new ImageIcon(image));
        }
    }
    public static int calculateAverage4(List<Integer> ratingList4) {
        if (ratingList4.isEmpty()) {
            return 0; // Handle the case when the list is empty.
        }

        int sum = 0;
        for (int number : ratingList4) {
            sum += number;
        }

        return sum / ratingList4.size(); // The result is an integer.
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
            java.util.logging.Logger.getLogger(social.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(social.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(social.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(social.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new social().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(social.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(social.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel clientusername;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel stara1;
    private javax.swing.JLabel starb1;
    private javax.swing.JLabel starc1;
    private javax.swing.JLabel starr1;
    // End of variables declaration//GEN-END:variables
}
