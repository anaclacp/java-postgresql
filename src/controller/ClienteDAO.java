
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Statement;
import java.util.List;
import model.Cliente;


public class ClienteDAO {
    private final Connection con;
    private PreparedStatement cmd;

    public ClienteDAO() {
        con = Conexao.conectar();
    }
    
    public int inserir(Cliente c) {
    try {
        String SQL = "insert into tb_clientes (nome_cliente, endereco_cliente, telefone_cliente) values (?,?,?)";
        cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
        cmd.setString(1, c.getNome());
        cmd.setString(2, c.getEndereco()); // Ajuste na ordem
        cmd.setString(3, c.getTelefone()); // Ajuste na ordem

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

    
   
    
    public int atualizar(Cliente c) {
        try {
            String SQL = "update tb_clientes set nome_cliente=?, endereco_cliente=?, telefone_cliente=? WHERE id=?";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, c.getNome());
            cmd.setString(2, c.getEndereco());
            cmd.setString(3, c.getTelefone());
            cmd.setInt(4, c.getId());

            
            if (cmd.executeUpdate() > 0){
                return c.getId();
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
    
    public List<Cliente> pesquisarPorNome(String nome) {
    try {
        String SQL = "SELECT id, nome_cliente, endereco_cliente, telefone_cliente FROM tb_clientes WHERE nome_cliente ILIKE ?";
        cmd = con.prepareStatement(SQL);
        cmd.setString(1, '%' + nome + '%');

        ResultSet rs = cmd.executeQuery();
        List<Cliente> lista = new ArrayList<>();
        while (rs.next()) {
            Cliente c = new Cliente(
                rs.getInt("id"), rs.getString("nome_cliente"),
                rs.getString("endereco_cliente"), rs.getString("telefone_cliente")
            );

            lista.add(c);
        } 
        return lista;
    } catch (SQLException e) {
        System.err.println("ERRO: " + e.getMessage());
        return null;
    } finally {
        Conexao.desconectar(con);
    }
}

    
    public List<Cliente> listar() {
        try {
            String SQL = "SELECT id, nome_cliente, "
                    + "endereco_cliente, telefone_cliente FROM tb_clientes "
                    + "ORDER BY nome_cliente";
            cmd = con.prepareStatement(SQL);
            ResultSet rs = cmd.executeQuery();
            List<Cliente> listaClientes = new ArrayList<>();

            while (rs.next()) {
                Cliente c = new Cliente(
                    rs.getInt("id"), rs.getString("nome_cliente"),
                    rs.getString("endereco_cliente"), rs.getString("telefone_cliente")
                );

                listaClientes.add(c);
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
