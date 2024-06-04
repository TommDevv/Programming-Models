
package Factory;
import Model.*;
import java.time.LocalDate;

public class RegistradoraLibro extends Registradora {

    @Override
    public Archivo crearArchivo(String titulo, String fechaPublicacion, String autor, String editorial, boolean disponible, boolean alta, PrimerRegistro registro, String creador) {
        return new Libro(titulo, fechaPublicacion, autor, editorial, super.generarRegistro(creador, titulo, creador),0);
        
    }
 
    public Libro configPaginas(int paginas, Libro libro){
        Libro lib = libro;
        lib.setPaginas(paginas);
        return lib;
    }
    
    public int obtenerPaginas(Libro libro){
        return libro.getPaginas();
    }
}
