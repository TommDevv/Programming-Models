package Model;

public class Usuario {

	private int id;
    private String username;
    private String password;
    private String nombre;
    private String correoElectronico;
    private String direccionFisica;
    private String numeroTelefono;


    public Usuario(int id, String username, String password, String nombre, String correoElectronico, String direccionFisica, String numeroTelefono) {
    	this.id = id;
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.direccionFisica = direccionFisica;
        this.numeroTelefono = numeroTelefono;
    }


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCorreoElectronico() {
		return correoElectronico;
	}


	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}


	public String getDireccionFisica() {
		return direccionFisica;
	}


	public void setDireccionFisica(String direccionFisica) {
		this.direccionFisica = direccionFisica;
	}


	public String getNumeroTelefono() {
		return numeroTelefono;
	}


	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	
	public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", usuario='" + username + '\'' +
                ", contraseña='" + password + '\'' +
                ", nombre='" + nombre + '\''+
                ", email='" + correoElectronico + '\'' +
                ", direccion='" + direccionFisica + '\'' +
                ", phoneNumber='" + numeroTelefono + '\'' +
                '}';
    }
    
    

}