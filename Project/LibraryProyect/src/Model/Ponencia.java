package Model;

import java.time.LocalDate;

public class Ponencia extends Archivo {

    private String congreso;

    public Ponencia(String congreso, String titulo, LocalDate fechaPublicacion, String autor, String editorial, PrimerRegistro registro) {
        super(titulo, fechaPublicacion, autor, editorial, registro);
        this.congreso = congreso;
    }

    public String getCongreso() {
        return congreso;
    }

    public void setCongreso(String congreso) {
        this.congreso = congreso;
    } 
    
}
