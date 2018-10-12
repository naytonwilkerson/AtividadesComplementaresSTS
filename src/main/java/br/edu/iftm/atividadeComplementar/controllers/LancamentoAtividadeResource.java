package br.edu.iftm.atividadeComplementar.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.atividadeComplementar.domains.LancamentoAtividade;
import br.edu.iftm.atividadeComplementar.services.LancamentoAtividadeService;

@RestController
@RequestMapping(value = "/lancamentoatividades")
public class LancamentoAtividadeResource {

	@Autowired
	private LancamentoAtividadeService service;

	@RequestMapping(value = "like/{codigo}", method = RequestMethod.GET)
	public ResponseEntity<?> findByNome(@PathVariable Long codigo) {
		Optional<LancamentoAtividade> lancamentoAtividade = service.buscarCodigo(codigo);
		return ResponseEntity.ok().body(lancamentoAtividade);
	}
	
	@RequestMapping( method = RequestMethod.GET)
	public ResponseEntity<?> findAll(){
		List<LancamentoAtividade> lancamentoAtividade = service.buscarTodos();
		return ResponseEntity.ok().body(lancamentoAtividade);
	}
	

}
