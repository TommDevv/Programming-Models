/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;




import DAO.UsuarioDAOImpl;
import java.util.ArrayList;
import java.util.List;
import proxy.Proxy;

public class Login {

    private static Login instance;
    private Proxy proxy;
    private UsuarioDAOImpl x;
    
   

    public Login(){
        this.proxy = new Proxy();
        this.x= new UsuarioDAOImpl();
        
    }
    public Login getInstance(){
        if(instance == null){
            instance = new Login();
        }
        return instance;
    }

    
     public void registrarUsuario(Usuario user){
        ArrayList<Usuario> usuarios = proxy.getAllUsuarios();
        boolean valido=false;
        for(Usuario usuario: usuarios ) {
            if(usuario.getUsername().equals(user.getUsername())) {
                    valido= false;
                }else{
                    valido=true;
            }
        }
        
        if(valido){
            x.addUsuario(user);
        }else{
            System.out.print("pailas compae ya existe ese user");
        }
    }
    public boolean validarUsuario(String user, String contraseña){
        ArrayList<Usuario> usuarios = proxy.getAllUsuarios();
        
        for(Usuario usuario: usuarios ) {
            if(usuario.getUsername().equals(user)) {
               if(usuario.getPassword().equals(contraseña)) {
                   return true;
                }else {
                    return false;
                }
            }
        }
        return false;
        
    }
    
    
   
    public int asignarId() {
    ArrayList<Usuario> usuarios = proxy.getAllUsuarios();

    // Encuentra el ID máximo actual
    int maxId = 0;
    for (Usuario usuario : usuarios) {
        if (usuario.getId() > maxId) {
            maxId = usuario.getId();
        }
    }

    // Asigna el siguiente ID disponible
    return maxId + 1;
}
}
