
package Model;

import java.time.LocalDate;

public class Registro implements Cloneable{
    
    private String libro;
    private String modificador;
    private LocalDate fecha;

    public Registro(String libro, String modificador) {
        this.libro = libro;
        this.modificador = modificador;
        this.fecha = LocalDate.now();
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getModificador() {
        return modificador;
    }

    public void setModificador(String modificador) {
        this.modificador = modificador;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    	@Override
	public Object clone() {
		try {
			return super.clone();
		}catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
