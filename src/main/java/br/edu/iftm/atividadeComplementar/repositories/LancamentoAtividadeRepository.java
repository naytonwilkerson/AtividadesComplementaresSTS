package br.edu.iftm.atividadeComplementar.repositories;

import java.util.List;

import org.springframework.data.repository.query.Param;

import br.edu.iftm.atividadeComplementar.domains.LancamentoAtividade;

public class LancamentoAtividadeRepository {

	
	public List<LancamentoAtividade> findByNomeContaining(@Param("nome") String nome) {
		return null;
	}
	
}
