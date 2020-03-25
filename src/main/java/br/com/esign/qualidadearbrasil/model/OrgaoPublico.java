package br.com.esign.qualidadearbrasil.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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

    @OneToMany(mappedBy = "orgaoPublico")
    private Set<QualidadeAr> tabelaQualidadeAr;

    public OrgaoPublico() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Set<QualidadeAr> getTabelaQualidadeAr() {
        return tabelaQualidadeAr;
    }

    public void setTabelaQualidadeAr(Set<QualidadeAr> tabelaQualidadeAr) {
        this.tabelaQualidadeAr = tabelaQualidadeAr;
    }

}