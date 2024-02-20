
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Statement;
import java.util.List;
import model.Funcionario;


public class FuncionarioDAO {
    private final Connection con;
    private PreparedStatement cmd;

    public FuncionarioDAO() {
        con = Conexao.conectar();
    }
    
    public int inserir(Funcionario f) {
    try {
        String SQL = "insert into tb_funcionario (nome_funcionario, salario_funcionario, telefone_funcionario) values (?,?,?)";
        cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
        cmd.setString(1, f.getNome());
        cmd.setString(2, f.getSalario()); 
        cmd.setString(3, f.getTelefone()); 

        if (cmd.executeUpdate() > 0) {
            ResultSet rs = cmd.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt("id");
            }
        }
        return -1;
    } catch (Exception e) {
        System.err.println("ERRO: " + e.getMessage());
        return -1;
    } finally {
        Conexao.desconectar(con);
    }
}

    
    public int atualizar(Funcionario f) {
        try {
            String SQL = "update tb_funcionario set nome_funcionario=?, salario_funcionario=?, telefone_funcionario=? WHERE id=?";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, f.getNome());
            cmd.setString(2, f.getSalario());
            cmd.setString(3, f.getTelefone());
            cmd.setInt(4, f.getId());

            
            if (cmd.executeUpdate() > 0){
                return f.getId();
            }else{
                return -1;
            }
        } catch (Exception e) {
            System.err.println("ERRO: " + e.getMessage());
            return -1;
        } finally {
            Conexao.desconectar(con);
        }
    }    
    
    public List<Funcionario> pesquisarPorNome(String nome) {
    try {
        String SQL = "SELECT id, nome_funcionario, salario_funcionario, telefone_funcionario FROM tb_funcionario WHERE nome_funcionario ILIKE ?";
        cmd = con.prepareStatement(SQL);
        cmd.setString(1, '%' + nome + '%');

        ResultSet rs = cmd.executeQuery();
        List<Funcionario> lista = new ArrayList<>();
        while (rs.next()) {
            Funcionario f = new Funcionario(
                rs.getInt("id"), rs.getString("nome_funcionario"),
                rs.getString("salario_funcionario"), rs.getString("telefone_funcionario")
            );

            lista.add(f);
        } 
        return lista;
    } catch (SQLException e) {
        System.err.println("ERRO: " + e.getMessage());
        return null;
    } finally {
        Conexao.desconectar(con);
    }
}

    
    public List<Funcionario> listar() {
        try {
            String SQL = "SELECT id, nome_funcionario, "
                    + "salario_funcionario, telefone_funcionario FROM tb_funcionario "
                    + "ORDER BY nome_funcionario";
            cmd = con.prepareStatement(SQL);
            ResultSet rs = cmd.executeQuery();
            List<Funcionario> listaClientes = new ArrayList<>();

            while (rs.next()) {
                Funcionario f = new Funcionario(
                    rs.getInt("id"), rs.getString("nome_funcionario"),
                    rs.getString("salario_funcionario"), rs.getString("telefone_funcionario")
                );

                listaClientes.add(f);
            }

            return listaClientes;
        } catch (Exception e) {
            System.err.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }
}
