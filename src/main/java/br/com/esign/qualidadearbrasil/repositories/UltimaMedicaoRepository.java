package br.com.esign.qualidadearbrasil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.esign.qualidadearbrasil.model.UltimaMedicao;
import br.com.esign.qualidadearbrasil.model.UltimaMedicaoId;

public interface UltimaMedicaoRepository extends JpaRepository<UltimaMedicao, UltimaMedicaoId> {
    
}