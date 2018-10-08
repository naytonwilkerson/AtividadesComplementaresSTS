package br.edu.iftm.atividadeComplementar.repositories;

import java.util.List;

import org.springframework.data.repository.query.Param;

import br.edu.iftm.atividadeComplementar.domains.Atividade;

public class AtividadeRepository {


	public List<Atividade> findByNomeContaining(@Param("nome") String nome) {
		return null;
	}
}
