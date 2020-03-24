package br.com.esign.qualidadearbrasil.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "orgaoPublico")
public class OrgaoPublico {

    @Id
    @GeneratedValue
    private Integer id;

    private String sigla;
    private String nome;
    private String site;

    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;

    @JsonManagedReference
    @OneToMany(mappedBy = "orgaoPublico")
    private Set<QualidadeAr> tabelaQualidadeAr;

    public OrgaoPublico() {
    }

    public OrgaoPublico(Integer id, String sigla, String nome, String site, Estado estado) {
        this.id = id;
        this.sigla = sigla;
        this.nome = nome;
        this.site = site;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSite() {
        return site;
    }

    public Estado getEstado() {
        return estado;
    }

    public Set<QualidadeAr> getTabelaQualidadeAr() {
        return tabelaQualidadeAr;
    }

}