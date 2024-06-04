/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Janus
 */
import DAO.ArchivoDAOImpl;
import DAO.RegistroDAOImpl;
import java.util.ArrayList;

import Model.*;
import proxy.Proxy;
import java.util.ArrayList;

public class Facade {
    private ArchivoDAOImpl archivo;
    private RegistroDAOImpl registro;
    private Proxy proxy;
    private Login login;

    public Facade() {
        this.proxy = new Proxy();
        this.login= new Login();
        this.archivo = new ArchivoDAOImpl();
        this.registro = new RegistroDAOImpl();
        
    }

    public ArrayList getAllArchivos() {
        return proxy.getAllArchivos();
    }
    
    
    
    public ArrayList getAllRegistros() {
        return proxy.getAllRegistros();
    }

    public ArrayList getAllUsuarios() {
        return proxy.getAllUsuarios();
    }

    public Archivo getArchivo(String titulo) {
        return proxy.getArchivo(titulo);
    }

    public Registro getRegistro(String id) {
        return proxy.getRegistro(id);
    }

    public Usuario getUsuario(String nombre) {
        return proxy.getUsuario(nombre);
    }

    public void addArchivo(Archivo arc) {
        
        archivo.addArchivo(arc);
        archivo.almacenarPropiedades();
        
    }

    public void addRegistro(Registro reg) {
        registro.addRegistro(reg);
        registro.almacenarPropiedades();
    }
    
    public void addPrimerRegistro(PrimerRegistro reg) {
        registro.addRegistro(reg);
        registro.almacenarPropiedades();
    }

    public void addUsuario(Usuario usr) {
        proxy.addUsuario(usr);
    }

    public void deleteArchivo(String titulo) {
        archivo.deleteRegistro(titulo);
        archivo.almacenarPropiedades();
    }

    public void deleteRegistro(String id) {
        proxy.deleteRegistro(id);
    }

    public void deleteUsuario(String nombre) {
        proxy.deleteUsuario(nombre);
    }

    public void updateArchivo(Archivo arc) {
        archivo.updateArchivo(arc);
        archivo.almacenarPropiedades();
    }

    public void updateRegistro(Registro reg) {
        registro.updateRegistro(reg);
        registro.almacenarPropiedades();
    }

    public void updateUsuario(Usuario usr) {
        proxy.updateUsuario(usr);
    }

    public void almacenarDatos() {
        proxy.almacenarDatos();
    }
    
    public void registrarUsuario(Usuario user){
        login.registrarUsuario(user);
}
    
    public boolean validarUsuario(String user, String contraseña){
        boolean valido= login.validarUsuario(user, contraseña);
        return valido;
    }
    
    public int asignarId(){
        return login.asignarId();
    }
    
    
}