package modelo;

import java.sql.Date;

/**
 * @author grodrigues
 *
 */
public class Tarefas {
	private String nome;
	private double prioridade;
	private Date dataLimite;
	private String detalhes;
	
	
	
	public Tarefas(String descricao,double prioridade,Date dataLimite,String detalhes){
		this.nome = descricao;
		this.prioridade = prioridade;
		this.dataLimite = dataLimite;
		this.detalhes = detalhes;
		
	}


	public String getDescricao() {
		return nome;
	}


	public void setDescricao(String descricao) {
		this.nome = descricao;
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