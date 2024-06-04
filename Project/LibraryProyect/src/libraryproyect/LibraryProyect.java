
package libraryproyect;

import DAO.RegistroDAO;
import DAO.RegistroDAOImpl;
import DAO.UsuarioDAOImpl;
import Model.Facade;
import View.Login;
import proxy.Proxy;


public class LibraryProyect {

 
    
        public static void main(String args[]) {
        Proxy f = new Proxy();
        System.out.print(f.getAllRegistros());
}
}

