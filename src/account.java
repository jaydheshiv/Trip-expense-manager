/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class account extends javax.swing.JFrame {
private String username;
    /**
     * Creates new form account
     */
    public account(String user) {
        initComponents();
        this.username=user;
        setUsernText();
        fetchAndSetUserDetails();
    }
    private void setUsernText() {
        usern.setText(username);
    }
     private void fetchAndSetUserDetails() {
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javapro", "root", "0000")) {
        String query = "SELECT * FROM users WHERE username = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, username);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    // Retrieve user details from the result set
                    String name = rs.getString("name");
                    String phonenu = rs.getString("mobilenumber");
                    String aadhar = rs.getString("aadharnumber");

                    Name.setText(name);
                    phonenum.setText(phonenu);
                    aadharnum.setText(aadhar);
                    
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usern = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        phonenum = new javax.swing.JLabel();
        aadharnum = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 337));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel1.setText("User name          :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 147, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel2.setText("Name                   :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel3.setText("Moblie number  :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 155, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel4.setText("Aadhar number  : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        getContentPane().add(usern, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 160, 20));

        Name.setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 160, 20));

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.setBorder(null);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 307, 80, 20));
        getContentPane().add(phonenum, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 160, 20));

        aadharnum.setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(aadharnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 160, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\prifile (1).jpg")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, -1, 440));

        setSize(new java.awt.Dimension(600, 337));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_backMouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name;
    private javax.swing.JLabel aadharnum;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel phonenum;
    private javax.swing.JLabel usern;
    // End of variables declaration//GEN-END:variables
}