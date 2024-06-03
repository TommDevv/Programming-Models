
package DAO;

import Model.Archivo;

public interface ArchivoDAO {
    int obtenerCantidadArchivos();
    Archivo leerPropiedades(int i);
    Archivo getArchivo(String titulo);
    void addArchivo(Archivo arc);
    void updateArchivo(Archivo arc);
    void deleteRegistro(String titulo);
    void almacenarPropiedades();
}
