
package Factory;
import Model.*;
import java.time.LocalDate;

public class RegistradoraPonencia extends Registradora {

    @Override
    public Archivo crearArchivo(String titulo, String fechaPublicacion, String autor, String editorial, boolean disponible, boolean alta, PrimerRegistro registro, String creador) {
        return new Ponencia("", titulo, fechaPublicacion, autor, editorial, super.generarRegistro(creador, titulo, creador));
    }
 
    public Ponencia configCongreso(String congreso, Ponencia ponencia){
        Ponencia pon = ponencia;
        pon.setCongreso(congreso);
        return pon;
    }
    
    public String obtenerCongreso(Ponencia pon){
        return pon.getCongreso();
    }
}
