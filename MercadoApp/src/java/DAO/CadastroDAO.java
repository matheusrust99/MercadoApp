
package DAO;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.UsuarioModel;


public class CadastroDAO {
    public void salvar(UsuarioModel usuario){
        try {
            Connection conexao= ConnectionFactory.getConexao();
            
            PreparedStatement ps = conexao.prepareCall("INSERT INTO `dbapp`.`usuario`(`idusuario`,`telefone`,`email`,`cpf`,`nascimento`,`cep`,`cidade`,`bairro`,`rua`,`numeroresidencia`,`nomesobrenome`,`estado`) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, usuario.getIdUsuario());
            ps.setString(2, usuario.getTelefone());
            ps.setString(3, usuario.getEmail());
            ps.setString(4, usuario.getCpf());
            ps.setDate(5, new Date(usuario.getDataNascimento().getTime()));
            ps.setString(6,usuario.getCep());
            ps.setString(7, usuario.getCidade());
            ps.setString(8, usuario.getBairro());
            ps.setString(9, usuario.getRua());
            ps.setString(10, usuario.getNumResidencia());
            ps.setString(11, usuario.getNomeSobrenome());
            ps.setString(12, usuario.getEstado());
            ps.execute();
            
            ConnectionFactory.fecharConexao();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    
}
