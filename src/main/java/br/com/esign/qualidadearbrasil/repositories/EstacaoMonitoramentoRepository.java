package br.com.esign.qualidadearbrasil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.esign.qualidadearbrasil.model.EstacaoMonitoramento;

public interface EstacaoMonitoramentoRepository extends JpaRepository<EstacaoMonitoramento, Integer> {
    
}