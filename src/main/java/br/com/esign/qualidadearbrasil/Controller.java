package br.com.esign.qualidadearbrasil;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
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
    public ResponseEntity<List<OrgaoPublico>> listOrgaosPublicos() {
        List<OrgaoPublico> orgaosPublicos = orgaoPublicoRepository.findAll();
        return new ResponseEntity<>(orgaosPublicos, HttpStatus.OK);
    }

}