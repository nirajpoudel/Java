
package javaapplication;

import java.awt.Color;
import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MyBookings extends javax.swing.JFrame {

    public MyBookings() {
        Container c = getContentPane();
        c.setBackground(new Color(0,153,204)); 
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(59, 144, 246));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("URW Palladio L", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 246, 247));
        jLabel1.setText("My Bookings");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 23, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(247, 249, 250));
        jLabel4.setText("<<<");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        l1.setForeground(new java.awt.Color(247, 248, 248));
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 106, -1, -1));

        l2.setForeground(new java.awt.Color(241, 248, 250));
        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        l3.setForeground(new java.awt.Color(249, 249, 249));
        jPanel1.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        l4.setForeground(new java.awt.Color(241, 242, 242));
        jPanel1.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        l5.setForeground(new java.awt.Color(254, 254, 254));
        jPanel1.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        l6.setForeground(new java.awt.Color(251, 253, 253));
        jPanel1.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        l7.setForeground(new java.awt.Color(240, 244, 245));
        jPanel1.add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        l8.setForeground(new java.awt.Color(250, 253, 254));
        jPanel1.add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        jButton1.setText("Cancel Booking");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));

        jButton2.setText("Cancel Booking");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
     
        HomePage hp = new HomePage();
        this.hide();
        hp.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
       
    }//GEN-LAST:event_jLabel1MouseMoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Connection con;
        PreparedStatement pst;
        int yesNo = JOptionPane.showConfirmDialog(null, "Cancel this Event?","Cancel",JOptionPane.YES_NO_OPTION);
        if(yesNo == JOptionPane.YES_OPTION){
  
            try {
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/javaProject","root","");
                String  query1 = "delete from MyBookings where id=1";
                pst = con.prepareStatement(query1);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Cancelled Successfully!");
                System.out.print("is successfully deleted.");
                
              
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Entertainment.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Entertainment.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        Connection con;
        PreparedStatement pst;
        int yesNo = JOptionPane.showConfirmDialog(null, " Cancel this Event?","Cancel",JOptionPane.YES_NO_OPTION);
        if(yesNo == JOptionPane.YES_OPTION){
  
            try {
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/javaProject","root","");
                String  query1 = "delete from MyBookings where id=2";
                pst = con.prepareStatement(query1);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Cancelled Successfully!");
                System.out.print("is successfully deleted.");
                
              
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Entertainment.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Entertainment.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
     
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        try {
            String L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12,L13,L14,L15,L16;
            L1 = l1.getText();
            L2 = l2.getText();
            L3 = l3.getText();
            L4 = l4.getText();
            L5 = l5.getText();
            L6 = l6.getText();
            L7 = l7.getText();
            L8 = l8.getText();

                   
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/javaProject","root","");
            String sql = "select * from MyBookings where id=1";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            while(rs.next()){
            String a = rs.getString("EventName");
            l1.setText(a);
            String b = rs.getString("EventTime");
            l2.setText(b);
            String c = rs.getString("EventDate");
            l3.setText(c);
            String d = rs.getString("EventVenue");
            l4.setText(d);
            
            String sql1 = "select * from MyBookings where id=2";
            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();
            while(rs.next()){
            String e = rs.getString("EventName");
            l5.setText(e);
            String f = rs.getString("EventTime");
            l6.setText(f);
            String g = rs.getString("EventDate");
            l7.setText(g);
            String h = rs.getString("EventVenue");
            l8.setText(h);
            }

            }
        
        }
        catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
        }        
    }//GEN-LAST:event_jPanel1MouseMoved

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyBookings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    // End of variables declaration//GEN-END:variables
}
