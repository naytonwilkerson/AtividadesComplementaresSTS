package br.edu.iftm.atividadeComplementar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.iftm.atividadeComplementar.domains.LancamentoAtividade;
import br.edu.iftm.atividadeComplementar.repositories.LancamentoAtividadeRepository;

public class LancamentoAtividadeService {

	@Autowired
	private LancamentoAtividadeRepository repository;

	public List<LancamentoAtividade> buscar(String aluno) {
		return repository.findByNomeContaining(aluno);
	}
}
