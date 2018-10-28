package br.edu.iftm.atividadeComplementar.repositories;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.iftm.atividadeComplementar.domains.Atividade;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AtividadeRepositoryTest {
	
	@Autowired
	private AtividadeRepository repository;
	
	@Test
	public void testaListaVazia() {
		Optional<Atividade> atividade = repository.findById((long) 1);
		assertThat(atividade.get().getNome().equals("nayton"));
	}

}
