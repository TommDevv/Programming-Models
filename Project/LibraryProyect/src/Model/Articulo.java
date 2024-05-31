
package Model;

import java.time.LocalDate;

public class Articulo extends Archivo{

    public Articulo(String titulo, LocalDate fechaPublicacion, String autor, String editorial, PrimerRegistro registro) {
        super(titulo, fechaPublicacion, autor, editorial, registro);
    }
     
}
