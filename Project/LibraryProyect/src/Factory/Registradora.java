
package Factory;
import Model.*;
import java.time.LocalDate;

public abstract class Registradora {
    
    public PrimerRegistro generarRegistro(String creador, String libro, String modificador){
        return new PrimerRegistro(creador, libro, modificador);
    }
    
    public abstract Archivo crearArchivo(String titulo, LocalDate fechaPublicacion, String autor, String editorial, boolean disponible, boolean alta, PrimerRegistro registro, String creador);
}
