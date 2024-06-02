
package Model;

import java.time.LocalDate;
import java.util.*;

public class Registro implements Cloneable{
    
    private String libro;
    private String modificador;
    private LocalDate fecha;
    private String id;

    public Registro(String libro, String modificador) {
        this.libro = libro;
        this.modificador = modificador;
        //this.fecha = LocalDate.now();
        this.id = String.valueOf((int)((Math.random())*100000)%100000);
    }

    public void configFecha(){
        this.fecha= LocalDate.now();
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

    public void setFecha(String fecha) {
        this.fecha = this.fecha.parse(fecha);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
