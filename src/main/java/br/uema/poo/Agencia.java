package br.uema.poo;

import java.util.List;

public class Agencia {

    private String nome;
    private String cnpj;
    private List<Cliente> clientes;

    public Agencia(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
