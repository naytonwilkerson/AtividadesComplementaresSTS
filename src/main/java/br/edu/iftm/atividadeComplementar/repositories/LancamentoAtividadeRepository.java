package br.edu.iftm.atividadeComplementar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.iftm.atividadeComplementar.domains.LancamentoAtividade;

public interface LancamentoAtividadeRepository extends JpaRepository<LancamentoAtividade, Long> {

}
