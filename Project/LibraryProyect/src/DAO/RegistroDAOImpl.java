package DAO;

import Model.PrimerRegistro;
import Model.Registro;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class RegistroDAOImpl implements RegistroDAO {

    Properties propiedades;
    InputStream entrada;

    public RegistroDAOImpl() {
        this.propiedades = new Properties();
        this.entrada = null;

        try {
            entrada = new FileInputStream("docs\\registros.properties");
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
    public int obtenerCantidadRegistros() {
        int cantreg;
        cantreg = (this.propiedades.size()) / 6;
        return cantreg;
    }

    @Override
    public Registro leerPropiedades(int i) {
        Registro reg = null;
        String tipo = propiedades.getProperty("tipo" + i);
        if (tipo.equals("nuevo")) {
            reg = new PrimerRegistro(propiedades.getProperty("creador" + i), propiedades.getProperty("libro" + i), propiedades.getProperty("modificador" + i));
            reg.setFecha(propiedades.getProperty("fecha" + i));
            reg.setId(propiedades.getProperty("id"+i));
        } else {
            reg = new Registro(propiedades.getProperty("libro" + i), propiedades.getProperty("modificador" + i));
            reg.setFecha(propiedades.getProperty("fecha" + i));
            reg.setId(propiedades.getProperty("id"+i));
        }
        return reg;
    }


    @Override
    public Registro getRegistro(String id) {
        Registro reg = null;
        int iter = this.obtenerCantidadRegistros();
        for (int i = 1; i <= iter; i++) {
            String tempid = propiedades.getProperty("id" + i);
            if (id.equals(tempid)) {
                reg = this.leerPropiedades(i);
            }
        }
        return reg;
    }

    @Override
    public void addRegistro(Registro reg) {
        int iter = (this.obtenerCantidadRegistros()) + 1;
        propiedades.setProperty("tipo" + iter, "nuevo");
        propiedades.setProperty("id" + iter, reg.getId());
        propiedades.setProperty("libro" + iter, reg.getLibro());
        propiedades.setProperty("modificador" + iter, reg.getModificador());
        propiedades.setProperty("fecha" + iter, (reg.getFecha()).toString());
        propiedades.setProperty("creador" + iter, "");
    }

    public void addPrimerRegistro(PrimerRegistro reg) {
        int iter = (this.obtenerCantidadRegistros()) + 1;
        propiedades.setProperty("tipo" + iter, "nuevo");
        propiedades.setProperty("id" + iter, reg.getId());
        propiedades.setProperty("libro" + iter, reg.getLibro());
        propiedades.setProperty("modificador" + iter, reg.getModificador());
        propiedades.setProperty("fecha" + iter, (reg.getFecha()).toString());
        propiedades.setProperty("creador" + iter, reg.getCreador());

    }

    @Override
    public void updateRegistro(Registro reg) {
        String id = reg.getId();
        int iter = this.obtenerCantidadRegistros();
        for (int i = 1; i <= iter; i++) {
            String tempid = propiedades.getProperty("id" + i);
            if (id.equals(tempid)) {
                propiedades.setProperty("tipo" + i, "nuevo");
                propiedades.setProperty("id" + i, reg.getId());
                propiedades.setProperty("libro" + i, reg.getLibro());
                propiedades.setProperty("modificador" + i, reg.getModificador());
                propiedades.setProperty("fecha" + i, (reg.getFecha()).toString());
            }
        }
    }

    @Override
    public void deleteRegistro(String id) {
        int iter = this.obtenerCantidadRegistros();
        for (int i = 1; i <= iter; i++) {
            String tempid = propiedades.getProperty("id" + i);
            if (id.equals(tempid)) {
                propiedades.remove("tipo" + i);
                propiedades.remove("id" + i);
                propiedades.remove("libro" + i);
                propiedades.remove("modificador" + i);
                propiedades.remove("fecha" + i);
            }
        }
    }
    
    @Override
    public void almacenarPropiedades(){
        try {
            propiedades.store(new FileOutputStream("docs\\registros.properties"), null);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
