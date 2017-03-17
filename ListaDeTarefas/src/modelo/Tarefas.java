package modelo;

import java.sql.Date;

/**
 * @author grodrigues
 *
 */
public class Tarefas {
	private String descricao;
	private double prioridade;
	private Date dataLimite;
	private String detalhes;
	
	
	public Tarefas(String descricao,double prioridade,Date dataLimite,String detalhes){
		this.descricao = descricao;
		this.prioridade = prioridade;
		this.dataLimite = dataLimite;
		this.detalhes = detalhes;
		
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public double getPrioridade() {
		return prioridade;
	}


	public void setPrioridade(double prioridade) {
		this.prioridade = prioridade;
	}


	public Date getDataLimite() {
		return dataLimite;
	}


	public void setDataLimite(Date dataLimite) {
		this.dataLimite = dataLimite;
	}


	public String getDetalhes() {
		return detalhes;
	}


	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	
	
	
	
}	