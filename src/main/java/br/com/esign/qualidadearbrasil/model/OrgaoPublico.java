package br.com.esign.qualidadearbrasil.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orgaoResponsavel")
public class OrgaoPublico {

    @Id
    @GeneratedValue
    private int id;

    private String sigla;
    private String nome;
    private String site;

    public OrgaoPublico(int id, String sigla, String nome, String site) {
        this.id = id;
        this.sigla = sigla;
        this.nome = nome;
        this.site = site;
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

    public String getSite() {
        return site;
    }

}