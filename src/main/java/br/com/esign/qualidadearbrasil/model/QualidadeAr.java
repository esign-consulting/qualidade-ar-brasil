package br.com.esign.qualidadearbrasil.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "qualidadeAr")
public class QualidadeAr {

    @Id
    @GeneratedValue
    private int id;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_orgaoResponsavel")
    private OrgaoPublico orgaoPublico;

    private String classificacao;
    private Integer indiceMinimo;
    private Integer indiceMaximo;

    public QualidadeAr() {
    }

    public QualidadeAr(int id, OrgaoPublico orgaoPublico, String classificacao, Integer indiceMinimo, Integer indiceMaximo) {
        this.id = id;
        this.orgaoPublico = orgaoPublico;
        this.classificacao = classificacao;
        this.indiceMinimo = indiceMinimo;
        this.indiceMaximo = indiceMaximo;
    }

    public int getId() {
        return id;
    }

    public OrgaoPublico getOrgaoPublico() {
        return orgaoPublico;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public Integer getIndiceMinimo() {
        return indiceMinimo;
    }

    public Integer getIndiceMaximo() {
        return indiceMaximo;
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