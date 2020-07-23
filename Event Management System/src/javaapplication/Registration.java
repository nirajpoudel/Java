
package javaapplication;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;


public class Registration extends javax.swing.JFrame {


    public Registration() {
        Container c = getContentPane();
        c.setBackground(new Color(0,153,204));
        initComponents();
    }
    Connection con;
    PreparedStatement pst;
    
    public boolean validation(){
    String id,fullname,gender,interests,others;
    id = txtid.getText();
    fullname = txtname.getText();
    others = txtothers.getText();
    

    
    if(id.equals("")){
    JOptionPane.showMessageDialog(this, "please enter your Id!!");
    return false;
    }
    else if(fullname.equals("")){
    JOptionPane.showMessageDialog(this, "please enter your Name!!");
    return false;
    }
    else if(fullname.length()<=5){
    JOptionPane.showMessageDialog(this, "Length of Name and id must be more than five characters!!!!");
    return false;
    }
    else if(id.length()<=5)
    {
    JOptionPane.showMessageDialog(this, "Length of Name and Id must be more than five character!");
    return false;
    }
            
   
    else{
        try {
         
            id = txtid.getText();
            fullname = txtname.getText();
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/javaProject","root","");
            pst = con.prepareStatement("insert into StudentInfo(StudentId,FUllname)values(?,?)");
            pst.setString(1, id);
            pst.setString(2, fullname);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "User successfully regestered!!");
            txtid.setText("");
            txtname.setText("");
            Login ln = new Login();
            this.hide();
            ln.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    return true;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCheckBox7 = new javax.swing.JCheckBox();
        txtothers = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(59, 144, 246));
        jPanel1.setForeground(new java.awt.Color(244, 247, 248));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(247, 248, 248));
        jLabel1.setText("Sign Up!!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        jLabel2.setFont(new java.awt.Font("URW Bookman L", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(247, 248, 248));
        jLabel2.setText("Full Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 110, 30));

        jLabel3.setFont(new java.awt.Font("URW Palladio L", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(246, 250, 252));
        jLabel3.setText("Id");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 70, 30));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 160, -1));
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 160, -1));

        jLabel4.setFont(new java.awt.Font("URW Palladio L", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(243, 244, 245));
        jLabel4.setText("Gender");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 100, 40));

        jLabel5.setFont(new java.awt.Font("URW Palladio L", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(244, 247, 248));
        jLabel5.setText("Interests");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 80, 40));

        jCheckBox1.setFont(new java.awt.Font("URW Palladio L", 0, 17)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(241, 247, 248));
        jCheckBox1.setText("Arts & Humanities");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("URW Palladio L", 0, 17)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(241, 247, 248));
        jCheckBox2.setText("Business");
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        jCheckBox4.setFont(new java.awt.Font("URW Palladio L", 0, 17)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(247, 248, 248));
        jCheckBox4.setText("Computer Science");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jCheckBox5.setFont(new java.awt.Font("URW Palladio L", 0, 17)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(252, 252, 252));
        jCheckBox5.setText("Health");
        jPanel1.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        jCheckBox3.setFont(new java.awt.Font("URW Palladio L", 0, 17)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(244, 247, 248));
        jCheckBox3.setText("Public Speaking");
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        jCheckBox6.setFont(new java.awt.Font("URW Palladio L", 0, 17)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(248, 252, 253));
        jCheckBox6.setText("Science");
        jPanel1.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        jButton1.setBackground(new java.awt.Color(59, 144, 246));
        jButton1.setFont(new java.awt.Font("URW Palladio L", 0, 17)); // NOI18N
        jButton1.setForeground(new java.awt.Color(244, 249, 250));
        jButton1.setText("Register");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 110, -1));

        jButton2.setBackground(new java.awt.Color(59, 144, 246));
        jButton2.setFont(new java.awt.Font("URW Palladio L", 0, 17)); // NOI18N
        jButton2.setForeground(new java.awt.Color(252, 252, 252));
        jButton2.setText("Cancel");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 120, 30));

        jCheckBox7.setFont(new java.awt.Font("URW Palladio L", 0, 17)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(239, 245, 247));
        jCheckBox7.setText("Others");
        jPanel1.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));
        jPanel1.add(txtothers, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 180, -1));

        male.setFont(new java.awt.Font("URW Palladio L", 0, 17)); // NOI18N
        male.setForeground(new java.awt.Color(241, 247, 248));
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        male.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                malePropertyChange(evt);
            }
        });
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        female.setFont(new java.awt.Font("URW Palladio L", 0, 17)); // NOI18N
        female.setForeground(new java.awt.Color(244, 249, 250));
        female.setText("Female");
        female.setDoubleBuffered(true);
        female.setEnabled(false);
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/icons/4341272-256.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 30, -1, 360));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 610, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
 
        validation();
    }//GEN-LAST:event_jButton1MouseClicked

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
        int Female = 0;
        if (female.isSelected()){
        Female=1;
        }
    }//GEN-LAST:event_femaleActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        
        int Male=0;
        if(male.isSelected()){
        Male = 1;
        }
    }//GEN-LAST:event_maleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       
        Login lg = new Login();
        this.hide();
        lg.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
       
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
       
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void malePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_malePropertyChange
       
    }//GEN-LAST:event_malePropertyChange


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtothers;
    // End of variables declaration//GEN-END:variables
    private String gender;
}
