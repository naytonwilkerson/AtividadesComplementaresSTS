package br.edu.iftm.atividadeComplementar.domains;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class LancamentoAtividade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;

	private Integer quantidadeHoras;

	private Date dataInicio;

	private Date dataFim;

	@Autowired
	@ManyToOne
	private Aluno aluno;

	@Autowired
	@OneToMany(fetch = FetchType.EAGER)
	private List<Atividade> atividade;

	public LancamentoAtividade(Integer codigo, Integer quantidadeHoras, Date dataInicio, Date dataFim) {
		super();
		this.codigo = codigo;
		this.quantidadeHoras = quantidadeHoras;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;

	}

	public String getSemestreAtividade() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataFim);
		int ano = calendar.get(Calendar.YEAR);
		int mes = calendar.get(Calendar.MONTH);
		if (mes > 5) {
			return ano + "-2";
		} else {
			return ano + "-1";
		}
	}

	public Integer getHorasAproveitadas(List<Atividade> atividade) {
			
		return ((Atividade) atividade). getHorasAproveitadasPorAtividade(quantidadeHoras);
		
	}

	public LancamentoAtividade() {
		super();
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(Integer quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

}
