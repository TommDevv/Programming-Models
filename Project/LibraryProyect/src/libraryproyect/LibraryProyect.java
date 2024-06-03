
package libraryproyect;

import DAO.RegistroDAO;
import DAO.RegistroDAOImpl;
import proxy.Proxy;


public class LibraryProyect {

 
    public static void main(String[] args) {
        
        RegistroDAOImpl Daoreg = new RegistroDAOImpl();
        System.out.println(Daoreg.leerPropiedades(2));
        System.out.println(Daoreg.getRegistro("54321"));
        Proxy proxy = new Proxy();
        System.out.println(proxy.archivos);
        System.out.println(proxy.registros);
    }
    
}
