
package Model;

public class PrimerRegistro extends Registro{
    
    private String creador;

    public PrimerRegistro(String creador, String libro, String modificador) {
        super(libro, modificador);
        this.creador = creador;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }  
}
