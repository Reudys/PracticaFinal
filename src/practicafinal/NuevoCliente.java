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
public class NuevoCliente extends javax.swing.JFrame {
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
            String textUser = userText.getText();
            String textFname = fNameText.getText();
            String textLname = lNameText.getText();
            String textNumber1 = numberText1.getText();
            String textNumber2 = numberText2.getText();
            String textNumber3 = numberText3.getText();
            String textMail = mailText.getText();
            
        if (!textUser.isEmpty() && !textFname.isEmpty() && !textLname.isEmpty() && !textNumber1.isEmpty() && !textNumber2.isEmpty() && !textNumber3.isEmpty() && !textMail.isEmpty()){
             
                    // Corregir la consulta SQL
                String query = "INSERT INTO client (FIRST_NAME, LAST_NAME, USER_NUMBER, MAIL, USER_NAME) VALUES (?,?,?,?,?)";
                PreparedStatement stmt = con.prepareStatement(query);

                
                stmt.setString(1, textFname);
                stmt.setString(2, textLname);
                stmt.setString(3, "(" + textNumber1 + ")" + "." + textNumber2 + "." + textNumber3);
                stmt.setString(4, textMail);
                stmt.setString(5, textUser);
                stmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");
        } else {
           JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }
    }
}
    /**
     * Creates new form NuevoCliente
     */
    public NuevoCliente() {
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
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        fNameText = new javax.swing.JTextField();
        lNameText = new javax.swing.JTextField();
        numberText1 = new javax.swing.JTextField();
        mailText = new javax.swing.JTextField();
        userText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        numberText2 = new javax.swing.JTextField();
        numberText3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registro de Clientes");

        txt1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txt1.setForeground(new java.awt.Color(204, 204, 204));
        txt1.setText("Nombre:");

        txt2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txt2.setForeground(new java.awt.Color(204, 204, 204));
        txt2.setText("Apellido:");

        txt3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txt3.setForeground(new java.awt.Color(204, 204, 204));
        txt3.setText("Numero:");

        txt4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txt4.setForeground(new java.awt.Color(204, 204, 204));
        txt4.setText("Correo:");

        txt5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txt5.setForeground(new java.awt.Color(204, 204, 204));
        txt5.setText("Usuario:");

        fNameText.setBackground(new java.awt.Color(255, 255, 255));
        fNameText.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        fNameText.setForeground(new java.awt.Color(51, 51, 51));

        lNameText.setBackground(new java.awt.Color(255, 255, 255));
        lNameText.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lNameText.setForeground(new java.awt.Color(51, 51, 51));
        lNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameTextActionPerformed(evt);
            }
        });

        numberText1.setBackground(new java.awt.Color(255, 255, 255));
        numberText1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
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

        mailText.setBackground(new java.awt.Color(255, 255, 255));
        mailText.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        mailText.setForeground(new java.awt.Color(51, 51, 51));
        mailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailTextActionPerformed(evt);
            }
        });

        userText.setBackground(new java.awt.Color(255, 255, 255));
        userText.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        userText.setForeground(new java.awt.Color(51, 51, 51));
        userText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ENVIAR");
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

        numberText2.setBackground(new java.awt.Color(255, 255, 255));
        numberText2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
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

        numberText3.setBackground(new java.awt.Color(255, 255, 255));
        numberText3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
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

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("(");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText(")");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText(".");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText(".");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(fNameText)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt3)
                                    .addComponent(txt2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numberText1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numberText2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numberText3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt4)
                                    .addComponent(txt5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mailText, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1)
                    .addComponent(fNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2)
                    .addComponent(lNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3)
                    .addComponent(numberText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberText3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameTextActionPerformed

    private void numberText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberText1ActionPerformed

    }//GEN-LAST:event_numberText1ActionPerformed

    
    private void mailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTextActionPerformed

    private void userTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void numberText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberText2ActionPerformed

    }//GEN-LAST:event_numberText2ActionPerformed

    
    private void numberText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberText3ActionPerformed

    }//GEN-LAST:event_numberText3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            conectar();
        } catch (SQLException ex) {
            Logger.getLogger(NuevoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        ClientRegister.showData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void numberText1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberText1KeyTyped
        if (numberText1.getText().length() >= 3)
        {
            evt.consume();
        }
    }//GEN-LAST:event_numberText1KeyTyped

    private void numberText2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberText2KeyTyped
        if (numberText2.getText().length() >= 3)
        {
            evt.consume();
        }
    }//GEN-LAST:event_numberText2KeyTyped

    private void numberText3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberText3KeyTyped
        if (numberText3.getText().length() >= 4)
        {
            evt.consume();
        }
    }//GEN-LAST:event_numberText3KeyTyped

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
            java.util.logging.Logger.getLogger(NuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fNameText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lNameText;
    private javax.swing.JTextField mailText;
    private javax.swing.JTextField numberText1;
    private javax.swing.JTextField numberText2;
    private javax.swing.JTextField numberText3;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
