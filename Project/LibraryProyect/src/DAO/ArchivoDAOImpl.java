package DAO;

import Model.PrimerRegistro;
import Model.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import Factory.*;
import java.time.LocalDate;

public class ArchivoDAOImpl implements ArchivoDAO {

    Properties propiedades;
    InputStream entrada;

    public ArchivoDAOImpl() {
        this.propiedades = new Properties();
        this.entrada = null;

        try {
            entrada = new FileInputStream("docs\\archivos.properties");
            propiedades.load(entrada);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (entrada != null) {
                try {
                    entrada.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public int obtenerCantidadArchivos() {
        int cantreg;
        cantreg = (this.propiedades.size()) / 12;
        return cantreg;
    }

    @Override
    public Archivo leerPropiedades(int i) {
        Archivo arc = null;
        String tipo = propiedades.getProperty("tipo" + i);
        if (tipo.equals("libro")) {
            RegistradoraLibro reg = new RegistradoraLibro();
            arc = reg.crearArchivo(propiedades.getProperty("titulo" + i), propiedades.getProperty("publicacion" + i), propiedades.getProperty("autor" + i), propiedades.getProperty("editorial" + i), Boolean.parseBoolean(propiedades.getProperty("disponible" + i)), Boolean.parseBoolean(propiedades.getProperty("alta" + i)), null, propiedades.getProperty("creador" + i));
            reg.configPaginas(Integer.parseInt(propiedades.getProperty("paginas" + i)), (Libro) arc);
        } else if (tipo.equals("ponencia")) {
            RegistradoraPonencia reg = new RegistradoraPonencia();
            arc = reg.crearArchivo(propiedades.getProperty("titulo" + i), propiedades.getProperty("publicacion" + i), propiedades.getProperty("autor" + i), propiedades.getProperty("editorial" + i), Boolean.parseBoolean(propiedades.getProperty("disponible" + i)), Boolean.parseBoolean(propiedades.getProperty("alta" + i)), null, propiedades.getProperty("creador" + i));
            reg.configCongreso(propiedades.getProperty("congreso" + i), (Ponencia) arc);
        } else {
            RegistradoraArticulo reg = new RegistradoraArticulo();
            arc = reg.crearArchivo(propiedades.getProperty("titulo" + i), propiedades.getProperty("publicacion" + i), propiedades.getProperty("autor" + i), propiedades.getProperty("editorial" + i), Boolean.parseBoolean(propiedades.getProperty("disponible" + i)), Boolean.parseBoolean(propiedades.getProperty("alta" + i)), null, propiedades.getProperty("creador" + i));
            reg.configSSN(propiedades.getProperty("SSN" + i), (SSNAdapter) arc);
        }
        return arc;
    }

    @Override
    public Archivo getArchivo(String titulo) {
        Archivo arc = null;
        int iter = this.obtenerCantidadArchivos();
        for (int i = 1; i <= iter; i++) {
            String temptitle = propiedades.getProperty("titulo" + i);
            if (titulo.equals(temptitle)) {
                arc = this.leerPropiedades(i);
            }
        }
        return arc;
    }

    @Override
    public void addArchivo(Archivo arc) {
        String tipo = arc.getClass().getSimpleName();
        int iter = (this.obtenerCantidadArchivos()) + 1;
        propiedades.setProperty("titulo" + iter, arc.getTitulo());
        propiedades.setProperty("publicacion" + iter, arc.getFechaPublicacion().toString());
        propiedades.setProperty("autor" + iter, arc.getAutor());
        propiedades.setProperty("editorial" + iter, arc.getEditorial());
        propiedades.setProperty("disponible" + iter, String.valueOf(arc.isDisponible()));
        propiedades.setProperty("alta" + iter, String.valueOf(arc.isDisponible()));
        propiedades.setProperty("ISBN" + iter, arc.getISBN());
        propiedades.setProperty("creador" + iter, arc.getRegistro().getCreador());
        propiedades.setProperty("paginas" + iter, "");
        propiedades.setProperty("congreso" + iter, "");
        propiedades.setProperty("SSN" + iter, "");
        if (tipo.equals("Libro")) {
            propiedades.setProperty("tipo" + iter, "libro");
            propiedades.setProperty("paginas" + iter, String.valueOf(new RegistradoraLibro().obtenerPaginas((Libro) arc)));
        } else if (tipo.equals("Ponencia")) {
            propiedades.setProperty("tipo" + iter, "ponencia");
            propiedades.setProperty("congreso" + iter, new RegistradoraPonencia().obtenerCongreso((Ponencia) arc));
        } else if (tipo.equals("SSNAdapter")) {
            propiedades.setProperty("tipo" + iter, "articulo");
        }
    }

    @Override
    public void updateArchivo(Archivo arc) {
        String title = arc.getTitulo();
        int iter = this.obtenerCantidadArchivos();
        for (int i = 1; i <= iter; i++) {
            String temptitle = propiedades.getProperty("titulo" + i);
            if (title.equals(temptitle)) {
                String tipo = arc.getClass().getSimpleName();
                propiedades.setProperty("titulo" + iter, arc.getTitulo());
                propiedades.setProperty("publicacion" + iter, arc.getFechaPublicacion().toString());
                propiedades.setProperty("autor" + iter, arc.getAutor());
                propiedades.setProperty("editorial" + iter, arc.getEditorial());
                propiedades.setProperty("disponible" + iter, String.valueOf(arc.isDisponible()));
                propiedades.setProperty("alta" + iter, String.valueOf(arc.isDisponible()));
                propiedades.setProperty("ISBN" + iter, arc.getISBN());
                propiedades.setProperty("creador" + iter, arc.getRegistro().getCreador());
                if (tipo.equals("Libro")) {
                    propiedades.setProperty("tipo" + iter, "libro");
                    propiedades.setProperty("paginas" + iter, String.valueOf(new RegistradoraLibro().obtenerPaginas((Libro) arc)));
                } else if (tipo.equals("Ponencia")) {
                    propiedades.setProperty("tipo" + iter, "ponencia");
                    propiedades.setProperty("congreso" + iter, new RegistradoraPonencia().obtenerCongreso((Ponencia) arc));
                } else if (tipo.equals("SSNAdapter")) {
                    propiedades.setProperty("tipo" + iter, "articulo");
                }
            }
        }
    }

    @Override
    public void deleteRegistro(String titulo) {
        int iter = this.obtenerCantidadArchivos();
        for (int i = 1; i <= iter; i++) {
            String temptitle = propiedades.getProperty("titulo" + i);
            if (titulo.equals(temptitle)) {
                propiedades.remove("tipo" + i);
                propiedades.remove("titulo" + i);
                propiedades.remove("publicacion" + i);
                propiedades.remove("autor" + i);
                propiedades.remove("editorial" + i);
                propiedades.remove("disponible" + i);
                propiedades.remove("alta" + i);
                propiedades.remove("ISBN" + i);
                propiedades.remove("paginas" + i);
                propiedades.remove("congreso" + i);
                propiedades.remove("creador" + i);
                propiedades.remove("SSN" + i);
            }
        }
    }

    @Override
    public void almacenarPropiedades() {
        try {
            propiedades.store(new FileOutputStream("docs\\archivos.properties"), null);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
