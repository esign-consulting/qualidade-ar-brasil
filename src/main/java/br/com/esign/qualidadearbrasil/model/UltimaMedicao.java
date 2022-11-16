package br.com.esign.qualidadearbrasil.model;

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
    private Integer estacaoMonitoramentoId;

    @Id
    private Integer medicaoId;

    @ManyToOne
    @JoinColumn(name = "id_estacaoMonitoramento")
    private EstacaoMonitoramento estacaoMonitoramento;

    @ManyToOne
    @JoinColumn(name = "id_medicao")
    private Medicao medicao;

    public EstacaoMonitoramento getEstacaoMonitoramento() {
        return estacaoMonitoramento;
    }

    public void setEstacaoMonitoramento(EstacaoMonitoramento estacaoMonitoramento) {
        this.estacaoMonitoramento = estacaoMonitoramento;
    }

    public Medicao getMedicao() {
        return medicao;
    }

    public void setMedicao(Medicao medicao) {
        this.medicao = medicao;
    }

}