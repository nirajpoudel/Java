
package javaapplication;

import java.awt.Color;
import java.awt.Container;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;


public class TechnologyPost extends javax.swing.JFrame {

    public TechnologyPost() {
        Container c = getContentPane();
        c.setBackground(new Color(0,153,204)); 
        initComponents();
    }
    Connection con;
    PreparedStatement pst;
    
    
    public boolean Post(){
        String Ename, Etime, Edate, Evenue;
        Ename = ename.getText();
        Etime = etime.getText();
        Edate = edate.getText();
        Evenue = evenue.getText();
        if (Ename.equals(""))
        {
        JOptionPane.showMessageDialog(this, "Please Enter Event Name!!");
        return false;
        }
        else if (Etime.equals(""))
        {
        JOptionPane.showMessageDialog(this, "Please Enter Time Of Event!!");
        return false;
        }
        else if (Edate.equals(""))
        {
        JOptionPane.showMessageDialog(this, "Please Enter Date Of Event!!");
        return false;
        }
        else if (Evenue.equals(""))
        {
        JOptionPane.showMessageDialog(this, "Please Enter Vanue Of Event!!");
        return false;
        }
        else
        {
            try {
                Ename = ename.getText();
                Etime = etime.getText();
                Edate = edate.getText();
                Evenue = evenue.getText();
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/javaProject","root","");
                pst = con.prepareStatement("insert into Technology(EventName,EventTime,EventDate,EventVenue)values(?,?,?,?)");
                pst.setString(1, Ename);
                pst.setString(2, Etime); 
                pst.setString(3, Edate);
                pst.setString(4, Evenue);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Event Successfully Created!!");
                Technology tp =new Technology();
                this.hide();
                tp.setVisible(true);

                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TechnologyPost.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TechnologyPost.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        ename = new javax.swing.JTextField();
        etime = new javax.swing.JTextField();
        edate = new javax.swing.JTextField();
        evenue = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(59, 144, 246));

        jLabel1.setFont(new java.awt.Font("URW Palladio L", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 244, 245));
        jLabel1.setText("Post Events");

        jLabel2.setFont(new java.awt.Font("URW Palladio L", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 246, 247));
        jLabel2.setText("Event Name");

        jLabel3.setFont(new java.awt.Font("URW Palladio L", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 246, 247));
        jLabel3.setText("Time Of Event");

        jLabel4.setFont(new java.awt.Font("URW Palladio L", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 246, 247));
        jLabel4.setText("Date Of Event");

        jLabel5.setFont(new java.awt.Font("URW Palladio L", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(243, 244, 245));
        jLabel5.setText("Venue");

        jComboBox1.setBackground(new java.awt.Color(52, 144, 246));
        jComboBox1.setFont(new java.awt.Font("URW Palladio L", 0, 17)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(246, 248, 249));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Offline", "Online" }));

        jButton1.setBackground(new java.awt.Color(59, 144, 246));
        jButton1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(245, 246, 247));
        jButton1.setText("Post");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(59, 144, 246));
        jButton2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 244, 245));
        jButton2.setText("Cancel");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ename)
                            .addComponent(etime)
                            .addComponent(edate)
                            .addComponent(evenue, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))))
                .addGap(138, 169, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2))
                    .addComponent(ename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(etime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(evenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 36, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       
        Technology tp = new Technology();
        this.hide();
        tp.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
      
        Post();
    }//GEN-LAST:event_jButton1MouseClicked

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TechnologyPost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField edate;
    private javax.swing.JTextField ename;
    private javax.swing.JTextField etime;
    private javax.swing.JTextField evenue;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
