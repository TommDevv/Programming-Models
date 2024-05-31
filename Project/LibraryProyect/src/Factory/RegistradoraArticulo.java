
package Factory;
import Model.*;
import java.time.LocalDate;

public class RegistradoraArticulo extends Registradora {

    @Override
    public Archivo crearArchivo(String titulo, LocalDate fechaPublicacion, String autor, String editorial, boolean disponible, boolean alta, PrimerRegistro registro, String creador) {
        return new SSNAdapter("", titulo, fechaPublicacion, autor, editorial, super.generarRegistro(creador, titulo, creador));
    }
 
    public SSNAdapter configSSN(String SSN, SSNAdapter articulo){
        SSNAdapter art = articulo;
        art.ssnAdapter(SSN);
        return art;
    }
}

