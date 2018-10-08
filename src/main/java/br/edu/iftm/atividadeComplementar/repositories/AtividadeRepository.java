package br.edu.iftm.atividadeComplementar.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import br.edu.iftm.atividadeComplementar.domains.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade, Integer> {

	public List<Atividade> findByNomeContaining(@Param("nome") String nome);

}
