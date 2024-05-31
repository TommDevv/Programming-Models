
package Model;

import java.time.LocalDate;

public class SSNAdapter extends Articulo{
    
    private String SSN;

    public SSNAdapter(String SSN, String titulo, LocalDate fechaPublicacion, String autor, String editorial, PrimerRegistro registro) {
        super(titulo, fechaPublicacion, autor, editorial, registro);
        this.ssnAdapter(SSN);
    }


    
    public void ssnAdapter(String SSN){
        super.setISBN(SSN);
    }
    
}
