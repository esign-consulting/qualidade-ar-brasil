package br.com.esign.qualidadearbrasil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.esign.qualidadearbrasil.model.OrgaoPublico;

public interface OrgaoPublicoRepository extends JpaRepository<OrgaoPublico, Integer> {

    public OrgaoPublico findBySigla(String sigla);

}