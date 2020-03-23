package br.com.esign.qualidadearbrasil.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estado")
public class Estado {

    @Id
    @GeneratedValue
    private int id;

    private String sigla;
    private String nome;

    public Estado() {
    }

    public Estado(int id, String sigla, String nome) {
        this.id = id;
        this.sigla = sigla;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

}