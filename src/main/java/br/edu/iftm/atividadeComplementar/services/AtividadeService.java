package br.edu.iftm.atividadeComplementar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.iftm.atividadeComplementar.domains.Atividade;

@Service
public class AtividadeService {

		
		@Autowired
		private Atividade repository;
		
		public List<Atividade> buscar(String nome) {
			return repository.findByNomeContaining(nome);
		}
		
		
		
	}


