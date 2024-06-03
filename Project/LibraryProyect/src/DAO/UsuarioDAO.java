package DAO;
import Model.Usuario;
import java.util.List;

public interface UsuarioDAO {
    void addUsuario(Usuario usuario);
    Usuario getUsuario(int id);
    Usuario getUsuarioByUsername(String username);
    List<Usuario> getAllUsuarios();
    void updateUsuario(Usuario usuario);
    void deleteUsuario(int id);
}
