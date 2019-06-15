
package bean;


import DAO.CadastroDAO;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.UsuarioModel;

@ManagedBean
@SessionScoped
public class UsuarioBean {
    private UsuarioModel user= new UsuarioModel();
    private List<UsuarioModel> usuarios= new ArrayList<>();
    
    public void adicionarUsuario(){
        usuarios.add(user);
        new CadastroDAO().salvar(user);
        user= new UsuarioModel();
    }

    public UsuarioBean() {
    }

    public UsuarioModel getUser() {
        return user;
    }

    public void setUser(UsuarioModel user) {
        this.user = user;
    }

    public List<UsuarioModel> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<UsuarioModel> usuarios) {
        this.usuarios = usuarios;
    }   
   
}
