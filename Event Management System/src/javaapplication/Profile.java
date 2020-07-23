
package javaapplication;

import java.awt.Color;
import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Profile extends javax.swing.JFrame {

    public Profile() {
        Container c = getContentPane();
        c.setBackground(new Color(0,153,204));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(59, 144, 246));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("URW Palladio L", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(247, 248, 248));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/icons/4043255-128.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 246, 247));
        jLabel2.setText("<<<");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, -1, -1));

        jLabel3.setFont(new java.awt.Font("URW Palladio L", 0, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(244, 249, 250));
        jLabel3.setText("Identity ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("URW Palladio L", 0, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(235, 241, 243));
        jLabel4.setText("Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        l2.setFont(new java.awt.Font("URW Palladio L", 0, 19)); // NOI18N
        l2.setForeground(new java.awt.Color(243, 250, 252));
        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        l1.setFont(new java.awt.Font("URW Palladio L", 0, 19)); // NOI18N
        l1.setForeground(new java.awt.Color(243, 250, 252));
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jButton1.setBackground(new java.awt.Color(59, 144, 246));
        jButton1.setForeground(new java.awt.Color(241, 247, 248));
        jButton1.setText("Edit Profile");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        HomePage hp = new HomePage();
        this.hide();
        hp.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
       

    }//GEN-LAST:event_jLabel1MouseMoved

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
       
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        try {
            String L1,L2;
            L1 = l1.getText();
            L2 = l2.getText();
                   
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/javaProject","root","");
            String sql = "select * from StudentInfo";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            while(rs.next()){
            String a = rs.getString("StudentId");
            l1.setText(a);
            String b = rs.getString("Fullname");
            l2.setText(b);

            }
        
        }
        catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jPanel1MouseMoved

  
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    // End of variables declaration//GEN-END:variables
}
