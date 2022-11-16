package br.com.esign.qualidadearbrasil.model;

import java.io.Serializable;
import java.util.Objects;

public class UltimaMedicaoId implements Serializable {

    private Integer estacaoMonitoramentoId;
    private Integer medicaoId;

    public UltimaMedicaoId() {
    }

    public UltimaMedicaoId(Integer estacaoMonitoramentoId, Integer medicaoId) {
        this.estacaoMonitoramentoId = estacaoMonitoramentoId;
        this.medicaoId = medicaoId;
    }

    public Integer getEstacaoMonitoramentoId() {
        return estacaoMonitoramentoId;
    }

    public void setEstacaoMonitoramentoId(Integer estacaoMonitoramentoId) {
        this.estacaoMonitoramentoId = estacaoMonitoramentoId;
    }

    public Integer getMedicaoId() {
        return medicaoId;
    }

    public void setMedicaoId(Integer medicaoId) {
        this.medicaoId = medicaoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        UltimaMedicaoId ultimeMedicaoId = (UltimaMedicaoId) o;
        return estacaoMonitoramentoId.equals(ultimeMedicaoId.estacaoMonitoramentoId) &&
                medicaoId.equals(ultimeMedicaoId.medicaoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estacaoMonitoramentoId, medicaoId);
    }

}