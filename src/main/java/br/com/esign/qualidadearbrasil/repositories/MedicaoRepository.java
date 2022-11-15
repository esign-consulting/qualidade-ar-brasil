package br.com.esign.qualidadearbrasil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.esign.qualidadearbrasil.model.Medicao;

public interface MedicaoRepository extends JpaRepository<Medicao, Integer> {
    
}