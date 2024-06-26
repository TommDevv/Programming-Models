package Model;

import java.time.LocalDate;

public abstract class Archivo {

    private String titulo;
    private LocalDate fechaPublicacion;
    private String autor;
    private String editorial;
    private boolean disponible;
    private boolean alta;
    private String ISBN;
    private PrimerRegistro registro;

    public Archivo(String titulo, String fechaPublicacion, String autor, String editorial, PrimerRegistro registro) {
        this.titulo = titulo;
        this.fechaPublicacion = LocalDate.parse(fechaPublicacion);
        this.autor = autor;
        this.editorial = editorial;
        this.disponible = true;
        this.alta = true;
        this.registro = registro;
        this.ISBN = this.generarISBN();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public PrimerRegistro getRegistro() {
        return registro;
    }

    public void setRegistro(PrimerRegistro registro) {
        this.registro = registro;
    }

    public static int hashOp(int i) {
        int doubled = 2 * i;
        if (doubled >= 10) {
            doubled = doubled - 9;
        }
        return doubled;
    }

    public String generarISBN() {
        String laendercode;
        String bandnr;
        String verlagsnr;
        String checksum;

        double L1 = Math.random() * (10);
        double L2 = Math.random() * (10);

        double B1 = Math.random() * (10);
        double B2 = Math.random() * (10);
        double B3 = Math.random() * (10);

        double V1 = Math.random() * (10);
        double V2 = Math.random() * (10);

        if ((int) L1 == 0 && (int) L2 == 0) {
            L2++;
        }
        if ((int) B1 == 0) {
            B1++;
        }
        if ((int) V1 == 0 && (int) V2 == 0) {
            V2++;
        }
        double C = (hashOp((int) L1) + L2 + hashOp((int) B1) + B2 + hashOp((int) B3) + V1 + hashOp((int) V2)) % 10;

        laendercode = (int) L1 + "" + (int) L2;
        bandnr = (int) B1 + "" + (int) B2 + "" + (int) B3;
        verlagsnr = (int) V1 + "" + (int) V2;
        checksum = (int) C + "";

        return laendercode + "-" + bandnr + "-" + verlagsnr + "-" + checksum;
    }

}
