
package javaapplication;

import java.awt.Color;
import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class Explore extends javax.swing.JFrame {

    public Explore() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        l38 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l47 = new javax.swing.JLabel();
        l46 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l45 = new javax.swing.JLabel();
        l42 = new javax.swing.JLabel();
        l43 = new javax.swing.JLabel();
        l44 = new javax.swing.JLabel();
        l48 = new javax.swing.JLabel();
        l41 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l16 = new javax.swing.JLabel();
        l39 = new javax.swing.JLabel();
        l36 = new javax.swing.JLabel();
        l37 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        l26 = new javax.swing.JLabel();
        l14 = new javax.swing.JLabel();
        l15 = new javax.swing.JLabel();
        l40 = new javax.swing.JLabel();
        l33 = new javax.swing.JLabel();
        l34 = new javax.swing.JLabel();
        l35 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        l19 = new javax.swing.JLabel();
        l20 = new javax.swing.JLabel();
        l17 = new javax.swing.JLabel();
        l18 = new javax.swing.JLabel();
        l31 = new javax.swing.JLabel();
        l32 = new javax.swing.JLabel();
        l29 = new javax.swing.JLabel();
        l30 = new javax.swing.JLabel();
        l23 = new javax.swing.JLabel();
        l24 = new javax.swing.JLabel();
        l21 = new javax.swing.JLabel();
        l22 = new javax.swing.JLabel();
        l27 = new javax.swing.JLabel();
        l28 = new javax.swing.JLabel();
        l25 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(52, 144, 246));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("URW Palladio L", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 242, 243));
        jLabel1.setText("Explore");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 12, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(247, 249, 250));
        jLabel4.setText("<<<");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jPanel2.setBackground(new java.awt.Color(59, 144, 246));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel2MouseMoved(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l38.setForeground(new java.awt.Color(249, 250, 250));
        jPanel2.add(l38, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        l3.setForeground(new java.awt.Color(237, 242, 243));
        jPanel2.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        l1.setForeground(new java.awt.Color(232, 233, 233));
        jPanel2.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        l2.setForeground(new java.awt.Color(238, 246, 248));
        jPanel2.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        l4.setForeground(new java.awt.Color(238, 241, 242));
        jPanel2.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        l7.setForeground(new java.awt.Color(237, 243, 245));
        jPanel2.add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        l8.setForeground(new java.awt.Color(240, 249, 252));
        jPanel2.add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        l5.setForeground(new java.awt.Color(233, 237, 238));
        jPanel2.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        l47.setForeground(new java.awt.Color(243, 243, 243));
        jPanel2.add(l47, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        l46.setForeground(new java.awt.Color(241, 247, 248));
        jPanel2.add(l46, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        l6.setForeground(new java.awt.Color(238, 241, 242));
        jPanel2.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        l45.setForeground(new java.awt.Color(235, 240, 242));
        jPanel2.add(l45, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        l42.setForeground(new java.awt.Color(247, 249, 250));
        jPanel2.add(l42, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        l43.setForeground(new java.awt.Color(241, 248, 250));
        jPanel2.add(l43, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        l44.setForeground(new java.awt.Color(241, 248, 250));
        jPanel2.add(l44, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        l48.setForeground(new java.awt.Color(241, 242, 242));
        jPanel2.add(l48, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        l41.setForeground(new java.awt.Color(244, 249, 250));
        jPanel2.add(l41, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        l9.setForeground(new java.awt.Color(241, 248, 250));
        jPanel2.add(l9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        l10.setForeground(new java.awt.Color(242, 246, 247));
        jPanel2.add(l10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 20));

        l11.setForeground(new java.awt.Color(245, 246, 247));
        jPanel2.add(l11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        l16.setForeground(new java.awt.Color(235, 240, 242));
        jPanel2.add(l16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        l39.setForeground(new java.awt.Color(244, 249, 250));
        jPanel2.add(l39, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        l36.setForeground(new java.awt.Color(235, 241, 243));
        jPanel2.add(l36, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, -1, -1));

        l37.setForeground(new java.awt.Color(238, 246, 248));
        jPanel2.add(l37, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        l12.setForeground(new java.awt.Color(240, 243, 243));
        jPanel2.add(l12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        l26.setForeground(new java.awt.Color(235, 240, 242));
        jPanel2.add(l26, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 640, -1, -1));

        l14.setForeground(new java.awt.Color(247, 249, 250));
        jPanel2.add(l14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        l15.setForeground(new java.awt.Color(238, 241, 242));
        l15.setText(" ");
        jPanel2.add(l15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        l40.setForeground(new java.awt.Color(245, 246, 247));
        jPanel2.add(l40, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, 20));

        l33.setForeground(new java.awt.Color(233, 238, 240));
        jPanel2.add(l33, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        l34.setForeground(new java.awt.Color(242, 246, 247));
        jPanel2.add(l34, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, -1, -1));

        l35.setForeground(new java.awt.Color(245, 246, 247));
        jPanel2.add(l35, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, -1, -1));

        l13.setForeground(new java.awt.Color(238, 246, 248));
        jPanel2.add(l13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        l19.setForeground(new java.awt.Color(237, 243, 245));
        jPanel2.add(l19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        l20.setForeground(new java.awt.Color(240, 249, 252));
        jPanel2.add(l20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        l17.setForeground(new java.awt.Color(244, 247, 248));
        jPanel2.add(l17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        l18.setForeground(new java.awt.Color(243, 244, 245));
        jPanel2.add(l18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        l31.setForeground(new java.awt.Color(241, 247, 248));
        jPanel2.add(l31, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, -1, -1));

        l32.setForeground(new java.awt.Color(240, 244, 245));
        jPanel2.add(l32, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, -1, -1));

        l29.setForeground(new java.awt.Color(244, 249, 250));
        jPanel2.add(l29, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, -1, -1));

        l30.setForeground(new java.awt.Color(243, 250, 252));
        jPanel2.add(l30, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, -1, -1));

        l23.setForeground(new java.awt.Color(241, 247, 248));
        l23.setText(" ");
        jPanel2.add(l23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, -1, -1));

        l24.setForeground(new java.awt.Color(238, 246, 248));
        jPanel2.add(l24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, -1, -1));

        l21.setForeground(new java.awt.Color(251, 252, 244));
        jPanel2.add(l21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, -1, -1));

        l22.setForeground(new java.awt.Color(241, 247, 248));
        jPanel2.add(l22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, -1));

        l27.setForeground(new java.awt.Color(244, 249, 250));
        jPanel2.add(l27, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 660, -1, -1));

        l28.setForeground(new java.awt.Color(242, 246, 247));
        jPanel2.add(l28, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 680, -1, -1));

        l25.setForeground(new java.awt.Color(237, 243, 245));
        jPanel2.add(l25, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 620, -1, -1));

        jButton2.setText("Go to post home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, -1, -1));

        jButton3.setText("Go to post home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        jButton4.setText("Go to post home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 710, -1, -1));

        jButton5.setText("Go to post home");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        jButton6.setText("Go to post home");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 580, -1, -1));

        jButton7.setText("Go to post home");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jButton8.setText("Go to post home");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, -1, -1));

        jButton9.setText("Go to post home");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jButton10.setText("Go to post home");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jButton11.setText("Go to post home");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jButton12.setText("Go to post home");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        jButton13.setText("Go to post home");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jScrollPane3.setViewportView(jPanel2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 60, 580, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       
        HomePage hp = new HomePage();
        this.hide();
        hp.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        Academic ac = new Academic();
        this.hide();
        ac.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     
        Culture ac = new Culture();
        this.hide();
        ac.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        Technology ac = new Technology();
        this.hide();
        ac.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        Leadership ac = new Leadership();
        this.hide();
        ac.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        Entertainment ac = new Entertainment();
        this.hide();
        ac.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       
        Entertainment ac = new Entertainment();
        this.hide();
        ac.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       
        Academic ac = new Academic();
        this.hide();
        ac.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        Sports ac = new Sports();
        this.hide();
        ac.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
      
        Leadership ac = new Leadership();
        this.hide();
        ac.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
      
        Sports ac = new Sports();
        this.hide();
        ac.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       
        Entertainment ac = new Entertainment();
        this.hide();
        ac.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
    

    }//GEN-LAST:event_jLabel1MouseMoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Culture ac = new Culture();
        this.hide();
        ac.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel1MouseMoved

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved
        
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
            L9 = l9.getText();
            L10 = l10.getText();
            L11 = l11.getText();
            L12 = l12.getText();
            L13 = l13.getText();
            L14 = l14.getText();
            L15 = l15.getText();
            L16 = l16.getText();
            L1 = l17.getText();
            L2 = l18.getText();
            L3 = l19.getText();
            L4 = l20.getText();
            L5 = l21.getText();
            L6 = l22.getText();
            L7 = l23.getText();
            L8 = l24.getText();
            L9 = l25.getText();
            L10 = l26.getText();
            L11 = l27.getText();
            L12 = l28.getText();
            L13 = l29.getText();
            L14 = l30.getText();
            L15 = l31.getText();
            L16 = l32.getText();
            L1 = l33.getText();
            L2 = l34.getText();
            L3 = l35.getText();
            L4 = l36.getText();
            L5 = l37.getText();
            L6 = l38.getText();
            L7 = l39.getText();
            L8 = l40.getText();
            L9 = l41.getText();
            L10 = l42.getText();
            L11 = l43.getText();
            L12 = l44.getText();
            L13 = l45.getText();
            L14 = l46.getText();
            L15 = l47.getText();
            L16 = l48.getText();
                   
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/javaProject","root","");
            String sql = "select * from Sports where id=3";
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
            
            String sql1 = "select * from Leadership where id=1";
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
            String sql2 = "select * from Sports where id=1";
            pst = con.prepareStatement(sql2);
            rs = pst.executeQuery();
            while(rs.next()){
            String e = rs.getString("EventName");
            l9.setText(e);
            String f = rs.getString("EventTime");
            l10.setText(f);
            String g = rs.getString("EventDate");
            l11.setText(g);
            String h = rs.getString("EventVenue");
            l12.setText(h);
            }
            String sql3 = "select * from Sports where id=4";
            pst = con.prepareStatement(sql3);
            rs = pst.executeQuery();
            while(rs.next()){
            String e = rs.getString("EventName");
            l13.setText(e);
            String f = rs.getString("EventTime");
            l14.setText(f);
            String g = rs.getString("EventDate");
            l15.setText(g);
            String h = rs.getString("EventVenue");
            l16.setText(h);
            }
            String sql4 = "select * from Technology where id=1";
            pst = con.prepareStatement(sql4);
            rs = pst.executeQuery();
            while(rs.next()){
            String e = rs.getString("EventName");
            l17.setText(e);
            String f = rs.getString("EventTime");
            l18.setText(f);
            String g = rs.getString("EventDate");
            l19.setText(g);
            String h = rs.getString("EventVenue");
            l20.setText(h);
            }
            String sql5 = "select * from Culture where id=1";
            pst = con.prepareStatement(sql5);
            rs = pst.executeQuery();
            while(rs.next()){
            String e = rs.getString("EventName");
            l21.setText(e);
            String f = rs.getString("EventTime");
            l22.setText(f);
            String g = rs.getString("EventDate");
            l23.setText(g);
            String h = rs.getString("EventVenue");
            l24.setText(h);
            }
            String sql6 = "select * from Culture where id=2";
            pst = con.prepareStatement(sql6);
            rs = pst.executeQuery();
            while(rs.next()){
            String e = rs.getString("EventName");
            l21.setText(e);
            String f = rs.getString("EventTime");
            l22.setText(f);
            String g = rs.getString("EventDate");
            l23.setText(g);
            String h = rs.getString("EventVenue");
            l24.setText(h);
            }
            String sql7 = "select * from Leadership where id=2";
            pst = con.prepareStatement(sql7);
            rs = pst.executeQuery();
            while(rs.next()){
            String e = rs.getString("EventName");
            l25.setText(e);
            String f = rs.getString("EventTime");
            l26.setText(f);
            String g = rs.getString("EventDate");
            l27.setText(g);
            String h = rs.getString("EventVenue");
            l28.setText(h);
            }
            String sql8 = "select * from Leadership where id=3";
            pst = con.prepareStatement(sql8);
            rs = pst.executeQuery();
            while(rs.next()){
            String e = rs.getString("EventName");
            l29.setText(e);
            String f = rs.getString("EventTime");
            l30.setText(f);
            String g = rs.getString("EventDate");
            l31.setText(g);
            String h = rs.getString("EventVenue");
            l32.setText(h);
            }
            String sql9 = "select * from Leadership where id=4";
            pst = con.prepareStatement(sql9);
            rs = pst.executeQuery();
            while(rs.next()){
            String e = rs.getString("EventName");
            l33.setText(e);
            String f = rs.getString("EventTime");
            l34.setText(f);
            String g = rs.getString("EventDate");
            l35.setText(g);
            String h = rs.getString("EventVenue");
            l36.setText(h);
            }
            String sql10 = "select * from Sports where id=2";
            pst = con.prepareStatement(sql10);
            rs = pst.executeQuery();
            while(rs.next()){
            String e = rs.getString("EventName");
            l37.setText(e);
            String f = rs.getString("EventTime");
            l38.setText(f);
            String g = rs.getString("EventDate");
            l39.setText(g);
            String h = rs.getString("EventVenue");
            l40.setText(h);
            }
            String sql11 = "select * from Leadership where id=2";
            pst = con.prepareStatement(sql11);
            rs = pst.executeQuery();
            while(rs.next()){
            String e = rs.getString("EventName");
            l41.setText(e);
            String f = rs.getString("EventTime");
            l42.setText(f);
            String g = rs.getString("EventDate");
            l43.setText(g);
            String h = rs.getString("EventVenue");
            l44.setText(h);
            }
            String sql12 = "select * from Culture where id=3";
            pst = con.prepareStatement(sql12);
            rs = pst.executeQuery();
            while(rs.next()){
            String e = rs.getString("EventName");
            l45.setText(e);
            String f = rs.getString("EventTime");
            l46.setText(f);
            String g = rs.getString("EventDate");
            l47.setText(g);
            String h = rs.getString("EventVenue");
            l48.setText(h);
            }
            }
        
        }
        catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jPanel2MouseMoved

    public static void main(String args[]) {
 

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Explore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l14;
    private javax.swing.JLabel l15;
    private javax.swing.JLabel l16;
    private javax.swing.JLabel l17;
    private javax.swing.JLabel l18;
    private javax.swing.JLabel l19;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l20;
    private javax.swing.JLabel l21;
    private javax.swing.JLabel l22;
    private javax.swing.JLabel l23;
    private javax.swing.JLabel l24;
    private javax.swing.JLabel l25;
    private javax.swing.JLabel l26;
    private javax.swing.JLabel l27;
    private javax.swing.JLabel l28;
    private javax.swing.JLabel l29;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l30;
    private javax.swing.JLabel l31;
    private javax.swing.JLabel l32;
    private javax.swing.JLabel l33;
    private javax.swing.JLabel l34;
    private javax.swing.JLabel l35;
    private javax.swing.JLabel l36;
    private javax.swing.JLabel l37;
    private javax.swing.JLabel l38;
    private javax.swing.JLabel l39;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l40;
    private javax.swing.JLabel l41;
    private javax.swing.JLabel l42;
    private javax.swing.JLabel l43;
    private javax.swing.JLabel l44;
    private javax.swing.JLabel l45;
    private javax.swing.JLabel l46;
    private javax.swing.JLabel l47;
    private javax.swing.JLabel l48;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    // End of variables declaration//GEN-END:variables
}
