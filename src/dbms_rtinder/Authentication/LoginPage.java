/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms_rtinder.Authentication;
import java.sql.*;
import dbms_rtinder.MainModules.*;

/**
 *
 * @author ritte
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AuthpagePanel = new javax.swing.JLayeredPane();
        email_ID = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Register = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AuthpagePanel.setBackground(new java.awt.Color(231, 120, 191));
        AuthpagePanel.setOpaque(true);
        AuthpagePanel.setPreferredSize(new java.awt.Dimension(877, 664));

        email_ID.setBackground(new java.awt.Color(255, 255, 255));
        email_ID.setToolTipText("enter email ID");
        email_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_IDActionPerformed(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setToolTipText("enter password");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        loginBtn.setText("LOGIN");
        loginBtn.setOpaque(false);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("*example@gmail.com");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("*special characters allowed");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email -ID");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        Register.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Register.setForeground(new java.awt.Color(255, 255, 255));
        Register.setText("New user ? , Click here to resgister !");
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMouseClicked(evt);
            }
        });

        AuthpagePanel.setLayer(email_ID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AuthpagePanel.setLayer(jPasswordField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AuthpagePanel.setLayer(loginBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AuthpagePanel.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AuthpagePanel.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AuthpagePanel.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AuthpagePanel.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AuthpagePanel.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AuthpagePanel.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AuthpagePanel.setLayer(Register, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout AuthpagePanelLayout = new javax.swing.GroupLayout(AuthpagePanel);
        AuthpagePanel.setLayout(AuthpagePanelLayout);
        AuthpagePanelLayout.setHorizontalGroup(
            AuthpagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AuthpagePanelLayout.createSequentialGroup()
                .addGap(429, 429, 429)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AuthpagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AuthpagePanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(AuthpagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AuthpagePanelLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Register)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        AuthpagePanelLayout.setVerticalGroup(
            AuthpagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AuthpagePanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(email_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
            .addComponent(jSeparator2)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AuthpagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AuthpagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void email_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_IDActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed

        String emailString=email_ID.getText();
        String passString=new String(jPasswordField1.getPassword());
        System.out.println(emailString);
        System.out.println(passString);

        String loginQuery="Select * FROM userprofile WHERE EmailID=? AND Password =?";

        System.out.println("Query entered");
        try{
           preparedStatement=dbms_rtinder.Dbms_rtinder.getInstance().getConnection()
                   .prepareStatement(loginQuery);
            System.out.println("Prepared Statement");
           preparedStatement.setString(1, emailString);
           preparedStatement.setString(2,passString);
            System.out.println("setString done");
           resultSet=preparedStatement.executeQuery();
           if(resultSet.next()){
                String userId=resultSet.getString("Unique_ID");
                 System.out.println(userId);
                HomePage homePage=new HomePage();
                RTinderPro rTinderPro=new RTinderPro();
                MyProfile myProfile=new MyProfile();
                Matches matches=new Matches();
                homePage.setUserID(userId);
                rTinderPro.setUserID(userId);
                myProfile.setUserID(userId);
                matches.setUserID(userId);
               System.out.println("Login success");
               this.dispose();
               homePage.checkNewMatches();
               homePage.setVisible(true);
         }
           else{
               System.out.println("Login Failed ");
           }

        }
        catch(Exception exception){
                        System.out.println("Error in login register");

            System.out.println(exception.getMessage());
        }

    }//GEN-LAST:event_loginBtnActionPerformed

    private void RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseClicked

        this.dispose();
        RegisterPage registerPage=new RegisterPage();
        registerPage.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterMouseClicked

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    PreparedStatement preparedStatement;
    ResultSet resultSet;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane AuthpagePanel;
    private javax.swing.JLabel Register;
    private javax.swing.JTextField email_ID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton loginBtn;
    // End of variables declaration//GEN-END:variables
}
