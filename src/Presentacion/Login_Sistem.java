
package Presentacion;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;


/**
 *
 * @author Usuario
 */
public class Login_Sistem extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public Login_Sistem() {
        initComponents();
     
 
 }
   

   


    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelfondo = new javax.swing.JPanel();
        txticono = new javax.swing.JLabel();
        txtexit = new javax.swing.JLabel();
        jseparador1 = new javax.swing.JSeparator();
        txtmuni = new javax.swing.JLabel();
        txtusuario = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JLabel();
        fielusuario = new javax.swing.JTextField();
        txtusuario7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        LoginBtn = new javax.swing.JButton();
        txticonocontraseña = new javax.swing.JLabel();
        labelcontraseña = new javax.swing.JPasswordField();
        txtfondo = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        txtlabelmoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanelfondo.setBackground(new java.awt.Color(255, 255, 255));
        jpanelfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txticono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/ImagenesSistema2024/415732918_698225495778006_1119471731745094111_n-removebg-preview (1).png"))); // NOI18N
        jpanelfondo.add(txticono, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 320, 440, 320));

        txtexit.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        txtexit.setText("X");
        txtexit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                txtexitMouseDragged(evt);
            }
        });
        txtexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtexitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtexitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtexitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtexitMousePressed(evt);
            }
        });
        jpanelfondo.add(txtexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 59, 62));

        jseparador1.setForeground(new java.awt.Color(255, 255, 255));
        jpanelfondo.add(jseparador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 300, 30));

        txtmuni.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtmuni.setForeground(new java.awt.Color(255, 255, 255));
        txtmuni.setText("MUNICIPALIDAD 26 DE OCTUBRE ");
        txtmuni.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                windowopen(evt);
            }
        });
        jpanelfondo.add(txtmuni, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 320, 50));

        txtusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/ImagenesSistema2024/users_theuser_6177.png"))); // NOI18N
        jpanelfondo.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 130, 130));

        txtcontraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtcontraseña.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtcontraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtcontraseña.setText("CONTRASEÑA");
        jpanelfondo.add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 230, 100));

        fielusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fielusuarioActionPerformed(evt);
            }
        });
        jpanelfondo.add(fielusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 250, 40));

        txtusuario7.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtusuario7.setForeground(new java.awt.Color(255, 255, 255));
        txtusuario7.setText("USUARIO ");
        jpanelfondo.add(txtusuario7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 110, 60));
        jpanelfondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 290, 30));

        LoginBtn.setBackground(new java.awt.Color(255, 255, 255));
        LoginBtn.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        LoginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/Imagenes02/auto.png"))); // NOI18N
        LoginBtn.setText("INICIAR SESSION ");
        LoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginBtnMouseEntered(evt);
            }
        });
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        jpanelfondo.add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 210, 60));

        txticonocontraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/ImagenesSistema2024/userpassword_deusuari_787.png"))); // NOI18N
        jpanelfondo.add(txticonocontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 120, 110));
        jpanelfondo.add(labelcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 250, 40));

        txtfondo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/ImagenesSistema2024/8785e6c0-a9c2-4a5c-b732-3bfe240ff22a.jpeg"))); // NOI18N
        txtfondo.setText(" ");
        jpanelfondo.add(txtfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 570, 640));

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitBtnMousePressed(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jpanelfondo.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 60));

        txtlabelmoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/Imagenes02/autorickshaw.png"))); // NOI18N
        txtlabelmoto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtlabelmotoMouseMoved(evt);
            }
        });
        jpanelfondo.add(txtlabelmoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fielusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fielusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fielusuarioActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
       
     String Usuario, pwd;
Usuario = fielusuario.getText();  // Asumiendo que fielusuario es un JTextField
pwd = new String(labelcontraseña.getPassword());  // Asegúrate de usar getPassword() si es JPasswordField

// Verifica que los valores sean correctos
System.out.println("Usuario ingresado: " + Usuario);
System.out.println("Contraseña ingresada: " + pwd);

if (Usuario.equals("municipalidad") && pwd.equals("12345")) {
    Mototaxis acceso = new Mototaxis();
    acceso.setVisible(true);
    this.setVisible(false);  // Oculta el login
} else {
    JOptionPane.showMessageDialog(null, "Usuario o Contraseña es incorrecta");
}
   
        
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void exitBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMousePressed
       
        xMouse =evt.getX();
        yMouse =evt.getY();
        
    }//GEN-LAST:event_exitBtnMousePressed

    private void txtexitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtexitMousePressed
     
        
    }//GEN-LAST:event_txtexitMousePressed

    private void txtexitMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtexitMouseDragged
    int x = evt.getXOnScreen();
    int y= evt.getYOnScreen();
        this.setLocation(x - xMouse,y- yMouse);
    }//GEN-LAST:event_txtexitMouseDragged

    private void txtexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtexitMouseClicked
    System.exit(0);
    }//GEN-LAST:event_txtexitMouseClicked

    private void txtexitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtexitMouseEntered
    exitBtn.setBackground(Color.red); 
    txtexit.setForeground(Color.white);
    }//GEN-LAST:event_txtexitMouseEntered

    private void txtexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtexitMouseExited
        exitBtn.setBackground(Color.white);
        txtexit.setForeground(Color.black);
    }//GEN-LAST:event_txtexitMouseExited

    private void LoginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnMouseEntered
       
        
        
    }//GEN-LAST:event_LoginBtnMouseEntered

    private void windowopen(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_windowopen
      
        final int MAX_X= 450;
        final int MIN_X=50;
         
       Thread animation = new Thread(new Runnable() {
            @Override
            public void run() {
              int x=20;
              int y=30; // POCICION DEL LABEL  
              
              while(true){
                  txtmuni.setLocation(x,y);
                  x+=10;
                  
                 try{
                     Thread.sleep(200);
                 }catch(Exception e) {
                  
              }
              }
            }
        }){
       
           
       };
        
        animation.start(); 
        
    }//GEN-LAST:event_windowopen

    private void txtlabelmotoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtlabelmotoMouseMoved
       final int MAX_X = 550;  // Límite derecho
final int MIN_X = 50;   // Límite izquierdo

Thread animation = new Thread(new Runnable() {
    @Override
    public void run() {
        int x = MIN_X;  // Posición inicial de la moto
        int y = 60;     // Posición vertical constante

        while (true) {
            // Usamos invokeLater para asegurarnos que la actualización se haga en el hilo principal de la GUI
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    txtlabelmoto.setLocation(x, y);  // Actualiza la posición de la moto
                }
            });

            x += 10;  // Incrementa la posición horizontal de la moto

            // Si la moto llega al borde derecho, reinicia su posición en el borde izquierdo
            if (x >= MAX_X) {
                x = MIN_X;
            }

            try {
                Thread.sleep(100);  // Ajusta el tiempo de espera para que el movimiento sea fluido
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
});

animation.start();

        

            


    }//GEN-LAST:event_txtlabelmotoMouseMoved

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
            java.util.logging.Logger.getLogger(Login_Sistem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Sistem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Sistem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Sistem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Sistem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JTextField fielusuario;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpanelfondo;
    private javax.swing.JSeparator jseparador1;
    private javax.swing.JPasswordField labelcontraseña;
    private javax.swing.JLabel txtcontraseña;
    private javax.swing.JLabel txtexit;
    private javax.swing.JLabel txtfondo;
    private javax.swing.JLabel txticono;
    private javax.swing.JLabel txticonocontraseña;
    private javax.swing.JLabel txtlabelmoto;
    private javax.swing.JLabel txtmuni;
    private javax.swing.JLabel txtusuario;
    private javax.swing.JLabel txtusuario7;
    // End of variables declaration//GEN-END:variables
}

