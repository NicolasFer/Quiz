/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Types.NULL;
import java.util.ArrayList;
import java.util.List;
import model.Pergunta;

/**
 *
 * @author jhond
 */
public class PerguntaDao {
    PreparedStatement pst;
    String sql;
    
    public int salvar(Pergunta pergunta) throws SQLException{
        
        int idPergunta = 0;
    
        sql = "insert into pergunta values(?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        pst.setInt(1,0);
        pst.setString(2, pergunta.getDescricao());
        pst.setString(3, pergunta.getComentario());
        pst.setInt(4,NULL);
        
        pst.execute();
        
        ResultSet rs = pst.getGeneratedKeys();
        
        while (rs.next()){
        
            idPergunta = rs.getInt(1);
        
        }
    
        pst.close();
        return idPergunta;
    }
    
    public void alterar(Pergunta pergunta) throws SQLException{
        
        sql = "update pergunta set resposta_certa = ? where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, pergunta.getResposta_certa());
        pst.setInt(2, pergunta.getId());
        pst.execute();
        pst.close();
        
    
    
    
    
    }
    
    public List<Pergunta> ListaPergunta() throws SQLException{
    
    List<Pergunta> listaPergunta;
    
    listaPergunta = new ArrayList<>();
    
    sql = "select * from pergunta";
    pst = Conexao.getInstance().prepareStatement(sql);
    ResultSet rs = pst.executeQuery();
    
    while(rs.next()){
        
        listaPergunta.add(new Pergunta(rs.getInt("id"), rs.getString("descricao"), rs.getString("comentario"), rs.getInt("resposta_certa")));
    
    }
    
    pst.close();
    
    return listaPergunta;
    }
    
    
}
