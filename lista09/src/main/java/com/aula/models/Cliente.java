package com.aula.models;

/**
 *
 * @author kroix
 */
public class Cliente {
    private String nome;
    private String endereco;

    public Cliente() {
        this.nome = "";
        this.endereco = "";
    }
    
    public Cliente(String nome, String endereco) {
        this.setNome(nome);
        this.setEndereco(endereco);
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public final void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
