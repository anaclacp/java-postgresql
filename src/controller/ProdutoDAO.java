/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Produto;

/**
 *
 * @author Windows 10
 */
public class ProdutoDAO {
    private final Connection con;
    private PreparedStatement cmd;

    public ProdutoDAO() {
        con = Conexao.conectar();
    }
    
    public int inserir(Produto p){
        try{
            String SQL="insert into tb_produto (nome,preco,"
                + "categoria_produto_id) values (?,?,?)";
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, p.getSabor());
            cmd.setDouble(2, p.getPreco());
            cmd.setInt(3, p.getCategoria_id());
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
    
    public int atualizar(Produto p) {
        try {
            String SQL = "UPDATE tb_produto SET nome=?, "
                    + "preco=?, categoria_produto_id=? WHERE id=? ";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, p.getSabor());
            cmd.setDouble(2, p.getPreco());
            cmd.setInt(3, p.getCategoria_id());
            cmd.setInt(4, p.getId());
            
            if (cmd.executeUpdate() > 0){
                return p.getId();
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
    
    public Produto pesquisarPorId(int id) {
        try {
            return null;
        } catch (Exception e) {
            System.err.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }    
    
    public List<Produto> pesquisarPorNome(String nome) {
        try {
            String SQL = "select p.*, c.nome as categoria_nome "
                    + "from tb_produto as p "
                    + "inner join tb_categoria_produto as c "
                    + "on (p.categoria_produto_id = c.id) "
                    + "where p.nome ilike ?";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, '%' + nome + '%');
            ResultSet rs = cmd.executeQuery();
            List<Produto> lista = new ArrayList<>();
            while (rs.next()) {
                Produto p = new Produto(
                    rs.getInt("id"), rs.getString("nome"),  
                    rs.getDouble("preco"), rs.getInt("categoria_produto_id"), rs.getString("categoria_nome")
                );

                lista.add(p);
            } 
            return lista;
        } catch (SQLException e) {
            System.err.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }
    
    public List<Produto> listar() {
    try {
        String SQL = "select p.*, c.nome as categoria_nome "
                + "from tb_produto as p "
                + "inner join tb_categoria_produto as c "
                + "on (p.categoria_produto_id = c.id) "  // Ajuste para corresponder ao nome da coluna no join
                + "order by p.nome";
        cmd = con.prepareStatement(SQL);
        ResultSet rs = cmd.executeQuery();
        List<Produto> lista = new ArrayList<>();
        while (rs.next()) {
            Produto p = new Produto(
                rs.getInt("id"), rs.getString("nome"),
                rs.getDouble("preco"), rs.getInt("categoria_produto_id"), rs.getString("categoria_nome")
            );
            lista.add(p);
        }
        return lista;
    } catch (SQLException e) {
        System.err.println("ERRO: " + e.getMessage());
        return null;
    } finally {
        Conexao.desconectar(con);
    }
}
    

    

    
}
