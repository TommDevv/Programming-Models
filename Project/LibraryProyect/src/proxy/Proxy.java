
package proxy;

import Model.*;
import DAO.*;
import java.util.ArrayList;

public class Proxy {
    public ArrayList<Archivo> archivos = new ArrayList<Archivo>();
    public ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    public ArrayList<Registro> registros = new ArrayList<Registro>();
    private ArchivoDAOImpl DAOarchivos = new ArchivoDAOImpl();
    private RegistroDAOImpl DAOregistros = new RegistroDAOImpl();
    private UsuarioDAOImpl DAOusuarios = new UsuarioDAOImpl();
    
    public Proxy(){
        int cantreg = DAOregistros.obtenerCantidadRegistros();
        int cantarc = DAOarchivos.obtenerCantidadArchivos();
        int cantusr = DAOusuarios.obtenerCantidadUsuarios();
        
        for(int i =1; i<= cantusr; i++){
            usuarios.add(DAOusuarios.getUsuario(i));
        }
        for (int i = 1; i <= cantreg;i++){
            registros.add(DAOregistros.leerPropiedades(i));
        }
        
        for (int j = 1; j <= cantarc;j++){
            archivos.add(DAOarchivos.leerPropiedades(j));
        }
    }
    
    public ArrayList getAllRegistros(){
        return registros;
    }
    
    public ArrayList getAllArchivos(){
        return archivos;
    }
    
    public ArrayList getAllUsuarios(){
        return usuarios;
    }
    
    public Archivo getArchivo(String titulo){
        Archivo arc = null;
        for(Archivo a : archivos){
            String temptitle = a.getTitulo();
            if(temptitle.equals(titulo)){
                arc = a;
            }
        }
        return arc;
    }
    
    
    public Registro getRegistro(String id){
        Registro reg = null;
        for(Registro r : registros){
            String tempid = r.getId();
            if(tempid.equals(id)){
                reg = r;
            }
        }
        return reg;
    }
    
    public Usuario getUsuario(String nombre){
        Usuario usr = null;
        for(Usuario u : usuarios){
            String tempname = u.getNombre();
            if(tempname.equals(nombre)){
                usr = u;
            }
        }
        return usr;
    }
    
    public void addArchivo(Archivo arc){
        archivos.add(arc);
    }

    public void addRegistro(Registro reg){
        registros.add(reg);
    }
    
    public void addUsuario(Usuario usr){
        usuarios.add(usr);
    }
    
    public void deleteArchivo(String titulo){
        for(Archivo a : archivos){
            String temptitle = a.getTitulo();
            if(temptitle.equals(titulo)){
                int index = archivos.indexOf(a);
                archivos.remove(index);
            }
        }
    }
    
    public void deleteRegistro(String id){
        for(Registro r : registros){
            String tempid = r.getId();
            if(tempid.equals(id)){
                int index = registros.indexOf(r);
                registros.remove(index);
            }
        }
    }
    
    public void deleteUsuario(String nombre){
        for(Usuario u : usuarios){
            String tempname = u.getNombre();
            if(tempname.equals(nombre)){
                int index = usuarios.indexOf(u);
                usuarios.remove(index);
            }
        }
    }
    
    public void updateArchivo(Archivo arc){
        for(Archivo a : archivos){
            String temptitle = a.getTitulo();
            if(temptitle.equals(arc.getTitulo())){
                archivos.set(archivos.indexOf(a),arc);
            }
        }
    }
    
    public void updateRegistro(Registro reg){
        for(Registro r : registros){
            String tempid = r.getId();
            if(tempid.equals(reg.getId())){
                registros.set(registros.indexOf(r), reg);
            }
        }
    }
    
    public void updateUsuario(Usuario usr){
        for(Usuario u : usuarios){
            String tempname = u.getNombre();
            usuarios.set(usuarios.indexOf(u), usr);
        }
    }
    
    public void almacenarDatos(){
        DAOarchivos.limpiarPropiedades();
        for(Archivo a : archivos){
            DAOarchivos.addArchivo(a);
        }
        for(Usuario u : usuarios){
            DAOusuarios.addUsuario(u);
        }
        DAOregistros.limpiarPropiedades();
        for(Registro r : registros){
            String tipo = r.getClass().getSimpleName();
            if(tipo.equals("PrimerRegistro")){
                DAOregistros.addPrimerRegistro((PrimerRegistro)r);
            }else if(tipo.equals("Registro")){
                DAOregistros.addRegistro(r);
            }
        }
    
        DAOarchivos.almacenarPropiedades();
        DAOusuarios.saveProperties();
        DAOregistros.almacenarPropiedades();
    }
}
