package br.com.esign.qualidadearbrasil;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.esign.qualidadearbrasil.model.EstacaoMonitoramento;
import br.com.esign.qualidadearbrasil.model.OrgaoPublico;
import br.com.esign.qualidadearbrasil.model.QualidadeAr;
import br.com.esign.qualidadearbrasil.repositories.EstacaoMonitoramentoRepository;
import br.com.esign.qualidadearbrasil.repositories.OrgaoPublicoRepository;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private OrgaoPublicoRepository orgaoPublicoRepository;

    @Autowired
    private EstacaoMonitoramentoRepository estacaoMonitoramentoRepository;

    @GetMapping("/orgaosPublicos")
    @ResponseBody
    public ResponseEntity<List<OrgaoPublico>> listarOrgaosPublicos() {
        List<OrgaoPublico> orgaosPublicos = orgaoPublicoRepository.findAll();
        return new ResponseEntity<>(orgaosPublicos, HttpStatus.OK);
    }

    @GetMapping("/orgaosPublicos/{sigla}")
    @ResponseBody
    public ResponseEntity<OrgaoPublico> obterOrgaoPublico(@PathVariable String sigla) {
        OrgaoPublico orgaoPublico = obterOrgaoPublicoPelaSigla(sigla);
        return new ResponseEntity<>(orgaoPublico, (orgaoPublico == null) ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }

    @GetMapping("/orgaosPublicos/{sigla}/tabelaQualidadeAr")
    @ResponseBody
    public ResponseEntity<Set<QualidadeAr>> obterTabelaQualidadeAr(@PathVariable String sigla) {
        OrgaoPublico orgaoPublico = obterOrgaoPublicoPelaSigla(sigla);
        if (orgaoPublico == null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(orgaoPublico.getTabelaQualidadeAr(), HttpStatus.OK);
        }
    }

    @GetMapping("/orgaosPublicos/{sigla}/estacoesMonitoramento")
    @ResponseBody
    public ResponseEntity<List<EstacaoMonitoramento>> listarEstacoesMonitoramento(@PathVariable String sigla) {
        OrgaoPublico orgaoPublico = obterOrgaoPublicoPelaSigla(sigla);
        if (orgaoPublico == null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        } else {
            EstacaoMonitoramento estacaoMonitoramento = new EstacaoMonitoramento();
            estacaoMonitoramento.setOrgaoPublico(orgaoPublico);
            Example<EstacaoMonitoramento> example = Example.of(estacaoMonitoramento);
            return new ResponseEntity<>(estacaoMonitoramentoRepository.findAll(example), HttpStatus.OK);
        }
    }

    private OrgaoPublico obterOrgaoPublicoPelaSigla(String sigla) {
        OrgaoPublico orgaoPublico = new OrgaoPublico();
        orgaoPublico.setSigla(sigla);
        Example<OrgaoPublico> example = Example.of(orgaoPublico);
        Optional<OrgaoPublico> optional = orgaoPublicoRepository.findOne(example);
        return (optional.isPresent()) ? optional.get() : null;
    }

}