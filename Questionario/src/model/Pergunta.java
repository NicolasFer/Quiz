/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jhond
 */
public class Pergunta {
    
    private int id;
    private String descricao;
    private String comentario;
    private int resposta_certa;

    public Pergunta() {
    }

    public Pergunta(int id, String descricao, String comentario, int resposta_certa) {
        this.id = id;
        this.descricao = descricao;
        this.comentario = comentario;
        this.resposta_certa = resposta_certa;
    }

   

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getResposta_certa() {
        return resposta_certa;
    }

    public void setResposta_certa(int resposta_certa) {
        this.resposta_certa = resposta_certa;
    }
    
}
