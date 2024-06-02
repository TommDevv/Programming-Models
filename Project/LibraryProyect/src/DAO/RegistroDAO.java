
package DAO;

import Model.Registro;
import java.util.ArrayList;

public interface RegistroDAO {
    int obtenerCantidadRegistros();
    Registro leerPropiedades(int i);
    ArrayList<Registro> getAllRegistro();
    Registro getRegistro(String id);
    void addRegistro(Registro reg);
    void updateRegistro(Registro reg);
    void deleteRegistro(String id);
    void almacenarPropiedades();
}
