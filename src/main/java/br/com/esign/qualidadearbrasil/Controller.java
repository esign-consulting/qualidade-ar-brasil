package br.com.esign.qualidadearbrasil;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.esign.qualidadearbrasil.model.OrgaoPublico;
import br.com.esign.qualidadearbrasil.repositories.OrgaoPublicoRepository;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private OrgaoPublicoRepository orgaoPublicoRepository;

    @GetMapping("/orgaosPublicos")
    @ResponseBody
    public ResponseEntity<List<OrgaoPublico>> listarOrgaosPublicos() {
        List<OrgaoPublico> orgaosPublicos = orgaoPublicoRepository.findAll();
        return new ResponseEntity<>(orgaosPublicos, HttpStatus.OK);
    }

    @GetMapping("/orgaosPublicos/{sigla}")
    @ResponseBody
    public ResponseEntity<OrgaoPublico> obterOrgaoPublico(@PathVariable String sigla) {
        OrgaoPublico orgaoPublico = new OrgaoPublico();
        orgaoPublico.setSigla(sigla);
        Example<OrgaoPublico> example = Example.of(orgaoPublico);
        Optional<OrgaoPublico> optional = orgaoPublicoRepository.findOne(example);
        if (optional.isPresent()) {
            return new ResponseEntity<>(optional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

}