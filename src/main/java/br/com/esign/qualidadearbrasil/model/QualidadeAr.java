package br.com.esign.qualidadearbrasil.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "qualidadeAr")
public class QualidadeAr {

    @Id
    @GeneratedValue
    private Integer id;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_orgaoPublico")
    private OrgaoPublico orgaoPublico;

    private String classificacao;
    private Integer indiceMinimo;
    private Integer indiceMaximo;

    public QualidadeAr() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrgaoPublico getOrgaoPublico() {
        return orgaoPublico;
    }

    public void setOrgaoPublico(OrgaoPublico orgaoPublico) {
        this.orgaoPublico = orgaoPublico;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public Integer getIndiceMinimo() {
        return indiceMinimo;
    }

    public void setIndiceMinimo(Integer indiceMinimo) {
        this.indiceMinimo = indiceMinimo;
    }

    public Integer getIndiceMaximo() {
        return indiceMaximo;
    }

    public void setIndiceMaximo(Integer indiceMaximo) {
        this.indiceMaximo = indiceMaximo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        QualidadeAr other = (QualidadeAr) obj;
        if (id != other.id)
            return false;
        return true;
    }

}