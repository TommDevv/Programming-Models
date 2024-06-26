/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Facade;
import javax.swing.JOptionPane;

/**
 *
 * @author nous_
 */
public class Login extends javax.swing.JFrame {
    private Facade facade;
    /**
     * Creates new form Login
     */
    public Login() {
        this.facade= new Facade();
        initComponents();
        facade = new Facade();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtContraseña = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        btnRecuperarPass = new javax.swing.JButton();
        LabelBienvenida = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 160, 30));

        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setToolTipText("Ingresar Usuario");
        txtUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 160, 30));

        btnIniciarSesion.setBackground(new java.awt.Color(204, 204, 255));
        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.setToolTipText("Iniciar Sesion");
        btnIniciarSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseClicked(evt);
            }
        });
        getContentPane().add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 110, 30));

        btnRegistrarse.setBackground(new java.awt.Color(204, 204, 255));
        btnRegistrarse.setText("Crear una Cuenta");
        btnRegistrarse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarseMouseClicked(evt);
            }
        });
        getContentPane().add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 140, 20));

        btnRecuperarPass.setBackground(new java.awt.Color(204, 204, 255));
        btnRecuperarPass.setText("Olvidé mi contraseña");
        btnRecuperarPass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnRecuperarPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 470, 140, 20));

        LabelBienvenida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/BibliotecaOnline_Bienvenido.png"))); // NOI18N
        getContentPane().add(LabelBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/paper.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-680, 0, 1480, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarseMouseClicked
        Registrarse newframe = new Registrarse();

                newframe.setVisible(true);

                this.dispose();
    }//GEN-LAST:event_btnRegistrarseMouseClicked

    private void btnIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseClicked
        try{
           
        String usuario = txtUsuario.getText();
        String contraseña = txtContraseña.getText();
        if(usuario.equals("admin") && contraseña.equals("admin")){
            Admin newframe = new Admin();

            newframe.setVisible(true);

            this.dispose();
        }else{
            boolean valido = facade.validarUsuario(usuario, contraseña);
        
            if(valido){
            GestorDocumentos newframe = new GestorDocumentos(usuario);

            newframe.setVisible(true);

            this.dispose();
            
        }else{
            System.out.print("paila");
        }
        }
        }catch (Exception e) {
            // Muestra el error en una ventana emergente
            JOptionPane.showMessageDialog(null, "Se produjo un error: " + e.getMessage(), "No se pudo logear", JOptionPane.ERROR_MESSAGE);
        }finally {
            // Este bloque siempre se ejecuta
            
        }
        
    
    }//GEN-LAST:event_btnIniciarSesionMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel LabelBienvenida;
    public javax.swing.JButton btnIniciarSesion;
    public javax.swing.JButton btnRecuperarPass;
    public javax.swing.JButton btnRegistrarse;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
