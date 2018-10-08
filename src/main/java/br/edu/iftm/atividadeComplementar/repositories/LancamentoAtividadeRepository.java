package br.edu.iftm.atividadeComplementar.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import br.edu.iftm.atividadeComplementar.domains.Atividade;
import br.edu.iftm.atividadeComplementar.domains.LancamentoAtividade;

public interface LancamentoAtividadeRepository extends JpaRepository<Atividade, Integer> {

	public List<LancamentoAtividade> findByNomeContaining(@Param("codigo") Integer codigo);


}
