package br.com.esign.qualidadearbrasil.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Immutable;

@Entity
@Immutable
@Table(name = "ultimaMedicao")
@IdClass(UltimaMedicaoId.class)
public class UltimaMedicao {

    @Id
    @Column(name = "id_estacaoMonitoramento", insertable = false, updatable = false)
    private Integer estacaoMonitoramentoId;

    @Id
    @Column(name = "id_medicao", insertable = false, updatable = false)
    private Integer medicaoId;

    @ManyToOne
    @JoinColumn(name = "id_medicao")
    private Medicao medicao;

    public Medicao getMedicao() {
        return medicao;
    }

    public void setMedicao(Medicao medicao) {
        this.medicao = medicao;
    }

}