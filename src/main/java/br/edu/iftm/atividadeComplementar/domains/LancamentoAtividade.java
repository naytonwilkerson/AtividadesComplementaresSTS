package br.edu.iftm.atividadeComplementar.domains;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LancamentoAtividade {
	
	@Id
	private Integer codigo;
	
	private Integer quantidadeHoras;
	
	private Date dataInicio;
	
	private Date dataFim;
	

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
			return ano+"-2";
		} else {
			return ano+"-1";
		}
	}
	
	//public Integer getHorasAproveitadas() {
		
	//}

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
