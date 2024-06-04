/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Factory.RegistradoraArticulo;
import Factory.RegistradoraLibro;
import Factory.RegistradoraPonencia;
import Model.Archivo;
import Model.Articulo;
import Model.Facade;
import Model.Libro;
import Model.Ponencia;
import Model.PrimerRegistro;
import Model.Registro;
import Model.SSNAdapter;
import javax.swing.JOptionPane;

/**
 *
 * @author nous_
 */
public class GestorDocumentos extends javax.swing.JFrame {
    String usuario;
     private Facade facade;
     private RegistradoraLibro regislibro;
     private RegistradoraPonencia regispon;
     private RegistradoraArticulo regisart;
    /**
     * Creates new form GestorDocumentos
     */
    public GestorDocumentos(String user) {
        usuario = user;
        this.facade= new Facade();
        this.regislibro = new RegistradoraLibro();
        this.regispon = new RegistradoraPonencia();
        this.regisart = new RegistradoraArticulo();
        initComponents();
        facade = new Facade();
        regislibro = new RegistradoraLibro();
        regispon= new RegistradoraPonencia();
        regisart = new RegistradoraArticulo();
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEditorial = new javax.swing.JTextField();
        txtTotalPaginas = new javax.swing.JTextField();
        txtFechaPublicacion = new javax.swing.JTextField();
        txtISBNSNN = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        btnConsultarTablaMods = new javax.swing.JButton();
        comboboxDocumentos = new javax.swing.JComboBox<>();
        btnCerrarSesion = new javax.swing.JButton();
        btnDevolverDocumento = new javax.swing.JButton();
        btnReservarDocumento = new javax.swing.JButton();
        btnConsultarDoc = new javax.swing.JButton();
        btnCrearDocumento = new javax.swing.JButton();
        btnModificarDocumento = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        congreso = new javax.swing.JTextField();
        primerRegistro = new javax.swing.JComboBox<>();
        Autor = new javax.swing.JTextField();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEditorial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEditorial.setText("Editorial");
        txtEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditorialActionPerformed(evt);
            }
        });
        getContentPane().add(txtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 210, -1));

        txtTotalPaginas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalPaginas.setText("Total de Paginas");
        txtTotalPaginas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPaginasActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotalPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 210, -1));

        txtFechaPublicacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaPublicacion.setText("Fecha de publicacion");
        txtFechaPublicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaPublicacionActionPerformed(evt);
            }
        });
        getContentPane().add(txtFechaPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 210, -1));

        txtISBNSNN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtISBNSNN.setText("ISBN/SNN");
        txtISBNSNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtISBNSNNActionPerformed(evt);
            }
        });
        getContentPane().add(txtISBNSNN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 210, -1));

        txtTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTitulo.setText("Titulo del Documento");
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 210, -1));

        btnConsultarTablaMods.setBackground(new java.awt.Color(204, 204, 255));
        btnConsultarTablaMods.setText("Consultar Modificaciones");
        btnConsultarTablaMods.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnConsultarTablaMods, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 180, -1));

        comboboxDocumentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "libro", "ponencia", "articulo cientifico" }));
        getContentPane().add(comboboxDocumentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 210, -1));

        btnCerrarSesion.setBackground(new java.awt.Color(204, 204, 255));
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 210, -1));

        btnDevolverDocumento.setBackground(new java.awt.Color(204, 204, 255));
        btnDevolverDocumento.setText("Devolucion");
        btnDevolverDocumento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnDevolverDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, -1));

        btnReservarDocumento.setBackground(new java.awt.Color(204, 204, 255));
        btnReservarDocumento.setText("Reservar Online");
        btnReservarDocumento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnReservarDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 180, -1));

        btnConsultarDoc.setBackground(new java.awt.Color(204, 204, 255));
        btnConsultarDoc.setText("Consultar Documento");
        btnConsultarDoc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnConsultarDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 180, -1));

        btnCrearDocumento.setBackground(new java.awt.Color(204, 204, 255));
        btnCrearDocumento.setText("Crear Documento");
        btnCrearDocumento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCrearDocumento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearDocumentoMouseClicked(evt);
            }
        });
        btnCrearDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearDocumentoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 180, -1));

        btnModificarDocumento.setBackground(new java.awt.Color(204, 204, 255));
        btnModificarDocumento.setText("Modificar Documento");
        btnModificarDocumento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModificarDocumento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarDocumentoMouseClicked(evt);
            }
        });
        btnModificarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDocumentoActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificarDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 180, -1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 320, 0));

        congreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        congreso.setText("Nombre del congreso");
        congreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congresoActionPerformed(evt);
            }
        });
        getContentPane().add(congreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 210, -1));

        primerRegistro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "si", "no" }));
        primerRegistro.setToolTipText("Primer registro?");
        primerRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primerRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(primerRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 210, -1));

        Autor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Autor.setText("Autor");
        Autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutorActionPerformed(evt);
            }
        });
        getContentPane().add(Autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 210, -1));

        LabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/paper.png"))); // NOI18N
        getContentPane().add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtISBNSNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtISBNSNNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtISBNSNNActionPerformed

    private void txtTotalPaginasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPaginasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPaginasActionPerformed

    private void txtEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditorialActionPerformed

    private void btnCrearDocumentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearDocumentoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearDocumentoMouseClicked

    private void congresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_congresoActionPerformed

    private void primerRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primerRegistroActionPerformed

    private void btnCrearDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearDocumentoActionPerformed
      String tipo = comboboxDocumentos.getSelectedItem().toString();
      String PrimerRegistro = primerRegistro.getSelectedItem().toString();
      try{
      if(tipo.equals("libro")){
          int paginas = Integer.valueOf(txtTotalPaginas.getText());
          String titulo= txtTitulo.getText();
          String fechaPublicacion= txtFechaPublicacion.getText();
          String autor = Autor.getText();
          String editorial = txtEditorial.getText();
          if(PrimerRegistro.equals("si")){
              
              PrimerRegistro primer = new PrimerRegistro(usuario, titulo, usuario);
              Archivo archivo= regislibro.crearArchivo(titulo, fechaPublicacion, autor, editorial, true, true, primer, autor);
              regislibro.configPaginas(paginas, (Libro) archivo);
              facade.addArchivo(archivo);
              facade.addPrimerRegistro(primer);
              
          }else{
               PrimerRegistro primer = new PrimerRegistro(usuario, titulo, usuario);
               Registro registro = (Registro) primer.clone();
              Archivo archivo= regislibro.crearArchivo(titulo, fechaPublicacion, autor, editorial, true, true, primer, autor);
              regislibro.configPaginas(paginas, (Libro) archivo);
              facade.addArchivo(archivo);
              facade.addRegistro(registro);         
          }
      }else if(tipo.equals("ponencia")){
          String Congreso = congreso.getText();
          String titulo= txtTitulo.getText();
          String fechaPublicacion= txtFechaPublicacion.getText();
          String autor = Autor.getText();
          String editorial = txtEditorial.getText();
          
          if(PrimerRegistro.equals("si")){
              
              PrimerRegistro primer = new PrimerRegistro(usuario, titulo, usuario);
              Archivo archivo= regispon.crearArchivo(titulo, fechaPublicacion, autor, editorial, true, true, primer, autor);
              regispon.configCongreso(Congreso, (Ponencia) archivo);
              facade.addArchivo(archivo);
              facade.addPrimerRegistro(primer);
              
          }else{
                PrimerRegistro primer = new PrimerRegistro(usuario, titulo, usuario);
               Registro registro = (Registro) primer.clone();
              Archivo archivo= regispon.crearArchivo(titulo, fechaPublicacion, autor, editorial, true, true, primer, autor);
              regispon.configCongreso(Congreso, (Ponencia) archivo);
              facade.addArchivo(archivo);
              facade.addRegistro(registro);         
          }
      }else if(tipo.equals("articulo cientifico")){
          String SSN = txtISBNSNN.getText();
          String titulo= txtTitulo.getText();
          String fechaPublicacion= txtFechaPublicacion.getText();
          String autor = Autor.getText();
          String editorial = txtEditorial.getText();
          
          if(PrimerRegistro.equals("si")){
              
              PrimerRegistro primer = new PrimerRegistro(usuario, titulo, usuario);
              SSNAdapter adapter = new SSNAdapter(SSN, titulo, fechaPublicacion, autor, editorial, primer);
              Archivo archivo= regisart.crearArchivo(titulo, fechaPublicacion, autor, editorial, true, true, primer, autor);
              regisart.configSSN(SSN, adapter);
             
              regisart.configSSN(SSN, adapter);
              facade.addArchivo(archivo);
              facade.addPrimerRegistro(primer);
              
          }else{
               PrimerRegistro primer = new PrimerRegistro(usuario, titulo, usuario);
               Registro registro = (Registro) primer.clone();
              SSNAdapter adapter = new SSNAdapter(SSN, titulo, fechaPublicacion, autor, editorial, (PrimerRegistro) registro);
              Archivo archivo= regisart.crearArchivo(titulo, fechaPublicacion, autor, editorial, true, true,primer, autor);
              regisart.configSSN(SSN, adapter);
              facade.addArchivo(archivo);
              facade.addRegistro(registro);   
      }
      }
      }catch (Exception e) {
            // Muestra el error en una ventana emergente
            JOptionPane.showMessageDialog(null, "Se produjo un error: " + e.getMessage(), "No se pudo registrar el archivo", JOptionPane.ERROR_MESSAGE);
        }finally {
            // Este bloque siempre se ejecuta
            
        
      
      }
    }//GEN-LAST:event_btnCrearDocumentoActionPerformed

    private void AutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AutorActionPerformed

    private void txtFechaPublicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaPublicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaPublicacionActionPerformed

    private void btnModificarDocumentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarDocumentoMouseClicked
        
    }//GEN-LAST:event_btnModificarDocumentoMouseClicked

    private void btnModificarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDocumentoActionPerformed
    String PrimerRegistro = primerRegistro.getSelectedItem().toString();
    String titulo= txtTitulo.getText();
    String tipo = comboboxDocumentos.getSelectedItem().toString();
    
      try{
      if(tipo.equals("libro")){
          int paginas = Integer.valueOf(txtTotalPaginas.getText());
          String fechaPublicacion= txtFechaPublicacion.getText();
          String autor = Autor.getText();
          String editorial = txtEditorial.getText();
          String titulolibro= titulo;
          PrimerRegistro primer = new PrimerRegistro(usuario, titulolibro, usuario);
          Archivo archivo= regislibro.crearArchivo(titulolibro, fechaPublicacion, autor, editorial, true, true, primer , autor);
          regislibro.configPaginas(paginas, (Libro) archivo);
          facade.updateArchivo(archivo);
          facade.updateRegistro(primer);
          }else if(tipo.equals("ponencia")){
              String Congreso = congreso.getText();
              String fechaPublicacion= txtFechaPublicacion.getText();
              String autor = Autor.getText();
              String editorial = txtEditorial.getText();
              String tituloponencia= titulo;
          
          
            Registro registro = new Registro(tituloponencia, usuario);
           Archivo archivo= regispon.crearArchivo(tituloponencia, fechaPublicacion, autor, editorial, true, true, (PrimerRegistro) registro, autor);
           regispon.configCongreso(Congreso, (Ponencia) archivo);
           facade.updateArchivo(archivo);
           facade.updateRegistro(registro);
          
      }else if(tipo.equals("articulo cientifico")){
          String SSN = txtISBNSNN.getText();
          String fechaPublicacion= txtFechaPublicacion.getText();
          String autor = Autor.getText();
          String editorial = txtEditorial.getText();
          String tituloarticulo= titulo;
          
              Registro registro = new Registro(tituloarticulo, usuario);
              SSNAdapter adapter = new SSNAdapter(SSN, tituloarticulo, fechaPublicacion, autor, editorial, (PrimerRegistro) registro);
              Archivo archivo= regisart.crearArchivo(tituloarticulo, fechaPublicacion, autor, editorial, true, true, (PrimerRegistro) registro, autor);
              regisart.configSSN(SSN, adapter);
              facade.updateArchivo(archivo);
              facade.updateRegistro(registro);  
      
      }
      }catch (Exception e) {
            // Muestra el error en una ventana emergente
            JOptionPane.showMessageDialog(null, "Se produjo un error: " + e.getMessage(), "No se pudo registrar el archivo", JOptionPane.ERROR_MESSAGE);
        }finally {
            // Este bloque siempre se ejecuta
            
        
      
      }
    
    
    
    }//GEN-LAST:event_btnModificarDocumentoActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Autor;
    public javax.swing.JLabel LabelFondo;
    public javax.swing.JButton btnCerrarSesion;
    public javax.swing.JButton btnConsultarDoc;
    public javax.swing.JButton btnConsultarTablaMods;
    public javax.swing.JButton btnCrearDocumento;
    public javax.swing.JButton btnDevolverDocumento;
    public javax.swing.JButton btnModificarDocumento;
    public javax.swing.JButton btnReservarDocumento;
    public javax.swing.JComboBox<String> comboboxDocumentos;
    public javax.swing.JTextField congreso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> primerRegistro;
    public javax.swing.JTextField txtEditorial;
    public javax.swing.JTextField txtFechaPublicacion;
    public javax.swing.JTextField txtISBNSNN;
    public javax.swing.JTextField txtTitulo;
    public javax.swing.JTextField txtTotalPaginas;
    // End of variables declaration//GEN-END:variables
}
