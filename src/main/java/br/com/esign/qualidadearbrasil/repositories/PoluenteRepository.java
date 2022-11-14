package br.com.esign.qualidadearbrasil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.esign.qualidadearbrasil.model.Poluente;

public interface PoluenteRepository extends JpaRepository<Poluente, Integer> {
    
}