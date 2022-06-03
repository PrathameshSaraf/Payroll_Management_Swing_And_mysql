/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Prathamesh Saraf
 */
public class signupForm extends javax.swing.JFrame {

   Connection con=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
    public signupForm() {
        initComponents();
        con=MyConnection.getconnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLname = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCombo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtQue = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Already Have an accout ?");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(0, 102, 255));
        headerPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        headerPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sign Up !");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        mainPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 429, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Last Name :");
        mainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 97, -1, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("First Name :");
        mainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 97, -1, 25));

        txtLname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtLname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(153, 153, 153)));
        mainPanel.add(txtLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 128, 146, 35));

        txtFname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtFname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(153, 153, 153)));
        mainPanel.add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 128, 142, 35));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("User ID :");
        mainPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 169, -1, 25));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(153, 153, 153)));
        mainPanel.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 200, 300, 37));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Designation :");
        mainPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 243, -1, -1));

        txtCombo.setBackground(new java.awt.Color(153, 153, 153));
        txtCombo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Owener", "Manager", "Accountant", "Superviser" }));
        txtCombo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        txtCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainPanel.add(txtCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 269, 300, 36));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Password :");
        mainPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 448, -1, -1));

        txtPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPass.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(153, 153, 153)));
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        mainPanel.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 474, 300, 39));

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign Up");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        mainPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 540, 300, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Already Have an accout ?");
        mainPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 586, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Log In now !");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        mainPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 612, 78, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Answer :");
        mainPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 379, -1, -1));

        txtQue.setBackground(new java.awt.Color(153, 153, 153));
        txtQue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtQue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your favourite Color ?", "What is your favourite food ?", "What is your favourite hero ?", "What is your favourite Subject ?" }));
        txtQue.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        txtQue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainPanel.add(txtQue, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 337, 300, 36));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Security Question :");
        mainPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 311, -1, -1));

        txtAnswer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtAnswer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(153, 153, 153)));
        mainPanel.add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 405, 300, 37));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                 int p=JOptionPane.showConfirmDialog(null,"Are you sure to add this record ?","add record",JOptionPane.YES_NO_OPTION);
                 if (p==0){
                     String sql="INSERT INTO `user`(`uname`, `pass`, `fname`, `lname`, `designation`,`Question`, `Answer`) VALUES (?,?,?,?,?,?,?)"; 
                     try{
                         ps=con.prepareStatement(sql);
                         
                         ps.setString(1,txtFname.getText());
                         ps.setString(2,txtPass.getText());
                          ps.setString(3,txtFname.getText());
                         ps.setString(4,txtLname.getText());
                          ps.setString(5,(String)txtCombo.getSelectedItem());
                          ps.setString(6,(String)txtQue.getSelectedItem());
                          ps.setString(7,txtAnswer.getText());
                          
                          String UN=txtFname.getText();
                          String C=txtPass.getText();
                          String FN=txtFname.getText();
                          String LN=txtLname.getText();
                          String D=(String)txtCombo.getSelectedItem();
                          String Q=(String)txtQue.getSelectedItem();
                          String A=txtAnswer.getText();
                         
                          
                         if(UN.equals("") || FN.equals("") || C.equals("") || LN.equals("") || D.equals("") || Q.equals("") || A.equals(""))
                         {
                             JOptionPane.showMessageDialog(null,"Please fill the all information");
                         }
                         else{

                         ps.execute();
                          JOptionPane.showMessageDialog(null,"Data save Successfully");
                          loginform l=new loginform();
                          l.setVisible(true);
                          this.dispose();}
                     }
                     catch(SQLException ex){
                          JOptionPane.showMessageDialog(null,ex);
                     }
                 }
                 else {
                     JOptionPane.showMessageDialog(null,"Data not saved ");
                 }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        loginform l=new loginform();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signupForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JComboBox<String> txtCombo;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JComboBox<String> txtQue;
    // End of variables declaration//GEN-END:variables
}
