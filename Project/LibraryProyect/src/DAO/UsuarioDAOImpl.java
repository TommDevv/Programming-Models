
package DAO;

import Model.Usuario;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class UsuarioDAOImpl implements UsuarioDAO {
    private final Properties properties = new Properties();
    private final String filePath = "docs\\usuarios.properties";

    public UsuarioDAOImpl() {
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (InputStream input = new FileInputStream(filePath)) {
                properties.load(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int obtenerCantidadUsuarios(){
        return properties.size();
    }
    @Override
    public void addUsuario(Usuario usuario) {
        properties.setProperty(String.valueOf(usuario.getId()), serializeUsuario(usuario));
        saveProperties();
    }

    @Override
    public Usuario getUsuario(int id) {
        String userString = properties.getProperty(String.valueOf(id));
        return userString != null ? deserializeUsuario(userString) : null;
    }

    @Override
    public Usuario getUsuarioByUsername(String username) {
        return getAllUsuarios().stream()
                .filter(usuario -> usuario.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return properties.stringPropertyNames().stream()
                .map(key -> deserializeUsuario(properties.getProperty(key)))
                .collect(Collectors.toList());
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        if (properties.containsKey(String.valueOf(usuario.getId()))) {
            properties.setProperty(String.valueOf(usuario.getId()), serializeUsuario(usuario));
            saveProperties();
        }
    }

    @Override
    public void deleteUsuario(int id) {
        properties.remove(String.valueOf(id));
        saveProperties();
    }

    private String serializeUsuario(Usuario usuario) {
        return usuario.getId() + "," +
               usuario.getUsername() + "," +
               usuario.getPassword() + "," +
               usuario.getNombre() + "," +
               usuario.getCorreoElectronico() + "," +
               usuario.getDireccionFisica() + "," +
               usuario.getNumeroTelefono();
    }

    private Usuario deserializeUsuario(String userString) {
        String[] parts = userString.split(",");
        return new Usuario(
                Integer.parseInt(parts[0]),
                parts[1],
                parts[2],
                parts[3],
                parts[4],
                parts[5],
                parts[6]
        );
    }

    public void saveProperties() {
        try (OutputStream output = new FileOutputStream(filePath)) {
            properties.store(output, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
