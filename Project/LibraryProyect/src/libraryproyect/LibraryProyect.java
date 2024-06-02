
package libraryproyect;

import DAO.RegistroDAO;
import DAO.RegistroDAOImpl;


public class LibraryProyect {

 
    public static void main(String[] args) {
        
        RegistroDAOImpl Daoreg = new RegistroDAOImpl();
        System.out.println(Daoreg.leerPropiedades(1));
        System.out.println(Daoreg.getRegistro("12345"));
    }
    
}
