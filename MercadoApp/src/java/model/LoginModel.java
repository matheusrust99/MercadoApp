
package model;


public class LoginModel {
   
    private int idLogin;
    private String usuario;
    private String senha;

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LoginModel() {
    }

    public LoginModel(int idLogin, String usuario, String senha) {
        this.idLogin = idLogin;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    
    
}
