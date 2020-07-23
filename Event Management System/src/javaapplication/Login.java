
package javaapplication;

import java.awt.Color;
import java.awt.Container;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;



public class Login extends javax.swing.JFrame {

    public Login() {
        Container c = getContentPane();
        c.setBackground(new Color(0,153,204));
       
        initComponents();
    }
    
    java.sql.Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public boolean validation(){
    
        String StudentName,StudentId;
        StudentName = txtname.getText();
        StudentId = txtid.getText();
        if (StudentName.equals(""))
        {
        JOptionPane.showMessageDialog(this, "please enter your Name!!");
        return false;
        }
        else if (StudentId.equals(""))
        {
        JOptionPane.showMessageDialog(this, "please enter your id!!");
        return false;
        }
        else
        {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/javaProject","root","");
                pst = con.prepareStatement("select * from StudentInfo where StudentId=? and Fullname=?");
                pst.setString(1, StudentId);
                pst.setString(2, StudentName);
                rs = pst.executeQuery();
                
                if(rs.next()){
                JOptionPane.showMessageDialog(this, "Successfully Logged In!");
                HomePage home = new HomePage();
                this.hide();
                home.setVisible(true);
                }
                else{
                JOptionPane.showMessageDialog(this, "User not found!!");
                }
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        }
       return true;
    }
   
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(59, 144, 246));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 246, 247));
        jLabel1.setText("Sign In?");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        jLabel2.setFont(new java.awt.Font("URW Bookman L", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(247, 248, 248));
        jLabel2.setText("Student Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 130, 40));

        jLabel3.setFont(new java.awt.Font("URW Bookman L", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(247, 248, 248));
        jLabel3.setText("Student Id");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 110, 40));
        jPanel2.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 170, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(248, 249, 245));
        jLabel4.setText("new user?  Sign up?");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 170, 30));
        jPanel2.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 170, -1));

        jButton1.setBackground(new java.awt.Color(59, 144, 246));
        jButton1.setForeground(new java.awt.Color(244, 247, 248));
        jButton1.setText("Login");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 110, 40));

        jButton2.setBackground(new java.awt.Color(59, 144, 246));
        jButton2.setForeground(new java.awt.Color(249, 251, 252));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 120, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/icons/5964548-256.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 70, 230, 330));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 610, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        validation();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
     
        Registration rp = new Registration();
        this.hide();
        rp.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed


    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
