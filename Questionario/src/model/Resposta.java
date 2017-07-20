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
public class Resposta {
    
    private int id;
    private String descricao;
    private int id_pergunta;

    public Resposta() {
    }

    public Resposta(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Resposta(int id, String descricao, int id_pergunta) {
        this.id = id;
        this.descricao = descricao;
        this.id_pergunta = id_pergunta;
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

    public int getId_pergunta() {
        return id_pergunta;
    }

    public void setId_pergunta(int id_pergunta) {
        this.id_pergunta = id_pergunta;
    }
    
}
