/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import grade_viewing_app.Login;
import java.awt.Color;
import javax.swing.JOptionPane;


import config.Session;




   
public class UserDash extends javax.swing.JFrame {


    
    public UserDash() {
         
        initComponents();
        
        
  }
      Color navcolor = new Color(153,153,0);
      Color hovercolor = new Color(204,204,0);
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        j = new javax.swing.JPanel();
        das = new javax.swing.JPanel();
        dash = new javax.swing.JLabel();
        st = new javax.swing.JPanel();
        das1 = new javax.swing.JLabel();
        su = new javax.swing.JPanel();
        das3 = new javax.swing.JLabel();
        sub = new javax.swing.JPanel();
        das2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        acc_name1 = new javax.swing.JLabel();
        acc_user = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        desh = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        gra = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        uss = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        stulist2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        subj = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        j.setBackground(new java.awt.Color(204, 204, 0));

        das.setBackground(new java.awt.Color(204, 204, 0));
        das.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dasMousePressed(evt);
            }
        });

        dash.setBackground(new java.awt.Color(153, 153, 153));
        dash.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        dash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dash.setText("Dashboard");

        javax.swing.GroupLayout dasLayout = new javax.swing.GroupLayout(das);
        das.setLayout(dasLayout);
        dasLayout.setHorizontalGroup(
            dasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(dash, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dasLayout.setVerticalGroup(
            dasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dasLayout.createSequentialGroup()
                .addComponent(dash)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        st.setBackground(new java.awt.Color(204, 204, 0));
        st.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                stMousePressed(evt);
            }
        });

        das1.setBackground(new java.awt.Color(153, 153, 153));
        das1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        das1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        das1.setText("Student List");
        das1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                das1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout stLayout = new javax.swing.GroupLayout(st);
        st.setLayout(stLayout);
        stLayout.setHorizontalGroup(
            stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(das1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        stLayout.setVerticalGroup(
            stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(das1))
        );

        su.setBackground(new java.awt.Color(204, 204, 0));
        su.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                suMousePressed(evt);
            }
        });

        das3.setBackground(new java.awt.Color(153, 153, 153));
        das3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        das3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        das3.setText("Subject");

        javax.swing.GroupLayout suLayout = new javax.swing.GroupLayout(su);
        su.setLayout(suLayout);
        suLayout.setHorizontalGroup(
            suLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(das3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        suLayout.setVerticalGroup(
            suLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, suLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(das3))
        );

        sub.setBackground(new java.awt.Color(204, 204, 0));
        sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subMousePressed(evt);
            }
        });

        das2.setBackground(new java.awt.Color(153, 153, 153));
        das2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        das2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        das2.setText("Grades");

        javax.swing.GroupLayout subLayout = new javax.swing.GroupLayout(sub);
        sub.setLayout(subLayout);
        subLayout.setHorizontalGroup(
            subLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(das2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        subLayout.setVerticalGroup(
            subLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(das2))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Log out");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        acc_name1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        acc_name1.setText("User");

        acc_user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        acc_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jLayout = new javax.swing.GroupLayout(j);
        j.setLayout(jLayout);
        jLayout.setHorizontalGroup(
            jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayout.createSequentialGroup()
                .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayout.createSequentialGroup()
                        .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(su, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(st, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(das, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(acc_name1)))
                        .addGap(204, 204, 204)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(acc_user, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayout.setVerticalGroup(
            jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(acc_name1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acc_user, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(das, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(st, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(su, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(30, 30, 30))
        );

        jPanel7.setBackground(new java.awt.Color(153, 153, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        desh.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(null);

        gra.setBackground(new java.awt.Color(153, 0, 153));
        gra.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        gra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                graMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                graMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Grades");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout graLayout = new javax.swing.GroupLayout(gra);
        gra.setLayout(graLayout);
        graLayout.setHorizontalGroup(
            graLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
            .addGroup(graLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        graLayout.setVerticalGroup(
            graLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jPanel2.add(gra);
        gra.setBounds(120, 10, 190, 160);

        uss.setBackground(new java.awt.Color(153, 0, 153));
        uss.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        uss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ussMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ussMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ussMouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Account");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout ussLayout = new javax.swing.GroupLayout(uss);
        uss.setLayout(ussLayout);
        ussLayout.setHorizontalGroup(
            ussLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ussLayout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(55, 55, 55))
        );
        ussLayout.setVerticalGroup(
            ussLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ussLayout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jPanel2.add(uss);
        uss.setBounds(340, 10, 180, 158);

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel4.setLayout(null);

        stulist2.setBackground(new java.awt.Color(0, 153, 255));
        stulist2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        stulist2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stulist2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stulist2MouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Student List");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout stulist2Layout = new javax.swing.GroupLayout(stulist2);
        stulist2.setLayout(stulist2Layout);
        stulist2Layout.setHorizontalGroup(
            stulist2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(stulist2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel9)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        stulist2Layout.setVerticalGroup(
            stulist2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stulist2Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel4.add(stulist2);
        stulist2.setBounds(120, 40, 190, 161);

        subj.setBackground(new java.awt.Color(0, 153, 255));
        subj.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        subj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                subjMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                subjMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Subject");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout subjLayout = new javax.swing.GroupLayout(subj);
        subj.setLayout(subjLayout);
        subjLayout.setHorizontalGroup(
            subjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subjLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(54, 54, 54))
        );
        subjLayout.setVerticalGroup(
            subjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjLayout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jPanel4.add(subj);
        subj.setBounds(340, 40, 180, 160);

        javax.swing.GroupLayout deshLayout = new javax.swing.GroupLayout(desh);
        desh.setLayout(deshLayout);
        deshLayout.setHorizontalGroup(
            deshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deshLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(deshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        deshLayout.setVerticalGroup(
            deshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deshLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(j, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(j, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(desh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
          Login ads= new Login();
           ads.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void stMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stMousePressed
     
              
    }//GEN-LAST:event_stMousePressed

    private void stMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stMouseClicked

    }//GEN-LAST:event_stMouseClicked

    private void dasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dasMousePressed
     
       
    }//GEN-LAST:event_dasMousePressed

    private void dasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dasMouseClicked
      
    }//GEN-LAST:event_dasMouseClicked

    private void suMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suMousePressed

      
    }//GEN-LAST:event_suMousePressed

    private void suMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suMouseClicked

    }//GEN-LAST:event_suMouseClicked

    private void subMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMousePressed

       
    }//GEN-LAST:event_subMousePressed

    private void subMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMouseClicked

    }//GEN-LAST:event_subMouseClicked

    private void das1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_das1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_das1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         Session sess=  Session.getInstances();
         if(sess.getUid()==0){
              JOptionPane.showMessageDialog(null,"No account, Login First!");
              Login ads= new Login();
           ads.setVisible(true);
           this.dispose();
         }
         acc_user.setText(""+sess.getFname());
    }//GEN-LAST:event_formWindowActivated

    private void graMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graMouseEntered
        gra .setBackground(navcolor);
    }//GEN-LAST:event_graMouseEntered

    private void graMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graMouseExited
        gra .setBackground(hovercolor);
    }//GEN-LAST:event_graMouseExited

    private void ussMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ussMouseClicked

        accountDetails adt= new  accountDetails();
        adt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ussMouseClicked

    private void ussMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ussMouseEntered
        uss .setBackground(navcolor);
    }//GEN-LAST:event_ussMouseEntered

    private void ussMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ussMouseExited
        uss .setBackground(hovercolor);
    }//GEN-LAST:event_ussMouseExited

    private void stulist2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stulist2MouseEntered
        stulist.setBackground(navcolor);
    }//GEN-LAST:event_stulist2MouseEntered

    private void stulist2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stulist2MouseExited
        stulist.setBackground(hovercolor);
    }//GEN-LAST:event_stulist2MouseExited

    private void subjMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjMouseEntered
        subj .setBackground(navcolor);
    }//GEN-LAST:event_subjMouseEntered

    private void subjMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjMouseExited
        subj .setBackground(hovercolor);
    }//GEN-LAST:event_subjMouseExited

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
            java.util.logging.Logger.getLogger(UserDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_name1;
    private javax.swing.JLabel acc_user;
    private javax.swing.JPanel das;
    private javax.swing.JLabel das1;
    private javax.swing.JLabel das2;
    private javax.swing.JLabel das3;
    private javax.swing.JLabel dash;
    private javax.swing.JPanel desh;
    private javax.swing.JPanel gra;
    private javax.swing.JPanel j;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel st;
    private javax.swing.JPanel stulist;
    private javax.swing.JPanel stulist1;
    private javax.swing.JPanel stulist2;
    private javax.swing.JPanel su;
    private javax.swing.JPanel sub;
    private javax.swing.JPanel subj;
    private javax.swing.JPanel uss;
    // End of variables declaration//GEN-END:variables
}
