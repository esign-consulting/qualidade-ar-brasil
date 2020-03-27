package br.com.esign.qualidadearbrasil.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "estacaoMonitoramento")
public class EstacaoMonitoramento {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_orgaoPublico")
    private OrgaoPublico orgaoPublico;

    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;

    private String nome;
    private String bairro;
    private String endereco;

    private BigDecimal latitude;
    private BigDecimal longitude;

    public EstacaoMonitoramento() {
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

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

}