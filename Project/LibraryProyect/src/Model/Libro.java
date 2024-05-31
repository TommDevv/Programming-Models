
package Model;

import java.time.LocalDate;

public class Libro extends Archivo {
    
    private int paginas;

    public Libro(int paginas, String titulo, LocalDate fechaPublicacion, String autor, String editorial, PrimerRegistro registro) {
        super(titulo, fechaPublicacion, autor, editorial, registro);
        this.paginas = paginas;
    }
 

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
   
    
    
}
