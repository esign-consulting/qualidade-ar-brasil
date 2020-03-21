package br.com.esign.qualidadearbrasil;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.esign.qualidadearbrasil.model.OrgaoPublico;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/orgaosPublicos")
    @ResponseBody
    public ResponseEntity<List<OrgaoPublico>> listOrgaosPublicos() {
        List<OrgaoPublico> orgaosPublicos = null;
        return new ResponseEntity<>(orgaosPublicos, HttpStatus.OK);
    }

}