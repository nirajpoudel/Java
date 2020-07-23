
package javaapplication;

import java.awt.Color;
import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        Container c = getContentPane();
        c.setBackground(new Color(0,153,204));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(59, 144, 246));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(59, 144, 246));
        jLabel2.setFont(new java.awt.Font("URW Palladio L", 0, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 246, 247));
        jLabel2.setText(" Extra-curricular Events ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 270, 50));

        jLabel1.setForeground(new java.awt.Color(245, 246, 247));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/icons/iconfinder_bookshelf_1055107.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 70, 80));

        jLabel3.setForeground(new java.awt.Color(246, 250, 252));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/icons/icons8-ipad-like-100.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 110, 70));

        jLabel4.setForeground(new java.awt.Color(244, 247, 248));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/icons/icons8-politician-70.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 80, 70));

        jLabel5.setForeground(new java.awt.Color(245, 246, 247));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/icons/icons8-party-100.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 110, 70));

        jLabel6.setForeground(new java.awt.Color(249, 251, 252));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/icons/icons8-track-and-field-100.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, 70));

        jLabel7.setForeground(new java.awt.Color(245, 246, 247));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/icons/icons8-church-100.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 100, 70));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 250, -1));

        jLabel8.setForeground(new java.awt.Color(244, 247, 248));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/icons/icons8-compass-30.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 30, -1));

        jLabel9.setForeground(new java.awt.Color(249, 251, 252));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/icons/icons8-event-30.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, 30));

        Logout.setForeground(new java.awt.Color(241, 247, 248));
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/icons/icons8-shutdown-30.png"))); // NOI18N
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        jPanel1.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        jLabel11.setForeground(new java.awt.Color(247, 248, 248));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/icons/icons8-popular-man-30.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("URW Palladio L", 0, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(239, 245, 247));
        jLabel10.setText("Academic Activities");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("URW Palladio L", 0, 17)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(237, 242, 243));
        jLabel12.setText("Technology");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel13.setFont(new java.awt.Font("URW Palladio L", 0, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(247, 249, 250));
        jLabel13.setText("Sports");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 80, -1));

        jLabel14.setFont(new java.awt.Font("URW Palladio L", 0, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(238, 247, 250));
        jLabel14.setText("Culture and Language");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        jLabel15.setFont(new java.awt.Font("URW Palladio L", 0, 17)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(247, 248, 248));
        jLabel15.setText("Entertainment");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        jLabel16.setFont(new java.awt.Font("URW Palladio L", 0, 17)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(235, 240, 242));
        jLabel16.setText("Leadership");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        jLabel17.setFont(new java.awt.Font("URW Palladio L", 0, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 244, 245));
        jLabel17.setText("Explore");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jLabel18.setFont(new java.awt.Font("URW Palladio L", 0, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(241, 248, 250));
        jLabel18.setText("My Bookings");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 100, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/icons/icons8-coronavirus-30.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/icons/4341327-32.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 40, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 610, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        Academic ad = new Academic();
        this.hide();
        ad.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
      
        Technology to = new Technology();
        this.hide();
        to.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        
        Entertainment et = new Entertainment();
        this.hide();
        et.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       
        Sports st = new Sports();
        this.hide();
        st.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        
        Culture ct = new Culture();
        this.hide();
        ct.setVisible(true);

        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       
        Explore eo = new Explore();
        this.hide();
        eo.setVisible(true);
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        
        MyBookings mb = new MyBookings();
        this.hide();
        mb.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
     
        int yesNo = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?","Logout",JOptionPane.YES_NO_OPTION);
        if(yesNo == JOptionPane.YES_OPTION){
            dispose();
            Login ln = new Login();
            ln.setVisible(true);
        }
    }//GEN-LAST:event_LogoutMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        
        Profile pf = new Profile();
        this.hide();
        pf.setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       
        Leadership ld = new Leadership();
        this.hide();
        ld.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
      
        Corona co = new Corona();
        this.hide();
        co.setVisible(true);
    }//GEN-LAST:event_jLabel20MouseClicked


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
