package modelo;

import java.sql.Date;

public class Atividades {

	private String descricao;
	private int percentual;
	private Date data;
	private Tarefas tarefas;
	
	public Atividades(String description,int percentual,Date data){
		this.descricao = description;
		this.percentual = percentual;
		this.data = data;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getPercentual() {
		return percentual;
	}


	public void setPercentual(int percentual) {
		this.percentual = percentual;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public Tarefas getTarefas() {
		return tarefas;
	}


	public void setTarefas(Tarefas tarefas) {
		this.tarefas = tarefas;
	}

	
}

