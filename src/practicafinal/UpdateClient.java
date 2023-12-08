/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practicafinal;

import com.mysql.jdbc.Connection;
import conexion.Conectar;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Ana Pèrez
 */
public class UpdateClient extends javax.swing.JFrame {
    private static Connection con;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="Rey";
    private static final String pass="rey1234";
    private static final String url="jdbc:mysql://localhost:3306/rdb";
    
    public void conectar() throws SQLException {
    String user = "Rey";
    String pass = "rey1234";
    String url = "jdbc:mysql://localhost:3306/rdb";

    con = Conectar.conectarse(user, pass, url);

    if (con != null) {
        // Resto del código para insertar en la base de datos
            String textFname = fNameText.getText();
            String textLname = lNameText.getText();
            String textNumber1 = numberText1.getText();
            String textNumber2 = numberText2.getText();
            String textNumber3 = numberText1.getText();
            String textMail = mailText.getText();
            String textUser = userText.getText();
            
        if (!textFname.isEmpty() && !textLname.isEmpty() && !textNumber1.isEmpty() && !textNumber2.isEmpty() && !textNumber3.isEmpty() && !textMail.isEmpty()){         
            String query = "UPDATE client SET FIRST_NAME = ?, LAST_NAME = ?, USER_NUMBER = ?, MAIL = ?, USER_NAME = ? WHERE USER_NAME = ?";

            try (PreparedStatement stmt = con.prepareStatement(query)) {
                stmt.setString(1, textFname);
                stmt.setString(2, textLname);
                stmt.setString(3, "("+textNumber1+")"+"."+textNumber2+"."+textNumber3);
                stmt.setString(4, textMail);
                stmt.setString(5, textUser);
                stmt.setString(6, textUser);

                int rowsAffected = stmt.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "A ocurrido un error");
                }
            } 
            }else {
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
            }
        }
    }

    /**
     * Creates new form UpdateClient
     */
    public UpdateClient() {
        initComponents();
        setLocationRelativeTo(null);
        num(numberText1);
        num(numberText2);
        num(numberText3);
    }
    
        private void num(JTextField a){
            a.addKeyListener(new KeyAdapter() {
                public void keyTyped(KeyEvent e){
                    char c = e.getKeyChar();
            if (!Character.isDigit(c)){
                e.consume();
            }      
        }
    });
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fNameText = new javax.swing.JTextField();
        lNameText = new javax.swing.JTextField();
        mailText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        numberText1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        numberText2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        numberText3 = new javax.swing.JTextField();
        userText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Actualizar Cliente");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Numero:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Correo:");

        fNameText.setBackground(new java.awt.Color(255, 255, 255));
        fNameText.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        fNameText.setForeground(new java.awt.Color(0, 0, 0));

        lNameText.setBackground(new java.awt.Color(255, 255, 255));
        lNameText.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lNameText.setForeground(new java.awt.Color(0, 0, 0));

        mailText.setBackground(new java.awt.Color(255, 255, 255));
        mailText.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        mailText.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ACTUALIZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("(");

        numberText1.setBackground(new java.awt.Color(255, 255, 255));
        numberText1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        numberText1.setForeground(new java.awt.Color(51, 51, 51));
        numberText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberText1ActionPerformed(evt);
            }
        });
        numberText1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberText1KeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText(")");

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText(".");

        numberText2.setBackground(new java.awt.Color(255, 255, 255));
        numberText2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        numberText2.setForeground(new java.awt.Color(51, 51, 51));
        numberText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberText2ActionPerformed(evt);
            }
        });
        numberText2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberText2KeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText(".");

        numberText3.setBackground(new java.awt.Color(255, 255, 255));
        numberText3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        numberText3.setForeground(new java.awt.Color(51, 51, 51));
        numberText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberText3ActionPerformed(evt);
            }
        });
        numberText3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberText3KeyTyped(evt);
            }
        });

        userText.setBackground(new java.awt.Color(255, 255, 255));
        userText.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        userText.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Usuario Actual:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel1))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mailText, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(numberText1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(numberText2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(numberText3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(numberText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberText3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void numberText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberText1ActionPerformed

    }//GEN-LAST:event_numberText1ActionPerformed

    private void numberText1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberText1KeyTyped
        if (numberText1.getText().length() >= 3)
        {
            evt.consume();
        }
    }//GEN-LAST:event_numberText1KeyTyped

    private void numberText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberText2ActionPerformed

    }//GEN-LAST:event_numberText2ActionPerformed

    private void numberText2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberText2KeyTyped
        if (numberText2.getText().length() >= 3)
        {
            evt.consume();
        }
    }//GEN-LAST:event_numberText2KeyTyped

    private void numberText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberText3ActionPerformed

    }//GEN-LAST:event_numberText3ActionPerformed

    private void numberText3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberText3KeyTyped
        if (numberText3.getText().length() >= 4)
        {
            evt.consume();
        }
    }//GEN-LAST:event_numberText3KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            conectar();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        ClientRegister.showData();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fNameText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lNameText;
    private javax.swing.JTextField mailText;
    private javax.swing.JTextField numberText1;
    private javax.swing.JTextField numberText2;
    private javax.swing.JTextField numberText3;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}